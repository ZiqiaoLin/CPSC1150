
public class reverseWords {
  public static void main(String[] args){
	  String s="This is a test";
	  String result=" ";
	  String[] s1=s.split(" ");
	  for(int i=0;i<s1.length;i++){
	    char[] word= s1[i].toCharArray();
	    for(int j=0;j<word.length/2;j++){
	    	char temp;
	    	temp=word[j];
	    	word[j]=word[word.length-1-j];
	    	word[word.length-1-j]=temp;
	    }
	    String reversed= new String(word);
	    result=result+reversed+" ";
	  }
	  System.out.println(result);
  }
}
