package com.tns.collegeservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class College_Service_Controller {
	@Autowired(required=true)
	private College_Service service;
	
	@GetMapping("/collegeservice")
	public java.util.List<College> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/Collegeservice/{Clg_id}")
	public ResponseEntity<College> get(@PathVariable Integer Clg_id)
	{
		try
		{
			College Clg=service.get(Clg_id);
			return new ResponseEntity<College>(Clg,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/collegeservice")
	public void add(@RequestBody College Clg)
	{
		service.save(Clg);
	}
	
	@PutMapping("/collegeservice/{Clg_id}")
	public ResponseEntity<?> update(@RequestBody College Clg, @PathVariable Integer Clg_id)
	{
		College existClg=service.get(Clg_id);
		service.save(existClg);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/collegeservice/{Clg_id}")
	public void delete(@PathVariable Integer Clg_id)
	{
		service.delete(Clg_id);
	}

}
