package com.es4a4.calculadoraColaborativa;
import static org.junit.Assert.assertEquals;

import com.es4a4.calculadoraColaborativa.dweet.PostDweet;
import org.junit.Test;

public class PostTest {

	@Test
	public void testarPostSomaDweet() {
		assertEquals(true, PostDweet.post("somar", 10, 5));
	}

	@Test
	public void testarPostSubtracaoDweet() {
		assertEquals(true, PostDweet.post("subtrair", 10, 5));
	}

	@Test
	public void testarPostMultiplicacaoDweet() {
		assertEquals(true, PostDweet.post("multiplicar",10, 5));
	}

	@Test
	public void testarPostDivisaoDweet() {
		assertEquals(true, PostDweet.post("dividir", 10, 5));
	}

}
