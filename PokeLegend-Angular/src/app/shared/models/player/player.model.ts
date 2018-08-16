import { PokemonBag } from '../bag/pokemon-bag.model';
import { Bag } from '../bag/bag.model';

export class Player {
    pokemonBag  : PokemonBag;
    bag         : Bag;

    constructor(public playerId: number, public name: string, public gender: string) {
        this.pokemonBag = new PokemonBag();
    }
}