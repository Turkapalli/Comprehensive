package com.mindtree.DoctorMicroService.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mindtree.DoctorMicroService.Entity.Doctor;

public interface DoctorService {

	public ResponseEntity<Doctor> saveDoctor(Doctor doctor);

	public List<String> getDoctors();

	public List<Doctor> listDoctors();

	public Doctor getDoctorByName(String Name);

	public Doctor getDoctorById(int id);

}
