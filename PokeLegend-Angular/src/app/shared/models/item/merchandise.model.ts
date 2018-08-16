import { Category } from './category.enum';

export class Merchandise {
    name        : String;
    price       : number;
    sellPrice   : number;
    location    : string;
    description : string;
    amount      : string;
    category    : Category;
}