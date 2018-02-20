import java.util.Scanner;
public class Factorial {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("input an number:");
		int x=input.nextInt();
		int result=1;
		do{
			result*=x;
			x--;
		}while(x>0);
		System.out.println(result);
	}
}
