package com.mindtree.PatientMicroService.Service;

import com.mindtree.PatientMicroService.Entity.Patient;
import com.mindtree.PatientMicroService.Exception.ResourceNotFoundException;

public interface PatientService {

	public Patient savePatient(Patient patient);

	public Patient getPatientById(int id) throws ResourceNotFoundException;


}
