import java.util.Scanner;
/** The Program's Name:NetProceeds
** Name: Ziqiao (John) Lin
** Date: Sep,22 2015
** Purpose of Each Class and Specific Method:  I only have one main class called NetProceeds.
**It mainly calculate Value of Share,Commission and Net Proceeds. 
*/
public class NetProceeds{
	
	/*
	 * the main program is to calculate the net proceeds from a sale of stock
	 */
	
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		double value_Share,commission,netProceeds;//declare three variables for calculation
		System.out.println("This program calculates the net proceeds from a sale of stock.\n");
		System.out.print("Enter stock price: $"); //
	    double stockPrice= input.nextDouble();
	    if(stockPrice<0){                 //input stock price should be positive
			System.out.println("Invaild input :Negative Stock Price");
		}else{
		    System.out.print("Enter number of shares:");
		    double number_Share=input.nextDouble();
		    if(number_Share<0){           //input number of share should be positive
				System.out.println("Invaild input :Negative Number of Share");
			}else{
		        System.out.print("Enter commission rate (as a percentage):");
		        double commissionRate=input.nextDouble();
		        if(commissionRate<0){     //input commission rate should be positive
					System.out.println("Invaild input :Negative Commission Rate");
		        }else{
		        	/*
		        	 * displace the value of share\commission\net proceeds
		        	 * 
		        	 * 
		        	 */
		        	
					value_Share=stockPrice*number_Share;
					System.out.println("Value of share: $"+value_Share);
					commission=value_Share*commissionRate/100;
					System.out.println("Commission:$"+commission);
					netProceeds=(float)value_Share-commission;
					System.out.println("Net proceeds:$"+netProceeds);
		             }
			     }
		     } 
	}
}
