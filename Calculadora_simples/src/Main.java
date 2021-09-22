import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static double x = 0.0;
	static double y = 0.0;
	
	public static void main(String[] args) {
		int op = 0;
		
		System.out.println("\tCalculadora Simples\n");
		do {
			menu();
			System.out.print("\nDigite uma opção: ");
			op = sc.nextInt();
			
			switch (op) {
			case 0: 
				break;
				
			case 1:{
				atribuir();
				System.out.println(Operacao.adicao(x, y));
				break;
			}
				
			
			default:
				System.out.println("Opção inválida! novamente.");
			}
			System.out.println();

		} while (op !=0);		
		sc.close();
		System.out.println("Programa finalizado!");
	}

	public static void menu() {
		System.out.println("1- Adição");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("0- Sair");
	}
	
	public static void atribuir() {
		System.out.print("Digite o primeiro número: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		y = sc.nextDouble();
	}

}
