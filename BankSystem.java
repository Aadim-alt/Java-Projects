import java.util.Scanner;
public class BankSystem
{
    static Scanner scanner = new Scanner(System.in);
    public static void main()
    {
        double balance = 0;
        boolean isRunning = true;
        
        
        
        while(isRunning)
        {
            System.out.println("---------------");
            System.out.println("Banking System");
            System.out.println("---------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("---------------");
            System.out.print("Enter Your Process (1-4): ");
            int choice = scanner.nextInt();
            System.out.println("---------------");
            switch (choice)
            
            {
                case 1 -> isBalance(balance);
                case 2 -> balance += doDeposit();
                case 3 -> balance -=doWithdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a Valid Process");
            }
            
        }
        System.out.println("-------------------------------");
        System.out.println("Thank You for using our System");
    }
    static void isBalance(double balance)
    {
        
        System.out.printf("Rs.%.2f\n",balance);
    }
    static double doDeposit()
    {
        double amount;
        System.out.print("Enter the Amount: Rs.");
        amount = scanner.nextDouble();
        if(amount<0)
        {
            System.out.println("-------------------------");
            System.out.println("Amount Can't Be Negative");
            return 0;
        }
        else
        {
            return amount;
        }
    }
    static double doWithdraw(double balance)
    {
        System.out.print("Enter The amount to withdraw: ");
        double amount = scanner.nextDouble();
        if(amount>balance)
        {
            System.out.println("-------------------");
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0)
        {
            System.out.println("-------------------------");
            System.out.println("Amount Can't Be Negative");
            return 0;
        }
        else
        {
            return amount;
        }
    }
}