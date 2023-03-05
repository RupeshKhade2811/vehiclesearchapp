package com.factory.appraisal.vehiclesearchapp.dto;
//@author:Kalyan

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalCreationPage {

    //dealer
    private String clientFirstName;
    private String clientLastName;
    private Long phoneNumber;
    private String dealershipUserNames;

    //AppraisalVehicle
    private String vinNumber;
    private Long vehicleYear;
    private String vehicleMake;
    //AppraisalVehicle
    private String vehicleModel;
    //AppraisalVehicle
    private String vehicleSeries;


    private String vehicleMileage;
    //AppraisalTestDriveStatus
    private String engineType;
    private String transmissionType;

    //Test Drive Status
    private String vehicleExteriorColor;

    private String vehicleInterior;

    //VehicleDrivingWarnLightStatus
    private List<String> dashWarningLights;

    //AppraisalVehicleAcCondition
    private List<String> acCondition;

    //AppraisalTestDriveStatus
    private String doorLocks;
    private String roofType;

    //AppraisalVehicleStereoStatus
    private List<String> stereoStatus;
    private List<String> interiorCondition;

    //AppraisalTestDriveStatus
    private String leftFrontWindowStatus;
    private String frontRightWindowStatus;
    private String rearLeftWindowStatus;
    private String rearRightWindowStatus;

    //
      private String quickAppraisal;

    //picture
    private String vehiclePicture1;
    private String vehiclePicture2;
    private String vehiclePicture3;
    private String vehiclePicture4;
    private String vehiclePicture5;
    private String vehiclePicture6;
    private String vehiclePicture7;
    private String vehiclePicture8;
    private String vehiclePicture9;
    private String vehicleVideo1;

    //AppraisalVehicleOilCondition
    private List<String> oilCondition;

    //Appraisal test Drive status
    private String externalDamage;

    //AppraisalTestDriveStatus
    private String frontDriversideDamage;
    private String frontDriversideDamageTextBox;
     private String frontDriversideDamagePicture;
    private String rearDriversideDamage;
    private String rearDriversideDamageTextBox;
    private String rearDriversideDamagePicture;
    private String rearPassengerSideDamage;
    private String rearPassengerSideDamageTextBox;
    private String rearPassengerSideDamagePicture;
    private String frontPassengerSideDamage;
    private String frontPassengerSideDamageTextBox;
    private String frontPassengerSideDamagePicture;
    private String paintWork;
    private String frontDriversidePaintwork;
    private String frontDriversidePaintworkTextBox;
    private String frontDriversidePaintworkPicture;
    private String rearDriversidePaintwork;
    private String rearDriversidePaintworkTextBox;
    private String rearDriversidePaintworkPicture;
    private String rearPassengerSidePaintwork;
    private String rearPassengerSidePaintworkTextBox;
    private String rearPassengerSidePaintworkPicture;
    private String frontPassengerSidePaintwork;
    private String frontPassengerSidePaintworkTextBox;
    private String frontPassengerSidePaintworkPicture;


    private String frontWindshieldDamage;
    private String rearGlassDamage;


    private String keyAssureYes;
    private String subscribToKeyAssure;
    private String keyAssureFiles;
    private String  brakingSystemStatus;

    //Appraisal vehicle
    private List<String> enginePerformance;
    private List<String> transmissionStatus;

    //AppraisalTest Drive Status
    private List<String> steeringFeelStatus;


    private String booksAndKeys;
    private String titleStatus;

    String professionalOpinion;
    //ConfigurationCodes
    private String vehicleDescription;


    //SignDet
    private String eSign;


    private String adjustedWholsalePoor;
    private String adjustedWholesaleFair;
    private String adjustedWholesaleGood;
    private String adjustedWholesaleVeryGood;
    private String adjustedWholesaleExcellent;
    private String adjustedFinancePoor;
    private String adjustedFinanceFair;
    private String adjustedFinanceGood;
    private String adjustedFinanceVeryGood;
    private String adjustedFinanceExcellent;
    private String adjustedRetailPoor;
    private String adjustedRetailFair;
    private String adjustedRetailGood;
    private String adjustedRetailVeryGood;
    private String adjustedRetailExcellent;

    //AppraisalVehicle
    private String appraisedValue;


    private String dealerReserve;
    private String comsumerAskingPrice;
    private String dealerRetailAskingPrice;


    private String pushforBuyfigure;

}
