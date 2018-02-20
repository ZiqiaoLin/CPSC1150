
public class Exercise28 {
	public static void main(String []args){
		char[] arr=createArray();
		int[] count=countLetters(arr);
		printFormat(count);
	}
	public static char[] createArray(){
		char[] arr= new char[100];
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)(Math.random()*26+'a');
		}
		return arr;
	}
	public static int[] countLetters(char[] arr){
		int[] count= new int[26];
		for(int i=0;i<arr.length;i++){
			count[arr[i]-'a']++;
		}
		return count;
	}
	public static void printFormat(int[] count){
		for(int i=0;i<count.length;i++){
			char y=(char)('a'+i);
			System.out.println("the letter "+y+" has occured "+count[i]);
		}
	}
}
