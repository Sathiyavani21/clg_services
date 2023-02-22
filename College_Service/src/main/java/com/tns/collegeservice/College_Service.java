package com.tns.collegeservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class College_Service {
	@Autowired
	private College_Service_Repository repo;
	
	public List<College> listAll()
	{
		return repo.findAll();
	}
	
	public void save(College Clg)
	{
		repo.save(Clg);
	}
	
	public College get(Integer Clg_id)
	{
		return repo.findById(Clg_id).get();
	}
	public void delete(Integer Clg_id)
	{
		repo.deleteById(Clg_id);
	}

}
