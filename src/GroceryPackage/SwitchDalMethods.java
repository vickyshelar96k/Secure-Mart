package GroceryPackage;
import java.util.Scanner;

import MiniMarketPackage.UserAuthorization;

public class SwitchDalMethods {
	
	Scanner sc = new Scanner(System.in);
	CollectionClass clc = new CollectionClass();	//for adding cart
	GroceryMain grm1 = new GroceryMain();
	

	public void secondLoop()	//loop for the exsting categories and operaions on them
	{
		boolean secloop=true;
		while(secloop)
		{
			System.out.println("1.Existing Categories \n2.Add New Category \n3.Update Category \n4.Delete Category "
					+ "\n5.Users \n6.Return to Users");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Select the Option and Please, Enter the Choice :");
			int opt = sc.nextInt();
			switch(opt)
			{
				//case 1: from Existing category option started
				case 1:
					thirdLoop();
					break;
				//Adding Category along with product
				case 2:
					adderProd();
					break;
				case 5:
					UserAuthorization.usersShow();
					break;
				case 6:
					secloop=false;
					break;
				default:
				{
					System.out.println("Choose Option as Given Above ..");
					System.out.println("-----------------------------------------------------------------");
				}	
			}
		}
	}
	//Method for the Add Category Option
	public void adderProd()
	{
		boolean cross = true;
		System.out.println("1.Add Product \n2.Update Product \n3.Delete Product"
				+ "\n4.View Details of Product \n5.Back-->");
		System.out.println("Enter Your Choice :");
		int counter = sc.nextInt();
		while(cross)
		{
			switch(counter)
			{
			case 1:
				grm1.addProduct();
				break;
			case 2:
				grm1.updateProduct();
				break;
			case 3:
				grm1.deleteProduct();
				break;
			case 4:
				grm1.viewProductDetails();
			case 5:
				cross = false;
				break;
			default:
			{
				System.out.println("Sorry !! Choose the option from the above mentioned....");
				System.out.println("-----------------------------------------------------------------");
			}
			}
		}
		
	}
	
