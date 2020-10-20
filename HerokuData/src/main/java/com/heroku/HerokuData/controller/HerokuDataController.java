package com.heroku.HerokuData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.heroku.HerokuData.model.AnonymizationPatten;
import com.heroku.HerokuData.model.Category;
import com.heroku.HerokuData.model.CountryCode;
import com.heroku.HerokuData.model.FieldAnonymizeMapping;
import com.heroku.HerokuData.model.ImpactField;
import com.heroku.HerokuData.model.ImpactTable;
import com.heroku.HerokuData.model.Policy;
import com.heroku.HerokuData.model.TriggerReference;
import com.heroku.HerokuData.service.HerokuDataService;

@RestController
@RequestMapping("/heroku")
public class HerokuDataController {
	@Autowired
	private HerokuDataService dataService;

	/* Methode to display home page */
	@RequestMapping(value = "/home")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	/* Methode to display input details page */
	@RequestMapping("/input")
	public ModelAndView getAllUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("allCategories", dataService.getAllCategories());
		modelAndView.addObject("allCountries", dataService.getAllCountries());
		modelAndView.addObject("allPolicies", dataService.getAllPolicy());
		modelAndView.addObject("allAnonymizationPattern", dataService.getAllAnonymizationpatten());
		modelAndView.addObject("allImpactTable", dataService.getAllImpactTable());
		modelAndView.addObject("allImpactFields", dataService.getAllImpactField());
		modelAndView.addObject("allTriggerReference", dataService.getAllTriggerReference());
		modelAndView.addObject("allFieldAnonymizeMapping", dataService.getAllFieldAnonymize());

		modelAndView.setViewName("input");
		return modelAndView;

	}

	/*
	 * @RequestMapping("/p") public List<AnonymizationPatten> getAllPolicy() {
	 * List<AnonymizationPatten> obj = dataService.getAllAnonymizationpatten();
	 * return obj; }
	 * 
	 * @RequestMapping("/it") public List<ImpactTable> getAllImpactTable() {
	 * List<ImpactTable> obj = dataService.getAllImpactTable(); return obj; }
	 * 
	 * @RequestMapping("/if") public List<ImpactField> getAllImpactField() {
	 * List<ImpactField> obj = dataService.getAllImpactField(); return obj; }
	 * 
	 * @RequestMapping("/t") public List<TriggerReference> getAllTriggerReference()
	 * { List<TriggerReference> obj = dataService.getAllTriggerReference(); return
	 * obj; }// getAllFieldAnonymize
	 * 
	 * @RequestMapping("/fa") public List<FieldAnonymizeMapping>
	 * getAllFieldAnonymize() { List<FieldAnonymizeMapping> obj =
	 * dataService.getAllFieldAnonymize(); return obj; }
	 * 
	 * @RequestMapping("/ap") public List<AnonymizationPatten>
	 * getAllAnonymizationpatten() { List<AnonymizationPatten> obj =
	 * dataService.getAllAnonymizationpatten(); return obj; }
	 */
}