package com.mindtree.DoctorMicroService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String specialist;
	private int numberofpatients;
	private int age;
	public Doctor(int id, String name, String gender, String specialist, int numberofpatients, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.specialist = specialist;
		this.numberofpatients = numberofpatients;
		this.age = age;
	}
	public Doctor() {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int getNumberofpatients() {
		return numberofpatients;
	}
	public void setNumberofpatients(int numberofpatients) {
		this.numberofpatients = numberofpatients;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", gender=" + gender + ", specialist=" + specialist
				+ ", numberofpatients=" + numberofpatients + ", age=" + age + "]";
	}
	
	
	
}
