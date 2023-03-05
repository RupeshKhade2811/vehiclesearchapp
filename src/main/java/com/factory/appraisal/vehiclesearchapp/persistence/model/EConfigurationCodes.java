package com.factory.appraisal.vehiclesearchapp.persistence.model;
// authorName : YogeshKumarV,Rupesh Khade

import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;


import javax.persistence.*;

@Audited
@Entity
@Table(name = "CONFIG_CODES")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "CODE_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))

@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "config_codes_seq")})
public class EConfigurationCodes extends TransactionEntity {
//    @Column(name = "CODE_ID")
//    private Long codeId;
    private String codeType;
    private String shortCode;
    private String longCode;
    private String shortDescription;



}