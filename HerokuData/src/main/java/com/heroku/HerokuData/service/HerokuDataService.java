package com.heroku.HerokuData.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heroku.HerokuData.model.AnonymizationPatten;
import com.heroku.HerokuData.model.Category;
import com.heroku.HerokuData.model.CountryCode;
import com.heroku.HerokuData.model.FieldAnonymizeMapping;
import com.heroku.HerokuData.model.ImpactField;
import com.heroku.HerokuData.model.ImpactTable;
import com.heroku.HerokuData.model.Policy;
import com.heroku.HerokuData.model.TriggerReference;
import com.heroku.HerokuData.repository.HerokuAnonymizeRepository;
//import com.heroku.HerokuData.repository.HerokuAnonymizeRepository;
import com.heroku.HerokuData.repository.HerokuCountryRepository;
import com.heroku.HerokuData.repository.HerokuDataRepository;
import com.heroku.HerokuData.repository.HerokuFieldAnonymizeRepository;
import com.heroku.HerokuData.repository.HerokuImpactFieldRepository;
import com.heroku.HerokuData.repository.HerokuImpactTableRepository;
//import com.heroku.HerokuData.repository.HerokuFieldAnonymizeMappingRepository;
import com.heroku.HerokuData.repository.HerokuPolicyRepository;
import com.heroku.HerokuData.repository.HerokuTriggerReferenceRepository;

@Service
public class HerokuDataService {

	@Autowired
	private HerokuDataRepository categoryRepository;
	@Autowired
	private HerokuCountryRepository countryRepository;

	@Autowired
	private HerokuAnonymizeRepository anonymizeRepository;
	@Autowired
	private HerokuImpactTableRepository impactTableRepository;

	@Autowired
	private HerokuImpactFieldRepository impactFieldRepository;

	@Autowired
	private HerokuTriggerReferenceRepository triggerReferenceRepository;

	@Autowired
	private HerokuFieldAnonymizeRepository fieldAnonymizeMappingRepository;

	@Autowired
	private HerokuPolicyRepository policyRepository;

	public List<Category> getAllCategories() {
		List<Category> category = new ArrayList<>();
		return categoryRepository.getAll();
	}

	public List<CountryCode> getAllCountries() {
		List<CountryCode> countryCode = new ArrayList<>();
		return countryRepository.getAllCountries();
	}

	public List<Policy> getAllPolicy() {

		return policyRepository.getAllPolicy();
	}

	public List<AnonymizationPatten> getAllAnonymizationpatten() {

		return anonymizeRepository.getAllAnonymizationpatten();
	}

	public List<ImpactTable> getAllImpactTable() {

		return impactTableRepository.getAllImpactTable();
	}

	public List<ImpactField> getAllImpactField() {

		return impactFieldRepository.getAllImpactField();
	}

	public List<TriggerReference> getAllTriggerReference() {

		return triggerReferenceRepository.getAllTriggerReference();
	}

	public List<FieldAnonymizeMapping> getAllFieldAnonymize() {

		return fieldAnonymizeMappingRepository.getAllFieldAnonymize();
	}

}