	public void thirdLoop() 	//loop for the exsting categories 
	{
		boolean thirdloop = true; 	//loop var
		while(thirdloop)	//third loop for showing Categories Multiple times
		{
			System.out.println("     !! Welcome to Categories !!");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Grocery \n2.Fashion \n3.Personal Care \n4.Books,Toys,Baby \n5.Sports \n6.Cart \n7.Return to DashBoard-->");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Select the Category and Please, Enter your Choice :");
			int catg = sc.nextInt();
			switch(catg)
			{
				case 1:
					fourthLoop();
					break;
				case 6:
					clc.cart();
					break;
				case 7:
					thirdloop=false;
					break;
				default:
				{
					System.out.println("Sorry !! Choose the Category from the above mentioned....");
					System.out.println("-----------------------------------------------------------------");
				}
			}
		}
	}
	
	
	public void fourthLoop()
	{
		boolean fortloop = true;	//fourth loop var
		while(fortloop)	////fourth loop for showing type of Categories Multiple times
		{
			System.out.println("     !! Welcome to Grocery Category !!");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Staples \n2.Snaks & Beverages \n3.Packaged Food \n3.Personal Baby Care "
					+ "\n4.Household Care \n5.Dairy Eggs \n6.Home Kitchen \n7.Return to Categories-->");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Select the Sub-Grocery and Please, Enter your Choice :");
			int gtype = sc.nextInt();
			switch(gtype)
			{
				case 1:
					fifthLoop();
					break;
				case 7:
					fortloop=false;
					break;
				default:
				{
					System.out.println("Sorry !! Choose the type of Category from the above mentioned....");
					System.out.println("-----------------------------------------------------------------");
				}
			}//Ending of switch
		}//ending of while loop
	}
	
	
	
	public void fifthLoop()
	{
		boolean fifloop = true;
		while(fifloop)	///fifth loop for showing type of staples Multiple times
		{	
			System.out.println("-----------------------------------------------------------------");
			System.out.println("     !! Welcome to Grocery - Staples !!");
			System.out.println("1.Dal & Pulses \n2.Ghee & Oil \n3.Masala \n4.Rice & Rice Products"
					+ " \n5.Sugar \n6.Dry Fruits \n7.Aatta \n8.Return to Sub-Categories-->");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Select the Type of Grocery and Please, Enter your Choice :");
			int gstype = sc.nextInt();
			switch(gstype)
			{
				case 1:
					dalRecords();
					break;
				case 2:
					gheeoilRecord();
					break;
				case 8:
					fifloop=false;
					break;
				default:
				{
					System.out.println("Choose Option as Given Above ..");
					System.out.println("-----------------------------------------------------------------");
				}					
			}//ending switch case
		}//ending of while loop
	}
	
	//Object creation for all Ghee&Oil products classes
	SDPToorDalProducts sdpt = new SDPToorDalProducts();	//for shwoing toor dal
	SDPUradDalProducts sdud = new SDPUradDalProducts();	///for shwoing Urid dal
	SDPMoongDalProducts sdmong = new SDPMoongDalProducts();	//for showing moong dal
	SDPMasoorDalProducts sdmasoor = new SDPMasoorDalProducts();	//for showing masoor Dal
	SDPChanaDalProducts sdchana = new SDPChanaDalProducts();
	SDPSoyaChunksProducts sdsoya = new SDPSoyaChunksProducts();	//for showing SOya chunks
	
	public void dalRecords()
	{
		boolean dalrepeater = true;
		while(dalrepeater)
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("     !! Welcome to Dal & Pulses !!");
			System.out.println("1.Toor Dal \n2.Urad Dal \n3.Moong Dal \n4.Masoor Dal"
					+ " \n5.Chana Dal \n6.Soya Chunks \n7.Cart \n8.Return to Type of Sub-Category");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Select the Dal and Please, Enter your Choice :");
			short gstype = sc.nextShort();
			switch(gstype)
			{
				case 1:
					sdpt.comBineToor();;
					break;
				case 2:
					sdud.comBineUradal();
					break;
				case 3:
					sdmong.comBineMoongal();
					break;
				case 4:
					sdmasoor.comBineMasoorDal();
					break;
				case 5:
					sdchana.comBineMasoorDal();
					break;
				case 6:
					sdsoya.comBineMasoorDal();
					break;
				case 7:
					clc.cart();
					break;
				case 8:
				{
					dalrepeater = false;
					break;
				}
				default:
				{
					System.out.println("Choose Option as Given Above ..");
					System.out.println("-----------------------------------------------------------------");
				}		
			
			}//Ending of switch
		}//Ending of while loop
	}
	
	//Object creation for all Ghee&Oil products classes
	GheeProducts gh = new GheeProducts();
	BlendOilProducts blo = new BlendOilProducts();
	SunFlowerOilProducts sf = new SunFlowerOilProducts();
	OliveOilProducts olp = new OliveOilProducts();
	GroundNutOilProducts gnp = new GroundNutOilProducts();
	MuterdOilProducts mop = new MuterdOilProducts();
	//Method for shwoing all the ghee oil 
	public void gheeoilRecord()
	{
		boolean gheerepeater = true;
		while(gheerepeater)
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("     !! Welcome to Ghee & Oil !!");
			System.out.println("1.Ghee \n2.Blended Oil \n3.Sun-Flower Oil \n4.Olive Oil"
					+ " \n5.Groundnut Oil \n6.Musterd Oil \n7.Cart \n8.Return to Type of Sub-Category");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Select the Dal and Please, Enter your Choice :");
			short gstype = sc.nextShort();
			switch(gstype)
			{
				case 1:
					gh.comBineGhee();
					break;
				case 2:
					blo.comBineGheeOil();
					break;
				case 3:
					sf.comBineGheeOil();
					break;
				case 4:
					olp.comBineGheeOil();
					break;
				case 5:
					gnp.comBineGheeOil();
					break;
				case 6:
					mop.comBineGheeOil();
					break;
				case 7:
					clc.cart();
					break;
				case 8:
				{
					gheerepeater = false;
					break;
				}
				default:
				{
					System.out.println("Choose Option as Given Above ..");
					System.out.println("-----------------------------------------------------------------");
				}		
			
			}//Ending of switch
		}//Ending of while loop
	}
}
