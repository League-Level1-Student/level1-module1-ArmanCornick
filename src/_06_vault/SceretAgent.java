package _06_vault;

public class SceretAgent {
	void caseCracker(Vault vault) {
		for(int i=0;i<1000001;i++) {
			if(vault.tryCode(i)==true) {
				System.out.println("The code is " + i + ".");
			}
		}
	}
}
