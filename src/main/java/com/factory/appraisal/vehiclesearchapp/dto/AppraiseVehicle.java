package com.factory.appraisal.vehiclesearchapp.dto;
//@author:Rupesh Khade


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraiseVehicle  {


    private Long appraisalReferenceId;

    private Date appraisalRetensionTime;
 
   @Size(max = 20)
    private String appraisalValue;

    @Size(max = 10)
    private String blackBookValue;

    @Size(max = 15)
    private String brakeSystemFuel;

    @NotNull
    @Max(999999999999999l)
    private Long  eSignId;

    @Size(max = 50)
    private String enginePerformance;

    @Size(max = 15)
    private String field1;

    @Size(max = 15)
    private String field2;

    @Size(max = 15)
    private String field3;
    @Size(max = 50)
    private String latitude;

    @Size(max = 50)
    private String longitude;

    @Size(max = 250)
    private String professionalOpinion;


    @Max(999999999999999l)
    private Long stockNumber;

    @Size(max = 100)
    private String transmission ;

    @Size(max = 15)
    private String vehicleMake;

    @Max(9999999999l)
    private Long miles;
    @Size(max = 15)
    private String  vehicleModel;
    @Size(max = 10)
    private String  vehicleSeries;
    @Size(max = 10)
    private String  style;
    @Max(9999)
    private Long vehicleYear;
    @Size(max = 17)
    private String vinNumber ;

    private String image;




}
