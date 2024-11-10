// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range=0,a=0,b=0,c=0;
        int max=0, mid=0, min=0;
        range=Integer.parseInt(args[0]);
        a = (int)(Math.random() * (range + 1));
        b = (int)(Math.random() * (range + 1));
        c = (int)(Math.random() * (range + 1));
        System.out.println(a+ " "+ b + " " + c); 
        max = Math.max(a, Math.max(b,c));
        min = Math.min(a, Math.min(b,c));
        mid = a + b + c - max - min;
        System.out.println(min + " "+ mid + " " + max);
	}
}
