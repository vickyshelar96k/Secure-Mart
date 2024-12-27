package MiniMarketPackage;

import java.util.Scanner;

public class Grocery extends Categories
{
	Scanner sc = new Scanner(System.in);
	
	public String type;
	
	public Grocery(String cat, String type)
	{
		super(cat);
		this.type =type;
	}

}


/*===============================================================================================
class Staples extends Grocery implements  ProductMgmtInterface
{
	
	Grocery gr;
	Market m;
	
	

	public void addProduct()
	{
		if(this.gr == null)
		{
			System.out.println("You are Adding Product..");
			System.out.println("Enter Password :");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{
				if(pass == m.getPassword())
				{
					System.out.println("Enter Category Type :");
					cat = sc.next();
					System.out.println("Enter Type of Product :");
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
					System.out.println("Enter Product Original Price :");
					cprice = sc.nextDouble();
					cprice=pprice-pprice*(discount/100);
					System.out.println("Enter Product Expiry Date :");
					expdate = sc.next();
					gr = new Grocery(cat,type,brand,pname,pid,quantity,oprice,pprice,discount,cprice,expdate);
					System.out.println("Product is added SuccessFully..");
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
			System.out.println("Product is Already Added..");
			System.out.println("-----------------------------------------------------------------");
		}
		
	}
	public void dalPulses()
	{
		System.out.println("Showing the results of Dal..");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Toor Dal \n2.Urad Dal \n3.Moong Dal \n4.Masoor Dal \n5.Chana Dal");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				
			}
			default:
				System.out.println("Enter Correct Choice..");
		}
	}
	
	public void updateProduct() 
	{
	
		if(this.gr != null)
		{
			System.out.println("You are Updating Product..");
			System.out.println("Enter Password :");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{	if(pass == m.getPassword())
				{
					System.out.println("You are Updating Product..");
					System.out.println("Enter Category Type :");
					cat = sc.next();
					System.out.println("Enter Type of Product :");
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
					System.out.println("Enter Product Original Price :");
					cprice = sc.nextDouble();
					cprice=pprice-pprice*(discount/100);
					System.out.println("Enter Product Expiry Date :");
					expdate = sc.next();
					gr = new Grocery(cat,type,brand,pname,pid,quantity,oprice,pprice,discount,cprice,expdate);
					System.out.println("Product is Updated SuccessFully..");
					System.out.println("-----------------------------------------------------------------");
					flag=false;
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
	
	public void deleteProduct() 
	{
		if(this.gr != null)
		{
			System.out.println("You are Deleting Product..");
			System.out.println("Enter Password :");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{
				if(pass == m.getPassword())
				{
					System.out.println("Password Matched.");
					System.out.println("Deleting Product");
					this.gr = null;
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
	
	public void viewProductDetails() 
	{
		if(this.gr !=null)
		{
			System.out.println("You are Deleting Product..");
			System.out.println("Enter Password :");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{
				if(pass==m.getPassword())
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
					System.out.println("Product Original Price :"+cprice);
					System.out.println("Product Expiry Date :"+expdate);
					System.out.println("-----------------------------------------------------------------");
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
}








//=========================================================================

/*
class SnackBeverage extends Grocery
{}

class PackagedFood extends Grocery
{}

class PersonalBabyCare extends Grocery
{}

class HouseHoldCare extends Grocery
{}

class DairyEggs extends Grocery
{}

class HomeKitchen extends Grocery
{}
*/
