package GroceryPackage;
import MiniMarketPackage.*;

public class SDPToorDal extends SDalPulses{
	
	
	public SDPToorDal(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double pprice, double discount, String expdate,String dalname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);
	}
	
	//toString method for showing the object details instead of address
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
