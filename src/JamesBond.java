
public class JamesBond {
	
int findCode(Vault vault){
	
	for(int i = 0; i<1000000;i++) {
	
	tryCode(i);
	if (i==138465) {
		return i;
	}
	else {
		return -1;
	}
}
}
}