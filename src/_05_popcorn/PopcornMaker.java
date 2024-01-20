package _05_popcorn;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn pop = new Popcorn("garlic");
	Microwave toast = new Microwave();
	toast.putInMicrowave(pop);
	toast.setTime(2);
	toast.startMicrowave();
}
}
