import { Pokemon } from '../pokemon/pokemon.model';

export class PokemonBag {
    constructor(private pokemons: Pokemon[] = []) {}
    
    getNumberOfFaintedPokemon() {
        if (pokemons.length === 0) return 0;
        
        let numberFainted = 0;
        for (let pokemon of this.pokemons) {
            if (pokemon.currentStat.hp === 0) {
                numberFainted++;
            }
        }
        
        return numberFainted;
    }
}