import { TestBed } from '@angular/core/testing';

import { AuthorizeServiceService } from './authorize-service.service';

describe('AuthorizeServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AuthorizeServiceService = TestBed.get(AuthorizeServiceService);
    expect(service).toBeTruthy();
  });
});
