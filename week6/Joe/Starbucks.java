package week6.Joe;

import java.util.Scanner;

public class Starbucks {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Dispenser cappuccino = new Dispenser("Cappuccino", 2.50, 10);
        Dispenser espresso = new Dispenser("Espresso", 1.75, 10);
        Dispenser latte = new Dispenser("Latte", 2.25, 10);
        Dispenser icedCoffee = new Dispenser("Iced Coffee", 2.00, 10);
        Dispenser icedTea = new Dispenser("Iced Tea", 1.50, 10);
        int choice;
        showSelection();
        choice = input.nextInt();
        while(choice != 9){
            switch(choice){
                case 1:
                    sellProduct(cappuccino, cashRegister);
                    break;
                case 2:
                    sellProduct(espresso, cashRegister);
                    break;
                case 3:
                    sellProduct(latte, cashRegister);
                    break;
                case 4:
                    sellProduct(icedCoffee, cashRegister);
                    break;
                case 5:
                    sellProduct(icedTea, cashRegister);
                    break;
                default:
                    System.out.println("Invalid selection");
            }
            showSelection();
            choice = input.nextInt();
        }
    }
    public static void showSelection(){
        System.out.println("\u001B[37mPlease select from the following menu:");
        System.out.println("To select a coffey, enter:");
        System.out.println("1 for Cappuccino");
        System.out.println("2 for Espresso");
        System.out.println("3 for Latte");
        System.out.println("4 for Iced Coffee");
        System.out.println("5 for Iced Tea");
        System.out.println("9 to exit");
    }
    public static void sellProduct(Dispenser product, CashRegister register){
        double price = product.getPrice();
        double chashInserted = 0;
        double cashRequired = price;
        if(product.getCount() > 0){
            while(cashRequired > 0){
                System.out.println("\u001B[33mPlease insert $" + price + " by entering one of the following:");
                System.out.println("1 for $1 bill");
                System.out.println("2 for $2 bill");
                System.out.println("3 for $5 bill");
                System.out.println("4 for $10 bill");
                System.out.println("5 for $20 bill");
                System.out.println("6 for quarter");
                chashInserted += input.nextInt();
                cashRequired = price - chashInserted;
                if(cashRequired > 0){
                    System.out.println("\u001B[31mYou still owe $" + cashRequired);
                }
                else if(cashRequired < 0){
                    System.out.println("\u001B[32mYour change is $" + Math.abs(cashRequired));
                }
                else{
                    System.out.println("\u001B[32mThank you for your business");
                }
            }
            register.acceptAmount(price);
            product.makeSale();
            System.out.println("\u001B[32mPlease take your " + product.getName() + " from the dispenser.\n");
        }
        else{
            System.out.println("\u001B[31mSorry, " + product.getName()  + " is sold out.");
        }
    }
}
