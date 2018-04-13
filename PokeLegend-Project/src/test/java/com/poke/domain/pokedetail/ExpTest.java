package com.poke.domain.pokedetail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExpTest {

	Exp exp;
	
	@Before
	public void setUp() throws Exception {
		exp = new Exp();
	}

	@Test
	public void testId() {
		long idValue = 4L;
		exp.setId(idValue);
		
		assertEquals(idValue, exp.getId());
	}
	
	@Test 
	public void testExp() {
		int expTest = 4;
		
		exp.setCurrentExp(expTest);
		
		assertEquals(expTest, exp.getCurrentExp());
	}

}
