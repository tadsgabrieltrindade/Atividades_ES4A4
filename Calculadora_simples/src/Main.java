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
			System.out.print("\nDigite uma op��o: ");
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
				System.out.println("Op��o inv�lida! novamente.");
			}
			System.out.println();

		} while (op !=0);		
		sc.close();
		System.out.println("Programa finalizado!");
	}

	public static void menu() {
		System.out.println("1- Adi��o");
		System.out.println("2- Subtra��o");
		System.out.println("3- Multiplica��o");
		System.out.println("4- Divis�o");
		System.out.println("0- Sair");
	}
	
	public static void atribuir() {
		System.out.print("Digite o primeiro n�mero: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		y = sc.nextDouble();
	}

}
