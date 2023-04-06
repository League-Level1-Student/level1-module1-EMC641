package _06_vault;

public class VaultRunner {
public  static void main(String[] args) {
Vault vault=new Vault();
SecretAgent secretAgent=new SecretAgent();
System.out.println(secretAgent.findCode(vault));
System.out.println(vault.tryCode(7));
	
	
}

}

