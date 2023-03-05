package com.factory.appraisal.vehiclesearchapp.controller;
/**
 * This is the Controller class having rest end points
 *
 * @author Rupesh khade
 */

import com.factory.appraisal.vehiclesearchapp.ExceptionHandle.ErrorResponse;
import com.factory.appraisal.vehiclesearchapp.VehiclesearchappApplication;
import com.factory.appraisal.vehiclesearchapp.dto.AppraisalVehicleCard;
import com.factory.appraisal.vehiclesearchapp.services.AppraiseVehicleServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Min;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/appraisal")
@Api(tags = "Appraisal Vehicle",value = "Appraisal Module")
public class AppraisalVehicleController {

    @Autowired
    private AppraiseVehicleServiceImpl service;


    Logger log = LoggerFactory.getLogger(AppraisalVehicleController.class);

    @ApiOperation(value = "get Appraisals cards by user id ", response = AppraisalVehicleCard.class)
    @PostMapping("/getAppraisalsCards")
    public ResponseEntity<Object []> getAppraisalsCards(@RequestHeader("userId") Long userId,@RequestParam @Min(1) Integer pageNo,@RequestParam @Min(1) Integer pageSize) {
        Object[] apv=null;

        apv = service.findAllCards(userId, pageNo, pageSize);

        return new ResponseEntity<Object[]>(apv, HttpStatus.OK);


    }


    @ApiOperation(value = "get Image by image name ", response = byte[].class)
    @PostMapping("/getpic1")
    public ResponseEntity<byte[]> downloadImageFromFileSystem(@RequestParam String pic1)  {
        byte[] bytes = service.downloadImageFromFileSystem(pic1);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/jpeg"))
                .body(bytes);
    }
 /*   @ApiIgnore
    @ApiOperation(value = "Upload Image and Returns image name", response = ApiResponseHandler.class)
    @PostMapping("/uploadImage")
    public ResponseEntity<?> uploadImage(@RequestParam("image1") MultipartFile file1, @RequestParam("image2")
    MultipartFile file2,@RequestParam("image3") MultipartFile file3,@RequestParam("image4") MultipartFile file4) throws IOException {
        Map<Integer,String> map=service.imageUpload(file1,file2,file3,file4);
        return new ResponseEntity<>(map,HttpStatus.OK);
    }*/

}
