package com.factory.appraisal.vehiclesearchapp.persistence.model;
// authorName:YogeshKumarV


import com.factory.appraisal.vehiclesearchapp.constants.AppraisalConstants;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited

@Entity
@Table(name = "DEALER_REG")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "DEALER_ID"))
@AttributeOverride(name = "valid",column= @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))
@GenericGenerator(name = AppraisalConstants.SEQUENCE_NAME,
        strategy = AppraisalConstants.CUSTOM_SEQUENCE_GENERATOR,
        parameters = {@Parameter(name = "sequence", value = "DEALER_REG_SEQ")})
public class EDealerRegistration extends TransactionEntity {


//    @Column(name="DEALER_ID")
//    private  long dealerId;
    private String name;
    private String clientFirstName;
    private String clientLastName;
    @Column(name ="APT_NUMBER")
    private String ApartmentNumber;
    private String city;
    private String email;
    private String password;
    private String phoneNumber;
    @Column(name = "PROFILE_PIC")
    private String profilePicture;
    private String state;
    private String streetAddress;
    private String zipCode;
    private String latitude;
    private String longitude;
    @Column(name = "TAX_CERT")
    private String taxCertificate;
    @Column(name = "DS_NAME")
    private String dealershipUserNames;
    @Column(name = "DS_ADDR")
    private String dealershipAddress;
    @Column(name = "DS_STREET")
    private String dealershipStreet;
    @Column(name = "DS_CITY")
    private String dealershipCity;
    @Column(name = "DS_ZIP_CODE")
    private String dealershipZipCode;
    @Column(name = "DS_PHONE_NO")
    private String dealershipPhoneNumber;
    @Column(name = "DS_PIC")
    private String dealershipPicture;
    @Column(name = "DS_LIC")
    private String dealershipLicense;
    @Column(name = "CORP_NAME")
    private String corporationName;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EConfigurationCodes.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "CODE_ID",nullable = false,referencedColumnName = "CODE_ID")
    private EConfigurationCodes configCodes;
}