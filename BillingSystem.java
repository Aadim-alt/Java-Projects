import java.util.Scanner;

public class BillingSystem
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[])
    {
        //Variables
        int choice;
        boolean isContinue = true;
        while(isContinue)
        {
            System.out.println("---------------------");
            System.out.println("Smart Billing System");
            System.out.println("---------------------");
            System.out.println("1. Start Billing");
            System.out.println("2. Help");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch(choice)
            {
             case 1 -> doBilling();
             case 2 -> takeHelp();
             case 3 -> isContinue = false;
             default -> System.out.println("Enter a Valid Choice");
            }
        }
        System.out.println("Thank You for Using our System.");
        
        //Display message
        
        
        //Conditions
    }
    static void doBilling()
    {
        System.out.print("Enter How many Items Do you want to bill (1-5): ");
        int numItems = scanner.nextInt();
        if(numItems >5 || numItems <0)
        {
            System.out.println("Enter Valid Number. Returning to Main Menu");
        }
        else
        {
            double price=0;
            double total= 0;
            for(int i =1; i<=numItems; i++)
            {
                scanner.nextLine();
                System.out.println("-----------------");
                System.out.print("Enter Item Name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter Item Price: ");
                double itemPrice = scanner.nextDouble();
                System.out.print("Enter Quantity of the Item: ");
                int quantity = scanner.nextInt();
                price = itemPrice * quantity;
                total = price +total;
                System.out.println("-------------------------------------------");
                System.out.println("Item\tQuantity\tPrice");
                System.out.println("-------------------------------------------");
                System.out.printf("%s\t%d\tRs.%.2f \n",itemName,quantity,price);
            }
            System.out.println("--------------------------");
            System.out.printf("Total is Rs.%.2f \n",total);
        }
    }
    static void takeHelp()
    {
        System.out.println("Press 1 For Billing and 3 for Exit.");
    }
}