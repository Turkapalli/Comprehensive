package com.mindtree.DoctorMicroService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mindtree.DoctorMicroService.Entity.Doctor;
import com.mindtree.DoctorMicroService.Repository.DoctorRepository;

@Service
public class DoctorServiceImp implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public ResponseEntity<Doctor> saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Doctor>(doctorRepository.save(doctor),HttpStatus.CREATED);
	}

	@Override
	public List<String> getDoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAllByName();
	}

	@Override
	public List<Doctor> listDoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorByName(String Name) {
		// TODO Auto-generated method stub
		return doctorRepository.getDoctorByName(Name);
	}

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(id).get();
		}
}
