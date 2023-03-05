package com.factory.appraisal.vehiclesearchapp.repository;


import com.factory.appraisal.vehiclesearchapp.Author;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleTireCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Author("Yogesh Kumar V")
@Repository
@Transactional
public interface AppraisalVehicleTireConditionRepo extends JpaRepository<EAppraisalVehicleTireCondition,Long> {
}
