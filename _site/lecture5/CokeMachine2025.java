public class CokeMachine2025 implements VendingMachine {
	private int itemsRemaining;
	private int itemsSold;
	private double cashReceived;

	public CokeMachine2025() {
		itemsRemaining = 10;
		itemsSold = 0;
		cashReceived = 0;
		System.out.println("Adding another CokeMachine to your empire");
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
			cashReceived = cashReceived + 1.50;
			System.out.println("Have a Coke");
			System.out.print(itemsRemaining);
			System.out.println(" cans remaining");
		} else {
			System.out.println("Sold out.");
		}
	}
	
	public static void main(String[] args) {
		CokeMachine2025 machine = new CokeMachine2025();
		machine.vendItem();
	}
}
