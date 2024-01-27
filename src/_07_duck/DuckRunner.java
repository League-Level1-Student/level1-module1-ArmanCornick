package _07_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck duck = new Duck("cheese", 10);	
		Dog dog = new Dog("Chocolate", 12);
		dog.bark();
		duck.quack();
		dog.chase();
		duck.waddle();
		dog.hahaEat(duck);
	}


}
