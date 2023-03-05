package com.factory.appraisal.vehiclesearchapp.persistence.model;
/**
 * @author Rupesh Khade
 */

import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
@Audited
@Entity
@Table(name = "APR_VEH_AC_CONDN")
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "AC_CONDN_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))
@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "APR_VEH_AC_CONDN_SEQ")})


public class EAppraisalVehicleAcCondition extends TransactionEntity {

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDriveStatus.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "VEH_STATUS_ID",nullable = false)                    //refkey
    private EAppraisalTestDriveStatus vehicleStatus;
    @Column(name = "COLD_AIR")
    private Boolean coldAir;
    @Column(name = "BAD_DISPLAY")
    private Boolean badDisplay;
    @Column(name = "FADED_DIS_OR_BTNS")
    private Boolean fadedDisplayOrButtons;
    @Column(name = "FAN_SPEED_MALFUNC")
    private Boolean fanSpeedMalfunction;
    @Column(name = "CLIMATE_CONTR_MALFUNC")
    private Boolean climateControlMalfunction;
    @Column(name = "HOT_OR_WARM_AIR")
    private Boolean hotOrWarmAir;
    @Column(name = "NOT_OPRNAL")
    private Boolean notOperational;

    public EAppraisalTestDriveStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(EAppraisalTestDriveStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public Boolean getColdAir() {
        return coldAir;
    }

    public void setColdAir(Boolean coldAir) {
        this.coldAir = coldAir;
    }

    public Boolean getBadDisplay() {
        return badDisplay;
    }

    public void setBadDisplay(Boolean badDisplay) {
        this.badDisplay = badDisplay;
    }

    public Boolean getFadedDisplayOrButtons() {
        return fadedDisplayOrButtons;
    }

    public void setFadedDisplayOrButtons(Boolean fadedDisplayOrButtons) {
        this.fadedDisplayOrButtons = fadedDisplayOrButtons;
    }

    public Boolean getFanSpeedMalfunction() {
        return fanSpeedMalfunction;
    }

    public void setFanSpeedMalfunction(Boolean fanSpeedMalfunction) {
        this.fanSpeedMalfunction = fanSpeedMalfunction;
    }

    public Boolean getClimateControlMalfunction() {
        return climateControlMalfunction;
    }

    public void setClimateControlMalfunction(Boolean climateControlMalfunction) {
        this.climateControlMalfunction = climateControlMalfunction;
    }

    public Boolean getHotOrWarmAir() {
        return hotOrWarmAir;
    }

    public void setHotOrWarmAir(Boolean hotOrWarmAir) {
        this.hotOrWarmAir = hotOrWarmAir;
    }

    public Boolean getNotOperational() {
        return notOperational;
    }

    public void setNotOperational(Boolean notOperational) {
        this.notOperational = notOperational;
    }
}
