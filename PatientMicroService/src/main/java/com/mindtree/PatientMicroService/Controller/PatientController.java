package com.mindtree.PatientMicroService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.PatientMicroService.Entity.Patient;
import com.mindtree.PatientMicroService.Service.PatientService;

@RestController
@CrossOrigin("*")
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable int id){
		return patientService.getPatientById(id);
	}
	
}
