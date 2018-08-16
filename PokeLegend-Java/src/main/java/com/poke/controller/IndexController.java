package com.poke.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poke.domain.Pokemon;
import com.poke.domain.player.PokemonPlayer;
import com.poke.service.PokemonPlayerService;
import com.poke.service.PokemonService;

@Controller
public class IndexController {
	
	private final PokemonService pokemonService;
	private final PokemonPlayerService pokemonPlayerService;
	
	public IndexController(PokemonService pokemonService, PokemonPlayerService pokemonPlayerService) {
		this.pokemonService = pokemonService;
		this.pokemonPlayerService = pokemonPlayerService;
	}

	@RequestMapping({"/", ""})
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping("/showPokemon")
	public String showPokemon(Model model) {
		List<Pokemon> pokemons = pokemonService.getPokemons();
		model.addAttribute("pokemons", pokemons);
		
		return "showPokemons";
	}
	
	@RequestMapping("/showPlayer")
	public String showPlayers(Model model) {
		List<PokemonPlayer> pokemonPlayers = pokemonPlayerService.getPokemonPlayers();
		
		model.addAttribute("pokemonPlayers", pokemonPlayers);
		
		return "showPlayers";
	}
}
