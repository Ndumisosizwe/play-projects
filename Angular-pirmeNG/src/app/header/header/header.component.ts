import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  public items = ['item1', 'item2'];
  public fileUploaded: File;

  constructor() {
  }

  ngOnInit() {
  }

  onClick() {
    console.log(this.fileUploaded);
  }

}
