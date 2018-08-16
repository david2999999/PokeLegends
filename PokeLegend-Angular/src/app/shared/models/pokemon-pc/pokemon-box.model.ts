import { Pokemon } from '../pokemon/pokemon.model';

export class PokemonBox {
    constructor(private pokemonList : Pokemon[] = [], private maxCapacity: number = 30) {}
    
    addPokemon(pokemon: Pokemon) {
        if (this.pokemonList.length >= this.maxCapacity) {
            return false;
        } 
        
        this.pokemonList.push(pokemon);
        return true;
    }
    
    isFull() {
        return this.pokemonList.length === this.maxCapacity;
    }
    
    getPokemon(index: number) {
        return this.pokemonList[index];
    }
    
    numberOfPokemons() {
        return this.pokemonList.length;
    }
}