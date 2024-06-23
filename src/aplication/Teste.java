package aplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Teste {

	public static void main(String[] args) {
		
		Product x = new Product("Celular", 500.00);
		Product y = new ImportedProduct("TV", 900.00, 20.00);
		Product z = new UsedProduct("Tablet", 400.00, null);
		
		System.out.println(x.getPrice());
		System.out.println(y.getPrice());
		System.out.println(z.getPrice());
	}
	
		}

