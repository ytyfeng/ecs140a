public class SimCoke {
	
	public static void main(String[] args) {
		System.out.println("Coke machine simulator");
		CokeMachine csmachine = new CokeMachine(); 	// create two unique CokeMachine objects
		CokeMachine engrmachine = new CokeMachine();
		csmachine.buyCoke(); 		// buy Cokes from the CS machine until it
		csmachine.buyCoke(); 		// is sold out
		csmachine.buyCoke();
		engrmachine.buyCoke(); // buy Cokes from the Engineering machine
		engrmachine.buyCoke(); // and note that there are Cokes in this
	} 			       // machine even though the CS machine is
} 				       // empty - these two objects are unique
