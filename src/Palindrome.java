import java.util.*;
public class Palindrome {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an String");
		String str=input.nextLine();
		//System.out.println(str);
		System.out.println(palindrome(str));
	}
	public static boolean palindrome(String str){
		boolean judge= true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				judge=false;
				break;
			}
		}
        return judge;
	}
}
