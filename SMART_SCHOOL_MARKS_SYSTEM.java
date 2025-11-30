import java.util.Scanner;
public class SMART_SCHOOL_MARKS_SYSTEM
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean isContinue = true;
        
        while(isContinue)
        {
            System.out.println("--------------------");
            System.out.println("School Marks System");
            System.out.println("--------------------");
            System.out.println("1 -> Enter Student Marks");
            System.out.println("2 -> View Help");
            System.out.println("3 -> Exit");
            System.out.println("--------------------");
        
            System.out.print("Your Choice: ");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1 -> Marks();
                case 2 -> System.out.println("HELP");
                case 3 -> isContinue = false;
            }
        }
        System.out.println("Thank You For Using Our System");
        scanner.close();
    }
    static void Marks()
    {
        String[] names;
        double[] subject1;
        double[] subject2;
        double[] subject3;
        double[] total;
        System.out.print("Enter The Number of Students: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        names = new String[num];
        subject1 = new double[num];
        subject2 = new double[num];
        subject3 = new double[num];
        total = new double[num];
        boolean isTrue = true;
        while(isTrue){
        for(int i=0; i<num; i++)
        {
            System.out.print("Enter Name Of The Student: ");
            names[i] = scanner.nextLine();
            System.out.print("Enter Marks At Physics: ");
            subject1[i] = scanner.nextDouble();
            scanner.nextLine();
            if(subject1[i]>100 || subject1[i]<0)
            {
                System.out.println("--------------------");
                System.out.println("Enter Valid Marks. Going Back to Menu");
                isTrue = false;
                break;
            }
            System.out.print("Enter Marks At Math: ");
            subject2[i] = scanner.nextDouble();
            scanner.nextLine();
            if(subject2[i]>100 || subject2[i]<0)
            {
                System.out.println("--------------------");
                System.out.println("Enter Valid Marks. Going Back to Menu");
                isTrue = false;
                break;
            }
            System.out.print("Enter Marks At Chemistry: ");
            subject3[i] = scanner.nextDouble();
            scanner.nextLine();
            if(subject3[i]>100 || subject3[i]<0)
            {
                System.out.println("--------------------");
                System.out.println("Enter Valid Marks. Going Back to Menu");
                isTrue = false;
                break;
            }
            total[i] = subject1[i] + subject2[i] + subject3[i];
            
        }
        if(isTrue)
        {
            showMarks(names,num,subject1,subject2,subject3,total);
            isTrue=false;
        }
        
    }
        
    }
    static void showMarks(String[] names, int num, double[] subject1, double[] subject2, double[] subject3, double[] total)
    {
        System.out.println("Name \tPhysics \tMath \tChemistry \t  Total");
        System.out.println("----------------------------------");
        for(int i =0; i<num; i++)
        {
            
            
            System.out.println(names[i]+"\t"+subject1[i]+"\t"+subject2[i]+"\t"+subject3[i]+"\t"+total[i]);
            
        }
        System.out.println("----------------------------------");
        greatestReturn(total, num);
    }
    static void greatestReturn(double[] total,int num)
    {
        double greatest = 0;
        double smallest = 999999;
        for(int i =0; i<num; i++)
        {
            if(total[i]>greatest)
            {
                greatest = total[i]; 
            }
        }
        for(int i =0; i<num; i++)
        {
            if(total[i]<smallest)
            {
                smallest = total[i]; 
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Highest Total: "+greatest);
        System.out.println("----------------------------------");
        System.out.println("Lowest Total: "+smallest);
        
    }
}