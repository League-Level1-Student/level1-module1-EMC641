package _04_harry_potter;

public class HarryPotterRunner {
public static void main(String[] args) {
	/* Create a HarryRunner class in the harry_potter package with a main method.
	 * The main method should:
	 * 
	* 1. create harry potter
	* 2. make him become invisible
	* 3. spy on Professor Snape
	* 4. make him become visible again
	* 5. cast a "stupefy" spell
	*/
	
	HarryPotter harryPotter = new HarryPotter();
	harryPotter.makeInvisible(true);
	harryPotter.spyOnSnape();
	harryPotter.makeInvisible(false);
	harryPotter.castSpell("stupefy");
}
}
