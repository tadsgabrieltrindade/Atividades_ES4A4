import java.util.Random;

public class Operacao {

	public static void adicao() {
		Random r = new Random();

		int n1, n2;

		n1 = r.nextInt(100);
		n2 = r.nextInt(100);

		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
	}

	public static void subtracao() {
		Random r = new Random();

		int n1, n2;

		n1 = r.nextInt(100);
		n2 = r.nextInt(100);

		System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
	}
	
	public static void multiplicacao() {
		Random r = new Random();
		
		int n1, n2;
		
		n1 = r.nextInt(100);
		n2 = r.nextInt(100);
		
		System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
	}
	
	public static void divisao() {
		Random r = new Random();
		
		int n1, n2;
		
		n1 = r.nextInt(200);
		n2 = r.nextInt(50);
		
		if(n2 == 0)
			System.out.println("Erro! Denominador aleatório com valor 0.");
		System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		
	}
}
