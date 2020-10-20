package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.AnonymizationPatten;
import com.heroku.HerokuData.model.FieldAnonymizeMapping;

@Repository
public interface HerokuFieldAnonymizeRepository extends CrudRepository<FieldAnonymizeMapping, String> {
	@Query("FROM FieldAnonymizeMapping")
	public List<FieldAnonymizeMapping> getAllFieldAnonymize(); 
}
