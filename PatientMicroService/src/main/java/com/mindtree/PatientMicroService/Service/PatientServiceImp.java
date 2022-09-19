package com.mindtree.PatientMicroService.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindtree.PatientMicroService.Entity.Patient;
import com.mindtree.PatientMicroService.Exception.ResourceNotFoundException;
import com.mindtree.PatientMicroService.Repository.PatientRepository;
import com.mindtree.PatientMicroService.VO.Doctor;

@Service
public class PatientServiceImp implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		Patient sp=new Patient();
		sp=patientRepository.save(patient);
		ResponseEntity<Doctor> d= restTemplate.getForEntity("http://localhost:8085/doctors/"+patient.getVisiteddoctor(), Doctor.class);
		Doctor doc=d.getBody();
		doc.setNumberofpatients(patientRepository.countTotal(doc.getName()));
	    ResponseEntity<Doctor> savedDoctor=restTemplate.postForEntity("http://localhost:8085/doctors",doc, Doctor.class);
		return patientRepository.save(patient);
	}

	@Override
	public Patient getPatientById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Patient> patient=patientRepository.findById(id);
		Patient savedPatient=new Patient();
		if(patient.isPresent()) {
			savedPatient=patient.get();
		}
		else {
			throw new ResourceNotFoundException("Patient", "id", savedPatient);
		}
		return savedPatient;
	}
	
}
