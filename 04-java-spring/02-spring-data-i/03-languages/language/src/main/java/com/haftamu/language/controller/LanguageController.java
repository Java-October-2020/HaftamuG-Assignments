package com.haftamu.language.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haftamu.language.models.Language;
import com.haftamu.language.services.LanguageService;

@Controller
public class LanguageController{
	
	@Autowired
	private LanguageService lService;
	
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("lang") Language lang) {
		List<Language> langs = lService.allLangs();
		model.addAttribute("langs", langs);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLangHome(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		}
		else {
			lService.createLang(lang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{index}")
	public String findLangByIndex(Model model, @PathVariable(value="index") Long index) {
		Language lang =  lService.findLanguage(index);
		model.addAttribute("langs",lang);
		return "dashboard.jsp";
	}
	
	@RequestMapping("languages/edit/{index}")
	public String updateLang(@PathVariable("index") Long index, @Valid @ModelAttribute("lang") Language lang, Model model) {
		lang= lService.findLanguage(index);
		if (lang != null) {
			model.addAttribute(lang);
			return "edit.jsp";
		}
		else {
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value = "languages/edit/{index}", method=RequestMethod.PUT)
	public String update(@PathVariable("index") Long id, @Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		}
		else { 
			this.lService.update(lang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("languages/delete/{index}")
	public String deleteLang(@PathVariable(value="index") Long index) {
		this.lService.deleteLang(index);
		return "redirect:/languages";
	}
}