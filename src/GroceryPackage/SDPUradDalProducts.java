package GroceryPackage;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SDPUradDalProducts {
	
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh2 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//Product 1 :
	SDPUradDal sudp1 = new SDPUradDal("Grocery", "Dal & Pulses", "Classic", "Organic Classic", 1011, 10, 95.10, 125, 10, "24-Jan-2025", "Urad Dal");
	//Product 2:
	SDPToorDal sudp2 = new SDPToorDal("Grocery", "Dal & Pulses", "Naturalands", "Organic Urad Dal", 1012, 10, 107.20, 144, 10, "18-March-2026", "Urad Dal");
	//Product 2:
	SDPToorDal sudp3 = new SDPToorDal("Grocery", "Dal & Pulses", "My Kitchen", "Gold Winner", 1013, 20, 82.67, 110, 10, "07-Oct-2025", "Urad Dal");
	//Product 2:
	SDPToorDal sudp4 = new SDPToorDal("Grocery", "Dal & Pulses", "Tata", "TRT-Dal", 1014, 15, 97.70, 137, 10, "12-Aug-2025", "Urad Dal");
	//Product 2:
	SDPToorDal sudp5 = new SDPToorDal("Grocery", "Dal & Pulses", "Pravin", "Pr-Urad Dal", 1015, 12, 67.10, 100, 10, "12-Dec-2025", "Urad Dal");
	//Product 2:
	SDPToorDal sudp6 = new SDPToorDal("Grocery", "Dal & Pulses", "Haldiram", "Haldiram Dal", 1016, 15, 84.40, 120, 10, "20-Jan-2025", "Urad Dal");
	//Product 2:
	SDPToorDal sudp7 = new SDPToorDal("Grocery", "Dal & Pulses", "Kisaan", "Kissan Urad Dal", 1017, 10, 103.18, 150, 10, "08-May-2026", "Urad Dal");
	//Product 2:
	SDPToorDal sudp8 = new SDPToorDal("Grocery", "Dal & Pulses", "Amruta", "Urad Gold", 1018, 10, 78.87, 120, 10, "15-Aug-2003", "Urad Dal");
	//Product 2:
	SDPToorDal sudp9 = new SDPToorDal("Grocery", "Dal & Pulses", "Vikram", "VK-Urad Dal", 1019, 20, 90.81, 130, 10, "12-July-2025", "Urad Dal");
	//Product 2:
	SDPToorDal sudp10 = new SDPToorDal("Grocery", "Dal & Pulses", "Suhana", "Hira Dal", 1020, 10, 60.10, 95, 10, "10-Sept-2025", "Urad Dal");

	Scanner sc = new Scanner(System.in);
	boolean counter=true;
	
	//Method for choosing option purchase or product details
	public void comBineUradal()
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
	
	//Methid for showing Urad Dal Details
	public void showDalPulses()
	{
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		System.out.println("Product Name          Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Organic Classic  : "+sudp1.cprice
						+"\n2.Organic Urad Dal : "+sudp2.cprice
						+"\n3.Gold Winner      : "+sudp3.cprice
						+"\n4.TRT-Dal          : "+sudp4.cprice
						+"\n5.Pr-Urad Dal      : "+sudp5.cprice
						+"\n6.Haldiram-Dal     : "+sudp6.cprice
						+"\n7.Kissan Urad Dal  : "+sudp7.cprice
						+"\n8.Urad Gold        : "+sudp8.cprice
						+"\n9.VK-Urad Dal      : "+sudp9.cprice
						+"\n10.Hira Dal        : "+sudp10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sudp10);
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
			System.out.println("1.Organic Classic  : "+sudp1.pprice
					+"\n2.Organic Urad Dal : "+sudp2.cprice
					+"\n3.Gold Winner      : "+sudp3.cprice
					+"\n4.TRT-Dal          : "+sudp4.cprice
					+"\n5.Pr-Urad Dal      : "+sudp5.cprice
					+"\n6.Haldiram-Dal     : "+sudp6.cprice
					+"\n7.Kissan Urad Dal  : "+sudp7.cprice
					+"\n8.Urad Gold        : "+sudp8.cprice
					+"\n9.VK-Urad Dal      : "+sudp9.cprice
					+"\n10.Hira Dal        : "+sudp10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh2.put(sudp1.pid+"  -->  "+sudp1.pname+"  ",sudp1.cprice);
					System.out.println("Product ID :"+sudp1.pid+" , "+"Product Name :"+sudp1.pname+" , "+"Product Price :"+sudp1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh2.put(sudp2.pid+"  -->  "+sudp2.pname+"  ",sudp2.cprice);
					System.out.println("Product ID :"+sudp2.pid+" , "+"Product Name :"+sudp2.pname+" , "+"Product Price :"+sudp2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh2.put(sudp3.pid+"  -->  "+sudp3.pname+"  ",sudp3.cprice);
					System.out.println("Product ID :"+sudp3.pid+" , "+"Product Name :"+sudp3.pname+" , "+"Product Price :"+sudp3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh2.put(sudp4.pid+"  -->  "+sudp4.pname+"  ",sudp4.cprice);
					System.out.println("Product ID :"+sudp4.pid+" , "+"Product Name :"+sudp4.pname+" , "+"Product Price :"+sudp4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh2.put(sudp5.pid+"  -->  "+sudp5.pname+"  ",sudp5.cprice);
					System.out.println("Product ID :"+sudp5.pid+" , "+"Product Name :"+sudp5.pname+" , "+"Product Price :"+sudp5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh2.put(sudp6.pid+"  -->  "+sudp6.pname+"  ",sudp6.cprice);
					System.out.println("Product ID :"+sudp6.pid+" , "+"Product Name :"+sudp6.pname+" , "+"Product Price :"+sudp6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh2.put(sudp7.pid+"  -->  "+sudp7.pname+"  ",sudp7.cprice);
					System.out.println("Product ID :"+sudp7.pid+" , "+"Product Name :"+sudp7.pname+" , "+"Product Price :"+sudp7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh2.put(sudp8.pid+"  -->  "+sudp8.pname+"  ",sudp8.cprice);
					System.out.println("Product ID :"+sudp8.pid+" , "+"Product Name :"+sudp8.pname+" , "+"Product Price :"+sudp8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh2.put(sudp9.pid+"  -->  "+sudp9.pname+"  ",sudp9.cprice);
					System.out.println("Product ID :"+sudp9.pid+" , "+"Product Name :"+sudp9.pname+" , "+"Product Price :"+sudp9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh2.put(sudp10.pid+"  -->  "+sudp10.pname+"  ",sudp10.cprice);
					System.out.println("Product ID :"+sudp10.pid+" , "+"Product Name :"+sudp10.pname+" , "+"Product Price :"+sudp10.cprice);
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
		for(Object obj:lh2.values())
		{
			Double d = (Double)obj;
			sum = sum+d;
		}
		return sum;
	}

}
