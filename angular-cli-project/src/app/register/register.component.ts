import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  private firstName: string = '';
  private lastName: string = '';
  private emailAddress: string = '';
  private password: any = '';
  private confirmpassword: any = '';
  alertMessage: string = "Please Enter Address";
  alertHTML = "<div class='alert alert-danger' role='alert'>" +
  "<span class='glyphicon glyphicon-exclamation-sign' aria-hidden='true'></span>" +
  "<span class='sr-only'>Error: </span>" + this.alertMessage +
  "</div>";
  constructor() { }

  ngOnInit() {
  }
  bindFirstName(event: Event) {
    this.firstName = (<HTMLInputElement>event.target).value;
  }
  bindLastName(event: Event) {
    this.lastName = (<HTMLInputElement>event.target).value;
  }
  bindEmail(event: Event) {
    this.lastName = (<HTMLInputElement>event.target).value;
  }



  registerUser() {
    if (this.firstName.length < 1) {

    }
  }

}
