package GroceryPackage;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SDPChanaDal extends SDalPulses {

	public SDPChanaDal(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double cprice, double discount, String expdate,String dalname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, cprice, discount, expdate, dalname);
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

class SDPChanaDalProducts
{
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh5 = new LinkedHashMap();
	//For adding Cart
		CollectionClass clc = new CollectionClass();
			
		//Product 1:
	SDPChanaDal sdchana1 = new SDPChanaDal("Grocery", "Dal & Pulses", "Classic", "Organic Classic", 1041, 10, 95.10, 125, 10, "24-Jan-2025", "Chana Dal");
		//Product 2:
	SDPChanaDal sdchana2 = new SDPChanaDal("Grocery", "Dal & Pulses", "Naturalands", "Organic Chana Dal", 1042, 10, 107.20, 144, 10, "18-March-2026", "Chana Dal");
		//Product 3:
	SDPChanaDal sdchana3 = new SDPChanaDal("Grocery", "Dal & Pulses", "My Kitchen", "Gold Winner", 1043, 20, 82.67, 110, 10, "07-Oct-2025", "Chana Dal");
		//Product 4:
	SDPChanaDal sdchana4 = new SDPChanaDal("Grocery", "Dal & Pulses", "Tata", "TRT-Dal", 1044, 15, 97.70, 137, 10, "12-Aug-2025", "Chana Dal");
		//Product 5:
	SDPChanaDal sdchana5 = new SDPChanaDal("Grocery", "Dal & Pulses", "Pravin", "Pr-Chana Dal", 1045, 12, 67.10, 100, 10, "12-Dec-2025", "Chana Dal");
		//Product 6:
	SDPChanaDal sdchana6 = new SDPChanaDal("Grocery", "Dal & Pulses", "Haldiram", "Haldiram-Dal", 1046, 15, 84.40, 120, 10, "20-Jan-2025", "Chana Dal");
		//Product 7:
	SDPChanaDal sdchana7 = new SDPChanaDal("Grocery", "Dal & Pulses", "Kisaan", "Kissan Chana Dal", 1047, 10, 103.18, 150, 10, "08-May-2026", "Chana Dal");
		//Product 8:
	SDPChanaDal sdchana8 = new SDPChanaDal("Grocery", "Dal & Pulses", "Amruta", "Chana Gold", 1048, 10, 78.87, 120, 10, "15-Aug-2003", "Chana Dal");
		//Product 9:
	SDPChanaDal sdchana9 = new SDPChanaDal("Grocery", "Dal & Pulses", "Vikram", "VK-Chana Dal", 1049, 20, 90.81, 130, 10, "12-July-2025", "Chana Dal");
		//Product 10:
	SDPChanaDal sdchana10 = new SDPChanaDal("Grocery", "Dal & Pulses", "Suhana", "Hira Dal", 1050, 10, 60.10, 95, 10, "10-Sept-2025", "Chana Dal");

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
	
	//Method for Showing the details of Dal
	public void showDalPulses()
	{
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		System.out.println("Product Name          Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Organic Classic  : "+sdchana1.cprice
						+"\n2.Organic Chana Dal: "+sdchana2.cprice
						+"\n3.Gold Winner      : "+sdchana3.cprice
						+"\n4.TRT-Dal          : "+sdchana4.cprice
						+"\n5.Pr-Chana Dal     : "+sdchana5.cprice
						+"\n6.Haldiram-Dal     : "+sdchana6.cprice
						+"\n7.Kissan Chana Dal : "+sdchana7.cprice
						+"\n8.Chana Gold       : "+sdchana8.cprice
						+"\n9.VK-Chana Dal     : "+sdchana9.cprice
						+"\n10.Hira Dal        : "+sdchana10.cprice+"\n11.Cart"+"\n12.Retun Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sdchana10);
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
			System.out.println("1.Organic Classic  : "+sdchana1.cprice
					+"\n2.Organic Chana Dal: "+sdchana2.cprice
					+"\n3.Gold Winner      : "+sdchana3.cprice
					+"\n4.TRT-Dal          : "+sdchana4.cprice
					+"\n5.Pr-Chana Dal     : "+sdchana5.cprice
					+"\n6.Haldiram-Dal     : "+sdchana6.cprice
					+"\n7.Kissan Chana Dal : "+sdchana7.cprice
					+"\n8.Chana Gold       : "+sdchana8.cprice
					+"\n9.VK-Chana Dal     : "+sdchana9.cprice
					+"\n10.Hira Dal        : "+sdchana10.cprice+"\n11.Cart"+"\n12.Retun Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh5.put(sdchana1.pid+"  -->  "+sdchana1.pname+"  ",sdchana1.cprice);
					System.out.println("Product ID :"+sdchana1.pid+" , "+"Product Name :"+sdchana1.pname+" , "+"Product Price :"+sdchana1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh5.put(sdchana2.pid+"  -->  "+sdchana2.pname+"  ",sdchana2.cprice);
					System.out.println("Product ID :"+sdchana2.pid+" , "+"Product Name :"+sdchana2.pname+" , "+"Product Price :"+sdchana2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh5.put(sdchana3.pid+"  -->  "+sdchana3.pname+"  ",sdchana3.cprice);
					System.out.println("Product ID :"+sdchana3.pid+" , "+"Product Name :"+sdchana3.pname+" , "+"Product Price :"+sdchana3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh5.put(sdchana4.pid+"  -->  "+sdchana4.pname+"  ",sdchana4.cprice);
					System.out.println("Product ID :"+sdchana4.pid+" , "+"Product Name :"+sdchana4.pname+" , "+"Product Price :"+sdchana4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh5.put(sdchana5.pid+"  -->  "+sdchana5.pname+"  ",sdchana5.cprice);
					System.out.println("Product ID :"+sdchana5.pid+" , "+"Product Name :"+sdchana5.pname+" , "+"Product Price :"+sdchana5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh5.put(sdchana6.pid+"  -->  "+sdchana6.pname+"  ",sdchana6.cprice);
					System.out.println("Product ID :"+sdchana6.pid+" , "+"Product Name :"+sdchana6.pname+" , "+"Product Price :"+sdchana6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh5.put(sdchana7.pid+"  -->  "+sdchana7.pname+"  ",sdchana7.cprice);
					System.out.println("Product ID :"+sdchana7.pid+" , "+"Product Name :"+sdchana7.pname+" , "+"Product Price :"+sdchana7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh5.put(sdchana8.pid+"  -->  "+sdchana8.pname+"  ",sdchana8.cprice);
					System.out.println("Product ID :"+sdchana8.pid+" , "+"Product Name :"+sdchana8.pname+" , "+"Product Price :"+sdchana8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh5.put(sdchana9.pid+"  -->  "+sdchana9.pname+"  ",sdchana9.cprice);
					System.out.println("Product ID :"+sdchana9.pid+" , "+"Product Name :"+sdchana9.pname+" , "+"Product Price :"+sdchana9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh5.put(sdchana10.pid+"  -->  "+sdchana10.pname+"  ",sdchana10.cprice);
					System.out.println("Product ID :"+sdchana10.pid+" , "+"Product Name :"+sdchana10.pname+" , "+"Product Price :"+sdchana10.cprice);
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
		for(Object obj:lh5.values())
		{
			Double d = (Double)obj;
			sum = sum+d;
		}
		return sum;
	}	
	
}