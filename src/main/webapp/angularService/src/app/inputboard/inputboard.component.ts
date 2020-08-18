import { Component, OnInit } from '@angular/core';
import { Player } from '../modal/player';
import { CricketscoreService } from '../cricketscore.service';
interface Team {
  value: string;
  viewValue: string;
}
@Component({
  selector: 'app-inputboard',
  templateUrl: './inputboard.component.html',
  styleUrls: ['./inputboard.component.css']
})
export class InputboardComponent implements OnInit {


  player : Player;
  teams: Team[] = [
    {value: 'Team1', viewValue: 'Team - 1'},
    {value: 'Team2', viewValue: 'Team - 2'},
  ];
  constructor(private cricketScoreUpdateService : CricketscoreService) { }

  ngOnInit(): void {
    this.player = new Player;
  }

  add() {
    console.log(this.player);
    this.cricketScoreUpdateService.add(this.player);
    console.log("Clearing "+this.player);
    this.player = new Player;
  } 

}
