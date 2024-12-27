package GroceryPackage;

import MiniMarketPackage.*;

class Staples extends Grocery
{
	public String brand;
	public String pname;
	public int pid;
	public double quantity;
	public double oprice;
	public double pprice;
	public double discount;
	public double cprice;
	public String expdate;
	
	public Staples(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double pprice, double discount, String expdate) {
		super(cat, type);
		this.brand = brand;
		this.pname = pname;
		this.pid = pid;
		this.quantity = quantity;
		this.oprice = oprice;
		this.pprice = pprice;
		this.discount = discount;
		this.cprice = pprice-pprice*discount/100;
		this.expdate = expdate;
	}
	
}
