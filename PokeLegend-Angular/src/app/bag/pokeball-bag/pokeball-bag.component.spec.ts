import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PokeballBagComponent } from './pokeball-bag.component';

describe('PokeballBagComponent', () => {
  let component: PokeballBagComponent;
  let fixture: ComponentFixture<PokeballBagComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PokeballBagComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PokeballBagComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
