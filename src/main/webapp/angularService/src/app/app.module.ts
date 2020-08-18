import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { InputboardComponent } from './inputboard/inputboard.component';
import { ScorecardComponent } from './scorecard/scorecard.component';
import { CricketscoreService } from './cricketscore.service'
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    InputboardComponent,
    ScorecardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CricketscoreService],
  bootstrap: [AppComponent]
})
export class AppModule { }
