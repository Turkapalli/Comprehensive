package com.mindtree.PatientMicroService.Test;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindtree.PatientMicroService.Controller.PatientController;
import com.mindtree.PatientMicroService.Entity.Patient;
import com.mindtree.PatientMicroService.Repository.PatientRepository;
import com.mindtree.PatientMicroService.Service.PatientService;

@WebMvcTest(PatientController.class)
public class PatientTest {

	  @MockBean
	  private PatientRepository patientRepository;
	  
	  @MockBean
	  private PatientService patientService;

	  @Autowired
	  private MockMvc mockMvc;

	  @Autowired
	  private ObjectMapper objectMapper;

	  @Test
	  void shouldCreatePatient() throws Exception {
	    Patient patient=new Patient();

	    mockMvc.perform(post("/patients/").contentType(MediaType.APPLICATION_JSON)
	        .content(objectMapper.writeValueAsString(patient)))
	        .andExpect(status().isOk())
	        .andDo(print());
	  }

	  @Test
	  void shouldReturnPatient() throws Exception {
	    int id=1;
	    Patient p=new Patient();
	    when(patientRepository.findById(id)).thenReturn(Optional.of(p));
	    mockMvc.perform(get("/patients/{id}", id)).andExpect(status().isOk())
	        .andDo(print());
	  }
	 
	  
}
