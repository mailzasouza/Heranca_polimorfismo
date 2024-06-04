package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		sc.nextInt();
		System.out.println("Product #1 data:");
		System.out.print("Common, used or imported (c/u/i)? ");
		sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		System.out.println();
		System.out.print("Price: ");
		sc.nextDouble();
		System.out.print("Customs fee: ");
		sc.nextDouble();
		System.out.println("Product #2 data:");
		System.out.print("Common, used or imported (c/u/i)? ");
		sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		System.out.println("Price: ");
		sc.nextDouble();
		System.out.println("Product #3 data:");
		System.out.print("Common, used or imported (c/u/i)? ");
		sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		System.out.println();
		System.out.print("Price: ");
		sc.nextDouble();
		System.out.print("Manufacture date (DD/MM/YYYY): ");

		sc.close();
	}

}
