package com.factory.appraisal.vehiclesearchapp.repository;

import com.factory.appraisal.vehiclesearchapp.Author;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EConfigurationCodes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Author("Yogesh Kumar V")
@Repository
@Transactional
public interface ConfigurationCodesRepo extends JpaRepository<EConfigurationCodes,Long> {

    Page<EConfigurationCodes> findAllByValidIsTrueOrderByCreatedOnDesc(Pageable pageable);
}
