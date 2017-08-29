import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-section-two',
  templateUrl: './section2.component.html',
  styleUrls: ['./section2.component.css']
})
export class Section2Component implements OnInit {

  list = ['Ndumiso', 'Mercedece', 'BMW', 'Caravan', 'Super Group'];

  constructor() {
  }

  ngOnInit() {

  }

}
