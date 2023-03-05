package com.factory.appraisal.vehiclesearchapp.dto;
//@Author :Rupesh
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApprTestDrStsWithBaseClass {


    @Valid
    private AppraisalVehicleAcCondition appraisalVehicleAcCondition;
    @Valid
    private AppraisalVehicleInteriorCondition appraisalVehicleInteriorCondition;
    @Valid
    private AppraisalVehicleOilCondition appraisalVehicleOilCondition;
    @Valid
    private AppraisalVehicleStereoStatus appraisalVehicleStereoStatus;
    @Valid
    private AppraisalVehicleTireCondition appraisalVehicleTireCondition;
    @Valid
    private VehicleDrivingWarnLightStatus vehicleDrivingWarnLightStatus;


    @Size(max = 50)
    private String optionalEquipment;
    @Size(max = 4)
    @NotNull
    private String  engineType;
    @Size(max = 10)
    @NotNull
    private String transmissionType;
    @Size(max = 5)
    @NotNull
    private String steering;
    @Size(max = 30)
    private String doorLockType;
    @Size(max = 17)
    private String  frontLeftSideImage;
    @Size(max = 15)
    @NotNull
    private String frontLeftWindowStatus;
    @Size(max = 15)
    @NotNull
    private String   frontRightWindowStatus;
    @Size(max = 15)
    @NotNull
    private String  rearLeftWindowStatus;
    @Size(max = 15)
    @NotNull
    private String  rearRightWindowStatus;
    @Size(max = 17)
    @NotNull
    private String frontRightImage;
    @Size(max = 17)
    @NotNull
    private String  rearLeftImage;
    @Size(max = 17)
    @NotNull
    private String rearRightImage;
    @Size(max = 30)
    @NotNull
    private String interiorType;
    @Size(max = 30)
    private String lightCondition;
    @Size(max = 50)
    private String roofType;
    @Size(max = 10)
    private String appraisalFollowUp;
    @Size(max = 10)
    private String appraisalInventoryStatus;
    @Size(max = 10)
    private String exteriorColor;
    @Size(max = 50)
    private String exteriorDamageStatus;
    @Size(max = 50)
    private String frontDriverSideDamageDescription;
    @Size(max = 50)
    private String frontDriverSideDamageStatus;
    @Size(max = 50)
    private String frontPassengerSideDamageDescription;
    @Size(max = 50)
    private String frontPassengerSideDamageStatus;


    @Size(max = 50)
    private String paintWorkFrontDriverSideStatus;
    @Size(max = 50)
    private String paintWorkFrontDriverSideStatusDescription;
    @Size(max = 50)
    private String paintWorkFrontPassengerSideStatus;
    @Size(max = 50)
    private String paintWorkFrontPassengerSideStatusDescription;
    @Size(max = 50)
    private String paintWorkRearDriverSideStatus;
    @Size(max = 50)
    private String paintWorkRearDriverSideStatusDescription;
    @Size(max = 50)
    private String paintWorkRearPassengerSideStatus;
    @Size(max = 50)
    private String paintWorkRearPassengerSideStatusDescription;
    @Size(max = 50)
    private String paintWorkStatus;
    @Size(max = 50)
    private String rearDriverSideDamageDescription;
    @Size(max = 50)
    private String rearDriverSideDamageStatus;
    @Size(max = 50)
    private String rearPassengerSideDamageDescription;
    @Size(max = 50)
    private String rearPassengerSideDamageStatus;
    @Size(max = 50)
    private String wholesaleBuyFiguresStatus;
    @Size(max = 50)
    private String windshieldDamage;



}
