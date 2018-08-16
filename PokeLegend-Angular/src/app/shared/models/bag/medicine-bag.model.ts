import { Medicine } from '../item/medicine.model';

export interface MedicineBag {
    medicineBagId   : number;
    medicines       : Medicine[];
}