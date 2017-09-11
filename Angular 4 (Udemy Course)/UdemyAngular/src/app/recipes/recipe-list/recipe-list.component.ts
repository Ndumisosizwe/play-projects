import {Component, OnInit} from '@angular/core';
import {Recipe} from '../recipe.model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  recipes: Recipe[] = [
    new Recipe('First Recipe', 'This is simply a test',
      'http://www.coca-colacompany.com/content/dam/journey/us/en/global/2012/11/chicken-wings-604mk112612-604-337-3f7d77f6.rendition.598.336.jpg'),
    new Recipe('Second Recipe', 'This is simply a test',
      'http://www.seriouseats.com/images/2016/07/20160711-eggplant-recipes-roundup-06.jpg')
  ];

  constructor() {
  }

  ngOnInit() {
  }

}
