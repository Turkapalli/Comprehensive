import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {

  patient:Patient = new Patient();
 
  message:any;
  doctors:any;
  doctorinfo:any;
  constructor(private patientservice:PatientService,private doctorservice:DoctorService,private router:Router) { }

  ngOnInit(): void {
    let response = this.doctorservice.getAllDoctors();
    response.subscribe((data)=>this.doctors=data);
  }
  public register(){
    let response = this.patientservice.createPatient(this.patient);
    response.subscribe((data)=>this.message=data);
    alert("Patient Registration Successful");
    this.router.navigate(['']);

  }
  selectName(pid :number){
   
    let response= this.doctorservice.getDoctorbyId(pid);
    response.subscribe((data)=>this.doctorinfo=data);

  
   }
}
