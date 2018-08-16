import { Pokeball } from '../item/poke-ball.model';

export interface PokeBallBag {
    pokeballBagId   : number;
    pokeballs       : Pokeball[];
}