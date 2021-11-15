package com.es4a4.calculadoraColaborativa;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.es4a4.calculadoraColaborativa.dweet.GetDweet;
import com.es4a4.calculadoraColaborativa.dweet.PostDweet;

public class GetTest {
	
	@Test
	public void testarGetSomaDweet() throws InterruptedException {
		Thread.sleep(1000);
		List<String> list = new ArrayList<>();
		list.add("somar");
		list.add("10");
		list.add("5");
		PostDweet.post("somar", 10, 5);
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}

	
	@Test
	public void testarGetSubtracaoDweet() throws InterruptedException {
		Thread.sleep(1000);
		List<String> list = new ArrayList<>();
		list.add("subtrair");
		list.add("10");
		list.add("5");
		PostDweet.post("subtrair", 10, 5);
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}
	
	@Test
	public void testarGetMultiplicarDweet() throws InterruptedException {
		Thread.sleep(1000);
		List<String> list = new ArrayList<>();
		list.add("multiplicar");
		list.add("10");
		list.add("5");
		PostDweet.post("multiplicar", 10, 5);
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}
	
	@Test
	public void testarGetDividirDweet() throws InterruptedException {
		Thread.sleep(1000);
		List<String> list = new ArrayList<>();
		list.add("dividir");
		list.add("10");
		list.add("5");
		PostDweet.post("dividir", 10, 5);
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}

	@Test
	public void testarGetRaizDweet() {
		List<String> list = new ArrayList<>();
		list.add("raiz");
		list.add("10");
		list.add("5");
		PostDweet.post("raiz", 10, 5);
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}
}

