// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	// To get you started, here is the first line in the program:
	String name1 = args[0],name2 = args[1],name3 = args[2];
    int totalBill=0;
    double finalEach=0;
    totalBill = Integer.parseInt(args[3]);
    finalEach = Math.ceil(totalBill/3.0); 
    System.out.println("Dear " + name3 + ", " + name2 + ", and " +
	name1 + ": pay " + finalEach + " Shekels each.");
	}
}
