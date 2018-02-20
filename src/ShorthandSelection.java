import java.util.Scanner;

public class ShorthandSelection{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("The number is even or odd?");
		System.out.print("plz input an number:");
		int number=input.nextInt();
		System.out.println((number%2==0)?"even":"odd");
	}
}