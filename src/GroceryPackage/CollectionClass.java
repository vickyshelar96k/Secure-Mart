package GroceryPackage;
import java.util.LinkedList;
import java.util.Scanner;
public class CollectionClass {
	 
	Scanner sc = new Scanner(System.in);
	LinkedList lco = new LinkedList();
	
	double total=0.0;
	
	public void cart()
	{
		boolean exit = true;
	
		System.out.println();
		System.out.println("     !!     Welcome to Cart     !!");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Products addded to Cart :");
		System.out.println();
		lco.addAll(SDPToorDalProducts.lh1.entrySet());
		lco.addAll(SDPUradDalProducts.lh2.entrySet());
		lco.addAll(SDPMoongDalProducts.lh3.entrySet());
		lco.addAll(SDPMasoorDalProducts.lh4.entrySet());
		lco.addAll(SDPChanaDalProducts.lh5.entrySet());
		lco.addAll(SDPSoyaChunksProducts.lh6.entrySet());
		lco.addAll(GheeProducts.lh7.entrySet());
		lco.addAll(BlendOilProducts.lh8.entrySet());
		lco.addAll(SunFlowerOilProducts.lh9.entrySet());
		lco.addAll(OliveOilProducts.lh10.entrySet());
		lco.addAll(GroundNutOilProducts.lh11.entrySet());
		lco.addAll(MuterdOilProducts.lh12.entrySet());
		System.out.println("ID    -->  Name & Price");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		for(Object obj:lco)
			System.out.println(obj);
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		total = SDPToorDalProducts.getTotal()
						+SDPUradDalProducts.getTotal()
						+SDPMoongDalProducts.getTotal()
						+SDPMasoorDalProducts.getTotal()
						+SDPChanaDalProducts.getTotal()
						+SDPSoyaChunksProducts.getTotal()
						+GheeProducts.getTotal()
						+BlendOilProducts.getTotal()
						+SunFlowerOilProducts.getTotal()
						+OliveOilProducts.getTotal()
						+GroundNutOilProducts.getTotal()
						+MuterdOilProducts.getTotal();
		System.out.println("Total : "+total+" Rs.");
		System.out.println();
		do 
		{
		System.out.println("Press 1: For Printing Bill <-->");
		System.out.println("Press 2: For Removing the Products from the Cart");
		System.out.println("Press 3: Return Back");
		byte re = sc.nextByte();
		switch(re)
		{
		case 2:
		{
			clearCart();
			lco.clear();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("All products are Removed Successfully..");
			System.out.println("Cart is Empty Now..");
		}
		break;
		case 1:
			printBill();
			exit = false;
			break;
		case 3:
			exit = false;
			break;
		default:
			System.out.println("Choose one of the Option from the Above options :");
			System.out.println("-----------------------------------------------------------------");
		}
	}
	while(exit);
	}
	
	//Method for printing Bill
	public void printBill()
	{
		System.out.println("Printing Bill..");
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("                  ***** Malhar's Market *****");
		System.out.println("            Main Road, Nalegaon. Ta.Chakur Dist.Latur ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		for(Object obj:lco)
			System.out.println(obj);
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Total : "+total+" Rs. "+" CGST :"+total*7/100+" Rs.  SGST :"+total*7/100+" Rs.");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Total Bill :"+(total+(total*7/100)+(total*7/100))+" Rs.");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("               ***** Thank You, Visit Again!! *****");
		System.out.println();
	}
	
	//Method for Clearing the cart
	public void clearCart()
	{
		boolean red = true;
		while(red)
		{	
			System.out.println("1.For Removing Dal Products \n2.For Removing All the products");
			short looper = sc.nextShort();
			switch(looper)
			{
			case 1:
				SDPToorDalProducts.removeOne();
				break;
			case 2:
			{
				SDPUradDalProducts.lh2.clear();
				SDPMoongDalProducts.lh3.clear();
				SDPMasoorDalProducts.lh4.clear();
				SDPChanaDalProducts.lh5.clear();
				SDPSoyaChunksProducts.lh6.clear();
				GheeProducts.lh7.clear();
				BlendOilProducts.lh8.clear();
				SunFlowerOilProducts.lh9.clear();
				OliveOilProducts.lh10.clear();
				GroundNutOilProducts.lh11.clear();
				MuterdOilProducts.lh12.clear();
			}
			break;
			case 3:
				red=false;
				break;
			default:
				System.out.println("Choose Correct Option :");
				looper= sc.nextShort();
			}
		}
	}
}
