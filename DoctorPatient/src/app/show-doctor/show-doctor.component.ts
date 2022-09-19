import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-show-doctor',
  templateUrl: './show-doctor.component.html',
  styleUrls: ['./show-doctor.component.css']
})
export class ShowDoctorComponent implements OnInit {
  doctors:any;
  doId:any;
  doctorflag:boolean=false;
  doctorinfo:any;
  constructor(private service:DoctorService,private router:Router) { }
  selectName(did :number){
    this.doctorflag=true;
    let response= this.service.getDoctorbyId(did);
    response.subscribe((data)=>this.doctorinfo=data);    
   }
  ngOnInit(): void {
    let response = this.service.getAllDoctors();
    response.subscribe((data)=>this.doctors=data);
  }
  back():void{
    this.router.navigate(['']);
  }
}
