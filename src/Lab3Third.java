/* The Program's Name: Lab3Third;
 * Name: Ziqiao(John) Lin
 *Date:Oct,4,2015
 *Course:CPSC1150
 *Compiler:JDK1.7
 *Purpose for each class: to calculate the months and years for the balance of a bank account
*/

import java.util.Scanner;     //import the Scanner function


public class Lab3Third{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);  // define input as a new Scanner
    final double INTEREST=0.005;   //define interest for bank account as a constant
    int counter=0;  //declare counter as an integer to account months 
    System.out.print("Please input the initial banlace in bank account:$");  //notice user to input a number for the balance of bank account
    double iBalance=input.nextDouble();  //receive input and sign it to iBalance
    for(int i=1; ;i++){   // the loop to account the months for bank account
      iBalance=iBalance*(1+INTEREST)-500;
      if(iBalance<=0)
      {
        counter=i;
        break;
      }
    }
    
    int year=counter/12;  // calculate the years
    int month=counter%12; // calculate the months
    String msuffix="",ysuffix=""; // define msuffix and ysuffix as string 
    if(year>0){ // to check the correct month\months\ without month for year great than 0
      ysuffix =ysuffix+ (year==1? "1 year ":year+" years "); // check correct word for year 
      if(month>0){
          msuffix =msuffix+(month==1? "1 month ":month+" months "); // check correct word for month when month is greater than 0
          System.out.println( ysuffix+"and "+msuffix); // print out the year and month when both of them are exist
      }else{
      System.out.println( ysuffix+msuffix);  // print out the year when only year exists
      }
    }else{
    	msuffix =msuffix+(month==1? "1 month":month+" months "); // define the correct month/months for msuffix
    	System.out.println( ysuffix+msuffix); // print out the month when only month exists
    }
  }  
} 
    
    
    
    
    /*if(counter<12&&counter%12==1){
      System.out.println(counter%12+" month");
    }else if(counter<12&&counter%12!=1){
      System.out.println(counter+" months");
    }else if(counter==12){
       System.out.println("1 year");
    }else if(counter/12==1&&counter%12==1){
       System.out.println("1 year and 1 month");       
    }else if(counter/12==1&&counter%12!=1&&counter!=12){
       System.out.println("1 year and "+counter%12+" months");
    }else if(counter/12>1&&counter%12==0){
       System.out.println(counter/12+" years");
    }else if(counter/12>1&&counter%12==1){
       System.out.println(counter/12+" years and "+"1 month");
    }else if(counter/12>1&&counter%12!=1&&counter%12!=0){
       System.out.println(counter/12+" years and "+counter%12+" months");
    }*/
    
  
  
  