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

import com.manuel.jordan.domain.Band;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
@Controller
@RequestMapping(path="/bands")
public class BandRestController {

	@PostMapping(consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Void> saveOne(
			@Validated @RequestBody Band band,
			BindingResult result) throws MethodArgumentNotValidException {
		URI location = null;
		return ResponseEntity.created(location).build();
	}

	@GetMapping(path="/{id}",
			    produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody Band findOneById(@PathVariable String id){
		return null;
	}

	@GetMapping(produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody Collection<Band> findAll(){
		return null;
	}

	@PutMapping(path="/{id}",
			   consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Void> updateOne(
			@PathVariable String id,
			@Validated @RequestBody Band band,
			BindingResult result) throws MethodArgumentNotValidException {
		return ResponseEntity.noContent().build();
	}

	/**
	 * Deletes a band according its {@code id}
	 *
	 * @param id input
	 * @return a {@code ResponseEntity<Void>}
	 */
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Void> deleteOne(@PathVariable String id){
		return ResponseEntity.noContent().build();
	}

}