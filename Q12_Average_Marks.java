import java.util.*;
class Q12_Average_Marks
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your markss: ");
		double marks = sc.nextDouble();
		double sum=0;
		int num=0;
		while(marks!=-1)
		{
			sum+=marks;
			num++;
			marks = sc.nextDouble();			
		}
		double average = sum/num;
		System.out.println("Average: "+average);
	}
}
