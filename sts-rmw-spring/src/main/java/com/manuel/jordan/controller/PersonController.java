package com.manuel.jordan.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.manuel.jordan.domain.Person;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
@Controller
@RequestMapping(path="/persons")
public class PersonController {

	@GetMapping(path="/save", produces=MediaType.TEXT_HTML_VALUE)
	public String saveOne(Model model){
		return "person/saveOne";
	}

	@PostMapping(path="/save",
				 consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,
				 produces=MediaType.TEXT_HTML_VALUE)
	public String saveOne(@Validated @ModelAttribute Person person,
			BindingResult result,
			RedirectAttributes redirectAttributes){
		return "redirect:/message";
	}

	@GetMapping(produces=MediaType.TEXT_HTML_VALUE)
	public String findAll(Model model){
		return "person/findAll";
	}

	@GetMapping(path="/{id}",
			    produces=MediaType.TEXT_HTML_VALUE)
	public String findOneById(@PathVariable String id, Model model){
		return "person/findOne";
	}

	@GetMapping(path="/update/{id}",
		        produces=MediaType.TEXT_HTML_VALUE)
	public String updateOne(@PathVariable String id, Model model){
		return "person/updateOne";
	}

	@PutMapping(path="/update/{id}",
			    consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			    produces=MediaType.TEXT_HTML_VALUE)
	public String updateOne(@PathVariable String id,
						@Validated @ModelAttribute Person person,
						BindingResult result,
						RedirectAttributes redirectAttributes){
		return "redirect:/message";
	}

	@GetMapping(path="/delete/{id}",
			    produces=MediaType.TEXT_HTML_VALUE)
	public String deleteOne(@PathVariable String id, Model model){
		return "person/deleteOne";
	}

	@DeleteMapping(path="/delete/{id}",
			   	  produces=MediaType.TEXT_HTML_VALUE)
	public String deleteOne(@PathVariable String id, RedirectAttributes redirectAttributes){
		return "redirect:/message";
	}

}