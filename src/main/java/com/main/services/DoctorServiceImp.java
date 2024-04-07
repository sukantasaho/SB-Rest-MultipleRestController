package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Doctor;
import com.main.repository.IDoctorRepository;

@Service("dService")
public class DoctorServiceImp implements IDoctorService
{

	@Autowired
	private IDoctorRepository repo;
	
	@Override
	public Doctor saveDoctor(Doctor doctor) 
	{
		 
		return repo.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors()
	{
		 
		return repo.findAll();
	}

}
