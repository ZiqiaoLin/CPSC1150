import java.util.*;
public class Exercise23 {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int x= input.nextInt();
		String str= deToBin(x);
		System.out.println(str);
		int y= binTode(str);
		System.out.println(y);
	}
	public static String deToBin(int x){
		String binary="";
		int reminder=0;
		while(x>0){
			reminder=x%2;
			x=x/2;
			binary=reminder+binary;
		}
		return binary;
	}
	public static int binTode(String str){
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum+=(str.charAt(i)-'0')*Math.pow(2,str.length()-i-1);
		}
		return sum;
	}
}
