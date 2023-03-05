package com.factory.appraisal.vehiclesearchapp.persistence.model;
// authorName:YogeshKumarV

import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.AuditTable;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited

@Entity
@Table(name = "APR_VEH_TIRE_CONDN")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "V_TIRE_CONDN_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))

@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "APR_VEH_TIRE_CONDN_SEQ")})
public class EAppraisalVehicleTireCondition extends TransactionEntity {

//    @Column(name = "V_TIRE_CONDN_ID")
//    private long vehicleTireConditionId;
    @Column(name = "T_265_OR_70R18")
    private boolean tireWidth;
    private boolean fourMatch;
    private boolean mismatched;
    @Column(name = "XLNT_TREAD")
    private boolean excellentTread;
    private boolean goodTread;
    private boolean poorTread;
    @Column(name = "NEEDS_RPLC")
    private boolean needsReplacement;
    @Column(name = "F_UNEVEN_WEAR_PTRN")
    private boolean frontUnevenWearPattern;
    @Column(name = "F_TIRES_BAD")
    private boolean frontTiresBad;
    @Column(name = "R_TIRES_BAD")
    private boolean rearTiresBad;

    @Column(name = "NO_SPARE_TIRE")
    private boolean noSpareTire;
    @Column(name = "SPARE_TIRE_ON_VEH")
    private boolean spareTireOnVehicle;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDriveStatus.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "VEH_STATUS_ID",nullable = false,referencedColumnName = "VEH_STATUS_ID")
    private EAppraisalTestDriveStatus vehicleStatus;
}