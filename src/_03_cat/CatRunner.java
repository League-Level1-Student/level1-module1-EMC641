package _03_cat;

public class CatRunner {
public static void main(String[] args) {
	/* Do the following things without changing the Cat class 
	
	* Create a CatRunner class in the cat package, with a main method that creates a Cat object.
	
    * 1. Make the Cat meow
	
	* 2. Get the Cat to print it's name

	* 3. Kill the Cat! 
	
	*/
	
	Cat cat = new Cat("pet");
	cat.printName();
	cat.kill();
}
}
