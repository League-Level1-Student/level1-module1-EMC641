package _07_duck;

public class Fish {

	private String favoriteColor;
	private int age;
	private String color;
	
	

	Fish(String favoriteColor, int age, String color) {
	       this.favoriteColor = favoriteColor;
	       this.age = age;
	       this.color = color;
	}

	void walk() {
		System.out.println("your fish is walking");
		
	}
	
	void sleep() {
		System.out.println("you fish is sleeping");
		
	}
	
}
