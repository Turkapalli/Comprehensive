package com.mindtree.PatientMicroService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String visiteddoctor;
	private String dateofvisit;
	private String prescription;
	private int age;
	public Patient(int id, String name, String visiteddoctor, String dateofvisit, String prescription, int age) {
		super();
		this.id = id;
		this.name = name;
		this.visiteddoctor = visiteddoctor;
		this.dateofvisit = dateofvisit;
		this.prescription = prescription;
		this.age = age;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVisiteddoctor() {
		return visiteddoctor;
	}
	public void setVisiteddoctor(String visiteddoctor) {
		this.visiteddoctor = visiteddoctor;
	}
	public String getDateofvisit() {
		return dateofvisit;
	}
	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", visiteddoctor=" + visiteddoctor + ", dateofvisit="
				+ dateofvisit + ", prescription=" + prescription + ", age=" + age + "]";
	}
	
	
}
