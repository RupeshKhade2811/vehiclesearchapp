package com.factory.appraisal.vehiclesearchapp.persistence.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@MappedSuperclass
@Inheritance
@NoArgsConstructor
@AllArgsConstructor

public class TransactionEntity extends IdEntity {

    @CreatedBy
    @Column(name="created_By")
    private String createdBy;

    @CreatedDate
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    @Column(name = "created_On")
    private Date createdOn;


    @LastModifiedBy
    @Column(name = "modified_by")
    private String modifiedBy;

    @LastModifiedDate
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    @Column(name = "modified_On")
    private Date modifiedOn;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
