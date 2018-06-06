
public class VaultRunner {
public static void main(String[] args) {
Vault vault= new Vault();
vault.setSecretCode(138465);

JamesBond jb= new JamesBond();
jb.findCode(vault);
}
}
