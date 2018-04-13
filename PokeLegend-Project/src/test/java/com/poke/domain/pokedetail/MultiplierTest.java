package com.poke.domain.pokedetail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplierTest {

	Multiplier multiplier;
			
	@Before
	public void setUp() throws Exception {
		multiplier = new Multiplier();
	}

	@Test
	public void testResetMultipliers() throws Exception{
		multiplier.resetMultipliers();
		
		assertEquals(1, multiplier.getAtkMultiplier());
		assertEquals(1, multiplier.getDefenseMultiplier());
		assertEquals(1, multiplier.getSpAtkMultiplier());
		assertEquals(1, multiplier.getSpDefenseMultiplier());
		assertEquals(1, multiplier.getSpeedMultiplier());
	}

}
