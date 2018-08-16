import { Merchandise } from './merchandise.model';

export interface Berry extends Merchandise {
    berryId     : number;
    growthTime  : number;
    size        : number;
    firmness    : string;
}