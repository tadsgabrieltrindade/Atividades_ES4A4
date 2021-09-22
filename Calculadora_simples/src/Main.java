import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int op = 0;
		
		System.out.println("\tCalculadora Simples\n");
		do {
			menu();
			System.out.print("\nDigite uma opcao: ");
			op = sc.nextInt();
			
			switch (op) {
				case 0:
					break;

				case 1:
					Operacao.adicao();
					break;

				case 2:
					Operacao.subtracao();
					break;

				default:
					System.out.println("Opcao invalida! novamente.");
					break;

			}
			System.out.println();

		} while (op !=0);		
		sc.close();
		System.out.println("Programa finalizado!");
	}

	public static void menu() {
		System.out.println("1- Adicao");
		System.out.println("2- Subtracao");
		System.out.println("3- Multiplicacao");
		System.out.println("4- Divisao");
		System.out.println("0- Sair");
	}
}
