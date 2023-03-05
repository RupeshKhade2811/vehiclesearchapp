package com.factory.appraisal.vehiclesearchapp.persistence.model;
/**
 * @author Rupesh Khade
 */

import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;

import lombok.NoArgsConstructor;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

import java.util.Date;


@Audited
@Entity
@Table(name = "APPRAISAL_VEHICLE")
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "APPR_REF_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))

@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "APPR_VEH_SEQ")})
public class EAppraiseVehicle extends TransactionEntity {


    @Column(name="APPR_RETENSION_TIME")
    private Date appraisalRetensionTime;
    @Column(name="APPR_VALUE")

    private double appraisalValue;
    @Column(name="BB_VALUE")

    private double blackBookValue;
    @Column(name="BRAKE_SYS_FUEL")

    private String brakeSystemFuel;

    @Column(name= "E_SIGN_ID")
    private Long  eSignId;
    @Column(name="ENGINE_PERFORMANCE")

    private String enginePerformance;
    @Column(name="FIELD1")

    private String field1;
    @Column(name="FIELD2")

    private String field2;
    @Column(name="FIELD3")

    private String field3;
    @Column(name="LATITUDE")
    private String latitude;
    @Column(name="LONGITUDE")

    private String longitude;
    @Column(name="PROF_OPINION")

    private String professionalOpinion ;

    @Column(name = "STOCK_NUMBER")
    private Long stockNumber;
    @Column(name="TRANSMISSION")

    private String transmission ;
    @Column(name="MAKE")

    private String vehicleMake;
    @Column(name="MILES")

    private Long miles;
    @Column(name="MODEL")
    private String  vehicleModel ;
    @Column(name="SERIES")
    private String  vehicleSeries;
    @Column(name="STYLE")
    private String  style;
    @Column(name="YEAR")
    private Long vehicleYear;
    @Column(name="VIN_NUMBER ")
    private String vinNumber;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EDealerRegistration.class, fetch = FetchType.LAZY,cascade ={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "DEALER_ID",referencedColumnName = "DEALER_ID",nullable = false)
    private EDealerRegistration dealer;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EUserRegistration.class, fetch = FetchType.LAZY,cascade ={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "USER_ID",referencedColumnName = "USER_ID",nullable = false)
    private EUserRegistration user;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "appraisalRef",cascade = CascadeType.ALL)
    private EAppraisalTestDriveStatus appraisalTestDriveStatus;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "appraisalReference",cascade = CascadeType.ALL)
     private ESignDet signDet;


    public Date getAppraisalRetensionTime() {
        return appraisalRetensionTime;
    }

    public void setAppraisalRetensionTime(Date appraisalRetensionTime) {
        this.appraisalRetensionTime = appraisalRetensionTime;
    }

    public double getAppraisalValue() {
        return appraisalValue;
    }

    public void setAppraisalValue(double appraisalValue) {
        this.appraisalValue = appraisalValue;
    }

    public double getBlackBookValue() {
        return blackBookValue;
    }

    public void setBlackBookValue(double blackBookValue) {
        this.blackBookValue = blackBookValue;
    }

    public String getBrakeSystemFuel() {
        return brakeSystemFuel;
    }

    public void setBrakeSystemFuel(String brakeSystemFuel) {
        this.brakeSystemFuel = brakeSystemFuel;
    }

    public Long geteSignId() {
        return eSignId;
    }

    public void seteSignId(Long eSignId) {
        this.eSignId = eSignId;
    }

    public String getEnginePerformance() {
        return enginePerformance;
    }

    public void setEnginePerformance(String enginePerformance) {
        this.enginePerformance = enginePerformance;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getProfessionalOpinion() {
        return professionalOpinion;
    }

    public void setProfessionalOpinion(String professionalOpinion) {
        this.professionalOpinion = professionalOpinion;
    }

    public Long getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Long stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public Long getMiles() {
        return miles;
    }

    public void setMiles(Long miles) {
        this.miles = miles;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleSeries() {
        return vehicleSeries;
    }

    public void setVehicleSeries(String vehicleSeries) {
        this.vehicleSeries = vehicleSeries;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Long getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(Long vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public EDealerRegistration getDealer() {
        return dealer;
    }

    public void setDealer(EDealerRegistration dealer) {
        this.dealer = dealer;
    }

    public EUserRegistration getUser() {
        return user;
    }

    public void setUser(EUserRegistration user) {
        this.user = user;
    }

    public EAppraisalTestDriveStatus getAppraisalTestDriveStatus() {
        return appraisalTestDriveStatus;
    }

    public void setAppraisalTestDriveStatus(EAppraisalTestDriveStatus appraisalTestDriveStatus) {
        this.appraisalTestDriveStatus = appraisalTestDriveStatus;
    }

    public ESignDet getSignDet() {
        return signDet;
    }

    public void setSignDet(ESignDet signDet) {
        this.signDet = signDet;
    }
}
