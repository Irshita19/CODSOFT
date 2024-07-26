package CodSoft.Task2;
import java.util.Scanner;
public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean re_enter = true;
        while (re_enter)
        {
        	System.out.print("Enter the number of subjects: ");
            int num = sc.nextInt();
        	double total = 0;
        	for(int i=1; i<=num; i++)
            {
            	System.out.print("Enter marks obtained in subject " +i+ ": ");
                double marks = sc.nextDouble();
                if(marks>100)
                {
                	System.out.println("Wrong marks entered. Marks must be out of 100");
                	break;
                }
                else
                	total = total + marks;
            }
           
            double avgPer = total / num;
            char grade = '0';
            if (avgPer >= 90) 
            {
                grade = 'O';
            } 
            else if (avgPer >= 80) 
            {
                grade = 'A';
            } 
            else if (avgPer >= 70) 
            {
                grade = 'B';
            } 
            else if (avgPer >= 60) 
            {
                grade = 'C';
            }
            else if(avgPer <60)
            {
                grade = 'D';
            }
            else
            {
            	System.out.println("Wrong marks entered.");
            }

            System.out.println("\nDo you want to re-enter the marks? "
            				+ "Type 'yes' to re-enter or any other key to exit.");
            String re = sc.next().toLowerCase();
            re_enter = re.equals("yes");

            if (!re_enter) 
            {
            	System.out.println("-----------------------------------------------------------------------------------");
            	System.out.println("RESULTS!!!!!");
                System.out.println("Total Marks: " +total);
                System.out.println("Average Percentage: " +avgPer+ "%");
                System.out.println("Grade: " +grade);
            }
        }
        sc.close();
    }
}