import java.util.Scanner;

public class Multi_Way{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("This system evaluate your study level");
		System.out.print("Please enter your score:");
		int score=input.nextInt();
		if(score>=90)
			System.out.println("A");
		else if (score>=80)
			System.out.println("B");
		else if (score>=70)
			System.out.println("C");
		else if (score>=60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}