package com.factory.appraisal.vehiclesearchapp.services;
/**
 * This is the Implementation class of AppraiseVehicleService
 * @author Rupesh Khade
 */

import com.factory.appraisal.vehiclesearchapp.ExceptionHandle.ApplicationExceptionHandler;
import com.factory.appraisal.vehiclesearchapp.ExceptionHandle.ErrorResponse;
import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;
import com.factory.appraisal.vehiclesearchapp.controller.AppraisalVehicleController;
import com.factory.appraisal.vehiclesearchapp.dto.AppraisalVehicleCard;

import com.factory.appraisal.vehiclesearchapp.dto.PageInfo;
import com.factory.appraisal.vehiclesearchapp.persistence.mapper.*;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraiseVehicle;
import com.factory.appraisal.vehiclesearchapp.repository.*;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Service
public class AppraiseVehicleServiceImpl implements AppraiseVehicleService {
    Logger log = LoggerFactory.getLogger(AppraiseVehicleServiceImpl.class);

    @Autowired
    private AppraiseVehicleRepo eAppraiseVehicleRepo;
    @Autowired

    private UserRegistrationRepo userRegistrationRepo;

    @Autowired
    AppraisalTestDriveStatusRepo eAppraisalTestDriveStatusRepo;
    @Autowired
    private AppraisalVehicleMapper appraisalVehicleMapper;
    @Autowired
    private ApplicationExceptionHandler exceptionHandler;

    @Override
    public Object[] findAllCards(Long userId, Integer pageNumber, Integer pageSize)  {
        Object[] response =null;
        try{
                  Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("createdOn").descending());

                  Page<EAppraiseVehicle> pageResult = eAppraiseVehicleRepo.findAllByValidIsTrueAndUserIdOrderByCreatedOnDesc(userId, pageable);

                 if(pageResult.getTotalElements()!=0) {

                     PageInfo pageInfo = new PageInfo();
                     pageInfo.setTotalRecords(pageResult.getTotalElements());
                     pageInfo.setTotalPages(pageResult.getTotalPages());

                     List<EAppraiseVehicle> apv = pageResult.toList();
                     List<AppraisalVehicleCard> appraiseVehicleDtos = appraisalVehicleMapper.lEApprVehiToLApprVehiCard(apv);
                     response = new Object[]{appraiseVehicleDtos,pageInfo};
                 }
                 else throw new RuntimeException("AppraisalCards not available");
        }
        catch (RuntimeException ex){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            response=new Object[]{errorResponse};
            log.error(ex.getMessage());
            return response;
        }
        return response;
    }

@Override
    public byte[] downloadImageFromFileSystem(String imageName)  {
         byte[] images=null;

        String filePath = AppraisalConstants.FOLDER_PATH + imageName;
           try {
              images = Files.readAllBytes(new File(filePath).toPath());//Reading from folder


           }catch (IOException e){
               System.out.println(e.getMessage());
           }

        return images;
    }



  /*  @Override
    public Map<Integer,String> imageUpload(MultipartFile file1,MultipartFile file2,MultipartFile file3,MultipartFile file4) {

        Map<Integer, String> map = new TreeMap<>();

        for (int i = 1; i <= 4; i++) {
            MultipartFile file = null;
            switch (i) {
                case 1:
                    file = file1;
                    break;
                case 2:
                    file = file2;
                    break;
                case 3:
                    file = file3;
                    break;
                case 4:
                    file = file4;
                    break;
            }
            if (file != null) {
                String extension = FilenameUtils.getExtension(file.getOriginalFilename());
                String filename = UUID.randomUUID().toString() + "." + extension;
                Path filePath = Paths.get(AppraisalConstants.FOLDER_PATH + filename);
                try{ Files.write(filePath, file.getBytes());

                }
                catch (IOException exception){

                }

                map.put(i, filename);
            }
        }


        return map;
    }*/
}
