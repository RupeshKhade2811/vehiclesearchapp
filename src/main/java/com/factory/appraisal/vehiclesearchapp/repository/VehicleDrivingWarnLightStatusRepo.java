package com.factory.appraisal.vehiclesearchapp.repository;
//Author:yudhister vijay
import com.factory.appraisal.vehiclesearchapp.persistence.model.EVehicleDrivingWarnLightStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VehicleDrivingWarnLightStatusRepo extends JpaRepository<EVehicleDrivingWarnLightStatus,Long> {




}
