package factory;

import java.util.ArrayList;
import java.util.List;

public class Question {
	int questionNumber;
	String questionBody;
	List<Reponse> reponseListe = new ArrayList<Reponse>();

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}

	public List<Reponse> getReponseListe() {
		return reponseListe;
	}

	public void setReponseListe(List<Reponse> reponseListe) {
		this.reponseListe = reponseListe;
	}

	public String getQuestion() {
		return "[" + questionNumber + "]" + questionBody;
	}

	public void afficherLesReponse() {
		for (Reponse rp : reponseListe) {
			System.out.println(rp.getReponse());
		}

	}

}
