import java.util.Scanner;

/*
 Write a Java program that:

Asks the user how many students are in a class.

For each student, asks for 3 subject marks (use a nested for loop).

Uses a method to calculate the total marks for each student.

Uses a method to calculate the average marks for each student.

Prints for each student:

Total marks

Average marks

"Excellent" if average ≥ 80, "Good" if average ≥ 50, "Needs Improvement" otherwise (conditional statements)

If any subject mark is below 40, skip calculating average for that student and print "Fail" (use continue inside nested loop).

After all students, print the highest total marks in the class (use another method).
 */
public class NotSoSimple
{
    public static void main(String args[])
    {
        int i;
        double chem = 0;
        double phy = 0;
        double math =0;
        int numStudent;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        numStudent = scanner.nextInt();
        for(i = 1; i<=numStudent;i++)
        {
            
                System.out.print("Enter The marks in Chemistry: ");
                chem = scanner.nextDouble();
                if(chem <=40)
                {
                    System.out.println(i+". Student has Failed");
                    continue;
                }
                System.out.print("Enter The marks in Physics: ");
                phy = scanner.nextDouble();
                if(phy <=40)
                {
                    System.out.println(i+". Student has Failed");
                    continue;
                }
                System.out.print("Enter The marks in Math: ");
                math = scanner.nextDouble();
                if(math <=40)
                {
                    System.out.println(i+". Student has Failed");
                    continue;
                }
            
            

            double total = Total(chem, phy, math);
            System.out.println("The total of "+i+". Student is "+total);
            double average = Avg(chem,phy,math);
            System.out.println("The Average of "+i+". Student is "+average);
            if(average>=80)
            {
                System.out.println("Excellent");
            }
            else if(average>=50)
            {
                System.out.println("Good");
            }
            else
            {
                System.out.println("Needs Improvement");
            }
        }
        scanner.close();
    }
    static double Total(double chem, double phy, double math)
    {
        double total = chem + phy + math;
        return total;
    }
    static double Avg(double chem, double phy, double math)
    {
    double Average = (chem+phy+math)/3;
    return Average;
    }
    
}