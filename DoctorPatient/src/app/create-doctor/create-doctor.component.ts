import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-create-doctor',
  templateUrl: './create-doctor.component.html',
  styleUrls: ['./create-doctor.component.css']
})
export class CreateDoctorComponent implements OnInit {
  doctor:Doctor=new Doctor();

  constructor(private doctorservice:DoctorService,private router:Router) { }

  ngOnInit(): void {
  }
  saveDoctor(){
    this.doctorservice.createDoctor(this.doctor).subscribe(data =>{
      console.log(data);
      //this.goToEmployeeList();
    },
    error => console.log(error));
    this.router.navigate(['']);
  }
  onSubmit(){
    console.log(this.doctor);
    this.saveDoctor();
    alert("Doctor Registration Successful");
  }
}
