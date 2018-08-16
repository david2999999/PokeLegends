import { Merchandise } from './merchandise.model';

export interface Medicine extends Merchandise {
    medicineId  : number;
}