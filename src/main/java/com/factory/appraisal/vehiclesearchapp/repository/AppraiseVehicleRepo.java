package com.factory.appraisal.vehiclesearchapp.repository;
//Author:Rupesh khade
import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraiseVehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface AppraiseVehicleRepo extends JpaRepository<EAppraiseVehicle,Long> {
    /**
     *
     * @param Id
     * @param pageable
     * @return
     */
     Page<EAppraiseVehicle> findAllByValidIsTrueAndUserIdOrderByCreatedOnDesc(Long Id, Pageable pageable);


}
