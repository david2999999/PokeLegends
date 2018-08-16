import { PokemonBox } from './pokemon-box.model';
import { Pokemon } from '../pokemon/pokemon.model';

export class PokemonPC {
    constructor(private pokemonBoxes: PokemonBox[] = [], private maxBoxes: number = 15) {}

    storePokemon(pokemon: Pokemon, boxNumber: number) {
       if (boxNumber >= this.maxBoxes || this.pokemonBoxes[boxNumber].isFull()) return false;
       
       this.pokemonBoxes[boxNumber].addPokemon(pokemon);
       return true;
    }
    
    getPokemon(boxNumber: number, pokemonIndex: number) {
        if (boxNumber >= this.maxBoxes || !this.pokemonBoxes[boxNumber][pokemonIndex]) return null;
        
        return this.pokemonBoxes[boxNumber][pokemonIndex];
    }
    
    releasePokemon(boxNumber: number, pokemonIndex: number) {
        if (boxNumber >= this.maxBoxes) return false;
        
        return this.pokemonBoxes[boxNumber].releasePokemon(pokemonIndex);
    }
}