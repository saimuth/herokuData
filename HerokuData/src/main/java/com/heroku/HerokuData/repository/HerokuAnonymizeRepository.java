package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.AnonymizationPatten;
@Repository
public interface HerokuAnonymizeRepository extends CrudRepository<AnonymizationPatten, String> {
	@Query("FROM AnonymizationPatten")
	public List<AnonymizationPatten> getAllAnonymizationpatten(); 
}
