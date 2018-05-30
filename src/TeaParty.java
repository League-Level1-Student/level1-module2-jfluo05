
public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String message = "Hello ";

		if (isKnighted) {
			if (isWoman) {
				message = message + "Lady ";
			} else {
				message = message + "Sir ";
			}
		} else {
			if (isWoman) {
				message = message + "Ms. ";
			} else {
				message = message + "Mr. ";
			}
		}
		message = message + name;
		System.out.println(message);
		return message;
	}

}
