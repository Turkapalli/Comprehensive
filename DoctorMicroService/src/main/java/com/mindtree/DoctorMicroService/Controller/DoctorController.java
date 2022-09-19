package com.mindtree.DoctorMicroService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DoctorMicroService.Entity.Doctor;
import com.mindtree.DoctorMicroService.Service.DoctorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}
	@GetMapping
	public List<String> getDoctors(){
		return doctorService.getDoctors();
		}
	@GetMapping("/")
	public List<Doctor> listDoctors(){
		return doctorService.listDoctors();
	}
	@GetMapping("/{Name}")
	public Doctor getDoctorByName(@PathVariable String Name) {
		return doctorService.getDoctorByName(Name);
	}
	@GetMapping("/getbyid/{id}")
	public Doctor getDoctorById(@PathVariable int id) {
		return doctorService.getDoctorById(id);
	}
}
