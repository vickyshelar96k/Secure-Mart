package MiniMarketPackage;

interface PointOfSale 
{
	void processOfSale();
	void applyDiscount();
	void applyTaxes();
	void printReceipt();
}

interface SalesTracking
{
	void viewSalesHistory();
	void dailySalesHistory();
	void monthlySalesReport();
	void salesByProduct();
}

interface ReturnsAndRefunds
{
	void processReturn();
	void issueRefund();
}