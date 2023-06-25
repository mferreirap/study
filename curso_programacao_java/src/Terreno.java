import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Área = %.2f%n", area, "m².");
		System.out.printf("Preço = R$%.2f%n", preco);

		sc.close();
	}

}
