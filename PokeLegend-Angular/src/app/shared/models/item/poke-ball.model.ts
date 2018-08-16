import { Merchandise } from './merchandise.model';

export interface Pokeball extends Merchandise {
    pokeballId  : number;
    catchRate   : number;
}