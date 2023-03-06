package com.factory.appraisal.vehiclesearchapp.persistence.model;

/**
 * @author Rupesh Khade
 */


import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "APR_TEST_DR_STATUS")
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "VEH_STATUS_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))

@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "APR_TEST_DR_STATUS_SEQ")})

public class EAppraisalTestDriveStatus extends TransactionEntity {

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraiseVehicle.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "APPRAISAL_REF ", referencedColumnName = "APPR_REF_ID", nullable = false)
    private EAppraiseVehicle appraisalRef;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "vehicleStatus", cascade = CascadeType.ALL)
    private EAppraisalVehicleAcCondition appraisalVehicleAcCondition;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "vehicleStatus", cascade = CascadeType.ALL)
    private EAppraisalVehicleInteriorCondition appraisalVehicleInteriorCondition;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "vehicleStatus", cascade = CascadeType.ALL)
    private EAppraisalVehicleOilCondition appraisalVehicleOilCondition;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "vehicleStatus", cascade = CascadeType.ALL)
    private EAppraisalVehicleStereoStatus appraisalVehicleStereoStatus;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "vehicleStatus", cascade = CascadeType.ALL)
    private EAppraisalVehicleTireCondition appraisalVehicleTireCondition;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "vehicleStatus", cascade = CascadeType.ALL)
    private EVehicleDrivingWarnLightStatus vehicleDrivingWarnLightStatus;


    @Column(name = "OPT_EQUIPMENT")
    private String optionalEquipment;   //this maybe a table
    @Column(name = "ENGINE_TYPE")
    private String engineType;
    @Column(name = "TRANSMISSION_TYPE ")
    private String transmissionType;
    @Column(name = " STEERING")
    private String steering;
    @Column(name = "DR_LOCK_TYPE")
    private String doorLocks;
    @Column(name = "F_L_IMAGE")
    private String frontLeftSideImage;
    @Column(name = "F_L_WIN_STATUS ")
    private String leftFrontWindowStatus;
    @Column(name = "F_R_WIN_STATUS")
    private String frontRightWindowStatus;
    @Column(name = "R_L_WIN_STATUS ")
    private String rearLeftWindowStatus;
    @Column(name = "R_R_WIN_STATUS")
    private String rearRightWindowStatus;
    @Column(name = "F_R_IMAGE")
    private String frontRightImage;
    @Column(name = "R_L_IMAGE")
    private String rearLeftImage;
    @Column(name = "R_R_IMAGE", nullable=true)
    private String rearRightImage;
    @Column(name = "INTR_TYPE")
    private String interiorType;
    @Column(name = "LIGHT_CONDN ")
    private String lightCondition;
    @Column(name = "ROOF_TYPE")
    private String roofType;
    @Column(name = "APR_FOLLOW_UP ")
    private String appraisalFollowUp;
    @Column(name = "APR_INV_STATUS ")
    private String appraisalInventoryStatus;
    @Column(name = "EXTR_COLOR")
    private String exteriorColor;
    @Column(name = "EXTR_DMG_STATUS ")
    private String exteriorDamageStatus;
    @Column(name = "F_DR_SIDE_DMG_DESC")
    private String frontDriversideDamageTextBox;
    @Column(name = "F_DR_SIDE_DMG_STS")
    private String frontDriversideDamage;
    @Column(name = "F_P_SIDE_DMG_DESC")
    private String frontPassengerSideDamageTextBox;
    @Column(name = "F_P_SIDE_DMG_STS ")
    private String frontPassengerSidePaintwork;


    @Column(name = "PNTWRK_FD_SIDE_STS ")
    private String frontDriversidePaintwork;
    @Column(name = "PNTWRK_FD_SIDE_STS_DESC")
    private String frontDriversidePaintworkTextBox;
    @Column(name = "PNTWRK_FP_SIDE_STS")
    private String paintWorkFrontPassengerSideStatus;
    @Column(name = "PNTWRK_FP_SIDE_STS_DESC")
    private String frontPassengerSidePaintworkTextBox;
    @Column(name = "PNTWRK_RD_SIDE_STS")
    private String rearDriversidePaintwork;
    @Column(name = "PNTWRK_RD_SIDE_STS_DESC")
    private String rearDriversidePaintworkTextBox;
    @Column(name = "PNTWRK_RP_SIDE_STS")
    private String rearPassengerSidePaintwork;
    @Column(name = "PNTWRK_RP_SIDE_STS_DESC")
    private String rearPassengerSidePaintworkTextBox;
    @Column(name = "PNTWRK_STATUS")
    private String paintWork;
    @Column(name = "R_DR_SIDE_DMG_DESC")
    private String rearPassengerSideDamageTextBox;
    @Column(name = "R_DR_SIDE_DMG_STS ")
    private String rearDriversideDamage;
    @Column(name = "R_PASS_SIDE_DMG_DESC")
    private String rearPassengerSideDamageDescription;
    @Column(name = "R_PASS_SIDE_DMG_STS ")
    private String rearPassengerSideDamage;
    @Column(name = "WS_BUY_FIG_STS ")
    private String wholesaleBuyFiguresStatus;
    @Column(name = "WIND_SHIELD_DMG")
    private String windshieldDamage;


    @Column(name = "QUIK_APPRAISAL")
    String quickAppraisal;
    @Column(name = "VECLE_MILEAGE")
    private String vehicleMileage;

    @Column(name = "KEY_ASSUR_YES")
    private String keyAssureYes;

    @Column(name = "SUBSCB_TO_KEY_ASSURE")
    private String subscribToKeyAssure;

    @Column(name = "KEY_ASSUR_FILE")
    private String keyAssureFiles;
    @Column(name = "BRAKE_SYS_STATS")
    private String brakingSystemStatus;
    @Column(name = "BOOKS_AND_KEYS")
    private String booksAndKeys;
    @Column(name = "TITL_STATS")
    private  String titleStatus;

    @Column(name = "ADJS_WHOLE_POOR")
    private  String adjustedWholsalePoor;
    @Column(name = "ADJS_WHOLE_SALE_FAIR")
    private  String adjustedWholesaleFair;
    @Column(name = "ADJS_WHOLE_SALE_GOOD")
    private String adjustedWholesaleGood;
    @Column(name = "ADJS_WHOLE_SALE_VERY_GOOD")
    private  String adjustedWholesaleVeryGood;
    @Column(name = "ADJS_WHOLE_SALE_EXCELNT")
    private  String adjustedWholesaleExcellent;
    @Column(name = "ADJS_FINAN_POOR")
    private  String adjustedFinancePoor;
    @Column(name = "ADJS_FINAN_FAIR")
    private  String adjustedFinanceFair;
    @Column(name = "ADJS_FINAN_GOOD")
    private  String adjustedFinanceGood;
    @Column(name = "ADJS_FINAN_VERY_GOOD")
    private  String adjustedFinanceVeryGood;
    @Column(name = "ADJS_FINAN_EXCLNT")
    private  String adjustedFinanceExcellent;
    @Column(name = "ADJS_RETL_POOR")
    private String adjustedRetailPoor;
    @Column(name = "ADJS_RETL_FAIR")
    private String adjustedRetailFair;
    @Column(name = "ADJS_RETL_GOOD")
    private String adjustedRetailGood;
    @Column(name = "ADJS_RETL_VRY_GOOD")
    private  String adjustedRetailVeryGood;

    @Column(name = "ADJS_RETL_EXCLNT")
    private  String adjustedRetailExcellent;
    @Column(name = "PUSH_FOR_BUY_FIG")
    private String pushforBuyfigure;
    @Column(name = "DEALR_RESRV")
    private String dealerReserve;
    @Column(name = "CONSMR_ASK_PRIC")
    private String comsumerAskingPrice;
    @Column(name = "DELR_RETL_ASK_PRIC")
    private String dealerRetailAskingPrice;

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


    private String frontDriversideDamagePicture;

    private String rearDriversideDamagePicture;
    private String rearPassengerSideDamagePicture;

    private String frontPassengerSideDamagePicture;

    private String frontDriversidePaintworkPicture;

    private String rearDriversidePaintworkPicture;

    private String rearPassengerSidePaintworkPicture;

    private String frontPassengerSidePaintworkPicture;

    private String frontWindshieldDamage;
    private String  rearGlassDamage;

    public EAppraiseVehicle getAppraisalRef() {
        return appraisalRef;
    }

    public void setAppraisalRef(EAppraiseVehicle appraisalRef) {
        this.appraisalRef = appraisalRef;
    }

    public EAppraisalVehicleAcCondition getAppraisalVehicleAcCondition() {
        return appraisalVehicleAcCondition;
    }

    public void setAppraisalVehicleAcCondition(EAppraisalVehicleAcCondition appraisalVehicleAcCondition) {
        this.appraisalVehicleAcCondition = appraisalVehicleAcCondition;
    }

    public EAppraisalVehicleInteriorCondition getAppraisalVehicleInteriorCondition() {
        return appraisalVehicleInteriorCondition;
    }

    public void setAppraisalVehicleInteriorCondition(EAppraisalVehicleInteriorCondition appraisalVehicleInteriorCondition) {
        this.appraisalVehicleInteriorCondition = appraisalVehicleInteriorCondition;
    }

    public EAppraisalVehicleOilCondition getAppraisalVehicleOilCondition() {
        return appraisalVehicleOilCondition;
    }

    public void setAppraisalVehicleOilCondition(EAppraisalVehicleOilCondition appraisalVehicleOilCondition) {
        this.appraisalVehicleOilCondition = appraisalVehicleOilCondition;
    }

    public EAppraisalVehicleStereoStatus getAppraisalVehicleStereoStatus() {
        return appraisalVehicleStereoStatus;
    }

    public void setAppraisalVehicleStereoStatus(EAppraisalVehicleStereoStatus appraisalVehicleStereoStatus) {
        this.appraisalVehicleStereoStatus = appraisalVehicleStereoStatus;
    }

    public EAppraisalVehicleTireCondition getAppraisalVehicleTireCondition() {
        return appraisalVehicleTireCondition;
    }

    public void setAppraisalVehicleTireCondition(EAppraisalVehicleTireCondition appraisalVehicleTireCondition) {
        this.appraisalVehicleTireCondition = appraisalVehicleTireCondition;
    }

    public EVehicleDrivingWarnLightStatus getVehicleDrivingWarnLightStatus() {
        return vehicleDrivingWarnLightStatus;
    }

    public void setVehicleDrivingWarnLightStatus(EVehicleDrivingWarnLightStatus vehicleDrivingWarnLightStatus) {
        this.vehicleDrivingWarnLightStatus = vehicleDrivingWarnLightStatus;
    }

    public String getOptionalEquipment() {
        return optionalEquipment;
    }

    public void setOptionalEquipment(String optionalEquipment) {
        this.optionalEquipment = optionalEquipment;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getDoorLocks() {
        return doorLocks;
    }

    public void setDoorLocks(String doorLocks) {
        this.doorLocks = doorLocks;
    }

    public String getFrontLeftSideImage() {
        return frontLeftSideImage;
    }

    public void setFrontLeftSideImage(String frontLeftSideImage) {
        this.frontLeftSideImage = frontLeftSideImage;
    }

    public String getLeftFrontWindowStatus() {
        return leftFrontWindowStatus;
    }

    public void setLeftFrontWindowStatus(String leftFrontWindowStatus) {
        this.leftFrontWindowStatus = leftFrontWindowStatus;
    }

    public String getFrontRightWindowStatus() {
        return frontRightWindowStatus;
    }

    public void setFrontRightWindowStatus(String frontRightWindowStatus) {
        this.frontRightWindowStatus = frontRightWindowStatus;
    }

    public String getRearLeftWindowStatus() {
        return rearLeftWindowStatus;
    }

    public void setRearLeftWindowStatus(String rearLeftWindowStatus) {
        this.rearLeftWindowStatus = rearLeftWindowStatus;
    }

    public String getRearRightWindowStatus() {
        return rearRightWindowStatus;
    }

    public void setRearRightWindowStatus(String rearRightWindowStatus) {
        this.rearRightWindowStatus = rearRightWindowStatus;
    }

    public String getFrontRightImage() {
        return frontRightImage;
    }

    public void setFrontRightImage(String frontRightImage) {
        this.frontRightImage = frontRightImage;
    }

    public String getRearLeftImage() {
        return rearLeftImage;
    }

    public void setRearLeftImage(String rearLeftImage) {
        this.rearLeftImage = rearLeftImage;
    }

    public String getRearRightImage() {
        return rearRightImage;
    }

    public void setRearRightImage(String rearRightImage) {
        this.rearRightImage = rearRightImage;
    }

    public String getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }

    public String getLightCondition() {
        return lightCondition;
    }

    public void setLightCondition(String lightCondition) {
        this.lightCondition = lightCondition;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getAppraisalFollowUp() {
        return appraisalFollowUp;
    }

    public void setAppraisalFollowUp(String appraisalFollowUp) {
        this.appraisalFollowUp = appraisalFollowUp;
    }

    public String getAppraisalInventoryStatus() {
        return appraisalInventoryStatus;
    }

    public void setAppraisalInventoryStatus(String appraisalInventoryStatus) {
        this.appraisalInventoryStatus = appraisalInventoryStatus;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getExteriorDamageStatus() {
        return exteriorDamageStatus;
    }

    public void setExteriorDamageStatus(String exteriorDamageStatus) {
        this.exteriorDamageStatus = exteriorDamageStatus;
    }

    public String getFrontDriversideDamageTextBox() {
        return frontDriversideDamageTextBox;
    }

    public void setFrontDriversideDamageTextBox(String frontDriversideDamageTextBox) {
        this.frontDriversideDamageTextBox = frontDriversideDamageTextBox;
    }

    public String getFrontDriversideDamage() {
        return frontDriversideDamage;
    }

    public void setFrontDriversideDamage(String frontDriversideDamage) {
        this.frontDriversideDamage = frontDriversideDamage;
    }

    public String getFrontPassengerSideDamageTextBox() {
        return frontPassengerSideDamageTextBox;
    }

    public void setFrontPassengerSideDamageTextBox(String frontPassengerSideDamageTextBox) {
        this.frontPassengerSideDamageTextBox = frontPassengerSideDamageTextBox;
    }

    public String getFrontPassengerSidePaintwork() {
        return frontPassengerSidePaintwork;
    }

    public void setFrontPassengerSidePaintwork(String frontPassengerSidePaintwork) {
        this.frontPassengerSidePaintwork = frontPassengerSidePaintwork;
    }

    public String getFrontDriversidePaintwork() {
        return frontDriversidePaintwork;
    }

    public void setFrontDriversidePaintwork(String frontDriversidePaintwork) {
        this.frontDriversidePaintwork = frontDriversidePaintwork;
    }

    public String getFrontDriversidePaintworkTextBox() {
        return frontDriversidePaintworkTextBox;
    }

    public void setFrontDriversidePaintworkTextBox(String frontDriversidePaintworkTextBox) {
        this.frontDriversidePaintworkTextBox = frontDriversidePaintworkTextBox;
    }

    public String getPaintWorkFrontPassengerSideStatus() {
        return paintWorkFrontPassengerSideStatus;
    }

    public void setPaintWorkFrontPassengerSideStatus(String paintWorkFrontPassengerSideStatus) {
        this.paintWorkFrontPassengerSideStatus = paintWorkFrontPassengerSideStatus;
    }

    public String getFrontPassengerSidePaintworkTextBox() {
        return frontPassengerSidePaintworkTextBox;
    }

    public void setFrontPassengerSidePaintworkTextBox(String frontPassengerSidePaintworkTextBox) {
        this.frontPassengerSidePaintworkTextBox = frontPassengerSidePaintworkTextBox;
    }

    public String getRearDriversidePaintwork() {
        return rearDriversidePaintwork;
    }

    public void setRearDriversidePaintwork(String rearDriversidePaintwork) {
        this.rearDriversidePaintwork = rearDriversidePaintwork;
    }

    public String getRearDriversidePaintworkTextBox() {
        return rearDriversidePaintworkTextBox;
    }

    public void setRearDriversidePaintworkTextBox(String rearDriversidePaintworkTextBox) {
        this.rearDriversidePaintworkTextBox = rearDriversidePaintworkTextBox;
    }

    public String getRearPassengerSidePaintwork() {
        return rearPassengerSidePaintwork;
    }

    public void setRearPassengerSidePaintwork(String rearPassengerSidePaintwork) {
        this.rearPassengerSidePaintwork = rearPassengerSidePaintwork;
    }

    public String getRearPassengerSidePaintworkTextBox() {
        return rearPassengerSidePaintworkTextBox;
    }

    public void setRearPassengerSidePaintworkTextBox(String rearPassengerSidePaintworkTextBox) {
        this.rearPassengerSidePaintworkTextBox = rearPassengerSidePaintworkTextBox;
    }

    public String getPaintWork() {
        return paintWork;
    }

    public void setPaintWork(String paintWork) {
        this.paintWork = paintWork;
    }

    public String getRearPassengerSideDamageTextBox() {
        return rearPassengerSideDamageTextBox;
    }

    public void setRearPassengerSideDamageTextBox(String rearPassengerSideDamageTextBox) {
        this.rearPassengerSideDamageTextBox = rearPassengerSideDamageTextBox;
    }

    public String getRearDriversideDamage() {
        return rearDriversideDamage;
    }

    public void setRearDriversideDamage(String rearDriversideDamage) {
        this.rearDriversideDamage = rearDriversideDamage;
    }

    public String getRearPassengerSideDamageDescription() {
        return rearPassengerSideDamageDescription;
    }

    public void setRearPassengerSideDamageDescription(String rearPassengerSideDamageDescription) {
        this.rearPassengerSideDamageDescription = rearPassengerSideDamageDescription;
    }

    public String getRearPassengerSideDamage() {
        return rearPassengerSideDamage;
    }

    public void setRearPassengerSideDamage(String rearPassengerSideDamage) {
        this.rearPassengerSideDamage = rearPassengerSideDamage;
    }

    public String getWholesaleBuyFiguresStatus() {
        return wholesaleBuyFiguresStatus;
    }

    public void setWholesaleBuyFiguresStatus(String wholesaleBuyFiguresStatus) {
        this.wholesaleBuyFiguresStatus = wholesaleBuyFiguresStatus;
    }

    public String getWindshieldDamage() {
        return windshieldDamage;
    }

    public void setWindshieldDamage(String windshieldDamage) {
        this.windshieldDamage = windshieldDamage;
    }

    public String getQuickAppraisal() {
        return quickAppraisal;
    }

    public void setQuickAppraisal(String quickAppraisal) {
        this.quickAppraisal = quickAppraisal;
    }

    public String getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(String vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public String getKeyAssureYes() {
        return keyAssureYes;
    }

    public void setKeyAssureYes(String keyAssureYes) {
        this.keyAssureYes = keyAssureYes;
    }

    public String getSubscribToKeyAssure() {
        return subscribToKeyAssure;
    }

    public void setSubscribToKeyAssure(String subscribToKeyAssure) {
        this.subscribToKeyAssure = subscribToKeyAssure;
    }

    public String getKeyAssureFiles() {
        return keyAssureFiles;
    }

    public void setKeyAssureFiles(String keyAssureFiles) {
        this.keyAssureFiles = keyAssureFiles;
    }

    public String getBrakingSystemStatus() {
        return brakingSystemStatus;
    }

    public void setBrakingSystemStatus(String brakingSystemStatus) {
        this.brakingSystemStatus = brakingSystemStatus;
    }

    public String getBooksAndKeys() {
        return booksAndKeys;
    }

    public void setBooksAndKeys(String booksAndKeys) {
        this.booksAndKeys = booksAndKeys;
    }

    public String getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(String titleStatus) {
        this.titleStatus = titleStatus;
    }

    public String getAdjustedWholsalePoor() {
        return adjustedWholsalePoor;
    }

    public void setAdjustedWholsalePoor(String adjustedWholsalePoor) {
        this.adjustedWholsalePoor = adjustedWholsalePoor;
    }

    public String getAdjustedWholesaleFair() {
        return adjustedWholesaleFair;
    }

    public void setAdjustedWholesaleFair(String adjustedWholesaleFair) {
        this.adjustedWholesaleFair = adjustedWholesaleFair;
    }

    public String getAdjustedWholesaleGood() {
        return adjustedWholesaleGood;
    }

    public void setAdjustedWholesaleGood(String adjustedWholesaleGood) {
        this.adjustedWholesaleGood = adjustedWholesaleGood;
    }

    public String getAdjustedWholesaleVeryGood() {
        return adjustedWholesaleVeryGood;
    }

    public void setAdjustedWholesaleVeryGood(String adjustedWholesaleVeryGood) {
        this.adjustedWholesaleVeryGood = adjustedWholesaleVeryGood;
    }

    public String getAdjustedWholesaleExcellent() {
        return adjustedWholesaleExcellent;
    }

    public void setAdjustedWholesaleExcellent(String adjustedWholesaleExcellent) {
        this.adjustedWholesaleExcellent = adjustedWholesaleExcellent;
    }

    public String getAdjustedFinancePoor() {
        return adjustedFinancePoor;
    }

    public void setAdjustedFinancePoor(String adjustedFinancePoor) {
        this.adjustedFinancePoor = adjustedFinancePoor;
    }

    public String getAdjustedFinanceFair() {
        return adjustedFinanceFair;
    }

    public void setAdjustedFinanceFair(String adjustedFinanceFair) {
        this.adjustedFinanceFair = adjustedFinanceFair;
    }

    public String getAdjustedFinanceGood() {
        return adjustedFinanceGood;
    }

    public void setAdjustedFinanceGood(String adjustedFinanceGood) {
        this.adjustedFinanceGood = adjustedFinanceGood;
    }

    public String getAdjustedFinanceVeryGood() {
        return adjustedFinanceVeryGood;
    }

    public void setAdjustedFinanceVeryGood(String adjustedFinanceVeryGood) {
        this.adjustedFinanceVeryGood = adjustedFinanceVeryGood;
    }

    public String getAdjustedFinanceExcellent() {
        return adjustedFinanceExcellent;
    }

    public void setAdjustedFinanceExcellent(String adjustedFinanceExcellent) {
        this.adjustedFinanceExcellent = adjustedFinanceExcellent;
    }

    public String getAdjustedRetailPoor() {
        return adjustedRetailPoor;
    }

    public void setAdjustedRetailPoor(String adjustedRetailPoor) {
        this.adjustedRetailPoor = adjustedRetailPoor;
    }

    public String getAdjustedRetailFair() {
        return adjustedRetailFair;
    }

    public void setAdjustedRetailFair(String adjustedRetailFair) {
        this.adjustedRetailFair = adjustedRetailFair;
    }

    public String getAdjustedRetailGood() {
        return adjustedRetailGood;
    }

    public void setAdjustedRetailGood(String adjustedRetailGood) {
        this.adjustedRetailGood = adjustedRetailGood;
    }

    public String getAdjustedRetailVeryGood() {
        return adjustedRetailVeryGood;
    }

    public void setAdjustedRetailVeryGood(String adjustedRetailVeryGood) {
        this.adjustedRetailVeryGood = adjustedRetailVeryGood;
    }

    public String getAdjustedRetailExcellent() {
        return adjustedRetailExcellent;
    }

    public void setAdjustedRetailExcellent(String adjustedRetailExcellent) {
        this.adjustedRetailExcellent = adjustedRetailExcellent;
    }

    public String getPushforBuyfigure() {
        return pushforBuyfigure;
    }

    public void setPushforBuyfigure(String pushforBuyfigure) {
        this.pushforBuyfigure = pushforBuyfigure;
    }

    public String getDealerReserve() {
        return dealerReserve;
    }

    public void setDealerReserve(String dealerReserve) {
        this.dealerReserve = dealerReserve;
    }

    public String getComsumerAskingPrice() {
        return comsumerAskingPrice;
    }

    public void setComsumerAskingPrice(String comsumerAskingPrice) {
        this.comsumerAskingPrice = comsumerAskingPrice;
    }

    public String getDealerRetailAskingPrice() {
        return dealerRetailAskingPrice;
    }

    public void setDealerRetailAskingPrice(String dealerRetailAskingPrice) {
        this.dealerRetailAskingPrice = dealerRetailAskingPrice;
    }

    public String getVehiclePicture1() {
        return vehiclePicture1;
    }

    public void setVehiclePicture1(String vehiclePicture1) {
        this.vehiclePicture1 = vehiclePicture1;
    }

    public String getVehiclePicture2() {
        return vehiclePicture2;
    }

    public void setVehiclePicture2(String vehiclePicture2) {
        this.vehiclePicture2 = vehiclePicture2;
    }

    public String getVehiclePicture3() {
        return vehiclePicture3;
    }

    public void setVehiclePicture3(String vehiclePicture3) {
        this.vehiclePicture3 = vehiclePicture3;
    }

    public String getVehiclePicture4() {
        return vehiclePicture4;
    }

    public void setVehiclePicture4(String vehiclePicture4) {
        this.vehiclePicture4 = vehiclePicture4;
    }

    public String getVehiclePicture5() {
        return vehiclePicture5;
    }

    public void setVehiclePicture5(String vehiclePicture5) {
        this.vehiclePicture5 = vehiclePicture5;
    }

    public String getVehiclePicture6() {
        return vehiclePicture6;
    }

    public void setVehiclePicture6(String vehiclePicture6) {
        this.vehiclePicture6 = vehiclePicture6;
    }

    public String getVehiclePicture7() {
        return vehiclePicture7;
    }

    public void setVehiclePicture7(String vehiclePicture7) {
        this.vehiclePicture7 = vehiclePicture7;
    }

    public String getVehiclePicture8() {
        return vehiclePicture8;
    }

    public void setVehiclePicture8(String vehiclePicture8) {
        this.vehiclePicture8 = vehiclePicture8;
    }

    public String getVehiclePicture9() {
        return vehiclePicture9;
    }

    public void setVehiclePicture9(String vehiclePicture9) {
        this.vehiclePicture9 = vehiclePicture9;
    }

    public String getVehicleVideo1() {
        return vehicleVideo1;
    }

    public void setVehicleVideo1(String vehicleVideo1) {
        this.vehicleVideo1 = vehicleVideo1;
    }

    public String getFrontDriversideDamagePicture() {
        return frontDriversideDamagePicture;
    }

    public void setFrontDriversideDamagePicture(String frontDriversideDamagePicture) {
        this.frontDriversideDamagePicture = frontDriversideDamagePicture;
    }

    public String getRearDriversideDamagePicture() {
        return rearDriversideDamagePicture;
    }

    public void setRearDriversideDamagePicture(String rearDriversideDamagePicture) {
        this.rearDriversideDamagePicture = rearDriversideDamagePicture;
    }

    public String getRearPassengerSideDamagePicture() {
        return rearPassengerSideDamagePicture;
    }

    public void setRearPassengerSideDamagePicture(String rearPassengerSideDamagePicture) {
        this.rearPassengerSideDamagePicture = rearPassengerSideDamagePicture;
    }

    public String getFrontPassengerSideDamagePicture() {
        return frontPassengerSideDamagePicture;
    }

    public void setFrontPassengerSideDamagePicture(String frontPassengerSideDamagePicture) {
        this.frontPassengerSideDamagePicture = frontPassengerSideDamagePicture;
    }

    public String getFrontDriversidePaintworkPicture() {
        return frontDriversidePaintworkPicture;
    }

    public void setFrontDriversidePaintworkPicture(String frontDriversidePaintworkPicture) {
        this.frontDriversidePaintworkPicture = frontDriversidePaintworkPicture;
    }

    public String getRearDriversidePaintworkPicture() {
        return rearDriversidePaintworkPicture;
    }

    public void setRearDriversidePaintworkPicture(String rearDriversidePaintworkPicture) {
        this.rearDriversidePaintworkPicture = rearDriversidePaintworkPicture;
    }

    public String getRearPassengerSidePaintworkPicture() {
        return rearPassengerSidePaintworkPicture;
    }

    public void setRearPassengerSidePaintworkPicture(String rearPassengerSidePaintworkPicture) {
        this.rearPassengerSidePaintworkPicture = rearPassengerSidePaintworkPicture;
    }

    public String getFrontPassengerSidePaintworkPicture() {
        return frontPassengerSidePaintworkPicture;
    }

    public void setFrontPassengerSidePaintworkPicture(String frontPassengerSidePaintworkPicture) {
        this.frontPassengerSidePaintworkPicture = frontPassengerSidePaintworkPicture;
    }

    public String getFrontWindshieldDamage() {
        return frontWindshieldDamage;
    }

    public void setFrontWindshieldDamage(String frontWindshieldDamage) {
        this.frontWindshieldDamage = frontWindshieldDamage;
    }

    public String getRearGlassDamage() {
        return rearGlassDamage;
    }

    public void setRearGlassDamage(String rearGlassDamage) {
        this.rearGlassDamage = rearGlassDamage;
    }
}