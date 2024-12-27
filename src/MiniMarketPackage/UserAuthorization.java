package MiniMarketPackage;
import java.util.Scanner;
import GroceryPackage.*;
import java.util.ArrayList;

//implementing interface
public class UserAuthorization implements UserAuthorizationInterface {

	static Scanner sc = new Scanner(System.in);
	GroceryMain grm = new GroceryMain();
	SwitchDalMethods sdm = new SwitchDalMethods();
	
	static Market m1 = new Market("Vikas B.S","vicky_shelar","vikasshelar369@gmail.com",
			8421247834l,"Pune","Admin",150803);
	static Market m2 = new Market("Malhar B.S","malhar_shelar","malharshelar110@gmail.com",
			8208324709l,"Latur","Manager",281106);
	static Market m3 = new Market("Shashi R.U", "shashikant_ugile","shashikantugile@gmail.com",
			8767661567l,"Udgir","Cashier",120603);
	//hasCode() method for validating users
	
	public void admin()
	{
		//creating admin(object during runtime
		boolean counter=true;	//var for do-while loop first loop
		System.out.println("Enter Admin UserName :");
		String adminuname = sc.next();
		System.out.println("Enter Password :");
		int pass = sc.nextInt();
		
		do	//outer first loop for entering password
		{
				//equals() method for comparing to Strings
			if(adminuname.equals(m1.getUsername()) && pass == m1.getPassword())
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("!! Welcome to Admin's DashBoard !!");
				System.out.println("***Hello "+m1.getName()+" , You are the Admin***");
				System.out.println("-----------------------------------------------------------------");
				
				sdm.secondLoop();
				break;
			}
			else
			{
			System.out.println("Invalid Username or Password..");
			System.out.println("Please Enter Correct Details :");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter Admin UserName :");
			adminuname = sc.next();
			System.out.println("Enter Password :");
			pass = sc.nextInt();
			}
		}
		while(counter);
	}
	
	//method for the manager
	public void manger()
	{
		//creating manager(object) during runtime
		boolean counter=true;	//var for do-while loop
		System.out.println("Enter Manager UserName :");
		String manageruname = sc.next();
		System.out.println("Enter Password :");
		int pass = sc.nextInt();
		do	//outer loop for entering password
		{
			if(manageruname.equals(m2.getUsername()) && pass == m2.getPassword())
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Welcome to Manager's DashBoard !!");
				System.out.println("***Hello "+m2.getName()+" , You are the Manager***");
				System.out.println("-----------------------------------------------------------------");
				sdm.secondLoop();
				break;
			}
			else
			{
			System.out.println("Invalid Username or Password..");
			System.out.println("Please Enter Correct Details :");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter Manager UserName :");
			manageruname = sc.next();
			System.out.println("Enter Password :");
			pass = sc.nextInt();
			}
		}
		while(counter);
	}
	//method for the cashier
	public void cashier()
	{
		//creating cashier(object) during runtime
		boolean counter=true;	//var for do-while loop
		System.out.println("Enter Cashier UserName :");
		String cashruname = sc.next();
		System.out.println("Enter Password :");
		int pass = sc.nextInt();
		do	//outer loop for entering password
		{
			if(cashruname.equals(m3.getUsername()) && pass == m3.getPassword())
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Welcome to Cashier's DashBoard !!");
				System.out.println("***Hello "+m3.getName()+" , You are the Cashier***");
				System.out.println("-----------------------------------------------------------------");
				sdm.thirdLoop();
				break;
			}
			else
			{
			System.out.println("Invalid Username or Password..");
			System.out.println("Please Enter Correct Details :");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter Manager UserName :");
			cashruname = sc.next();
			System.out.println("Enter Password :");
			pass = sc.nextInt();
			}
		}
		while(counter);
	}
	
	//static Method for showing the Users Option
	public static void usersShow()
	{
		boolean flag2=true;
		do
		{
			System.out.println();
			System.out.println("1.Active Users \n2.Add Users \n3.Remove Users \n4.Return Back -->");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter your Choice :");
			int choice2 = sc.nextInt();
			switch(choice2)
			{
				case 1:
					activeUsers();
					break;
				case 2:
				{
					System.out.println("Work in Progress..");
					System.out.println("Option is not Build Yet...!!");
				}
					break;
				case 3:
				{
					System.out.println("Work in Progress..");
					System.out.println("Option is not Build Yet...!!");
				}
					break;
				case 4:
					flag2=false;
					break;
				default:
					System.out.println("Choose option among from the above mentioned..");
					System.out.println("-----------------------------------------------------------------");
			}
		}
		while(flag2);
	}
	
	//static method for showing active users
	public static void activeUsers()
	{
		//ArrayList for showing to the Admin the existing Users
				ArrayList al = new ArrayList();
				al.add(m1);
				al.add(m2);
				al.add(m3);
				System.out.println();
				System.out.println("Showing the Active Users We have...");
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
				System.out.println("User 1: "+m1.getRole());
				System.out.println(al.get(0));
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
				System.out.println("User 2: "+m2.getRole());
				System.out.println(al.get(1));
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
				System.out.println("User 3: "+m3.getRole());
				System.out.println(al.get(2));
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
	}
	public void roleMgmt()
	{}
	public void permissionMgnt()
	{}
}
