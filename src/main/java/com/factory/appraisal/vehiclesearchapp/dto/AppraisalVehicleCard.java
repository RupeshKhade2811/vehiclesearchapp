package com.factory.appraisal.vehiclesearchapp.dto;
/**
 *
 * This is the Model class use for to send the data to UI
 *
 * @author Rupesh Khade
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ApiModel(description = "Appraisal card details")
public class AppraisalVehicleCard {

    private Long id;
    @ApiModelProperty(notes = "Manufacturer name")
    private String vehicleMake ;
    private String  vehicleModel ;
    private Long miles;
    private String appraisalValue;
    private String createdBy;
    private Long vehicleYear;
    private AppraisalTestDRStsImages appraisalTestDriveStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Long getMiles() {
        return miles;
    }

    public void setMiles(Long miles) {
        this.miles = miles;
    }

    public String getAppraisalValue() {
        return appraisalValue;
    }

    public void setAppraisalValue(String appraisalValue) {
        this.appraisalValue = appraisalValue;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(Long vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public AppraisalTestDRStsImages getAppraisalTestDriveStatus() {
        return appraisalTestDriveStatus;
    }

    public void setAppraisalTestDriveStatus(AppraisalTestDRStsImages appraisalTestDriveStatus) {
        this.appraisalTestDriveStatus = appraisalTestDriveStatus;
    }
}
