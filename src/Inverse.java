
public class Inverse {
     public static void main(String [] args){
    	 String str="This is a test";
    	 String[] str2=str.split(" ");

    	 System.out.println(str2.length);
    	 for(int i=0;i<str2.length;i++){
    		 for(int j=0;j<str2[i].length();j++){
    			 System.out.print((str2[i].charAt(str2[i].length()-1-j)));
    		 }
    		 System.out.print(" ");
    	 }
    	 //String str3=str2[1];
    	 //System.out.println(str3.charAt(1));
    	 //System.out.println(str2[1].charAt(1));
    	 //System.out.println(str2[1].length());
     }
     
}
