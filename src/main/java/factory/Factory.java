package factory;

import java.util.Scanner;

public class Factory {
	public static void FactoryQuestionTest(String[] args) {

		Scanner input = new Scanner(System.in);

	
		Score score= new Score() ;

		//System.out.println("Bonjour Vous devez choisir le test  (JAVA|XML|MOBILE)");

		String testName = null;
		int reponce = 0 ;
		int question = 0 ;
		Test TEST = null;
		while (question <5) {

			testName = input.nextLine();
			TestFactory questionFactory = new TestFactory();

			if (testName.equals("JAVA")) {

				TEST = (JavaTest) questionFactory.getQuestion("JAVA", DATA.getJavaQuestion());

			} else if (testName.equals("XML")) {

				TEST = (XmlTest) questionFactory.getQuestion("XML", DATA.getXMLQuestion());

			} else if (testName.equals("MOBILE")) {

				TEST = (MobileTest) questionFactory.getQuestion("MOBILE", DATA.getMobileQuestion());
			}
			if(TEST!=null) {
			System.out.println(TEST.getTestName());
			TEST.afficheReponseParQuestion(question);
			reponce = input.nextInt();
			if(TEST.choisirReponse(question, reponce)) {
				score.addScore();
				
			}
		question++ ;	
		}
			else {
				System.out.println("vous devez choisir seulement   (JAVA|XML|MOBILE)");
				
			}	
		
		}
		System.out.println("Votre Score ==>>" + score.getScore()+" / 5");
		
		if (score.getScore()>=3) {
			System.out.println("\n Niveaux Acceptable ");
		} else {
			System.out.println("\n  Niveaux Faible");
		}


	}

}
