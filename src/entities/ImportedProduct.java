package entities;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(double customsFee) {
			this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	

}
