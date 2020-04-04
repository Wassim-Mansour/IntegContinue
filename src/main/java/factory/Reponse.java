package factory;

public class Reponse {

	int reponseNumber;
	String reponseBody;
	Boolean isTrue = false;

	public int getReponseNumber() {
		return reponseNumber;
	}

	public void setReponseNumber(int reponseNumber) {
		this.reponseNumber = reponseNumber;
	}

	public Reponse(int reponseNumber, String reponseBody) {
		super();
		this.reponseNumber = reponseNumber;
		this.reponseBody = reponseBody;
	}

	public String getReponseBody() {
		return reponseBody;
	}

	public void setReponseBody(String reponseBody) {
		this.reponseBody = reponseBody;
	}

	public Boolean getIsTrue() {
		return isTrue;
	}

	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}

	public String getReponse() {
		return "[" + reponseNumber + "]  " + reponseBody;
	}

}
