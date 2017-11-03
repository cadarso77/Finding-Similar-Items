import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/*
	 * 
	 * I have to create a method for reading directly from file text that is the variable
	 * testExample now.
	 * Also, I will modify the code for acccepting any number of K now I am working with 10
	 * 
	 */
	static String[] textExample={"Hola me llamo Manuel" ,"Hola que tal? son las 12 ..,,.,!!34231"};
	static int k=10;
	public static void main( String[] args ) throws NoSuchAlgorithmException{ 
		System.out.println("Command Options: ");
		System.out.println("a: Shingling");
		System.out.println("b: MinHashing");
		  String choice = null;
	        Scanner scan = new Scanner(System.in);
	        do {
	            choice = scan.nextLine();
	            switch (choice) {
	            case "a":
	            	Shingling shinglingText= new Shingling ();
	        		ArrayList<ArrayList<StringBuffer>> group =Shingling.create(textExample,k);
	        	/*	for(int i=0;i<group.size();i++){
	        			System.out.println("Text: "+i);
	        			for(int pop=0;pop<group.get(i).size();pop++){
	        				System.out.println("Hex format : " + group.get(i).get(pop).toString());
							}
	        			}*/
	            case "b":
	            	System.out.println("Working on it ;)");
	            	//You should define some object as I did 

	            } // end of switch
	        } while (!choice.equals("q")); // end of loop
		
	}

}
