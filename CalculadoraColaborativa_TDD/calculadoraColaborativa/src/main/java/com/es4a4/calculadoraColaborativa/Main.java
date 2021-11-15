package com.es4a4.calculadoraColaborativa;

import java.util.List;
import java.util.Scanner;

import com.es4a4.calculadoraColaborativa.dweet.GetDweet;
import com.es4a4.calculadoraColaborativa.dweet.PostDweet;
import com.es4a4.calculadoraColaborativa.services.Operations;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> p = GetDweet.get("es4a4-fgmtem");
		Integer num1 = 0;
		Integer num2 = 0;
		Double resultado = 0.0;
		String opcao = "";
		do {
			Menu();
			System.out.print("Digite uma opção => ");
			opcao = input.next();

			if (opcao.toLowerCase().equals("sair"))
				break;

			// aqui é uma espécie de verificar se alguma outra instância da calculadora fez
			// algum post.
			p = GetDweet.get("es4a4-fgmtem");
			if (p != null) {
				if (!(p.get(0).equals(opcao) && p.get(1).equals(num1.toString()) && p.get(2).equals(num2.toString()))) {
					System.out.println("\n******************\n\tResultado de uma outra calculadora (instância):");
					result(p);
					System.out.println("\n******************");
				}
			}

			System.out.print("\nDigite o 1º número: ");
			num1 = input.nextInt();
			System.out.print("Digite o 2º número: ");
			num2 = input.nextInt();

			// verificação para não dar erros futuramente
			opcao = opcao.toLowerCase();
			if (opcao.equals("somar") || opcao.equals("subtrair") || opcao.equals("multiplicar")
					|| opcao.equals("dividir")) {
				PostDweet.post(opcao.toLowerCase(), num1, num2);

				// recuperar do dweet
				p = GetDweet.get("es4a4-fgmtem");
				resultado = result(p);

				System.out.print("Deseja realizar raiz quadrada com o valor da operação anterior? (s/n): ");
				opcao = input.next();

				if (opcao.equals("s")) {
					Operations.raiz(resultado);
				}
			} else {
				System.out.println("Tente novamente! Algum dado de entrada inválido.");
			}

		} while (!opcao.toLowerCase().equals("sair"));

		input.close();
		System.out.println("Programa Finalizado!");
	}

	public static void Menu() {
		System.out.println("\n-----------Opções: ");
		System.out.println("- Somar");
		System.out.println("- Subtrair");
		System.out.println("- Multiplicar");
		System.out.println("- Dividir");
		System.out.println("- Sair");
	}

	public static double result(List<String> p) {
		System.out.println("\n- Operação Recebida: " + p.get(0));
		System.out.println("- 1º número recebido: " + p.get(1));
		System.out.println("- 2º número recebido: " + p.get(2));
		System.out.println("- Cálculo:");
		double resultado = 0;
		switch (p.get(0)) {
		case "somar":
			resultado = Operations.adicao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		case "subtrair":
			resultado = Operations.subtracao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		case "multiplicar":
			resultado = Operations.multiplicacao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		case "dividir":
			resultado = Operations.divisao(Integer.parseInt(p.get(1)), Integer.parseInt(p.get(2)));
			break;
		default:
			System.out.println("Operacao invalida!!");
		}
		return resultado;
	}

}
