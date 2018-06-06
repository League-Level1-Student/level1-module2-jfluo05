
public class Vault {
private int secretCode=1;
boolean tryCode(int guess) {
	return(guess==secretCode);
	
}
int getSecretCode() {
	return secretCode;
}
void setSecretCode(int secretCode){
	this.secretCode= secretCode;
}
}
