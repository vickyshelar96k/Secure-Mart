package GroceryPackage;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SDPMasoorDal extends SDalPulses{

	public SDPMasoorDal(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
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

//class for adding masoor dal products


class SDPMasoorDalProducts {
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh4 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
		
	//Product 1 :
	SDPMasoorDal sdmasor1 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Classic", "Organic Classic", 1031, 10, 95.10, 125, 10, "24-Jan-2025", "Masoor Dal");
	//Product 2:
	SDPMasoorDal sdmasor2 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Naturalands", "Organic Masoor Dal", 1032, 10, 107.20, 144, 10, "18-March-2026", "Masoor Dal");
	//Product 3:
	SDPMasoorDal sdmasor3 = new SDPMasoorDal("Grocery", "Dal & Pulses", "My Kitchen", "Gold Winner", 1033, 20, 82.67, 110, 10, "07-Oct-2025", "Masoor Dal");
	//Product 4:
	SDPMasoorDal sdmasor4 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Tata", "TRT-Dal", 1034, 15, 97.70, 137, 10, "12-Aug-2025", "Masoor Dal");
	//Product 5:
	SDPMasoorDal sdmasor5 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Pravin", "Pr-Masoor Dal", 1035, 12, 67.10, 100, 10, "12-Dec-2025", "Masoor Dal");
	//Product 6:
	SDPMasoorDal sdmasor6 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Haldiram", "Haldiram-Dal", 1036, 15, 84.40, 120, 10, "20-Jan-2025", "Masoor Dal");
	//Product 7:
	SDPMasoorDal sdmasor7 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Kisaan", "Kissan Masoor Dal", 1037, 10, 103.18, 150, 10, "08-May-2026", "Masoor");
	//Product 8:
	SDPMasoorDal sdmasor8 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Amruta", "Masoor Gold", 1038, 10, 78.87, 120, 10, "15-Aug-2003", "Masoor Dal");
	//Product 9:
	SDPMasoorDal sdmasor9 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Vikram", "VK-Masoor Dal", 1039, 20, 90.81, 130, 10, "12-July-2025", "Masoor Dal");
	//Product 10:
	SDPMasoorDal sdmasor10 = new SDPMasoorDal("Grocery", "Dal & Pulses", "Suhana", "Hira Dal", 1040, 10, 60.10, 95, 10, "10-Sept-2025", "Masoor Dal");

	Scanner sc = new Scanner(System.in);
	boolean counter=true;
	
	//Method for combining showDal and purchaseDal
	public void comBineMasoorDal()
	{
		boolean value = true;
		while(value)
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Product Details \n2.Purchase Product \n3.Return Back ");
			System.out.println("Enter your Choice :");
			short take = sc.nextShort();
			switch(take)
			{
			case 1:
				showDalPulses();
				break;
			case 2:
				purchaseDal();
				break;
			case 3:
				value = false;
				break;
			default:
				System.out.println("Choose Correct Option..");
				System.out.println("-----------------------------------------------------------------");
			
			}
		}
	}
	
	//Method to show all the details of Masoor Dal
	public void showDalPulses()
	{
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		System.out.println("Product Name          Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Organic Classic   : "+sdmasor1.pprice
						+"\n2.Organic Masoor Dal: "+sdmasor2.pprice
						+"\n3.Gold Winner       : "+sdmasor3.pprice
						+"\n4.TRT-Dal           : "+sdmasor4.pprice
						+"\n5.Pr-Masoor Dal     : "+sdmasor5.pprice
						+"\n6.Haldiram-Dal      : "+sdmasor6.pprice
						+"\n7.Kissan Masoor Dal : "+sdmasor7.pprice
						+"\n8.Masoor Gold       : "+sdmasor8.pprice
						+"\n9.VK-Masoor Dal     : "+sdmasor9.pprice
						+"\n10.Hira Dal         : "+sdmasor10.pprice+"\n11.Cart"+"\n12.Return Back ");
		
		System.out.println("Choose the Product for viewing the Details :");
		short count = sc.nextShort();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmasor10);
			}
				break;
			case 11:
				clc.cart();
				break;
			case 12:
			{
				counter = false;
				System.out.println("-----------------------------------------------------------------");
			}
				break;
			default:
			{
				System.out.println("Choose Correct Choice..");
				System.out.println("-----------------------------------------------------------------");
			}	
		}
		}
		while(counter);
	}
	
	//Method for purchasing or adding product into cart
	public void purchaseDal()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name        Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Organic Classic   : "+sdmasor1.pprice
					+"\n2.Organic Masoor Dal: "+sdmasor2.pprice
					+"\n3.Gold Winner       : "+sdmasor3.pprice
					+"\n4.TRT-Dal           : "+sdmasor4.pprice
					+"\n5.Pr-Masoor Dal     : "+sdmasor5.pprice
					+"\n6.Haldiram-Dal      : "+sdmasor6.pprice
					+"\n7.Kissan Masoor Dal : "+sdmasor7.pprice
					+"\n8.Masoor Gold       : "+sdmasor8.pprice
					+"\n9.VK-Masoor Dal     : "+sdmasor9.pprice
					+"\n10.Hira Dal         : "+sdmasor10.pprice+"\n11.Cart"+"\n12.Return Back ");

			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh4.put(sdmasor1.pid+"  -->  "+sdmasor1.pname+"  ",sdmasor1.cprice);
					System.out.println("Product ID :"+sdmasor1.pid+" , "+"Product Name :"+sdmasor1.pname+" , "+"Product Price :"+sdmasor1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh4.put(sdmasor2.pid+"  -->  "+sdmasor2.pname+"  ",sdmasor2.cprice);
					System.out.println("Product ID :"+sdmasor2.pid+" , "+"Product Name :"+sdmasor2.pname+" , "+"Product Price :"+sdmasor2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh4.put(sdmasor3.pid+"  -->  "+sdmasor3.pname+"  ",sdmasor3.cprice);
					System.out.println("Product ID :"+sdmasor3.pid+" , "+"Product Name :"+sdmasor3.pname+" , "+"Product Price :"+sdmasor3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh4.put(sdmasor4.pid+"  -->  "+sdmasor4.pname+"  ",sdmasor4.cprice);
					System.out.println("Product ID :"+sdmasor4.pid+" , "+"Product Name :"+sdmasor4.pname+" , "+"Product Price :"+sdmasor4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh4.put(sdmasor5.pid+"  -->  "+sdmasor5.pname+"  ",sdmasor5.cprice);
					System.out.println("Product ID :"+sdmasor5.pid+" , "+"Product Name :"+sdmasor5.pname+" , "+"Product Price :"+sdmasor5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh4.put(sdmasor6.pid+"  -->  "+sdmasor6.pname+"  ",sdmasor6.cprice);
					System.out.println("Product ID :"+sdmasor6.pid+" , "+"Product Name :"+sdmasor6.pname+" , "+"Product Price :"+sdmasor6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh4.put(sdmasor7.pid+"  -->  "+sdmasor7.pname+"  ",sdmasor7.cprice);
					System.out.println("Product ID :"+sdmasor7.pid+" , "+"Product Name :"+sdmasor7.pname+" , "+"Product Price :"+sdmasor7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh4.put(sdmasor8.pid+"  -->  "+sdmasor8.pname+"  ",sdmasor8.cprice);
					System.out.println("Product ID :"+sdmasor8.pid+" , "+"Product Name :"+sdmasor8.pname+" , "+"Product Price :"+sdmasor8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh4.put(sdmasor9.pid+"  -->  "+sdmasor9.pname+"  ",sdmasor9.cprice);
					System.out.println("Product ID :"+sdmasor9.pid+" , "+"Product Name :"+sdmasor9.pname+" , "+"Product Price :"+sdmasor9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh4.put(sdmasor10.pid+"  -->  "+sdmasor10.pname+"  ",sdmasor10.cprice);
					System.out.println("Product ID :"+sdmasor10.pid+" , "+"Product Name :"+sdmasor10.pname+" , "+"Product Price :"+sdmasor10.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
					}
				break;
				case 11:
					clc.cart();
					break;
				case 12:
				count = false;
				break;
				
				default:
				{
					System.out.println("Please, Choose Correct option.");
					System.out.println("-----------------------------------------------------------------");
				}
			}	
		}
	}

	//static method for returning total of product added to cart
	static public double getTotal()
	{
		double sum=0;
		for(Object obj:lh4.values())
		{
			Double d = (Double)obj;
			sum = sum+d;
		}
		return sum;
	}

}

