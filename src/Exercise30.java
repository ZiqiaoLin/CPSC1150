import java.util.*;
public class Exercise30 {
	public static void main(String[] args){
		String s1="Welcome";
		String s2= new String("Welcome");
		System.out.println(s1.compareTo(s2));
		String s3=String.valueOf(5.44);
		System.out.println(s3);
		Scanner input= new Scanner(System.in);
		System.out.println("Please input an String");
		String s4= input.next();
		String [] s5=s4.split(" ");
		reverse(s5);
		printFormat(s5);
		
	}
	public static void reverse(String[] str){
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[i].length();j++){
				char temp;
				temp=str[i].charAt(j);
				str[i]+=str[i].charAt(str[i].length()-1-j);
			}
		}
	}
	public static void printFormat(String[] str){
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
