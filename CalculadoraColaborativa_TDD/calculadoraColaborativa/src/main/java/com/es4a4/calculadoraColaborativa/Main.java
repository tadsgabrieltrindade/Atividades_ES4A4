package com.es4a4.calculadoraColaborativa;

import java.util.List;

import com.es4a4.calculadoraColaborativa.services.Operations;

public class Main {

	public static void main(String[] args) {
		
	}

	public static void Menu() {
		System.out.println("\n-----------Opções: ");
		System.out.println("- Somar");
		System.out.println("- Subtrair");
		System.out.println("- Multiplicar");
		System.out.println("- Dividir");
		System.out.println("- Sair");
	}

	public static void result(List<String> p) {
		System.out.println("\n- Operação Recebida: " + p.get(0));
		System.out.println("- 1º número recebido: " + p.get(1));
		System.out.println("- 2º número recebido: " + p.get(2));
		System.out.println("- Cálculo:");
		switch (p.get(0)) {
		case "somar":
			Operations.adicao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		case "subtrair":
			Operations.subtracao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		case "multiplicar":
			Operations.multiplicacao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		case "dividir":
			Operations.divisao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		default:
			System.out.println("Operacao invalida!!");
		}
	}

}
