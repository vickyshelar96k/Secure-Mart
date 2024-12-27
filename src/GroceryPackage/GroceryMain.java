package GroceryPackage;
import MiniMarketPackage.*;
import java.util.Scanner;

public class GroceryMain implements ProductMgmtInterface
{

	Market mk;	//Ref Variable for Market Class
	Staples st;	//Ref Variable for Staples Class
	
	SDalPulses sd;	//Ref Variable for super and sub classes
		SDPChanaDal dpchana;
		SDPMasoorDal dpmasoor;
		SDPMoongDal dpmoong;
		SDPOthers dpother;
		SDPSoyaChunks dpsoya;
		SDPToorDal dptoor; 
		SDPToorDalProducts dalpd =new SDPToorDalProducts();
		
		SDPUradDal dpurad;
		
	SGheeOil go;
	SMasala ms;
	SRiceProducts rp;
	SSuger sg;
	SDryFruits df;
	SAatta at;
	
	
	
	Scanner sc = new Scanner(System.in);
	
	static String cat = "Grocery";
	String type;
	String dalname;
	String brand;
	String pname;
	int pid;
	double quantity;
	double oprice;
	double pprice;
	double discount;
	double cprice;
	String expdate;
	
	@Override
	//Method for Adding the product into cart
	
	public void addProduct() 
	{
		boolean wider = true;
		while(wider)
		{
		System.out.println("Press 1.For Adding Product... \nPress 2.For Return Back..");
		System.out.println("Enter your choice :");
		byte choic = sc.nextByte();
		switch(choic)
		{
		case 1:
		{
		if(this.st==null)
		{
			System.out.println("You are Adding Product..");
			System.out.println("Enter Password :");
			int pass = sc.nextInt();
			System.out.println("-----------------------------------------------------------------");
			boolean flag = true;
			while(flag)
			{
				if(pass == 150803)
				{
					System.out.println("Choose the Type of Product from following :");
					System.out.println("1.Dal & Pulses \n2.Ghee & Oil \n3.Masala \n4.Aatta \n5.Rice & Rice Product \n6.Dry Fruits \n7.Sugar \n8.Return Back");
					System.out.println("-----------------------------------------------------------------");
					int choice = sc.nextInt();
					
					switch(choice)	//switch for the type of product
					{
						case 1:
						{
							boolean counter = true;
							while(counter)
							{
							type = "Dal & Pulses";
							System.out.println("You have Selected :"+type+" !!");
							System.out.println("Choose the Type of Dal from following :");
							System.out.println("1.Toor Dal \n2.Moong Dal \n3.Masoor Dal \n4.Urad Dal \n5.Chana Dal \n6.Soya Chunks \n7.Others \n8.Types of Product \n9.Home \n10.Exit");
							System.out.println("-----------------------------------------------------------------");
							choice = sc.nextInt();
							
							if(choice==1)
							{
								dalname = "Toor Dal";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPToorDal(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							
							else if(choice ==2)
							{
								dalname = "Moong Dal";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPMoongDal(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							
							else if(choice == 3)
							{
								dalname = "Masoor Dal";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPMasoorDal(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							
							else if(choice == 4)
							{
								dalname = "Urad Dal";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPUradDal(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							
							else if(choice == 5)
							{
								dalname = "Chana Dal";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPChanaDal(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							
							else if(choice == 6)
							{
								dalname = "Soya Chunks";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPSoyaChunks(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							else if(choice == 7)
							{
								dalname = "Others";
								System.out.println("You are Adding Product :"+dalname);
								System.out.println("Enter Product Brand :");
								brand = sc.next();
								System.out.println("Enter Product Name :");
								pname = sc.next();
								System.out.println("Enter Product ID :");
								pid = sc.nextInt();
								System.out.println("Enter Product Quantity :");
								quantity = sc.nextDouble();
								System.out.println("Enter Product Original Price :");
								oprice = sc.nextDouble();
								System.out.println("Enter Product Price :");
								pprice = sc.nextDouble();
								System.out.println("Enter Discount on Product :");
								discount = sc.nextDouble();
								
								System.out.println("Enter Product Expiry Date :");
								expdate = sc.next();
								st = new SDPOthers(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate, dalname);	//UpCasting
								System.out.println("Product is added SuccessFully..");
								System.out.println("-----------------------------------------------------------------");
								counter=false;
								break;
							}
							else  if(choice==8)
							{
								counter=false;
								flag = false;
								System.out.println("Returning to Types of Product..");
								System.out.println("-----------------------------------------------------------------");
								break;
							}
							else
							{
								System.out.println("Please, Enter Correct Option!!");
								System.out.println("-----------------------------------------------------------------");
								
							}
							
						}
						}
						break;
						
						case 2:
						{
							type = "Ghee & Oil";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							brand = sc.next();
							System.out.println("Enter Product Name :");
							pname = sc.next();
							System.out.println("Enter Product ID :");
							pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							discount = sc.nextDouble();
							
							System.out.println("Enter Product Expiry Date :");
							expdate = sc.next();
							System.out.println("Enter Oil Name :");
							String oilname= sc.next();
							st = new SGheeOil(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate,oilname);	//UpCasting
							System.out.println("Product is added SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag = false;
						}
						break;
						
						case 3:
						{
							type = "Masala";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							brand = sc.next();
							System.out.println("Enter Product Name :");
							pname = sc.next();
							System.out.println("Enter Product ID :");
							pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							discount = sc.nextDouble();
							System.out.println("Enter Product Expiry Date :");
							expdate = sc.next();
							st = new SMasala(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);	//UpCasting
							System.out.println("Product is added SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag = false;	
						}
						break;
						
						case 4:
						{
							type = "Aatta";
							System.out.println("Type of Product :"+type);
							type = sc.next();
							System.out.println("Enter Product Brand :");
							brand = sc.next();
							System.out.println("Enter Product Name :");
							pname = sc.next();
							System.out.println("Enter Product ID :");
							pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							discount = sc.nextDouble();
							System.out.println("Enter Product Expiry Date :");
							expdate = sc.next();
							st = new SAatta(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);	//UpCasting
							System.out.println("Product is added SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag = false;
						}
						break;
						
						case 5:
						{
							type = "Rice & Rice Products";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							brand = sc.next();
							System.out.println("Enter Product Name :");
							pname = sc.next();
							System.out.println("Enter Product ID :");
							pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							discount = sc.nextDouble();
							System.out.println("Enter Product Expiry Date :");
							expdate = sc.next();
							st = new SRiceProducts(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);	//UpCasting
							System.out.println("Product is added SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag = false;
						}
						break;
						
						case 6:
						{
							type = "Dry Fruits";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							brand = sc.next();
							System.out.println("Enter Product Name :");
							pname = sc.next();
							System.out.println("Enter Product ID :");
							pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							discount = sc.nextDouble();
							System.out.println("Enter Product Expiry Date :");
							expdate = sc.next();
							st = new SDryFruits(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);	//UpCasting
							System.out.println("Product is added SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag = false;
						}
						break;
						
						case 7:
						{
							type = "Sugar";
							System.out.println("Type of Product :"+type);
							type = sc.next();
							System.out.println("Enter Product Brand :");
							brand = sc.next();
							System.out.println("Enter Product Name :");
							pname = sc.next();
							System.out.println("Enter Product ID :");
							pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							discount = sc.nextDouble();
							System.out.println("Enter Product Expiry Date :");
							expdate = sc.next();
							st = new SSuger(cat, type, brand, pname, pid, quantity, oprice, pprice, discount, expdate);	//UpCasting
							System.out.println("Product is added SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag = false;
						}
						break;	
						
						default:
							System.out.println("Please, Choose Correct Type..");
					}
				}
			
				else
				{
					System.out.println("Password is Incorrect..");
					System.out.println("Please Enter Correct Password :");
					pass = sc.nextInt();
				}
			}
		}
			
		else
		{
			System.out.println("Product is Already Added..");
			System.out.println("-----------------------------------------------------------------");
		}
		}
		break;
		case 2:
			wider=false;
			break;
		default:
			System.out.println("Enter Correct Choice :");
			choic = sc.nextByte();
		}
	}
	}
	
	@Override
	//Method for Updating Product
	public void updateProduct() 
	{
		if(this.st != null)
		{
			System.out.println("You are Updating Product..");
			System.out.println("Enter Password :");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{	if(pass == mk.getPassword())
				{
					System.out.println("1.Dal & Pulses \n2.Ghee & Oil \n3.Masala \n4.Aatta \n5.Rice & Rice Product \n6.Dry Fruits \n7.Sugar");
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Choose the Type of Product :");
					int choice = sc.nextInt();
	
					switch(choice)
					{
						case 1:
						{	
							sd = (SDalPulses)st; 	//DownCasting
							System.out.println("You are Updating Product..");
							type = "Dal & Pulses";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							sd.brand = sc.next();
							System.out.println("Enter Product Name :");
							sd.pname = sc.next();
							System.out.println("Enter Product ID :");
							sd.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							sd.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							sd.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							sd.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							sd.discount = sc.nextDouble();
							
							sd.cprice=sd.pprice-sd.pprice*(sd.discount/100);
							System.out.println("Enter Product Expiry Date :");
							sd.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;
						}
						break;
						
						case 2:
						{
							go = (SGheeOil)st;	//DownCasting
							System.out.println("You are Updating Product..");
							type = "Ghee & Oil";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							go.brand = sc.next();
							System.out.println("Enter Product Name :");
							go.pname = sc.next();
							System.out.println("Enter Product ID :");
							go.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							go.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							go.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							go.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							go.discount = sc.nextDouble();
							
							go.cprice=go.pprice-go.pprice*(go.discount/100);
							System.out.println("Enter Product Expiry Date :");
							go.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;							
						}
						break;
						
						case 3:
						{
							ms = (SMasala)st;	//DownCasting
							System.out.println("You are Updating Product..");
							type = "Masala";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							ms.brand = sc.next();
							System.out.println("Enter Product Name :");
							ms.pname = sc.next();
							System.out.println("Enter Product ID :");
							ms.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							ms.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							ms.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							ms.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							ms.discount = sc.nextDouble();
							
							ms.cprice=ms.pprice-ms.pprice*(ms.discount/100);
							System.out.println("Enter Product Expiry Date :");
							ms.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;	
						}
						break;
						
						case 4:
						{
							at = (SAatta)st;	//DownCasting
							System.out.println("You are Updating Product..");
							type = "Aatta";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							at.brand = sc.next();
							System.out.println("Enter Product Name :");
							at.pname = sc.next();
							System.out.println("Enter Product ID :");
							at.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							at.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							at.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							at.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							at.discount = sc.nextDouble();
							
							at.cprice=at.pprice-at.pprice*(at.discount/100);
							System.out.println("Enter Product Expiry Date :");
							at.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;	
						}
						break;
						
						case 5:
						{
							rp = (SRiceProducts)st;	//DownCasting
							System.out.println("You are Updating Product..");
							type = "Rice & Rice Products";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							rp.brand = sc.next();
							System.out.println("Enter Product Name :");
							rp.pname = sc.next();
							System.out.println("Enter Product ID :");
							rp.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							rp.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							rp.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							rp.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							rp.discount = sc.nextDouble();
							
							rp.cprice=rp.pprice-rp.pprice*(rp.discount/100);
							System.out.println("Enter Product Expiry Date :");
							rp.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;	
						}
						break;
						
						case 6:
						{
							df = (SDryFruits)st;
							System.out.println("You are Updating Product..");
							type = "Dry Fruits";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							df.brand = sc.next();
							System.out.println("Enter Product Name :");
							df.pname = sc.next();
							System.out.println("Enter Product ID :");
							df.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							df.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							df.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							df.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							df.discount = sc.nextDouble();
						
							df.cprice=df.pprice-df.pprice*(df.discount/100);
							System.out.println("Enter Product Expiry Date :");
							df.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;	
						}
						break;
						
						case 7:
						{
							sg = (SSuger)st;	//DownCasting
							System.out.println("You are Updating Product..");
							type = "Sugar";
							System.out.println("Type of Product :"+type);
							System.out.println("Enter Product Brand :");
							sg.brand = sc.next();
							System.out.println("Enter Product Name :");
							sg.pname = sc.next();
							System.out.println("Enter Product ID :");
							sg.pid = sc.nextInt();
							System.out.println("Enter Product Quantity :");
							sg.quantity = sc.nextDouble();
							System.out.println("Enter Product Original Price :");
							sg.oprice = sc.nextDouble();
							System.out.println("Enter Product Price :");
							sg.pprice = sc.nextDouble();
							System.out.println("Enter Discount on Product :");
							sg.discount = sc.nextDouble();
							
							sg.cprice=sg.pprice-sg.pprice*(sg.discount/100);
							System.out.println("Enter Product Expiry Date :");
							sg.expdate = sc.next();
							System.out.println("Product is Updated SuccessFully..");
							System.out.println("-----------------------------------------------------------------");
							flag=false;	
						}
						break;
				
						default:
						{
							System.out.println("Choose Correct Choice..");
							System.out.println("-----------------------------------------------------------------");
						}
					}
				}
				else
				{
					System.out.println("Password is Incorrect..");
					System.out.println("Please Enter Correct Password :");
					pass = sc.nextInt();
				}
				
			}
		}
		else
		{
			System.out.println("Product is not Added yet..");
			System.out.println("Soory,Product is not existing for Updation..");
			System.out.println("-----------------------------------------------------------------");
		}
		
	}
	
	@Override
	//Method for deletion of the product:
	public void deleteProduct() 
	{
			if(this.st != null)
			{
				System.out.println("You are Deleting Product..");
				System.out.println("Enter Password :");
				int pass = sc.nextInt();
				boolean flag = true;
				while(flag)
				{
					if(pass == mk.getPassword())
					{
						System.out.println("Password Matched.");
						System.out.println("Deleting Product");
						this.st = null;
						System.out.println("Product Deleted Successfully..");
						System.out.println("-----------------------------------------------------------------");
						flag = false;
					}
					else
					{
						System.out.println("Password is Incorrect..");
						System.out.println("Please Enter Correct Password :");
						pass = sc.nextInt();
					}
				}
			}
			else 
			{
				System.out.println("Product is not Added yet..");
				System.out.println("Soory,Product is not existing for deletion..");
				System.out.println("-----------------------------------------------------------------");
			}
		
	}
	
	@Override
	//Method for viewing Details of the Product
	public void viewProductDetails() 
	{
		boolean flag = true;
		System.out.println("Select the Products from the following");
		System.out.println("1.Existing Products \n2.Newly Added Product");
		int chose = sc.nextInt();
		switch(chose)
		{
			case 1:
			{
				dalpd.showDalPulses();
				break;
			}
			case 2 :
			{
				if(this.st !=null)
				{
					System.out.println("You are Viewing Product Details..");
					System.out.println("Product Category Type :"+cat);
					System.out.println("Type of Product :"+type);
					System.out.println("Product Brand :"+brand);
					System.out.println("Product Name :"+pname);
					System.out.println("Product ID :"+pid);
					System.out.println("Product Quantity :"+quantity);
					System.out.println("Product Original Price :"+oprice);
					System.out.println("Product Price :"+pprice);
					System.out.println("Discount on Product :"+discount);
					System.out.println("Product Customer Price :"+cprice);								
					System.out.println("Product Expiry Date :"+expdate);
					System.out.println("-----------------------------------------------------------------");
				}
				else 
				{
					System.out.println("Sorry,Product is not Added newly yet..");
					System.out.println("-----------------------------------------------------------------");
				}
						
			}
			break;
			default:
			{
				System.out.println("Choose Correct Option..");
				System.out.println("-----------------------------------------------------------------");
			}
						
		}//Switch ends
	}
}

