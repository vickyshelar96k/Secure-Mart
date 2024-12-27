package MiniMarketPackage;

interface Configuration
{
	void sysytemSetting();
	void userInterfaceSetting();
}

interface BackupRecovery
{
	void dataBackup();
	void dataRecovery();
}

interface NotoficationAlerts
{
	void lowStockAlert();
	void expiryAlert();
}