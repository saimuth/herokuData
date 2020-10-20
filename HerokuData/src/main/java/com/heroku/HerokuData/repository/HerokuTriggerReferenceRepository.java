package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.TriggerReference;


public interface HerokuTriggerReferenceRepository extends CrudRepository<TriggerReference, String> {
	@Query("FROM TriggerReference")
	public List<TriggerReference> getAllTriggerReference();
}
