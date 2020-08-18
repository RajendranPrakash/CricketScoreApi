import { Injectable } from '@angular/core';
import { Player } from './modal/player';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CricketscoreService {

  constructor(private http: HttpClient) { }

  add(player : Player) {
    console.log("services invoked "+player.name);
    //this.http.post("http://localhost:8080/playerscore",player).subscribe((response)=> console.log(response));
    this.http.post("/playerscore",player).subscribe((response)=> console.log(response));
  }

  getScoreBoard() {
    console.log("services invoked fetching scoreboard");
    //this.http.get("http://localhost:8080/getscoreboard").subscribe((response)=> console.log(response));
    this.http.get("/getscoreboard").subscribe((response)=> console.log(response));
  }
}
