public class FrenchFryMachine2025 implements VendingMachine {
	private int itemsRemaining;
	private int itemsSold;
	private double cashReceived;

	public FrenchFryMachine2025() {
		itemsRemaining = 10;
		itemsSold = 0;
		cashReceived = 0;
		System.out.println("Adding another FrenchFryMachine to your empire");
	}

	public int getItemsRemaining() {
		return itemsRemaining;
	}

	public int getItemsSold() {
		return itemsSold;
	}

	public double getCashReceived() {
		return cashReceived;
	}

	public void loadItems(int n) {
		itemsRemaining = itemsRemaining + n;
	}

	public void vendItem() {
		if (itemsRemaining > 0) {
			itemsRemaining = itemsRemaining - 1;
			itemsSold++;
			cashReceived = cashReceived + 2.00;
			System.out.println("Have a nice hot cup of french fries");
			System.out.print(itemsRemaining);
			System.out.println(" cups of french fries remaining");
		} else {
			System.out.println("Sold out.");
		}
	}
}
