package GroceryPackage;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SDPSoyaChunks extends SDalPulses {

	public SDPSoyaChunks(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
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

//SoyaChunks Products Class
class SDPSoyaChunksProducts
{
	
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh6 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//Product 1:
	SDPSoyaChunks sdsoya1 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Classic", "Organic Classic", 1051, 10, 95.10, 125, 10, "24-Jan-2025", "Soya Chunks");
	//Product 2:
	SDPSoyaChunks sdsoya2 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Naturalands", "Organic Soya Chunks", 1052, 10, 107.20, 144, 10, "18-March-2026", "Soya Chunks");
	//Product 3:
	SDPSoyaChunks sdsoya3 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "My Kitchen", "Gold Winner", 1053, 20, 82.67, 110, 10, "07-Oct-2025", "Soya Chunks");
	//Product 4:
	SDPSoyaChunks sdsoya4 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Tata", "TRT-Soya Chunks", 1054, 15, 97.70, 137, 10, "12-Aug-2025", "Soya Chunks");
	//Product 5:
	SDPSoyaChunks sdsoya5 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Pravin", "Pr-Soya Chunks", 1055, 12, 67.10, 100, 10, "12-Dec-2025", "Soya Chunks");
	//Product 6:
	SDPSoyaChunks sdsoya6 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Haldiram", "Haldiram Soya Chunks", 1056, 15, 84.40, 120, 10, "20-Jan-2025", "Soya Chunks");
	//Product 7:
	SDPSoyaChunks sdsoya7 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Kisaan", "Kissan Soya Chunks", 1057, 10, 103.18, 150, 10, "08-May-2026", "Soya Chunks");
	//Product 8:
	SDPSoyaChunks sdsoya8 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Amruta", "Soya Chunks Gold", 1058, 10, 78.87, 120, 10, "15-Aug-2003", "Soya Chunks");
	//Product 9:
	SDPSoyaChunks sdsoya9 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Vikram", "VK-Soya Chunks", 1059, 20, 90.81, 130, 10, "12-July-2025", "Soya Chunks");
	//Product 10:
	SDPSoyaChunks sdsoya10 = new SDPSoyaChunks("Grocery", "Dal & Pulses", "Suhana", "Hira Soya Chunks", 1060, 10, 60.10, 95, 10, "10-Sept-2025", "Soya Chunks");

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

public void showDalPulses()
{
	do
	{
	System.out.println("Showing Products We have..");
	System.out.println("-----------------------------------------------------------------");
	System.out.println();
	System.out.println("Product Name            Rs. ");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("1.Organic Classic     : "+sdsoya1.cprice
					+"\n2.Organic Soya Chunks : "+sdsoya2.cprice
					+"\n3.Gold Winner         : "+sdsoya3.cprice
					+"\n4.TRT-Soya Chunks     : "+sdsoya4.cprice
					+"\n5.Pr-Soya Chunks      : "+sdsoya5.cprice
					+"\n6.Haldiram-Soya Chunks: "+sdsoya6.cprice
					+"\n7.Kissan Soya Chunks  : "+sdsoya7.cprice
					+"\n8.Soya Chunks Gold    : "+sdsoya8.cprice
					+"\n9.VK-Soya Chunks      : "+sdsoya9.cprice
					+"\n10.Hira Soya Chunks   : "+sdsoya10.cprice+"\n11.Cart"+"\n12.Return Back ");
	System.out.println("Choose the Product for viewing the Details :");
	int count = sc.nextInt();
	
	switch(count)
	{
		case 1:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya1);
		}
			break;
		case 2:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya2);
		}
			break;
		case 3:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya3);
		}
			break;
		case 4:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya4);
		}
			break;
		case 5:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya5);
		}
			break;
		case 6:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya6);
		}
			break;
		case 7:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya7);
		}
			break;
		case 8:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya8);
		}
			break;
		case 9:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya9);
		}
			break;
		case 10:
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Showing Details of Product..");
			System.out.println(sdsoya10);
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
		System.out.println("1.Organic Classic     : "+sdsoya1.cprice
				+"\n2.Organic Soya Chunks : "+sdsoya2.cprice
				+"\n3.Gold Winner         : "+sdsoya3.cprice
				+"\n4.TRT-Soya Chunks     : "+sdsoya4.cprice
				+"\n5.Pr-Soya Chunks      : "+sdsoya5.cprice
				+"\n6.Haldiram-Soya Chunks: "+sdsoya6.cprice
				+"\n7.Kissan Soya Chunks  : "+sdsoya7.cprice
				+"\n8.Soya Chunks Gold    : "+sdsoya8.cprice
				+"\n9.VK-Soya Chunks      : "+sdsoya9.cprice
				+"\n10.Hira Soya Chunks   : "+sdsoya10.cprice+"\n11.Cart"+"\n12.Exit ");
		System.out.println("Which product, Do you want?");
		byte id = sc.nextByte();
		switch(id)
		{
			case 1:
			{
				System.out.println();
				lh6.put(sdsoya1.pid+"  -->  "+sdsoya1.pname+"  ",sdsoya1.cprice);
				System.out.println("Product ID :"+sdsoya1.pid+" , "+"Product Name :"+sdsoya1.pname+" , "+"Product Price :"+sdsoya1.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 2:
			{
				System.out.println();
				lh6.put(sdsoya2.pid+"  -->  "+sdsoya2.pname+"  ",sdsoya2.cprice);
				System.out.println("Product ID :"+sdsoya2.pid+" , "+"Product Name :"+sdsoya2.pname+" , "+"Product Price :"+sdsoya2.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 3:
			{
				System.out.println();
				lh6.put(sdsoya3.pid+"  -->  "+sdsoya3.pname+"  ",sdsoya3.cprice);
				System.out.println("Product ID :"+sdsoya3.pid+" , "+"Product Name :"+sdsoya3.pname+" , "+"Product Price :"+sdsoya3.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 4:
			{
				System.out.println();
				lh6.put(sdsoya4.pid+"  -->  "+sdsoya4.pname+"  ",sdsoya4.cprice);
				System.out.println("Product ID :"+sdsoya4.pid+" , "+"Product Name :"+sdsoya4.pname+" , "+"Product Price :"+sdsoya4.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 5:
			{
				//chasing addreee of en object
				System.out.println();
				lh6.put(sdsoya5.pid+"  -->  "+sdsoya5.pname+"  ",sdsoya5.cprice);
				System.out.println("Product ID :"+sdsoya5.pid+" , "+"Product Name :"+sdsoya5.pname+" , "+"Product Price :"+sdsoya5.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 6:
			{
				System.out.println();
				lh6.put(sdsoya6.pid+"  -->  "+sdsoya6.pname+"  ",sdsoya6.cprice);
				System.out.println("Product ID :"+sdsoya6.pid+" , "+"Product Name :"+sdsoya6.pname+" , "+"Product Price :"+sdsoya6.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 7:
			{
				System.out.println();
				lh6.put(sdsoya7.pid+"  -->  "+sdsoya7.pname+"  ",sdsoya7.cprice);
				System.out.println("Product ID :"+sdsoya7.pid+" , "+"Product Name :"+sdsoya7.pname+" , "+"Product Price :"+sdsoya7.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 8:
			{
				System.out.println();
				lh6.put(sdsoya8.pid+"  -->  "+sdsoya8.pname+"  ",sdsoya8.cprice);
				System.out.println("Product ID :"+sdsoya8.pid+" , "+"Product Name :"+sdsoya8.pname+" , "+"Product Price :"+sdsoya8.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 9:
			{ 
				System.out.println();
				lh6.put(sdsoya9.pid+"  -->  "+sdsoya9.pname+"  ",sdsoya9.cprice);
				System.out.println("Product ID :"+sdsoya9.pid+" , "+"Product Name :"+sdsoya9.pname+" , "+"Product Price :"+sdsoya9.cprice);
				System.out.println("Product is Successfully Added to Cart..");
				System.out.println("-----------------------------------------------------------------");
			}
			break;
			case 10:
			{
				System.out.println();
				lh6.put(sdsoya10.pid+"  -->  "+sdsoya10.pname+"  ",sdsoya10.cprice);
				System.out.println("Product ID :"+sdsoya10.pid+" , "+"Product Name :"+sdsoya10.pname+" , "+"Product Price :"+sdsoya10.cprice);
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
	for(Object obj:lh6.values())
	{
		Double d = (Double)obj;
		sum = sum+d;
	}
	return sum;
}
}