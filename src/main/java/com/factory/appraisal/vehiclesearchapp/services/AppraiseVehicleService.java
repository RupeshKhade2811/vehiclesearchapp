package com.factory.appraisal.vehiclesearchapp.services;
/**
 * This is the AppraiseVehicleService class having abstract methods
 * @author Rupesh Khade
 */


public interface AppraiseVehicleService {

    /**
     *
     * @param userId this is the user id
     * @param pageNumber this is the page number
     * @param pageSize this is the number of cards per page
     * @return Appraisal card list and page information ie total records and  total pages
     * @author Rupesh khade
     *
     */
    Object[] findAllCards(Long userId, Integer pageNumber, Integer pageSize);

    /**
     *
     * @param imageName This is the image name
     * @return image of a car
     * @author Rupesh Khade
     *
     */
    byte[]  downloadImageFromFileSystem(String imageName);



  //  Map<Integer,String> imageUpload(MultipartFile file1, MultipartFile file2, MultipartFile file3, MultipartFile file4);




}
