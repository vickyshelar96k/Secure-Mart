package GroceryPackage;

public class SDPUradDal extends SDalPulses {

	public SDPUradDal(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double pprice, double discount, String expdate,String dalname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);
	}
	
	@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nDal Name : "+dalname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}
