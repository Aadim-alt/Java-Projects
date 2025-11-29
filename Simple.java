import java.util.Scanner;

public class Simple
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i;
        String isContinue = "";
        int num;
        int calc = 0;
        do{
        for(i = 1; i <=5; i++)
        {
            System.out.print("Enter a Number");
            num = scanner.nextInt();
            calc = sum(num,calc);    
        }
        System.out.println("Your sum is: "+calc);
        System.out.println("Do you want to continue: (y/n)");
        isContinue = scanner.next().toUpperCase();
    }while(isContinue.equals("Y"));
}
    static int sum(int num, int calc)
    {
        calc = num+calc;
        return calc;
    }
}
