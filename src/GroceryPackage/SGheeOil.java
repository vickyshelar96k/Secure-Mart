package GroceryPackage;
import java.util.LinkedHashMap;
import java.util.Scanner;

import MiniMarketPackage.*;

public class SGheeOil extends Staples{
	
	String oilname;
	SGheeOil(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);
		this.oilname=oilname;
	}
}

//GheeOil type class
class Ghee extends SGheeOil
{
	Ghee(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
			double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, oilname);
	}
	
	//toString method for showing the object details instead of address
		@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nGhee Name : "+oilname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}

class GheeProducts
{
	Scanner sc = new Scanner(System.in);
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh7 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//constructor adding products error ghee 
	Ghee gh1 = new Ghee("Grocery","Ghee & Oil","Heritage","Golden Cow Ghee",1071,20,260,297,7,"15-Aug-2025","Ghee");
	Ghee gh2 = new Ghee("Grocery","Ghee & Oil","GRB","GRB Cow Ghee",1072,20,385,485,10,"28-Oct-2025","Ghee");
	Ghee gh3 = new Ghee("Grocery","Ghee & Oil","Nadini","Nandini Cow Ghee",1073,20,260,297,7,"16-Sept-2025","Ghee");
	Ghee gh4 = new Ghee("Grocery","Ghee & Oil","Patanjali","Danedar Cow Ghee",1074,20,631,725,7,"02-March-2025","Ghee");
	Ghee gh5 = new Ghee("Grocery","Ghee & Oil","Aashirwad","Svasti Cow Ghee",1075,20,674,725,7,"27-Feb-2025","Ghee");
	Ghee gh6 = new Ghee("Grocery","Ghee & Oil","Godrej","Godrej Cow Ghee",1076,20,499,779,7,"18-Oct-2025","Ghee");
	Ghee gh7 = new Ghee("Grocery","Ghee & Oil","Gowardhan","GW Cow Ghee",1077,20,467,525,7,"15-Dec-2024","Ghee");
	Ghee gh8 = new Ghee("Grocery","Ghee & Oil","NutriLite","Dhoodh-Shakti Cow Ghee",1078,20,514,630,7,"09-Oct-2025","Ghee");
	Ghee gh9 = new Ghee("Grocery","Ghee & Oil","Amul","Amul Cow Ghee",1079,20,610,635,7,"17-Sept-2025","Ghee");
	Ghee gh10 = new Ghee("Grocery","Ghee & Oil","Vijaya","Jaya Cow Ghee",1080,20,310,390,7,"04-March-2025","Ghee");
	//for showing and purchasing the product
	public void comBineGhee()
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
				showGheeOil();
				break;
			case 2:
				purchaseGheeOil();
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
	//Method for showing ghee products
	public void showGheeOil()
	{
		boolean counter=true;
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("            ");
		System.out.println("Product Name         Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Golden Cow Ghee : "+gh1.cprice
						+"\n2.GRB Cow Ghee	  : "+gh2.cprice
						+"\n3.Nandini Cow Ghee: "+gh3.cprice
						+"\n4.Danedar Cow Ghee: "+gh4.cprice
						+"\n5.Svasti Cow Ghee : "+gh5.cprice
						+"\n6.Godrej Cow Ghee : "+gh6.cprice
						+"\n7.GW Cow Ghee     : "+gh7.cprice
						+"\n8.Shakti Cow Ghee : "+gh8.cprice
						+"\n9.Amul Cow Ghee   : "+gh9.cprice
						+"\n10.Jaya Cow Ghee  : "+gh10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gh10);
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
	//Method for purchasing the product
	public void purchaseGheeOil()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name         Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Golden Cow Ghee : "+gh1.cprice
							+"\n2.GRB Cow Ghee	  : "+gh2.cprice
							+"\n3.Nandini Cow Ghee: "+gh3.cprice
							+"\n4.Danedar Cow Ghee: "+gh4.cprice
							+"\n5.Svasti Cow Ghee : "+gh5.cprice
							+"\n6.Godrej Cow Ghee : "+gh6.cprice
							+"\n7.GW Cow Ghee     : "+gh7.cprice
							+"\n8.Shakti Cow Ghee : "+gh8.cprice
							+"\n9.Amul Cow Ghee   : "+gh9.cprice
							+"\n10.Jaya Cow Ghee  : "+gh10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh7.put(gh1.pid+"  -->  "+gh1.pname+"  ",gh1.cprice);
					System.out.println("Product ID :"+gh1.pid+" , "+"Product Name :"+gh1.pname+" , "+"Product Price :"+gh1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh7.put(gh2.pid+"  -->  "+gh2.pname+"  ",gh2.cprice);
					System.out.println("Product ID :"+gh2.pid+" , "+"Product Name :"+gh2.pname+" , "+"Product Price :"+gh2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh7.put(gh3.pid+"  -->  "+gh3.pname+"  ",gh3.cprice);
					System.out.println("Product ID :"+gh3.pid+" , "+"Product Name :"+gh3.pname+" , "+"Product Price :"+gh3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh7.put(gh4.pid+"  -->  "+gh4.pname+"  ",gh4.cprice);
					System.out.println("Product ID :"+gh4.pid+" , "+"Product Name :"+gh4.pname+" , "+"Product Price :"+gh4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh7.put(gh5.pid+"  -->  "+gh5.pname+"  ",gh5.cprice);
					System.out.println("Product ID :"+gh5.pid+" , "+"Product Name :"+gh5.pname+" , "+"Product Price :"+gh5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh7.put(gh6.pid+"  -->  "+gh6.pname+"  ",gh6.cprice);
					System.out.println("Product ID :"+gh6.pid+" , "+"Product Name :"+gh6.pname+" , "+"Product Price :"+gh6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh7.put(gh7.pid+"  -->  "+gh7.pname+"  ",gh7.cprice);
					System.out.println("Product ID :"+gh7.pid+" , "+"Product Name :"+gh7.pname+" , "+"Product Price :"+gh7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh7.put(gh8.pid+"  -->  "+gh8.pname+"  ",gh8.cprice);
					System.out.println("Product ID :"+gh8.pid+" , "+"Product Name :"+gh8.pname+" , "+"Product Price :"+gh8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh7.put(gh9.pid+"  -->  "+gh9.pname+"  ",gh9.cprice);
					System.out.println("Product ID :"+gh9.pid+" , "+"Product Name :"+gh9.pname+" , "+"Product Price :"+gh9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh7.put(gh10.pid+"  -->  "+gh10.pname+"  ",gh10.cprice);
					System.out.println("Product ID :"+gh10.pid+" , "+"Product Name :"+gh10.pname+" , "+"Product Price :"+gh10.cprice);
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
		for(Object obj:lh7.values())
		{
			Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
			sum = sum+d;
		}
		return sum;
	}
	
	
}

class BlendedOil extends SGheeOil
{
	BlendedOil(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
				double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, oilname);
	}
	
	//toString method for showing the object details instead of address
		@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nOil Name : "+oilname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}

class BlendOilProducts
{
	Scanner sc = new Scanner(System.in);
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh8 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//constructor adding products error ghee 
	BlendedOil bl1 = new BlendedOil("Grocery","Ghee & Oil","Saffola","Saffola Gold Oil",1081,20,149,180,4,"15-Aug-2025","Oil");
	BlendedOil bl2 = new BlendedOil("Grocery","Ghee & Oil","Oleev","Oleev Health Oil",1082,20,154,210,4,"28-Oct-2025","Oil");
	BlendedOil bl3 = new BlendedOil("Grocery","Ghee & Oil","Fortune","Fortune Xpert Oil",1083,20,139,172,4,"16-Sept-2025","Oil");
	BlendedOil bl4 = new BlendedOil("Grocery","Ghee & Oil","Patanjali","Patanjali Pure Oil",1084,20,137,207,4,"02-March-2025","Oil");
	BlendedOil bl5 = new BlendedOil("Grocery","Ghee & Oil","Sundrop","Sundrop Heart Oil",1085,20,197,225,4,"27-Feb-2025","Oil");
	BlendedOil bl6 = new BlendedOil("Grocery","Ghee & Oil","Godrej","Kirti Gold",1086,20,120,149,4,"18-Oct-2025","Oil");
	BlendedOil bl7 = new BlendedOil("Grocery","Ghee & Oil","Oleev","Oleev Smart Oil",1087,20,130,200,4,"15-Dec-2024","Oil");
	BlendedOil bl8 = new BlendedOil("Grocery","Ghee & Oil","NutriLite","NutriLite Oil",1088,20,147,189,4,"09-Oct-2025","Oil");
	BlendedOil bl9 = new BlendedOil("Grocery","Ghee & Oil","Sun Feast","Sun-Feast Oil",1089,20,174,217,4,"17-Sept-2025","Oil");
	BlendedOil bl10 = new BlendedOil("Grocery","Ghee & Oil","Xpert","Xpert Pro Oil",1090,20,142,168,4,"04-March-2025","Oil");
	//for showing and purchasing the product
	public void comBineGheeOil()
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
				showGheeOil();
				break;
			case 2:
				purchaseGheeOil();
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
	//Method for showing oil details
	public void showGheeOil()
	{
		boolean counter=true;
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("            ");
		System.out.println("Product Name        Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Saffola Gold Oil   : "+bl1.cprice
				+"\n2.Oleev Health Oil   : "+bl2.cprice
				+"\n3.Fortune Xpert Oil  : "+bl3.cprice
				+"\n4.Patanjali Pure Oil : "+bl4.cprice
				+"\n5.Sundrop Heart Oil  : "+bl5.cprice
				+"\n6.Kirti Gold         : "+bl6.cprice
				+"\n7.Oleev Smart Oil    : "+bl7.cprice
				+"\n8.NutriLite Oil      : "+bl8.cprice
				+"\n9.Sun-Feast Oil      : "+bl9.cprice
				+"\n10.Xpert Pro Oil     : "+bl10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(bl10);
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
	//Method for purchasing oil
	public void purchaseGheeOil()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name            Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Saffola Gold Oil   : "+bl1.cprice
							+"\n2.Oleev Health Oil   : "+bl2.cprice
							+"\n3.Fortune Xpert Oil  : "+bl3.cprice
							+"\n4.Patanjali Pure Oil : "+bl4.cprice
							+"\n5.Sundrop Heart Oil  : "+bl5.cprice
							+"\n6.Kirti Gold         : "+bl6.cprice
							+"\n7.Oleev Smart Oil    : "+bl7.cprice
							+"\n8.NutriLite Oil      : "+bl8.cprice
							+"\n9.Sun-Feast Oil      : "+bl9.cprice
							+"\n10.Xpert Pro Oil     : "+bl10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh8.put(bl1.pid+"  -->  "+bl1.pname+"  ",bl1.cprice);
					System.out.println("Product ID :"+bl1.pid+" , "+"Product Name :"+bl1.pname+" , "+"Product Price :"+bl1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh8.put(bl2.pid+"  -->  "+bl2.pname+"  ",bl2.cprice);
					System.out.println("Product ID :"+bl2.pid+" , "+"Product Name :"+bl2.pname+" , "+"Product Price :"+bl2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh8.put(bl3.pid+"  -->  "+bl3.pname+"  ",bl3.cprice);
					System.out.println("Product ID :"+bl3.pid+" , "+"Product Name :"+bl3.pname+" , "+"Product Price :"+bl3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh8.put(bl4.pid+"  -->  "+bl4.pname+"  ",bl4.cprice);
					System.out.println("Product ID :"+bl4.pid+" , "+"Product Name :"+bl4.pname+" , "+"Product Price :"+bl4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh8.put(bl5.pid+"  -->  "+bl5.pname+"  ",bl5.cprice);
					System.out.println("Product ID :"+bl5.pid+" , "+"Product Name :"+bl5.pname+" , "+"Product Price :"+bl5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh8.put(bl6.pid+"  -->  "+bl6.pname+"  ",bl6.cprice);
					System.out.println("Product ID :"+bl6.pid+" , "+"Product Name :"+bl6.pname+" , "+"Product Price :"+bl6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh8.put(bl7.pid+"  -->  "+bl7.pname+"  ",bl7.cprice);
					System.out.println("Product ID :"+bl7.pid+" , "+"Product Name :"+bl7.pname+" , "+"Product Price :"+bl7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh8.put(bl8.pid+"  -->  "+bl8.pname+"  ",bl8.cprice);
					System.out.println("Product ID :"+bl8.pid+" , "+"Product Name :"+bl8.pname+" , "+"Product Price :"+bl8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh8.put(bl9.pid+"  -->  "+bl9.pname+"  ",bl9.cprice);
					System.out.println("Product ID :"+bl9.pid+" , "+"Product Name :"+bl9.pname+" , "+"Product Price :"+bl9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh8.put(bl10.pid+"  -->  "+bl10.pname+"  ",bl10.cprice);
					System.out.println("Product ID :"+bl10.pid+" , "+"Product Name :"+bl10.pname+" , "+"Product Price :"+bl10.cprice);
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
		double sum=0.0;
		for(Object obj:lh8.values())
		{
			Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
			sum = sum+d;
		}
		return sum;
	}
}
//BlededOil products class ended
//SunflowerOil class starts
class SunflowerOil extends SGheeOil
{
	SunflowerOil(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
					double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, oilname);
	}
	
	//toString method for showing the object details instead of address
		@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nOil Name : "+oilname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}
//Class for sunflowerOil products
class SunFlowerOilProducts
{
	Scanner sc = new Scanner(System.in);
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh9 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//constructor adding products error ghee 
	SunflowerOil sf1 = new SunflowerOil("Grocery","Ghee & Oil","Saffola","Saffola Gold Oil",1091,20,149,180,4,"15-Aug-2025","Oil");
	SunflowerOil sf2 = new SunflowerOil("Grocery","Ghee & Oil","Oleev","Oleev Health Oil",1092,20,154,210,4,"28-Oct-2025","Oil");
	SunflowerOil sf3 = new SunflowerOil("Grocery","Ghee & Oil","Fortune","Fortune Xpert Oil",1093,20,139,172,4,"16-Sept-2025","Oil");
	SunflowerOil sf4 = new SunflowerOil("Grocery","Ghee & Oil","Patanjali","Patanjali Pure Oil",1094,20,137,207,4,"02-March-2025","Oil");
	SunflowerOil sf5 = new SunflowerOil("Grocery","Ghee & Oil","Sundrop","Sundrop Heart Oil",1095,20,197,225,4,"27-Feb-2025","Oil");
	SunflowerOil sf6 = new SunflowerOil("Grocery","Ghee & Oil","Godrej","Kirti Gold",1096,20,120,149,4,"18-Oct-2025","Oil");
	SunflowerOil sf7 = new SunflowerOil("Grocery","Ghee & Oil","Oleev","Oleev Smart Oil",1097,20,130,200,4,"15-Dec-2024","Oil");
	SunflowerOil sf8 = new SunflowerOil("Grocery","Ghee & Oil","NutriLite","NutriLite Oil",1098,20,147,189,4,"09-Oct-2025","Oil");
	SunflowerOil sf9 = new SunflowerOil("Grocery","Ghee & Oil","Sun Feast","Sun-Feast Oil",1099,20,174,217,4,"17-Sept-2025","Oil");
	SunflowerOil sf10 = new SunflowerOil("Grocery","Ghee & Oil","Xpert","Xpert Pro Oil",1100,20,142,168,4,"04-March-2025","Oil");
	//for showing and purchasing the product
	public void comBineGheeOil()
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
				showGheeOil();
				break;
			case 2:
				purchaseGheeOil();
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
	//method for showing all the dal details
	public void showGheeOil()
	{
		boolean counter=true;
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("            ");
		System.out.println("Product Name        Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Saffola Gold Oil   : "+sf1.cprice
				+"\n2.Oleev Health Oil   : "+sf2.cprice
				+"\n3.Fortune Xpert Oil  : "+sf3.cprice
				+"\n4.Patanjali Pure Oil : "+sf4.cprice
				+"\n5.Sundrop Heart Oil  : "+sf5.cprice
				+"\n6.Kirti Gold         : "+sf6.cprice
				+"\n7.Oleev Smart Oil    : "+sf7.cprice
				+"\n8.NutriLite Oil      : "+sf8.cprice
				+"\n9.Sun-Feast Oil      : "+sf9.cprice
				+"\n10.Xpert Pro Oil     : "+sf10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(sf10);
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
	//Method for purchasing product
	public void purchaseGheeOil()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name        Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Saffola Gold Oil   : "+sf1.cprice
					+"\n2.Oleev Health Oil   : "+sf2.cprice
					+"\n3.Fortune Xpert Oil  : "+sf3.cprice
					+"\n4.Patanjali Pure Oil : "+sf4.cprice
					+"\n5.Sundrop Heart Oil  : "+sf5.cprice
					+"\n6.Kirti Gold         : "+sf6.cprice
					+"\n7.Oleev Smart Oil    : "+sf7.cprice
					+"\n8.NutriLite Oil      : "+sf8.cprice
					+"\n9.Sun-Feast Oil      : "+sf9.cprice
					+"\n10.Xpert Pro Oil     : "+sf10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh9.put(sf1.pid+"  -->  "+sf1.pname+"  ",sf1.cprice);
					System.out.println("Product ID :"+sf1.pid+" , "+"Product Name :"+sf1.pname+" , "+"Product Price :"+sf1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh9.put(sf2.pid+"  -->  "+sf2.pname+"  ",sf2.cprice);
					System.out.println("Product ID :"+sf2.pid+" , "+"Product Name :"+sf2.pname+" , "+"Product Price :"+sf2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh9.put(sf3.pid+"  -->  "+sf3.pname+"  ",sf3.cprice);
					System.out.println("Product ID :"+sf3.pid+" , "+"Product Name :"+sf3.pname+" , "+"Product Price :"+sf3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh9.put(sf4.pid+"  -->  "+sf4.pname+"  ",sf4.cprice);
					System.out.println("Product ID :"+sf4.pid+" , "+"Product Name :"+sf4.pname+" , "+"Product Price :"+sf4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh9.put(sf5.pid+"  -->  "+sf5.pname+"  ",sf5.cprice);
					System.out.println("Product ID :"+sf5.pid+" , "+"Product Name :"+sf5.pname+" , "+"Product Price :"+sf5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh9.put(sf6.pid+"  -->  "+sf6.pname+"  ",sf6.cprice);
					System.out.println("Product ID :"+sf6.pid+" , "+"Product Name :"+sf6.pname+" , "+"Product Price :"+sf6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh9.put(sf7.pid+"  -->  "+sf7.pname+"  ",sf7.cprice);
					System.out.println("Product ID :"+sf7.pid+" , "+"Product Name :"+sf7.pname+" , "+"Product Price :"+sf7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh9.put(sf8.pid+"  -->  "+sf8.pname+"  ",sf8.cprice);
					System.out.println("Product ID :"+sf8.pid+" , "+"Product Name :"+sf8.pname+" , "+"Product Price :"+sf8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh9.put(sf9.pid+"  -->  "+sf9.pname+"  ",sf9.cprice);
					System.out.println("Product ID :"+sf9.pid+" , "+"Product Name :"+sf9.pname+" , "+"Product Price :"+sf9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh9.put(sf10.pid+"  -->  "+sf10.pname+"  ",sf10.cprice);
					System.out.println("Product ID :"+sf10.pid+" , "+"Product Name :"+sf10.pname+" , "+"Product Price :"+sf10.cprice);
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
		double sum=0.0;
		for(Object obj:lh9.values())
		{
			Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
			sum = sum+d;
		}
		return sum;
	}
}
//SunFlower Oil Porducts class ended
//OliveOil class start
class OliveOil extends SGheeOil
{
	OliveOil(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
				double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, oilname);
	}
	
	//toString method for showing the object details instead of address
		@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nOil Name : "+oilname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}
//Product Class
class OliveOilProducts
{
	Scanner sc = new Scanner(System.in);
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh10 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//constructor adding products error ghee 
	OliveOil ol1 = new OliveOil("Grocery","Ghee & Oil","Saffola","Saffola Gold Oil",1101,20,149,180,4,"15-Aug-2025","Oil");
	OliveOil ol2 = new OliveOil("Grocery","Ghee & Oil","Oleev","Oleev Health Oil",1102,20,154,210,4,"28-Oct-2025","Oil");
	OliveOil ol3 = new OliveOil("Grocery","Ghee & Oil","Fortune","Fortune Xpert Oil",1103,20,139,172,4,"16-Sept-2025","Oil");
	OliveOil ol4 = new OliveOil("Grocery","Ghee & Oil","Patanjali","Patanjali Pure Oil",1104,20,137,207,4,"02-March-2025","Oil");
	OliveOil ol5 = new OliveOil("Grocery","Ghee & Oil","Sundrop","Sundrop Heart Oil",1105,20,197,225,4,"27-Feb-2025","Oil");
	OliveOil ol6 = new OliveOil("Grocery","Ghee & Oil","Godrej","Kirti Gold",1106,20,120,149,4,"18-Oct-2025","Oil");
	OliveOil ol7 = new OliveOil("Grocery","Ghee & Oil","Oleev","Oleev Smart Oil",1107,20,130,200,4,"15-Dec-2024","Oil");
	OliveOil ol8 = new OliveOil("Grocery","Ghee & Oil","NutriLite","NutriLite Oil",1108,20,147,189,4,"09-Oct-2025","Oil");
	OliveOil ol9 = new OliveOil("Grocery","Ghee & Oil","Sun Feast","Sun-Feast Oil",1109,20,174,217,4,"17-Sept-2025","Oil");
	OliveOil ol10 = new OliveOil("Grocery","Ghee & Oil","Xpert","Xpert Pro Oil",1110,20,142,168,4,"04-March-2025","Oil");
	//for showing and purchasing the product
	public void comBineGheeOil()
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
				showGheeOil();
				break;
			case 2:
				purchaseGheeOil();
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
	//Method for showing oil details
	public void showGheeOil()
	{
		boolean counter=true;
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("            ");
		System.out.println("Product Name        Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Saffola Gold Oil   : "+ol1.cprice
				+"\n2.Oleev Health Oil   : "+ol2.cprice
				+"\n3.Fortune Xpert Oil  : "+ol3.cprice
				+"\n4.Patanjali Pure Oil : "+ol4.cprice
				+"\n5.Sundrop Heart Oil  : "+ol5.cprice
				+"\n6.Kirti Gold         : "+ol6.cprice
				+"\n7.Oleev Smart Oil    : "+ol7.cprice
				+"\n8.NutriLite Oil      : "+ol8.cprice
				+"\n9.Sun-Feast Oil      : "+ol9.cprice
				+"\n10.Xpert Pro Oil     : "+ol10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(ol10);
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
	//Method for purchasing oil
	public void purchaseGheeOil()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name            Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Saffola Gold Oil   : "+ol1.cprice
							+"\n2.Oleev Health Oil   : "+ol2.cprice
							+"\n3.Fortune Xpert Oil  : "+ol3.cprice
							+"\n4.Patanjali Pure Oil : "+ol4.cprice
							+"\n5.Sundrop Heart Oil  : "+ol5.cprice
							+"\n6.Kirti Gold         : "+ol6.cprice
							+"\n7.Oleev Smart Oil    : "+ol7.cprice
							+"\n8.NutriLite Oil      : "+ol8.cprice
							+"\n9.Sun-Feast Oil      : "+ol9.cprice
							+"\n10.Xpert Pro Oil     : "+ol10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh10.put(ol1.pid+"  -->  "+ol1.pname+"  ",ol1.cprice);
					System.out.println("Product ID :"+ol1.pid+" , "+"Product Name :"+ol1.pname+" , "+"Product Price :"+ol1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh10.put(ol2.pid+"  -->  "+ol2.pname+"  ",ol2.cprice);
					System.out.println("Product ID :"+ol2.pid+" , "+"Product Name :"+ol2.pname+" , "+"Product Price :"+ol2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh10.put(ol3.pid+"  -->  "+ol3.pname+"  ",ol3.cprice);
					System.out.println("Product ID :"+ol3.pid+" , "+"Product Name :"+ol3.pname+" , "+"Product Price :"+ol3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh10.put(ol4.pid+"  -->  "+ol4.pname+"  ",ol4.cprice);
					System.out.println("Product ID :"+ol4.pid+" , "+"Product Name :"+ol4.pname+" , "+"Product Price :"+ol4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh10.put(ol5.pid+"  -->  "+ol5.pname+"  ",ol5.cprice);
					System.out.println("Product ID :"+ol5.pid+" , "+"Product Name :"+ol5.pname+" , "+"Product Price :"+ol5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh10.put(ol6.pid+"  -->  "+ol6.pname+"  ",ol6.cprice);
					System.out.println("Product ID :"+ol6.pid+" , "+"Product Name :"+ol6.pname+" , "+"Product Price :"+ol6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh10.put(ol7.pid+"  -->  "+ol7.pname+"  ",ol7.cprice);
					System.out.println("Product ID :"+ol7.pid+" , "+"Product Name :"+ol7.pname+" , "+"Product Price :"+ol7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh10.put(ol8.pid+"  -->  "+ol8.pname+"  ",ol8.cprice);
					System.out.println("Product ID :"+ol8.pid+" , "+"Product Name :"+ol8.pname+" , "+"Product Price :"+ol8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh10.put(ol9.pid+"  -->  "+ol9.pname+"  ",ol9.cprice);
					System.out.println("Product ID :"+ol9.pid+" , "+"Product Name :"+ol9.pname+" , "+"Product Price :"+ol9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh10.put(ol10.pid+"  -->  "+ol10.pname+"  ",ol10.cprice);
					System.out.println("Product ID :"+ol10.pid+" , "+"Product Name :"+ol10.pname+" , "+"Product Price :"+ol10.cprice);
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
		double sum=0.0;
		for(Object obj:lh10.values())
		{
			Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
			sum = sum+d;
		}
		return sum;
	}
}
//OliveOil products class ended
class GroundNutOil extends SGheeOil
{
	GroundNutOil(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
					double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, oilname);
	}
	
	//toString method for showing the object details instead of address
		@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nOil Name : "+oilname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}
//GroundNutOil Products class
class GroundNutOilProducts 
{
	Scanner sc = new Scanner(System.in);
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh11 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//constructor adding products error ghee 
	GroundNutOil gn1 = new GroundNutOil("Grocery","Ghee & Oil","Saffola","Saffola Gold Oil",1111,20,149,180,4,"15-Aug-2025","Oil");
	GroundNutOil gn2 = new GroundNutOil("Grocery","Ghee & Oil","Oleev","Oleev Health Oil",1112,20,154,210,4,"28-Oct-2025","Oil");
	GroundNutOil gn3 = new GroundNutOil("Grocery","Ghee & Oil","Fortune","Fortune Xpert Oil",1113,20,139,172,4,"16-Sept-2025","Oil");
	GroundNutOil gn4 = new GroundNutOil("Grocery","Ghee & Oil","Patanjali","Patanjali Pure Oil",1114,20,137,207,4,"02-March-2025","Oil");
	GroundNutOil gn5 = new GroundNutOil("Grocery","Ghee & Oil","Sundrop","Sundrop Heart Oil",1115,20,197,225,4,"27-Feb-2025","Oil");
	GroundNutOil gn6 = new GroundNutOil("Grocery","Ghee & Oil","Godrej","Kirti Gold",1116,20,120,149,4,"18-Oct-2025","Oil");
	GroundNutOil gn7 = new GroundNutOil("Grocery","Ghee & Oil","Oleev","Oleev Smart Oil",1117,20,130,200,4,"15-Dec-2024","Oil");
	GroundNutOil gn8 = new GroundNutOil("Grocery","Ghee & Oil","NutriLite","NutriLite Oil",1118,20,147,189,4,"09-Oct-2025","Oil");
	GroundNutOil gn9 = new GroundNutOil("Grocery","Ghee & Oil","Sun Feast","Sun-Feast Oil",1119,20,174,217,4,"17-Sept-2025","Oil");
	GroundNutOil gn10 = new GroundNutOil("Grocery","Ghee & Oil","Xpert","Xpert Pro Oil",1120,20,142,168,4,"04-March-2025","Oil");
	//for showing and purchasing the product
	public void comBineGheeOil()
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
				showGheeOil();
				break;
			case 2:
				purchaseGheeOil();
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
	//Method for showing oil details
	public void showGheeOil()
	{
		boolean counter=true;
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("            ");
		System.out.println("Product Name        Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Saffola Gold Oil   : "+gn1.cprice
				+"\n2.Oleev Health Oil   : "+gn2.cprice
				+"\n3.Fortune Xpert Oil  : "+gn3.cprice
				+"\n4.Patanjali Pure Oil : "+gn4.cprice
				+"\n5.Sundrop Heart Oil  : "+gn5.cprice
				+"\n6.Kirti Gold         : "+gn6.cprice
				+"\n7.Oleev Smart Oil    : "+gn7.cprice
				+"\n8.NutriLite Oil      : "+gn8.cprice
				+"\n9.Sun-Feast Oil      : "+gn9.cprice
				+"\n10.Xpert Pro Oil     : "+gn10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(gn10);
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
	//Method for purchasing oil
	public void purchaseGheeOil()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name            Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Saffola Gold Oil   : "+gn1.cprice
					+"\n2.Oleev Health Oil   : "+gn2.cprice
					+"\n3.Fortune Xpert Oil  : "+gn3.cprice
					+"\n4.Patanjali Pure Oil : "+gn4.cprice
					+"\n5.Sundrop Heart Oil  : "+gn5.cprice
					+"\n6.Kirti Gold         : "+gn6.cprice
					+"\n7.Oleev Smart Oil    : "+gn7.cprice
					+"\n8.NutriLite Oil      : "+gn8.cprice
					+"\n9.Sun-Feast Oil      : "+gn9.cprice
					+"\n10.Xpert Pro Oil     : "+gn10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh11.put(gn1.pid+"  -->  "+gn1.pname+"  ",gn1.cprice);
					System.out.println("Product ID :"+gn1.pid+" , "+"Product Name :"+gn1.pname+" , "+"Product Price :"+gn1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh11.put(gn2.pid+"  -->  "+gn2.pname+"  ",gn2.cprice);
					System.out.println("Product ID :"+gn2.pid+" , "+"Product Name :"+gn2.pname+" , "+"Product Price :"+gn2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh11.put(gn3.pid+"  -->  "+gn3.pname+"  ",gn3.cprice);
					System.out.println("Product ID :"+gn3.pid+" , "+"Product Name :"+gn3.pname+" , "+"Product Price :"+gn3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh11.put(gn4.pid+"  -->  "+gn4.pname+"  ",gn4.cprice);
					System.out.println("Product ID :"+gn4.pid+" , "+"Product Name :"+gn4.pname+" , "+"Product Price :"+gn4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh11.put(gn5.pid+"  -->  "+gn5.pname+"  ",gn5.cprice);
					System.out.println("Product ID :"+gn5.pid+" , "+"Product Name :"+gn5.pname+" , "+"Product Price :"+gn5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh11.put(gn6.pid+"  -->  "+gn6.pname+"  ",gn6.cprice);
					System.out.println("Product ID :"+gn6.pid+" , "+"Product Name :"+gn6.pname+" , "+"Product Price :"+gn6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh11.put(gn7.pid+"  -->  "+gn7.pname+"  ",gn7.cprice);
					System.out.println("Product ID :"+gn7.pid+" , "+"Product Name :"+gn7.pname+" , "+"Product Price :"+gn7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh11.put(gn8.pid+"  -->  "+gn8.pname+"  ",gn8.cprice);
					System.out.println("Product ID :"+gn8.pid+" , "+"Product Name :"+gn8.pname+" , "+"Product Price :"+gn8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh11.put(gn9.pid+"  -->  "+gn9.pname+"  ",gn9.cprice);
					System.out.println("Product ID :"+gn9.pid+" , "+"Product Name :"+gn9.pname+" , "+"Product Price :"+gn9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh11.put(gn10.pid+"  -->  "+gn10.pname+"  ",gn10.cprice);
					System.out.println("Product ID :"+gn10.pid+" , "+"Product Name :"+gn10.pname+" , "+"Product Price :"+gn10.cprice);
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
		double sum=0.0;
		for(Object obj:lh11.values())
		{
			Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
			sum = sum+d;
		}
		return sum;
	}
}
//GroundNutOil Products class ended
class MuterdOil extends SGheeOil
{
	MuterdOil(String cat, String type, String brand, String pname, int pid, double quantity, double oprice,
					double pprice, double discount, String expdate, String oilname)
	{
		super(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, oilname);
	}
	
	//toString method for showing the object details instead of address
		@Override
	public String toString()
	{
		return "Product Category Type : "+cat+"\nType of Product : "+type
				+"\nProduct Brand : "+brand+"\nOil Name : "+oilname+"\nProduct Name : "+pname+"\nProduct ID : "+pid+"\nProduct Quantity : "+quantity
				+"\nProduct Original Price : "+oprice+"\nProduct Price : "+pprice+"\nDiscount on Product : "+discount
				+"\nProduct Customer Price : "+cprice+"\nProduct Expiry Date : "+expdate
				+"\n-----------------------------------------------------------------";
	}
}
//MuterdOil Products
class MuterdOilProducts
{
	Scanner sc = new Scanner(System.in);
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh12 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
	//constructor adding products error ghee 
	MuterdOil mo1 = new MuterdOil("Grocery","Ghee & Oil","Saffola","Saffola Gold Oil",1121,20,149,180,4,"15-Aug-2025","Oil");
	MuterdOil mo2 = new MuterdOil("Grocery","Ghee & Oil","Oleev","Oleev Health Oil",1122,20,154,210,4,"28-Oct-2025","Oil");
	MuterdOil mo3 = new MuterdOil("Grocery","Ghee & Oil","Fortune","Fortune Xpert Oil",1123,20,139,172,4,"16-Sept-2025","Oil");
	MuterdOil mo4 = new MuterdOil("Grocery","Ghee & Oil","Patanjali","Patanjali Pure Oil",1124,20,137,207,4,"02-March-2025","Oil");
	MuterdOil mo5 = new MuterdOil("Grocery","Ghee & Oil","Sundrop","Sundrop Heart Oil",1125,20,197,225,4,"27-Feb-2025","Oil");
	MuterdOil mo6 = new MuterdOil("Grocery","Ghee & Oil","Godrej","Kirti Gold",1126,20,120,149,4,"18-Oct-2025","Oil");
	MuterdOil mo7 = new MuterdOil("Grocery","Ghee & Oil","Oleev","Oleev Smart Oil",1127,20,130,200,4,"15-Dec-2024","Oil");
	MuterdOil mo8 = new MuterdOil("Grocery","Ghee & Oil","NutriLite","NutriLite Oil",1128,20,147,189,4,"09-Oct-2025","Oil");
	MuterdOil mo9 = new MuterdOil("Grocery","Ghee & Oil","Sun Feast","Sun-Feast Oil",1129,20,174,217,4,"17-Sept-2025","Oil");
	MuterdOil mo10 = new MuterdOil("Grocery","Ghee & Oil","Xpert","Xpert Pro Oil",1130,20,142,168,4,"04-March-2025","Oil");
	//for showing and purchasing the product
	public void comBineGheeOil()
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
				showGheeOil();
				break;
			case 2:
				purchaseGheeOil();
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
	//Method for showing oil details
	public void showGheeOil()
	{
		boolean counter=true;
		do
		{
		System.out.println("Showing Products We have..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("            ");
		System.out.println("Product Name        Rs. ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Saffola Gold Oil   : "+mo1.cprice
				+"\n2.Oleev Health Oil   : "+mo2.cprice
				+"\n3.Fortune Xpert Oil  : "+mo3.cprice
				+"\n4.Patanjali Pure Oil : "+mo4.cprice
				+"\n5.Sundrop Heart Oil  : "+mo5.cprice
				+"\n6.Kirti Gold         : "+mo6.cprice
				+"\n7.Oleev Smart Oil    : "+mo7.cprice
				+"\n8.NutriLite Oil      : "+mo8.cprice
				+"\n9.Sun-Feast Oil      : "+mo9.cprice
				+"\n10.Xpert Pro Oil     : "+mo10.cprice+"\n11.Cart"+"\n12.Return Back ");
		System.out.println("Choose the Product for viewing the Details :");
		int count = sc.nextInt();
		
		switch(count)
		{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo1);
			}
				break;
			case 2:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo2);
			}
				break;
			case 3:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo3);
			}
				break;
			case 4:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo4);
			}
				break;
			case 5:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo5);
			}
				break;
			case 6:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo6);
			}
				break;
			case 7:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo7);
			}
				break;
			case 8:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo8);
			}
				break;
			case 9:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo9);
			}
				break;
			case 10:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Showing Details of Product..");
				System.out.println(mo10);
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
	//Method for purchasing oil
	public void purchaseGheeOil()
	{
		boolean count = true;
		while(count)
		{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                    ");
			System.out.println("Product Name            Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Saffola Gold Oil   : "+mo1.cprice
					+"\n2.Oleev Health Oil   : "+mo2.cprice
					+"\n3.Fortune Xpert Oil  : "+mo3.cprice
					+"\n4.Patanjali Pure Oil : "+mo4.cprice
					+"\n5.Sundrop Heart Oil  : "+mo5.cprice
					+"\n6.Kirti Gold         : "+mo6.cprice
					+"\n7.Oleev Smart Oil    : "+mo7.cprice
					+"\n8.NutriLite Oil      : "+mo8.cprice
					+"\n9.Sun-Feast Oil      : "+mo9.cprice
					+"\n10.Xpert Pro Oil     : "+mo10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Which product, Do you want?");
			byte id = sc.nextByte();
			switch(id)
			{
				case 1:
				{
					System.out.println();
					lh12.put(mo1.pid+"  -->  "+mo1.pname+"  ",mo1.cprice);
					System.out.println("Product ID :"+mo1.pid+" , "+"Product Name :"+mo1.pname+" , "+"Product Price :"+mo1.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 2:
				{
					System.out.println();
					lh12.put(mo2.pid+"  -->  "+mo2.pname+"  ",mo2.cprice);
					System.out.println("Product ID :"+mo2.pid+" , "+"Product Name :"+mo2.pname+" , "+"Product Price :"+mo2.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 3:
				{
					System.out.println();
					lh12.put(mo3.pid+"  -->  "+mo3.pname+"  ",mo3.cprice);
					System.out.println("Product ID :"+mo3.pid+" , "+"Product Name :"+mo3.pname+" , "+"Product Price :"+mo3.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 4:
				{
					System.out.println();
					lh12.put(mo4.pid+"  -->  "+mo4.pname+"  ",mo4.cprice);
					System.out.println("Product ID :"+mo4.pid+" , "+"Product Name :"+mo4.pname+" , "+"Product Price :"+mo4.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 5:
				{
					//chasing addreee of en object
					System.out.println();
					lh12.put(mo5.pid+"  -->  "+mo5.pname+"  ",mo5.cprice);
					System.out.println("Product ID :"+mo5.pid+" , "+"Product Name :"+mo5.pname+" , "+"Product Price :"+mo5.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 6:
				{
					System.out.println();
					lh12.put(mo6.pid+"  -->  "+mo6.pname+"  ",mo6.cprice);
					System.out.println("Product ID :"+mo6.pid+" , "+"Product Name :"+mo6.pname+" , "+"Product Price :"+mo6.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 7:
				{
					System.out.println();
					lh12.put(mo7.pid+"  -->  "+mo7.pname+"  ",mo7.cprice);
					System.out.println("Product ID :"+mo7.pid+" , "+"Product Name :"+mo7.pname+" , "+"Product Price :"+mo7.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 8:
				{
					System.out.println();
					lh12.put(mo8.pid+"  -->  "+mo8.pname+"  ",mo8.cprice);
					System.out.println("Product ID :"+mo8.pid+" , "+"Product Name :"+mo8.pname+" , "+"Product Price :"+mo8.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 9:
				{ 
					System.out.println();
					lh12.put(mo9.pid+"  -->  "+mo9.pname+"  ",mo9.cprice);
					System.out.println("Product ID :"+mo9.pid+" , "+"Product Name :"+mo9.pname+" , "+"Product Price :"+mo9.cprice);
					System.out.println("Product is Successfully Added to Cart..");
					System.out.println("-----------------------------------------------------------------");
				}
				break;
				case 10:
				{
					System.out.println();
					lh12.put(mo10.pid+"  -->  "+mo10.pname+"  ",mo10.cprice);
					System.out.println("Product ID :"+mo10.pid+" , "+"Product Name :"+mo10.pname+" , "+"Product Price :"+mo10.cprice);
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
		double sum=0.0;
		for(Object obj:lh12.values())
		{
			Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
			sum = sum+d;
		}
		return sum;
	}
}