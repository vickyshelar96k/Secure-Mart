package GroceryPackage;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SDPMoongDal extends SDalPulses{
	
	public SDPMoongDal(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
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

//class for adding the products into moongdal
class SDPMoongDalProducts 
{
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh3 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//Product 1 :
	SDPMoongDal sdmong1 = new SDPMoongDal("Grocery", "Dal & Pulses", "Classic", "Health Classic", 1021, 10, 95.10, 125, 10, "24-Jan-2025", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong2 = new SDPMoongDal("Grocery", "Dal & Pulses", "Naturalands", "Organic Moong Dal", 1022, 10, 107.20, 144, 10, "18-March-2026", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong3 = new SDPMoongDal("Grocery", "Dal & Pulses", "My Kitchen", "Gold Winner", 1023, 20, 82.67, 110, 10, "07-Oct-2025", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong4 = new SDPMoongDal("Grocery", "Dal & Pulses", "Tata", "TRT-Dal", 1024, 15, 97.70, 137, 10, "12-Aug-2025", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong5 = new SDPMoongDal("Grocery", "Dal & Pulses", "Pravin", "Pr-Moong Dal", 1025, 12, 67.10, 100, 10, "12-Dec-2025", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong6 = new SDPMoongDal("Grocery", "Dal & Pulses", "Haldiram", "Haldiram Dal", 1026, 15, 84.40, 120, 10, "20-Jan-2025", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong7 = new SDPMoongDal("Grocery", "Dal & Pulses", "Kisaan", "Kissan Moong Dal", 1027, 10, 103.18, 150, 10, "08-May-2026", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong8 = new SDPMoongDal("Grocery", "Dal & Pulses", "Amruta", "Moong Gold", 1028, 10, 78.87, 120, 10, "15-Aug-2003", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong9 = new SDPMoongDal("Grocery", "Dal & Pulses", "Vikram", "VK-Moong Dal", 1029, 20, 90.81, 130, 10, "12-July-2025", "Moong Dal");
		//Product 2:
	SDPMoongDal sdmong10 = new SDPMoongDal("Grocery", "Dal & Pulses", "Suhana", "Hira Dal", 1030, 10, 60.10, 95, 10, "10-Sept-2025", "Moong Dal");

	Scanner sc = new Scanner(System.in);
	boolean counter=true;
	
	//Method for choosing option purchase or product details
	public void comBineMoongal()
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
		
	public void showDalPulses()
	{
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		System.out.println("Product Name          Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Organic Classic  : "+sdmong1.cprice
						+"\n2.Organic Moong Dal: "+sdmong2.cprice
						+"\n3.Gold Winner      : "+sdmong3.cprice
						+"\n4.TRT-Dal          : "+sdmong4.cprice
						+"\n5.Pr-Moong Dal     : "+sdmong5.cprice
						+"\n6.Haldiram-Dal     : "+sdmong6.cprice
						+"\n7.Kissan Moong Dal : "+sdmong7.cprice
						+"\n8.Moong Gold       : "+sdmong8.cprice
						+"\n9.VK-Moong Dal     : "+sdmong9.cprice
						+"\n10.Hira Dal        : "+sdmong10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdmong10);
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
			System.out.println("1.Organic Classic  : "+sdmong1.cprice
					+"\n2.Organic Moong Dal: "+sdmong2.cprice
					+"\n3.Gold Winner      : "+sdmong3.cprice
					+"\n4.TRT-Dal          : "+sdmong4.cprice
					+"\n5.Pr-Moong Dal     : "+sdmong5.cprice
					+"\n6.Haldiram-Dal     : "+sdmong6.cprice
					+"\n7.Kissan Moong Dal : "+sdmong7.cprice
					+"\n8.Moong Gold       : "+sdmong8.cprice
					+"\n9.VK-Moong Dal     : "+sdmong9.cprice
					+"\n10.Hira Dal        : "+sdmong10.cprice+"\n11.Cart"+"\n12.Exit ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh3.put(sdmong1.pid+"  -->  "+sdmong1.pname+"  ",sdmong1.cprice);
					System.out.println("Product ID :"+sdmong1.pid+" , "+"Product Name :"+sdmong1.pname+" , "+"Product Price :"+sdmong1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh3.put(sdmong2.pid+"  -->  "+sdmong2.pname+"  ",sdmong2.cprice);
					System.out.println("Product ID :"+sdmong2.pid+" , "+"Product Name :"+sdmong2.pname+" , "+"Product Price :"+sdmong2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh3.put(sdmong3.pid+"  -->  "+sdmong3.pname+"  ",sdmong3.cprice);
					System.out.println("Product ID :"+sdmong3.pid+" , "+"Product Name :"+sdmong3.pname+" , "+"Product Price :"+sdmong3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh3.put(sdmong4.pid+"  -->  "+sdmong4.pname+"  ",sdmong4.cprice);
					System.out.println("Product ID :"+sdmong4.pid+" , "+"Product Name :"+sdmong4.pname+" , "+"Product Price :"+sdmong4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh3.put(sdmong5.pid+"  -->  "+sdmong5.pname+"  ",sdmong5.cprice);
					System.out.println("Product ID :"+sdmong5.pid+" , "+"Product Name :"+sdmong5.pname+" , "+"Product Price :"+sdmong5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh3.put(sdmong6.pid+"  -->  "+sdmong6.pname+"  ",sdmong6.cprice);
					System.out.println("Product ID :"+sdmong6.pid+" , "+"Product Name :"+sdmong6.pname+" , "+"Product Price :"+sdmong6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh3.put(sdmong7.pid+"  -->  "+sdmong7.pname+"  ",sdmong7.cprice);
					System.out.println("Product ID :"+sdmong7.pid+" , "+"Product Name :"+sdmong7.pname+" , "+"Product Price :"+sdmong7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh3.put(sdmong8.pid+"  -->  "+sdmong8.pname+"  ",sdmong8.cprice);
					System.out.println("Product ID :"+sdmong8.pid+" , "+"Product Name :"+sdmong8.pname+" , "+"Product Price :"+sdmong8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh3.put(sdmong9.pid+"  -->  "+sdmong9.pname+"  ",sdmong9.cprice);
					System.out.println("Product ID :"+sdmong9.pid+" , "+"Product Name :"+sdmong9.pname+" , "+"Product Price :"+sdmong9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh3.put(sdmong10.pid+"  -->  "+sdmong10.pname+"  ",sdmong10.cprice);
					System.out.println("Product ID :"+sdmong10.pid+" , "+"Product Name :"+sdmong10.pname+" , "+"Product Price :"+sdmong10.cprice);
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
		for(Object obj:lh3.values())
		{
			Double d = (Double)obj;
			sum = sum+d;
		}
		return sum;
	}
}
