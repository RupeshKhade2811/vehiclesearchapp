package com.factory.appraisal.vehiclesearchapp.repository;


//kalyan
import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleOilCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface AppraisalVehicleOilConditionRepo extends JpaRepository<EAppraisalVehicleOilCondition,Long> {
}
