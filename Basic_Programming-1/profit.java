
import java.util.Scanner;
class Profit { 
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  selling price: ");
        int sp = s.nextInt();
        System.out.println("Enter cost price: ");
        int cp = s.nextInt();
        double profit = sp - cp;
        System.out.println("The profit is: " + profit);
        double pp = (profit / (double)cp) * 100;  
        System.out.println("The profit percentage is: " + pp + "%");
}
}