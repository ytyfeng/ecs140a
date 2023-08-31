public class CokeMachine {
	public int numberOfCans; // what happens if you change this attribute to private? what about protected?

	public CokeMachine() {  // constructor
		numberOfCans = 2;
		System.out.println("Adding another machine to your empire");
	}

	public void buyCoke() {
		if (numberOfCans > 0) {
			numberOfCans = numberOfCans - 1;
			System.out.println("Have a Coke");
			System.out.print(numberOfCans);
			System.out.println(" cans remaining");
		} else {
			System.out.println("Sold Out");
		}
	}
	
	public static void main(String[] args) {
		CokeMachine machine = new CokeMachine();
		machine.buyCoke();
	}
}
