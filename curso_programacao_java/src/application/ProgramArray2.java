package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductArray2;

public class ProgramArray2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ProductArray2[] vect = new ProductArray2[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductArray2(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;

		System.out.printf("Average Price = $ %.2f%n", avg);
		sc.close();

	}

}