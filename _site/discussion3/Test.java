package hw2;

/*
 * To ensure you get graded correctly by autograder, 
 * DO NOT change the file name, method names, and provided skeleton code.
 * Only fill in your code where there is a TODO comment.
 * Use the provided variables in the reportBuilder code. 
 * Check if your generateReport() output is equal to hw2_output.txt 
 * 
 * Questions or comments? Direct them to TA (Ty Feng)
 * 
 */
public class Test {

	public static String generateReport() {
		StringBuilder reportBuilder = new StringBuilder();
		// TODO:
		// Read hw2.txt line by line

		// For each record, create an instance in the corresponding class (FinAssist,
		// NoFinAssist, Degree, etc.)

		// Save all records to a Student[] array. Student is the interface for all the
		// classes you make.
		Student[] students; // save all the student record objects here

		// DO NOT ADD, CHANGE, OR DELETE ANY reportBuilder code. Use the provided variables.
		// INDIVIDUAL REPORTS, listing of all students and the fees they have each been
		// assessed

		int student_fee = 0; // TODO: Change this! Assign its value in the iteration below and use the
								// provided print statement
		String student_name = ""; // TODO: Change this! Assign its value in the iteration below and use the
									// provided print statement

		// Print out first and last name and fee amount
		reportBuilder.append("Summary of each student's fees assessed: \n\n");
		// TODO: iterate over all Student records and compute the individual student_fee. Assign student_name.
		// TODO: put the following line in your for/while loop so that every student's fee gets printed
		reportBuilder.append(student_name + " has $" + String.format("%,d", student_fee) + " fees assessed \n");
		
		
		
		// SUMMARY REPORT of fees assessed for each of the four types of student
		int degree_nofin_fees = 0;
		int degree_fin_fees = 0;
		int certificate_fees = 0;
		int senior_fees = 0;
		int total_fees = 0;

		// TODO: Calculate the fees values by iterating through all students

		
		// Print out the fee amounts
		reportBuilder.append("\n\n");
		reportBuilder.append("Summary of all student fees assessed: \n\n");
		reportBuilder.append(
				"Degree-seeking students without financial assistance: $" + String.format("%,d", degree_nofin_fees) + "\n");
		reportBuilder
				.append("Degree-seeking students with financial assistance: $" + String.format("%,d", degree_fin_fees) + "\n");
		reportBuilder.append("Certificate students: $" + String.format("%,d", certificate_fees) + "\n");
		reportBuilder.append("Senior citizens: $" + String.format("%,d", senior_fees) + "\n\n");
		reportBuilder.append("Total fees assessed: $" + String.format("%,d", total_fees));

		return reportBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(generateReport());
	}
}
