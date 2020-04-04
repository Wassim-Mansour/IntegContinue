package factory;

import java.util.Iterator;
import java.util.List;

public class MobileTest extends Test {

	public MobileTest( List<Question> questionsListe) {
		super("MOBILE", questionsListe);
	}

	@Override
	Boolean choisirReponse(int question,int reponce) {
	return	questionsListe.get(question).getReponseListe().get(reponce).getIsTrue();
		
	}


	@Override
	void afficheReponseParQuestion(int questionNum) {
		System.out.println("-----------------JAVAQuestion"+questionNum+"------------------------ \n") ;
		System.out.println(questionsListe.get(questionNum).getQuestionBody() );
		System.out.println("-----------------Choisir Reponce------------------------ \n") ;
		List<Reponse> listReponce=questionsListe.get(questionNum).getReponseListe() ;
		
		for (Iterator iterator = listReponce.iterator(); iterator.hasNext();) {
			Reponse reponse = (Reponse) iterator.next();
			System.out.println("-----------------Reponce------------------------") ;
			System.out.println(reponse.getReponseNumber()-1+"||-"+reponse.getReponseBody());
		}
		
	}

	

	
	
}
