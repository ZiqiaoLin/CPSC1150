import java.util.Scanner;

public class Loop1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("please input the times you want to say 'Welcome to Java':");
		int times=input.nextInt();
		int counter=1;
		while (counter<=times){
			System.out.println("Welcome to Java!");
			counter++;
		}
	}
}