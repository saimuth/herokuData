package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.ImpactField;

public interface HerokuImpactFieldRepository extends CrudRepository<ImpactField, String> {

	@Query("FROM ImpactField")
	public List<ImpactField> getAllImpactField(); 
}
