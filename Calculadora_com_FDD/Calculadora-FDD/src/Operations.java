import java.util.Random;

public class Operations {
	private static Random num1 = new Random();
	private static int n1,n2;
	private static final int MAX = 1000;
	
	public static void adicao() {}
	public static void subtracao() {}
	public static void divisao() {
		n1 = num1.nextInt(MAX);
		do {
			n2 = num1.nextInt(MAX);
		}while(n2 == 0);
		
		System.out.println(n1+" / "+ n2+ " = "+ (float)n1/n2);
		
	}
	public static void multiplicacao() {}

}
