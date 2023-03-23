package _06_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	for(int i=0;i<1000001;i++)  {
	vault.tryCode(i);
	
	
	if(vault.tryCode(i)==true)  {
		System.out.println(i);
	}
	}
}}

