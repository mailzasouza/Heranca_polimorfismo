package entities;

import java.util.Date;

public class UsedProduct extends Product{
	
	Date manufactureDate;
	
	private UsedProduct() {
		super();	
	}
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + price +  manufactureDate;
	}
}
