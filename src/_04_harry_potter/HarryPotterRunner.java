package _04_harry_potter;

public class HarryPotterRunner {
public static void main(String[] args) {
	HarryPotter James = new HarryPotter();
	James.makeInvisible(true);
	James.spyOnSnape();
	James.makeInvisible(false);
	James.castSpell("stupify");
}
}
