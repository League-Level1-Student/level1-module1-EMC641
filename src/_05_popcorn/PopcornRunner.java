package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	
	/* Your mission and you have to accept it:
		 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
		 * The main method should create a bag of Popcorn and cook it in the microwave.
		 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		 * Don't change the existing methods.
		 */
	Popcorn popcorn = new Popcorn("something");
	String flavor = JOptionPane.showInputDialog(null, "What flavor popcorn do you want?");
	String time = JOptionPane.showInputDialog(null, "How long do you want to cook the popcorn for?");
	
}
}
