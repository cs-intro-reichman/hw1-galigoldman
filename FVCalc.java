// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=0, n=0;
		double rate=0, futureValue=0;
		currentValue=Integer.parseInt(args[0]);
		rate=Double.parseDouble(args[1])/100;
		n=Integer.parseInt(args[2]);
		futureValue = currentValue * Math.pow((1+rate),n);
		System.out.println("After "+ n + " years, " + "a $"+currentValue + " saved at "+
		100*rate+"%" + " will yield "+ "$"+(int)futureValue);
	}
}