package com.mindtree.PatientMicroService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.PatientMicroService.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

	@Query(value = "SELECT Count(id) FROM patient group by(visiteddoctor) having visiteddoctor=?1",nativeQuery = true)
	int countTotal(String docName);
}
