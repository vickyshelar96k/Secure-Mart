package MiniMarketPackage;

interface SupplierInfo
{
	void addSupplier();
	void updateSupplier();
	void deleteSupplier();
	void viewSupplierDetails();
}

interface OrderDeliveries
{
	void placeOrder();
	void trackDelivers();
	void orderHistory();
}

interface Payments
{
	void managePayments();
	void paymentHistory();
}