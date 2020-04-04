package factory;

import java.util.List;

public abstract class Test {

	String testName;
	List<Question> questionsListe;

	abstract  void afficheReponseParQuestion(int questionNum) ;

	abstract Boolean choisirReponse(int question,int reponce);

	public Test(String testName, List<Question> questionsListe) {
		super();
		this.testName = testName;
		this.questionsListe = questionsListe;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public List<Question> getQuestionsListe() {
		return questionsListe;
	}

	public void setQuestionsListe(List<Question> questionsListe) {
		this.questionsListe = questionsListe;
	}

}