import java.util.Scanner;

public class GreastestCommonDivisor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to calculate the greatest common divisor");
		System.out.print("Please input the first integer:");
		int n1=input.nextInt();
		System.out.print("Please input the second integer:");
		int n2=input.nextInt();
		int gcd=0;
		for(int i=1;i<=n1&&i<=n2;i++){
			if(n1%i==0&&n2%i==0){
				gcd=i;
			}
		}
	    System.out.println("the greatest common divisor is "+gcd);
	}
}