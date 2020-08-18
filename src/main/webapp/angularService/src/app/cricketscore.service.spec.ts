import { TestBed } from '@angular/core/testing';

import { CricketscoreService } from './cricketscore.service';

describe('CricketscoreService', () => {
  let service: CricketscoreService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CricketscoreService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
