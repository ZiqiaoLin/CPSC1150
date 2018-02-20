import java.util.*;
public class Exercise31 {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("Please input an String");
		String str1= input.nextLine();
		//System.out.println(str1);
		String[] str2=str1.split(" ");
		for(int i=0;i<str2.length;i++){
			System.out.println(str2[i]);
		}
		String result= reverse(str2);
		System.out.println(result);
	}
	public static String reverse(String[] str){
		String result="";
		for(int i=0;i<str.length;i++){
			for(int j=str[i].length()-1;j>=0;j++){
				result=result+str[i].charAt(j);
			}
			result=result+" ";
		}
		return result;
	}
}
