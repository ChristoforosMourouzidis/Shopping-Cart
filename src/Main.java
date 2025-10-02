import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //SHOPPING CART PROGRAM


        Scanner scan = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '€';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scan.nextLine();

        System.out.print("What is the price for each? ");
        price = scan.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scan.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s" );
        System.out.println("Your total is " + total + currency);

        scan.close();
    }
}
