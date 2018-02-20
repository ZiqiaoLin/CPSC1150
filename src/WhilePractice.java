import java.util.Scanner;

public class WhilePractice{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("This is a program to calculate the factorial X");
		System.out.print("Please input an integer:");
		int x=input.nextInt();
		int sum=0,i=1;
		while(i<=x){
			sum+=i;
			i++;
		}
		System.out.println("sum="+sum);
	}
}