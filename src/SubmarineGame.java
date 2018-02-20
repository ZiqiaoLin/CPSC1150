/*The Program's Name:SubmarineGame;
**Name: Ziqiao(John) Lin;
**Date of Finish: Nov,30,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
import java.util.Scanner;  //import Scanner function
public class SubmarineGame {
	/*
	 * class SubmarineGme is a small submarine game
	 */
	public static void main(String [] args){
		/*
		 * main method
		 */
		char[][] map={  // 2D array map to create a 10*10 ocean map
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
		};
		char[][] hiddenmap={  // 2D array hiddenmap to create a 10*10 ocean map
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.','.'},
		};
		making(hiddenmap);
		showing(map);
		menu(map,hiddenmap); 
	}
	/*
	 * void type method menu to get input from user and showing map and redo it until showing submarine
	 */
	public static void menu(char[][] map, char[][] hiddenmap){
		int x=0;  // define x as integer type
		int y=0;  //define y as integer type
		Scanner input= new Scanner(System.in);  // create input as a new Scanner
		
		System.out.println("Specify the bomb target by two digit numbers:");  // notice user to specify the location of bomb
		x=input.nextInt();  // get first integer for x-coordinate
		if(input.hasNextInt()){
			y=input.nextInt();  // get second integer for y-coordinate
		}
		while(hiddenmap[x][y]!='S'){  // check whether hit the submarine or not
			hiddenmap[x][y]='O';  // make the location that did not hit submarine as 'O'
			map[x][y]='O';  // also mark this location in map
			System.out.println("You did not destroy a submarine");  // notice user that did not destroy a submarine
			showing(map);  // calling method showing to show the map on scream
			System.out.println("Specify the bomb target by two digit numbers:"); // redo this process
			x=input.nextInt();  // get x-coordinate
			if(input.hasNextInt()){
				y=input.nextInt();  // get y-coordinate
			}
		}
		hiddenmap[x][y]='X';  // the bomb hit the submarine and make that location to 'X'
		showing(hiddenmap);  // showing the hiddenmap
		System.out.println("Found a submarine! You win!");  // notice user has won
		input.close();
	}
	/*
	 * method making is to create 4 5-length submarine in the ocean map, S means submarine
	 */
	public static void making(char[][] map2){  
			int number=4;  // the number of submarine
			for(int i=1;i<=number;i++){  // repetition loop to random create location of every submarine
				if(direction()){  // make direction of submarine true for horizontal direction, and false for vertical direction
					int x=(int)(Math.random()*5);
					int y=(int)(Math.random()*9);
					map2[x][y]='S';  // make location of submarine as 'S'
					for(int j=1;j<=4;j++){  // mark other 4 location for submarine
						map2[x+j][y]='S';  
					}
				}else{  //  vertical direction
					int x=(int)(Math.random()*9); 
					int y=(int)(Math.random()*5);
					map2[x][y]='S';    // make location of submarine as 'S'
					for(int j=1;j<=4;j++){  //make other 4 locations for submarine
						map2[x][y+j]='S';
					}
				}
			}
		}
	/*
	 * method direction is a boolean method to decide which direction of submarine
	 */
	public static boolean direction(){
		if(Math.random()<0.5){
			return true;//horizontal direction
		}else{
			return false; // vertical direction
		}
	}
	/*
	 * void type method showing  to show the map on scream
	 */
	public static void showing(char[][] map){
		System.out.print("  ");
		for(int i=0;i<=9;i++){  // print x coordinate
			System.out.printf("%2d",i);
		}
		System.out.println();
		for(int i=0;i<map.length;i++){ // start to print map
			System.out.printf("%2d",i);  // print y coordinate
			for(int j=0;j<map[i].length;j++){  //  print map
				System.out.printf("%2c",map[i][j]);
			}
			System.out.println();
		}
	}
}