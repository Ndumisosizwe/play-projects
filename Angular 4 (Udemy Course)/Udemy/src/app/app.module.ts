import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { Section2Component } from './section-2/section2/section2.component';
import { HeaderComponent } from './section_3(Building The App)/header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    Section2Component,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
