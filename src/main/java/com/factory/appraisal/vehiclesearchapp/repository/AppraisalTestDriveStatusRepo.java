package com.factory.appraisal.vehiclesearchapp.repository;
//Author:Rupesh khade

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalTestDriveStatus;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface AppraisalTestDriveStatusRepo extends JpaRepository<EAppraisalTestDriveStatus,Long> {


}
