package _06_vault;

import javax.swing.JOptionPane;

public class SecretAgent {
	
	
int findCode(Vault something) {
	Vault vault = new Vault();
	
	for(int i=0;i<1000002;i++)  {
		
		if(vault.tryCode(i)==true) {
			return(i);
		}

	
	}
	
	return(-1);
	



}}


