package Application;

import java.util.Scanner;

import Services.Operations;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int Adição = 1;
		final int subtração = 2;
		final int multiplicação = 3;
		final int divisão = 4;
		final int sair = 0;
		
		int op = 0; 
		
		do {
			Menu();
			try {
				op = input.nextInt();
				switch(op) {
					case Adição:
						Operations.adicao();
						break;
					case subtração:
						Operations.subtracao();
						break;
					case divisão:
						Operations.divisao();
						break;
					case multiplicação:
						Operations.multiplicacao();
						break;
					default:
						System.out.println("Operação invalida!!");
						
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

