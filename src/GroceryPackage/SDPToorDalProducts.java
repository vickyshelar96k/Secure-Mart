package GroceryPackage;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class SDPToorDalProducts {
	//LinkedHashMap for adding product into cart
	static LinkedHashMap lh1 = new LinkedHashMap();
	//For adding Cart
	CollectionClass clc = new CollectionClass();
		
	Scanner sc = new Scanner(System.in);
		//Product 1 :
		SDPToorDal sdptd1 = new SDPToorDal("Grocery", "Dal & Pulses", "Classic", "Organic Classic", 1001, 10, 95.10, 125, 10, "24-Jan-2025", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd2 = new SDPToorDal("Grocery", "Dal & Pulses", "Naturalands", "Organic Toor Dal", 1002, 10, 107.20, 144, 10, "18-March-2026", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd3 = new SDPToorDal("Grocery", "Dal & Pulses", "My Kitchen", "Gold Winner", 1003, 20, 82.67, 110, 10, "07-Oct-2025", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd4 = new SDPToorDal("Grocery", "Dal & Pulses", "Tata", "TRT-Dal", 1004, 15, 97.70, 137, 10, "12-Aug-2025", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd5 = new SDPToorDal("Grocery", "Dal & Pulses", "Pravin", "Pr-Toor Dal", 1005, 12, 67.10, 100, 10, "12-Dec-2025", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd6 = new SDPToorDal("Grocery", "Dal & Pulses", "Haldiram", "Haldiram Dal", 1006, 15, 84.40, 120, 10, "20-Jan-2025", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd7 = new SDPToorDal("Grocery", "Dal & Pulses", "Kisaan", "Kissan Toor Dal", 1007, 10, 103.18, 150, 10, "08-May-2026", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd8 = new SDPToorDal("Grocery", "Dal & Pulses", "Amruta", "Toor Gold", 1008, 10, 78.87, 120, 10, "15-Aug-2003", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd9 = new SDPToorDal("Grocery", "Dal & Pulses", "Vikram", "VK-Toor Dal", 1009, 20, 90.81, 130, 10, "12-July-2025", "Toor Dal");
		//Product 2:
		SDPToorDal sdptd10 = new SDPToorDal("Grocery", "Dal & Pulses", "Suhana", "Hira Dal", 1010, 10, 60.10, 95, 10, "10-Sept-2025", "Toor Dal");
		//for showing and purchasing the product
		public void comBineToor()
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
		//method for showing all the dal details
		public void showDalPulses()
		{
			boolean counter=true;
			do
			{
			System.out.println("Showing Products We have..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("            ");
			System.out.println("Product Name        Rs. ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Organic Classic : "+sdptd1.cprice
							+"\n2.Organic Toor Dal: "+sdptd2.cprice
							+"\n3.Gold Winner     : "+sdptd3.cprice
							+"\n4.TRT-Dal         : "+sdptd4.cprice
							+"\n5.Pr-Toor Dal     : "+sdptd5.cprice
							+"\n6.Haldiram-Dal    : "+sdptd6.cprice
							+"\n7.Kissan Toor Dal : "+sdptd7.cprice
							+"\n8.Toor Gold       : "+sdptd8.cprice
							+"\n9.VK-Toor Dal     : "+sdptd9.cprice
							+"\n10.Hira Dal       : "+sdptd10.cprice+"\n11.Cart"+"\n12.Return Back ");
			System.out.println("Choose the Product for viewing the Details :");
			int count = sc.nextInt();
			
			switch(count)
			{
				case 1:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd1);
				}
					break;
				case 2:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd2);
				}
					break;
				case 3:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd3);
				}
					break;
				case 4:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd4);
				}
					break;
				case 5:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd5);
				}
					break;
				case 6:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd6);
				}
					break;
				case 7:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd7);
				}
					break;
				case 8:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd8);
				}
					break;
				case 9:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd9);
				}
					break;
				case 10:
				{
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Showing Details of Product..");
					System.out.println(sdptd10);
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
				System.out.println("1.Organic Classic : "+sdptd1.cprice
								+"\n2.Organic Toor Dal: "+sdptd2.cprice
								+"\n3.Gold Winner     : "+sdptd3.cprice
								+"\n4.TRT-Dal         : "+sdptd4.cprice
								+"\n5.Pr-Toor Dal     : "+sdptd5.cprice
								+"\n6.Haldiram-Dal    : "+sdptd6.cprice
								+"\n7.Kissan Toor Dal : "+sdptd7.cprice
								+"\n8.Toor Gold       : "+sdptd8.cprice
								+"\n9.VK-Toor Dal     : "+sdptd9.cprice
								+"\n10.Hira Dal       : "+sdptd10.cprice+"\n11.Cart"+"\n12.Return Back ");
				System.out.println("Which product, Do you want?");
				byte id = sc.nextByte();
				switch(id)
				{
					case 1:
					{
						System.out.println();
						lh1.put(sdptd1.pid+"  -->  "+sdptd1.pname+"  ",sdptd1.cprice);
						System.out.println("Product ID :"+sdptd1.pid+" , "+"Product Name :"+sdptd1.pname+" , "+"Product Price :"+sdptd1.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 2:
					{
						System.out.println();
						lh1.put(sdptd2.pid+"  -->  "+sdptd2.pname+"  ",sdptd2.cprice);
						System.out.println("Product ID :"+sdptd2.pid+" , "+"Product Name :"+sdptd2.pname+" , "+"Product Price :"+sdptd2.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 3:
					{
						System.out.println();
						lh1.put(sdptd3.pid+"  -->  "+sdptd3.pname+"  ",sdptd3.cprice);
						System.out.println("Product ID :"+sdptd3.pid+" , "+"Product Name :"+sdptd3.pname+" , "+"Product Price :"+sdptd3.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 4:
					{
						System.out.println();
						lh1.put(sdptd4.pid+"  -->  "+sdptd4.pname+"  ",sdptd4.cprice);
						System.out.println("Product ID :"+sdptd4.pid+" , "+"Product Name :"+sdptd4.pname+" , "+"Product Price :"+sdptd4.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 5:
					{
						//chasing addreee of en object
						System.out.println();
						lh1.put(sdptd5.pid+"  -->  "+sdptd5.pname+"  ",sdptd5.cprice);
						System.out.println("Product ID :"+sdptd5.pid+" , "+"Product Name :"+sdptd5.pname+" , "+"Product Price :"+sdptd5.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 6:
					{
						System.out.println();
						lh1.put(sdptd6.pid+"  -->  "+sdptd6.pname+"  ",sdptd6.cprice);
						System.out.println("Product ID :"+sdptd6.pid+" , "+"Product Name :"+sdptd6.pname+" , "+"Product Price :"+sdptd6.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 7:
					{
						System.out.println();
						lh1.put(sdptd7.pid+"  -->  "+sdptd7.pname+"  ",sdptd7.cprice);
						System.out.println("Product ID :"+sdptd7.pid+" , "+"Product Name :"+sdptd7.pname+" , "+"Product Price :"+sdptd7.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 8:
					{
						System.out.println();
						lh1.put(sdptd8.pid+"  -->  "+sdptd8.pname+"  ",sdptd8.cprice);
						System.out.println("Product ID :"+sdptd8.pid+" , "+"Product Name :"+sdptd8.pname+" , "+"Product Price :"+sdptd8.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 9:
					{ 
						System.out.println();
						lh1.put(sdptd9.pid+"  -->  "+sdptd9.pname+"  ",sdptd9.cprice);
						System.out.println("Product ID :"+sdptd9.pid+" , "+"Product Name :"+sdptd9.pname+" , "+"Product Price :"+sdptd9.cprice);
						System.out.println("Product is Successfully Added to Cart..");
						System.out.println("-----------------------------------------------------------------");
					}
					break;
					case 10:
					{
						System.out.println();
						lh1.put(sdptd10.pid+"  -->  "+sdptd10.pname+"  ",sdptd10.cprice);
						System.out.println("Product ID :"+sdptd10.pid+" , "+"Product Name :"+sdptd10.pname+" , "+"Product Price :"+sdptd10.cprice);
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
			for(Object obj:lh1.values())
			{
				Double d = (Double)obj;	//DownCasting by Using wrapper Class (DJ Sir)
				sum = sum+d;
			}
			return sum;
		}
		
		//remove products one by one
		static public void removeOne()
		{
			Scanner sc1 = new Scanner(System.in);
			int count=0,productno=1;
			for(Object obj:lh1.entrySet())
			{
				System.out.println("Product No :"+productno);
				System.out.println(obj);
				count++;
				productno++;
				System.out.println();
			}
			System.out.println(count+": Products are added to cart");
			boolean flagg = true;
			while(flagg)
			{
				Set s = (Set)lh1.entrySet();
				ArrayList al = new ArrayList(s);
				System.out.println("Enter Product Number for Removing out of Cart:");
				short no = sc1.nextShort();
				switch(no)
				{
				case 1:
				{
					al.remove(0);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 2:
				{
					al.remove(1);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 3:
				{
					al.remove(2);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 4:
				{
					al.remove(3);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 5:
				{
					al.remove(4);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 6:
				{
					al.remove(5);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 7:
				{
					al.remove(6);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 8:
				{
					al.remove(7);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 9:
				{
					al.remove(8);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				case 10:
				{
					al.remove(9);
					System.out.println("Product is Removed Successfully.");
					flagg=false;
				}
					break;
				default:
				{
					System.out.println("Enter Correct Choice :");
					no = sc1.nextShort();
				}
				}
			}
				
			}
		
}

