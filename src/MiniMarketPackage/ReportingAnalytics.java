package MiniMarketPackage;

interface SalesReport 
{
	void dailyReports();
	void weeklyReports();
	void monthlyReports();
}

interface InventoryReports
{
	void currentStockReport();
	void lowStockReport();
}

interface CustomerReports
{
	void purchaseReports();
	void loyaltyPointsReport();
}

interface SupplierReport
{
	void orderHistoryReport();
	void paymentHistoryReport();
}