/* The Program Name: Wind_ChillIndex;
 * Name: Ziqiao(John) Lin;
 * Date: Sep,29,2015;
 * The Purpose of the Class: This class is to calculate Wind_Chill Index based on two input:Air Temperature and Wind Speed;
 */

import java.util.Scanner;   // import input function

public class Wind_ChillIndex{   // main class
	public static void main(String[] args){
		int wind_chillindex;   //define wind_chillindex as integer type
		float airtemperature,windspeed;  // define air temperature and wind speed as float type
		Scanner input=new Scanner(System.in);  // create a scanner
		System.out.println("This program calculates the wind-chill index.");  
		System.out.print("Enter the temperature in Celsius:");  // notice user to input temperature
		airtemperature=input.nextFloat();    // read a float to air temperature
		if(airtemperature>=-50&&airtemperature<=5){  // check whether air temperature is in the valid limit or not
			System.out.print("Enter the wind speed kilometers per hour:");  // notice user to input wind speed
			windspeed=input.nextFloat(); // read a float
			if(windspeed>=0&&windspeed<=100){  // check the input wind speed whether is in limit or not
				wind_chillindex=(int)(13.112+0.6215*airtemperature-11.37*Math.pow(windspeed,0.16)+0.3965*airtemperature*Math.pow(windspeed, 0.16));
				// compute wind_chillindex
			    System.out.println("The wind chill index is "+wind_chillindex); 
			    //display result of wind_chillindex
			}else{
				System.out.println("Invaild Input: The Wind Speed should from 0 to 100 km/h" ); 
				// notice user the invalid input for wind speed
			}
		}else{
			System.out.println("Invaild Input:Temperature should between -50°C and 5°C"); 
			//notice user the invalid input for air temperature
		}
	}
}