package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault metal = new Vault();	
		SceretAgent agent = new SceretAgent();
		agent.caseCracker(metal);
	}
}
