package com.village.SpringVillageApplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.village.SpringVillageApplication.model.CityDetails;

@Repository
public interface CityRepository extends JpaRepository<CityDetails, Integer>,CityCustomReposity {

}
