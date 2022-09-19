package com.mindtree.DoctorMicroService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.DoctorMicroService.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

	@Query(value = "SELECT name FROM doctor",nativeQuery = true)
	List<String> findAllByName();

	
	@Query(value = "SELECT * FROM doctor WHERE name=?1",nativeQuery = true)
	Doctor getDoctorByName(String name);

}
