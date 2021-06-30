package com.village.SpringVillageApplication.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.village.SpringVillageApplication.model.CityDetails;

public class CityRepositoryImpl implements CityCustomReposity {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<CityDetails> findByCityName(String cityName) {
		String JPQL = "FROM CityDetails WHERE cityName=:name";
		TypedQuery<CityDetails> query = entityManager.createQuery(JPQL, CityDetails.class);
		query.setParameter("name", cityName);
		return query.getResultList();

	}

}
