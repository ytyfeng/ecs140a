public interface VendingMachine {
	void vendItem();

	int getItemsRemaining();

	int getItemsSold();

	double getCashReceived();

	void loadItems(int n);
}
