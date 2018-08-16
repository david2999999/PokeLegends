import { PokemonBag } from '../bag/pokemon-bag.model';
import { Bag } from '../bag/bag.model';

export interface Player {
    playerId    : number;
    name        : string;
    gender      : string;
    pokemonBag  : PokemonBag;
    bag         : Bag;
}