package MiniMarketPackage;
import java.util.Scanner;
import GroceryPackage.*;

interface UserAuthantication 
{
	void logIn();
	void registration();
	void passwordRecovery();
	void changePassword();
}

//inheriting GroceryMain class and implementing UserAuthantication interface
class UserAthunticate extends GroceryMain implements UserAuthantication
{
	Market m;
	GroceryMain grm1 = new GroceryMain();
	UserAuthorization uaz = new UserAuthorization();
	SwitchDalMethods swdm = new SwitchDalMethods();
	Scanner sc = new Scanner(System.in);
	
	public void logIn()
	{
		//whenever login executes roles must be shown
		/*boolean b1= true;
		do
		{
		System.out.println("LogIn As :");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.Admin \n2.Manager \n3.Cashier \n4.Create New Account \n5.Back-->");
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
				case 5:
					b1=false;
					break;
				default:
				{
					System.out.println("Sorry !! Enter Correct Choice....");
					System.out.println("-----------------------------------------------------------------");
				}
			}//Ending of switch
		}
		while(b1);
		*/
	}
	
	public void registration()
	{
		if(this.m==null)
		{
			System.out.println("For Registration Enter: 1");
			int choice = sc.nextInt();
			String name=null;
			String username=null;
			String email=null;
			long num=0;
			String area=null;
			String role=null;
			int pass1=0;
			int pass2=0;
			switch(choice)
			{
			case 1:
			{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Enter Your Name :");
				 name = sc.next();
				System.out.println("Enter Username :");
				 username = sc.next();
				System.out.println("Enter Your Email ID :");
				 email = sc.next();
				System.out.println("Enter Your Mobile Number :");
				 num = sc.nextLong();
				System.out.println("Enter Your Area/Location :");
				 area = sc.next();
				 
				boolean exit=true;
				while(exit)
				{
				System.out.println("Choose Your Role :");
				System.out.println("1.Admin \n2.Manager \n3.Cashier");
				int count = sc.nextInt();
				
					switch(count)
					{
					case 1:
					{
						role="Admin";
						exit=false;
					}
						break;
					case 2:
					{
						role="Manager";
						exit=false;
					}
						break;
					case 3:
					{
						role="Cashier";
						exit=false;
					}
						break;
					default:
						System.out.println("Choose Correct Role..");
						break;
					}
				}
				System.out.println("Your Role is "+role+"..");
				System.out.println("Enter Password :(Only 6 digits Numbers are Allowed)");
				 pass1 = sc.nextInt();
				System.out.println("Confirm Password :");
				 pass2 = sc.nextInt();
				boolean flag=true;
					while(flag)
					{
						if(pass1 == pass2)
						{
							System.out.println("Password Matched");
							System.out.println("-----------------------------------------------------------------");
							flag=false;
						}
						else
						{
							System.out.println("Password is not Matched");
							System.out.println("Re-enterPassword");
							pass1 = sc.nextInt();
							System.out.println("Confirm Password :");
							pass2 = sc.nextInt();
						}
					}
					
				}
				break;
				default:
					System.out.println("Enter correct Option");
				}
			m = new Market(name,username,email,num,area,role,pass1);
			System.out.println("Account is created Successfully..");
			System.out.println("-----------------------------------------------------------------");
		}
		else
		{
			System.out.println("Account is Exists already..");
		}
	}

	public void passwordRecovery()
	{
		if(this.m==null)
		{
			System.out.println("Account is not Created yet..");
			System.out.println("Please create an Account First..");
			System.out.println("-----------------------------------------------------------------");
		}
		else
		{	
			System.out.println("You have choosen Password Recovery Option..");
			System.out.println("Enter Your Registered Mobile Number for Password Recovery");
			long mno = sc.nextLong();
			boolean flag=true;
			while(flag)
			{
				if(mno == m.getMno())
				{
					System.out.println("Your password is :"+m.getPassword());
					flag=false;
				}
				else
				{
					System.out.println("Enterd Mobile Number is Incorrect");
					System.out.println("Enter Your Registered Mobile Number for Password Recovery");
					mno = sc.nextLong();
				}
			}
			System.out.println("-----------------------------------------------------------------");
		}
	}
	
	public void changePassword()
	{
		if(this.m==null)
		{
			System.out.println("Account is not Created yet..");
			System.out.println("Please create an Account First..");
			System.out.println("-----------------------------------------------------------------");
		}
		else
		{
			System.out.println("Enter Your Old Password");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{
				if(pass == m.getPassword())
				{
					System.out.println("Enter Your New Password :(Only 6 digits Numbers are Allowed)");
					int pass1 = sc.nextInt();
					System.out.println("Confirm New Password :");
					int pass2 = sc.nextInt();
					boolean counter=true;
					while(counter)
					{
						if(pass1 == pass2)
						{
							System.out.println("Password is Updated Successfully..");
							System.out.println("-----------------------------------------------------------------");
							counter=false;
							flag=false;
						}
						else
						{
							System.out.println("Password is not matching..");
							System.out.println("Please Re-enter Password :(Only 6 digits Numbers are Allowed)");
							pass1=sc.nextInt();
							System.out.println("Confirm New Password :");
							pass2=sc.nextInt();
						}
					}
				}
				else 
				{
					System.out.println("Password is not matching..");
					System.out.println("Please Enter your old Password ");
					pass = sc.nextInt();
				}
			}
		}
	}
}

interface UserAuthorizationInterface
{
	void admin();
	void manger();
	void cashier();
	void roleMgmt();
	void permissionMgnt();
}

//=================================================================
//User Profile Management
interface UserProfileInterface
{
	void viewProfile();
	void editProfile();
}

//UserProfile is Sub-Class of UserAthunticate so that directly aaccessing possible
class UserProfile extends UserAthunticate implements UserProfileInterface
{
	public void viewProfile()
	{
		if(this.m==null)
		{
			System.out.println("Account is not Created yet..");
			System.out.println("Please create an Account First..");
			System.out.println("-----------------------------------------------------------------");
		}
		else
		{
			System.out.println("!! Welcome to "+m.getRole()+" Profile !!");
			System.out.println("Your Name :"+m.getName());
			System.out.println("Username :"+m.getUsername());
			System.out.println("User Email ID :"+m.getEmail());
			System.out.println("User Mobile Number :"+m.getMno());
			System.out.println("User Area/Location :"+m.getArea());
			System.out.println("User Role :"+m.getRole());
			System.out.println("-----------------------------------------------------------------");
		}
	}
	
	public void editProfile()
	{
		if(this.m==null)
		{
			System.out.println("Account is not Created yet..");
			System.out.println("Please create an Account First..");
			System.out.println("-----------------------------------------------------------------");
		}
		else
		{
			System.out.println("To Edit Profile Enter Password :");
			int pass = sc.nextInt();
			boolean flag = true;
			while(flag)
			{
				if(pass == m.getPassword())
				{
					System.out.println("Enter email to Update: ");
					String email=sc.next();
					m.setEmail(email);
					System.out.println("Enter Contact Number to Update: ");
					long mno = sc.nextLong();
					m.setMno(mno);
					System.out.println("Enter Area/Location to Update: ");
					String area = sc.next();
					m.setArea(area);
					System.out.println("Profile Updated Successfully..");
					System.out.println("-----------------------------------------------------------------");
					flag = false;
				}
				else
				{
					System.out.println("Password is Incorrect..");
					System.out.println("Please Enter correct Password :");
					pass = sc.nextInt();
				}
			}
		}
	}
	
}
