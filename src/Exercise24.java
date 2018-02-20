import java.util.*;
public class Exercise24 {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int x =input.nextInt();
		rotation(x);
		input.close();
	}
	public static void rotation(int x){
		int length=0;
		int reminder=0;
		int y=x;
		while(y>0){
			y/=10;
			length++;
		}
		for(int i=1;i<=length;i++){
			reminder=x%10;
			x=x/10;
			x=(int)(reminder*Math.pow(10, length-1)+x);
			System.out.println(x);
		}
		
	}
}
