import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}