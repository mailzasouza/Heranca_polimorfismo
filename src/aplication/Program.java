package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.println("Product #" + i + " data:");	
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);	
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("Customs fee: ");
			double custom = sc.nextDouble();
			
			
		}
		
		
		
		
		System.out.print("Manufacture date (DD/MM/YYYY): ");

		sc.close();
	}

}
