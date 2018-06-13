import java.util.Random;

public class VaultRunner {
	static Random random= new Random();
	
public static void main(String[] args) {
	Vault vault= new Vault(0);

vault.setSecretCode(random.nextInt(1000000));
JamesBond jb= new JamesBond();
int result=jb.findCode(vault);

if(result==-1) {
	System.out.println("YOU COULD NOT CRACK THE VAULT!");
}else {
	System.out.println("Great work, James Bond! You have cracked the code. The code is "+vault.getSecretCode());
}
}
}