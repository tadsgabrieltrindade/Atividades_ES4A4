package com.es4a4.calculadoraColaborativa.services;

public class Operations {

	public static double adicao(int n1, int n2) {
		double result = n1 + n2;
		System.out.println(result);
		return result;
	}

	public static double subtracao(int n1, int n2) {
		double result = n1 - n2;
		System.out.println(result);
		return result;
	}

	public static double divisao(int n1, int n2) {
		double result = n1 / n2;
		System.out.println(result);
		return result;
	}

	public static double multiplicacao(int n1, int n2) {
		double result = n1 * n2;
		System.out.println(result);
		return result;
	}

	public static double raiz(double n1) {
		double result = Math.sqrt(n1);
		System.out.println(result);
		return result;
	}

}
