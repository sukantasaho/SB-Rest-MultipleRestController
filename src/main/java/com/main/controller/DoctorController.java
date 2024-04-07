package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Doctor;
import com.main.services.IDoctorService;

@RestController
@RequestMapping("/doctor-api")
public class DoctorController 
{ 
	
	@Autowired
	private IDoctorService service;
	
	@PostMapping("/registerDoctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) 
	{
		 
		return service.saveDoctor(doctor);
	}

	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors()
	{
		 
		return service.getAllDoctors();
	}
}
