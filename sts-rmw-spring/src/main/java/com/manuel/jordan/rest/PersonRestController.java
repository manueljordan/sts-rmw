package com.manuel.jordan.rest;

import java.net.URI;
import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manuel.jordan.domain.Person;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
@Controller
@RequestMapping(path="/persons")
public class PersonRestController {

	/**
	 * manolito
	 * @param person
	 * @param result
	 * @return
	 * @throws MethodArgumentNotValidException
	 */
	@PostMapping(consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Void> saveOne(
			@Validated @RequestBody Person person,
			BindingResult result) throws MethodArgumentNotValidException {
		URI location = null;
		return ResponseEntity.created(location).build();
	}

	@GetMapping(path="/{id}",
			    produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody Person findOneById(@PathVariable String id){
		return null;
	}

	@GetMapping(produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody Collection<Person> findAll(){
		return null;
	}

	@PutMapping(path="/{id}",
			   consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Void> updateOne(
			@PathVariable String id,
			@Validated @RequestBody Person person,
			BindingResult result) throws MethodArgumentNotValidException {
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping(path="/{id}")
	public ResponseEntity<Void> deleteOne(@PathVariable String id){
		return ResponseEntity.noContent().build();
	}

}