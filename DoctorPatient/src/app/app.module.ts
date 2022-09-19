import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ShowDoctorComponent } from './show-doctor/show-doctor.component';
import { FormsModule } from '@angular/forms';
import { ShowPatientComponent } from './show-patient/show-patient.component';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ShowDoctorComponent,
    ShowPatientComponent,
    CreateDoctorComponent,
    CreatePatientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
