package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat whiskers = new Cat("whiskers");
		whiskers.meow();
		System.out.println("whiskers");
		whiskers.kill();
	}
}
