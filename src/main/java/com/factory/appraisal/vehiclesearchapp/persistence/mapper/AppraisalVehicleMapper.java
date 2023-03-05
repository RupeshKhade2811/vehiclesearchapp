package com.factory.appraisal.vehiclesearchapp.persistence.mapper;
/**
 * This is the Mapper interface to map the Entities to model classes and vice versa
 * its Implementation  class is auto generated by  Mapstruct
 *
 * @author Rupesh Khade
 */

import com.factory.appraisal.vehiclesearchapp.dto.*;

import com.factory.appraisal.vehiclesearchapp.persistence.model.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppraisalVehicleMapper {
    AppraiseVehicle eApprVehiToApprVehicle (EAppraiseVehicle eAppraiseVehicle);
    EAppraiseVehicle apprVehiToEapprVehi(AppraiseVehicle appraiseVehicle);
    List<EAppraiseVehicle> lApprVehiToLeApprVehi (List<AppraiseVehicle> appraiseVehicleList);
    List<AppraiseVehicle> leApprVehiToLapprVehi (List<EAppraiseVehicle> eAppraiseVehicleList);


    AppraisalVehicleCard eApprVehiToApprVehiCard(EAppraiseVehicle eAppraiseVehicle);
    List<AppraisalVehicleCard> lEApprVehiToLApprVehiCard (List<EAppraiseVehicle> eAppraiseVehicleList);

    AppraisalVehicleAcCondition eApprAcConToApprVehiAcCon(EAppraisalVehicleAcCondition eAppraisalVehicleAcCondition);
    EAppraisalVehicleAcCondition apprVehiAcCondToEApprVehiAcCon(AppraisalVehicleAcCondition appraisalVehicleAcCondition);

    AppraisalVehicleInteriorCondition eApprVehiInteConToApprVehiInterCon (EAppraisalVehicleInteriorCondition eAppraisalVehicleInteriorCondition);
    EAppraisalVehicleInteriorCondition apprVehiInteCondToEApprVehiInteCondi(AppraisalVehicleInteriorCondition appraisalVehicleInteriorCondition);


    AppraisalVehicleOilCondition eApprOilCondToApprOilCon(EAppraisalVehicleOilCondition eAppraisalVehicleOilCondition);
    EAppraisalVehicleOilCondition apprOilConToEApprOilCon(AppraisalVehicleOilCondition appraisalVehicleOilCondition);

    AppraisalVehicleStereoStatus eApprSterStatusToApprSterStatus(EAppraisalVehicleStereoStatus eAppraisalVehicleStereoStatus);
    EAppraisalVehicleStereoStatus apprSterStatusToEApprSterStatus(AppraisalVehicleStereoStatus appraisalVehicleStereoStatus);

    AppraisalVehicleTireCondition eApprTireConToApprTireCon (EAppraisalVehicleTireCondition eAppraisalVehicleTireCondition);
    EAppraisalVehicleTireCondition apprTireConToEApprTireCond(AppraisalVehicleTireCondition appraisalVehicleTireCondition);

    EVehicleDrivingWarnLightStatus vehWarLigStsToEvehDrWarLiSts (VehicleDrivingWarnLightStatus vehicleDrivingWarnLightStatus);
    VehicleDrivingWarnLightStatus evehWarLigStsToVehDrWarLiSts(EVehicleDrivingWarnLightStatus eVehicleDrivingWarnLightStatus);

    AppraisalTestDRStsImages VehToDto(EAppraiseVehicle vehicle);




}
