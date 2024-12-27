package MiniMarketPackage;
import java.util.Scanner;
public class MarketDriver {

	static		//static block for showing name of market
	{
		System.out.println("-----------------------------------------------------------------");
		System.out.println("                  ***** Malhar's Market *****");
		System.out.println("-----------------------------------------------------------------");
			
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Branch Name :");
		String branch = sc.next();
		System.out.println("Welcome to "+branch+" Branch!!!");
		System.out.println("-----------------------------------------------------------------");
		UserAuthorization uaz = new UserAuthorization();
		
		boolean b1= true;
		do
		{
		System.out.println("LogIn As :");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Admin \n2.Manager \n3.Cashier \n4.Create New Account \n5.Exit-->");
		int role = sc.nextInt();
			switch(role)
			{	//switch for choosing role
				case 1: 
					//swdm.thirdLoop();
					uaz.admin();
					break;
				case 2:
					uaz.manger();
					break;
				case 3:
					uaz.cashier();
					break;
				case 4:
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Only Admin can create an account..");
					uaz.admin();
				}
				break;
				case 5:
				{
					b1=false;
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Thank You !! Application is closed Successfully..");
					break;
				}
				default:
				{
					System.out.println("Sorry !! Enter Correct Choice....");
					System.out.println("-----------------------------------------------------------------");
				}
			}//Ending of switch
		}
		while(b1);
	}
}
