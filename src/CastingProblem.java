import java.util.Scanner;
public class CastingProblem{
	public static void main(String[]args){
		double d=100.04;
		long l=(long)d;
		int i=(int)l;
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
		double tax = 197.55*0.05;
		System.out.println("The Sales tax is $"+(int)(tax*100)/100.0);
		float f=12.5F;
		int j=(int)f;
		System.out.println(f);
		System.out.println(j);
		Scanner input= new Scanner(System.in);
		System.out.println("1");
		int c= input.nextInt();
		int b=input.nextInt();
		System.out.println(c);
		System.out.println(b);
		
	}
}