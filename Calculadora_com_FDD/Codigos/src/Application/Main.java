package Application;

import java.util.Scanner;

import Services.Operations;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int Adicao = 1;
		final int subtracao = 2;
		final int multiplicacao = 3;
		final int divisao = 4;
		final int sair = 0;
		
		int op = 0; 
		
		do {
			Menu();
			try {
				op = input.nextInt();
				switch(op) {
					case Adicao:
						Operations.adicao();
						break;
					case subtracao:
						Operations.subtracao();
						break;
					case divisao:
						Operations.divisao();
						break;
					case multiplicacao:
						Operations.multiplicacao();
						break;
					default:
						System.out.println("Operacao invalida!!");
						
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}while(op != sair);
		
		input.close();
	}
	public static void Menu() {
		System.out.println("1- Adicao");
		System.out.println("2- Subtracao");
		System.out.println("3- Multiplicacao");
		System.out.println("4- Divisao");
		System.out.println("0- Sair");
	}

}

