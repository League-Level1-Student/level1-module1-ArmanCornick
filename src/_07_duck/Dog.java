package _07_duck;

import java.awt.print.Printable;

public class Dog {
	int numberOfFriends;
	String favoriteFood;

	Dog(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	void bark() {
	System.out.println("bark roof roof bark");	
	}
	
	void chase() {
	System.out.println("roof roof roof! clop clop clop");
	}
	
	void hahaEat(Duck duck) {
		System.out.println("Dog eats duck while the duck's " + duck.numberOfFriends + " friends laugh at him.");
	}
}
