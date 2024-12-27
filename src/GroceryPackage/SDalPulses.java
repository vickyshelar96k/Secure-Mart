package GroceryPackage;

public class SDalPulses extends Staples {

	String dalname;
	
	public SDalPulses(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double pprice, double discount, String expdate,String dalname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);
		this.dalname=dalname;
	}
}
