import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("O número que você digitou é positivo.");
		}
		else if (x == 0) {
			System.out.println("Você digitou o número zero.");
		}
		else {
			System.out.println("O número que você digitou é negativo.");
		}
		if (x % 2 != 0) {
			System.out.println("Você digitou um número ímpar.");
		}
		else {
			System.out.println("Você digitou um número par.");
		}
		sc.close();
	}

}
