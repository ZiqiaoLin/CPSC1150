public class Practice_Lec14{
	public static void main(String[]args){
		
		for (int i=1;i<=5;i++){
			for (int k=0;k<i-1;k++){
				System.out.print(" ");
			}
		    for(char ch=(char) ('a'+i-1);ch<='e';ch++){
		    	System.out.print(ch);
		    }
		  System.out.print("\n");
		}
	}
}