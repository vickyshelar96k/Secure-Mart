package MiniMarketPackage;

//class for the products
class Products
{
	
}
//interface for Product Management
public interface ProductMgmtInterface 
{
	void addProduct();
	void updateProduct();
	void deleteProduct();
	void viewProductDetails();
}


//interface for Stock Management
interface StockMgmt
{
	void trackStockLevel();
	void setRecorderLevel();
	void stockAlerts();
	void inventoryAdjustment();
}

//interface for Category Management
interface CategoryMgmt
{
	void addCategory();
	void updateCategory();
	void deleteCategory();
}
