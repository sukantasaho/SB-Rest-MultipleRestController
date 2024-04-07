package com.main.services;

import java.util.List;

import com.main.entity.Doctor;

public interface IDoctorService 
{
    public Doctor saveDoctor(Doctor doctor);
    public List<Doctor> getAllDoctors();
}
