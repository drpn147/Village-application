package com.village.SpringVillageApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.village.SpringVillageApplication.model.VillageDetails;

@Repository
public interface VillageRepository extends JpaRepository<VillageDetails, Integer> {

}
