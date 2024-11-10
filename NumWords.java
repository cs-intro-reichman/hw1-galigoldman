// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num=0, hundreds=0, tens=0, ones=0;
        num = Integer.parseInt(args[0]);
        hundreds = num/100;
        num = num%100;
        tens = num/10;
        ones = num%10;
        System.out.println(hundreds+ " hundreds, "+ tens + " tens, and "+ ones+ " ones.");
	}
}
