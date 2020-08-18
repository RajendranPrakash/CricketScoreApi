import { Component, OnInit } from '@angular/core';
import { CricketscoreService } from '../cricketscore.service';

@Component({
  selector: 'app-scorecard',
  templateUrl: './scorecard.component.html',
  styleUrls: ['./scorecard.component.css']
})
export class ScorecardComponent implements OnInit {

  constructor(private service : CricketscoreService) { }

  ngOnInit(): void {
  }

  get() {
    console.log("get invoked fetching scoreboard");
    this.service.getScoreBoard();
  }
}
