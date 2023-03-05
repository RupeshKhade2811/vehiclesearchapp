package com.factory.appraisal.vehiclesearchapp.persistence.model;


//kalyan
import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="APR_VEH_OIL_CONDN")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "V_OIL_CONDN_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))
@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "APR_VEH_OIL_CONDN_SEQ")})
public class EAppraisalVehicleOilCondition extends TransactionEntity {
//    @Column(name = "V_OIL_CONDN_ID")
//    private long vehicleOilConditionId;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDriveStatus.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "VEH_STATUS_ID",nullable = false)
    private EAppraisalTestDriveStatus vehicleStatus;

    @Column(name = "CLEAN_OIL")
    private boolean cleanOil ;
    @Column(name = "DIRTY_OIL")
    private boolean dirtyOil ;
    @Column(name = "WTR_IN_OIL")
    private boolean waterInOil;
    @Column(name = "CRT_LEVEL")
    private boolean correctLevel ;
    @Column(name = "S_QUART_LOW")
    private boolean  oneQuartLow ;
    @Column(name = "GT_QUART_LOW")
    private boolean moreThanAQuartLow ;
    @Column(name = "EC_GAUGE")
    private boolean electronicGauge ;

}
