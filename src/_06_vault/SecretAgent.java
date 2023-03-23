package _06_vault;

public class SecretAgent {
public static void main(String[] args) {
	
		
		
	}


public static void findCode() {
Vault vault = new Vault();
	
for(int i=0;i<1000001;i++)  {
	if(vault.tryCode(i))  {
	
System.out.println(i);
	
	}
	else { 
		System.out.println(-1);
	}
}
	
}
}
