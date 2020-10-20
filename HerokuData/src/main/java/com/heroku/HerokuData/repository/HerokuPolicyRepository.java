package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.Policy;
@Repository
public interface HerokuPolicyRepository extends CrudRepository<Policy, String>{
	@Query("FROM Policy")
	public List<Policy> getAllPolicy();
}
