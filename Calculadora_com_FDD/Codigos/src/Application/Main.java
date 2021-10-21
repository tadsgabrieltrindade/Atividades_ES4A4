package Application;

import java.util.Scanner;

import Services.Operations;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int Adi��o = 1;
		final int subtra��o = 2;
		final int multiplica��o = 3;
		final int divis�o = 4;
		final int sair = 0;
		
		int op = 0; 
		
		do {
			Menu();
			try {
				op = input.nextInt();
				switch(op) {
					case Adi��o:
						Operations.adicao();
						break;
					case subtra��o:
						Operations.subtracao();
						break;
					case divis�o:
						Operations.divisao();
						break;
					case multiplica��o:
						Operations.multiplicacao();
						break;
					default:
						System.out.println("Opera��o invalida!!");
						
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

