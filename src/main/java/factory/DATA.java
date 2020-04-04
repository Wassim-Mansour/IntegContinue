package factory;

import java.util.ArrayList;
import java.util.List;

public class DATA {
	static String JAVAQ1 = "UN DESIGN PATTERN PERMET DE GÉRER DES";
	static String JAVAQ2 = "LE MOT CLÉ \"EXTENDS\" EST UTILISÉ POUR";
	static String JAVAQ3 = "LE MOT-CLÉ \"TRANSIENT\" SERT À INDIQUER ";
	static String JAVAQ4 = "QUEL PROGRAMME DU JDK SERT À COMPILER DU JAVA ?";
	static String JAVAQ5 = "LORSQUE LA PORTÉE D'UNE CLASSE N'EST PAS PRÉCISÉE DANS UN PACKAGE, CELLE-CI EST DITE";
	static String JAVAQ1R1 = "la résolution d'un ou de plusieurs problèmes de conception.";
	static String JAVAQ1R2 = "les annotations";
	static String JAVAQ1R3 = "autre chose";
	static String JAVAQ2R1 = "l'héritage d'une classe";
	static String JAVAQ2R2 = "l'adressage mémoire";
	static String JAVAQ2R3 = "étendre la portée d'une variable";
	static String JAVAQ3R1 = "qu'une classe n'est pas instanciable";
	static String JAVAQ3R2 = "qu'une classe ne comporte pas de méthodes";
	static String JAVAQ3R3 = "qu'un objet n'est pas serializable";
	static String JAVAQ4R1 = "javac.exe";
	static String JAVAQ4R2 = "jdk.exe";
	static String JAVAQ4R3 = "jre.exe";
	static String JAVAQ5R1 = "default";
	static String JAVAQ5R2 = "public";
	static String JAVAQ5R3 = "protected";

	static String XMLQ1 = "UN DESIGN PATTERN PERMET DE GÉRER DES";
	static String XMLQ2 = "LE MOT CLÉ \"EXTENDS\" EST UTILISÉ POUR";
	static String XMLQ3 = "LE MOT-CLÉ \"TRANSIENT\" SERT À INDIQUER ";
	static String XMLQ4 = "QUEL PROGRAMME DU JDK SERT À COMPILER DU XML ?";
	static String XMLQ5 = "LORSQUE LA PORTÉE D'UNE CLASSE N'EST PAS PRÉCISÉE DANS UN PACKAGE, CELLE-CI EST DITE";
	static String XMLQ1R1 = "la résolution d'un ou de plusieurs problèmes de conception.";
	static String XMLQ1R2 = "les annotations";
	static String XMLQ1R3 = "autre chose";
	static String XMLQ2R1 = "l'héritage d'une classe";
	static String XMLQ2R2 = "l'adressage mémoire";
	static String XMLQ2R3 = "étendre la portée d'une variable";
	static String XMLQ3R1 = "qu'une classe n'est pas instanciable";
	static String XMLQ3R2 = "qu'une classe ne comporte pas de méthodes";
	static String XMLQ3R3 = "qu'un objet n'est pas serializable";
	static String XMLQ4R1 = "XMLc.exe";
	static String XMLQ4R2 = "jdk.exe";
	static String XMLQ4R3 = "jre.exe";
	static String XMLQ5R1 = "default";
	static String XMLQ5R2 = "public";
	static String XMLQ5R3 = "protected";

	static String MOBILEQ1 = "UN DESIGN PATTERN PERMET DE GÉRER DES";
	static String MOBILEQ2 = "LE MOT CLÉ \"EXTENDS\" EST UTILISÉ POUR";
	static String MOBILEQ3 = "LE MOT-CLÉ \"TRANSIENT\" SERT À INDIQUER ";
	static String MOBILEQ4 = "QUEL PROGRAMME DU JDK SERT À COMPILER DU MOBILE ?";
	static String MOBILEQ5 = "LORSQUE LA PORTÉE D'UNE CLASSE N'EST PAS PRÉCISÉE DANS UN PACKAGE, CELLE-CI EST DITE";
	static String MOBILEQ1R1 = "la résolution d'un ou de plusieurs problèmes de conception.";
	static String MOBILEQ1R2 = "les annotations";
	static String MOBILEQ1R3 = "autre chose";
	static String MOBILEQ2R1 = "l'héritage d'une classe";
	static String MOBILEQ2R2 = "l'adressage mémoire";
	static String MOBILEQ2R3 = "étendre la portée d'une variable";
	static String MOBILEQ3R1 = "qu'une classe n'est pas instanciable";
	static String MOBILEQ3R2 = "qu'une classe ne comporte pas de méthodes";
	static String MOBILEQ3R3 = "qu'un objet n'est pas serializable";
	static String MOBILEQ4R1 = "MOBILEc.exe";
	static String MOBILEQ4R2 = "jdk.exe";
	static String MOBILEQ4R3 = "jre.exe";
	static String MOBILEQ5R1 = "default";
	static String MOBILEQ5R2 = "public";
	static String MOBILEQ5R3 = "protected";

	static Question jQ1, jQ2, jQ3, jQ4, jQ5;
	static Question XQ1, XQ2, XQ3, XQ4, XQ5;
	static Question MQ1, MQ2, MQ3, MQ4, MQ5;

	static Reponse jQ1R1;
	static Reponse jQ1R2;
	static Reponse jQ1R3;

	static Reponse jQ2R1, jQ2R2, jQ2R3;
	static Reponse jQ3R1, jQ3R2, jQ3R3;
	static Reponse jQ4R1, jQ4R2, jQ4R3;
	static Reponse jQ5R1, jQ5R2, jQ5R3;

	static Reponse XQ1R1, XQ1R2, XQ1R3;
	static Reponse XQ2R1, XQ2R2, XQ2R3;
	static Reponse XQ3R1, XQ3R2, XQ3R3;
	static Reponse XQ4R1, XQ4R2, XQ4R3;
	static Reponse XQ5R1, XQ5R2, XQ5R3;

	static Reponse MQ1R1, MQ1R2, MQ1R3;
	static Reponse MQ2R1, MQ2R2, MQ2R3;
	static Reponse MQ3R1, MQ3R2, MQ3R3;
	static Reponse MQ4R1, MQ4R2, MQ4R3;
	static Reponse MQ5R1, MQ5R2, MQ5R3;

	static List<Question> questionsJAVA = new ArrayList<Question>();
	static List<Question> questionsXML = new ArrayList<Question>();
	static List<Question> questionsMOBILE = new ArrayList<Question>();

	static List<Reponse> reponsesj1 = new ArrayList<Reponse>();
	static List<Reponse> reponsesj2 = new ArrayList<Reponse>();
	static List<Reponse> reponsesj3 = new ArrayList<Reponse>();
	static List<Reponse> reponsesj4 = new ArrayList<Reponse>();
	static List<Reponse> reponsesj5 = new ArrayList<Reponse>();

	static List<Reponse> reponsesX1 = new ArrayList<Reponse>();
	static List<Reponse> reponsesX2 = new ArrayList<Reponse>();
	static List<Reponse> reponsesX3 = new ArrayList<Reponse>();
	static List<Reponse> reponsesX4 = new ArrayList<Reponse>();
	static List<Reponse> reponsesX5 = new ArrayList<Reponse>();

	static List<Reponse> reponsesM1 = new ArrayList<Reponse>();
	static List<Reponse> reponsesM2 = new ArrayList<Reponse>();
	static List<Reponse> reponsesM3 = new ArrayList<Reponse>();
	static List<Reponse> reponsesM4 = new ArrayList<Reponse>();
	static List<Reponse> reponsesM5 = new ArrayList<Reponse>();

	public static List<Question> getMobileQuestion() {

		MQ1R1 = new Reponse(1, MOBILEQ1R1);
		MQ1R2 = new Reponse(2, MOBILEQ1R2);
		MQ1R2.setIsTrue(true);
		MQ1R3 = new Reponse(3, MOBILEQ1R3);
		
		MQ2R1 = new Reponse(1, MOBILEQ2R1);
		MQ2R2 = new Reponse(2, MOBILEQ2R2);
		MQ2R2.setIsTrue(true);
		MQ2R3 = new Reponse(3, MOBILEQ2R3);
		
		MQ3R1 = new Reponse(1, MOBILEQ3R1);
		MQ3R2 = new Reponse(2, MOBILEQ3R2);
		MQ3R2.setIsTrue(true);
		MQ3R3 = new Reponse(3, MOBILEQ3R3);
		
		MQ4R1 = new Reponse(1, MOBILEQ4R1);
		MQ4R2 = new Reponse(2, MOBILEQ4R2);
		MQ4R2.setIsTrue(true);
		MQ4R3 = new Reponse(3, MOBILEQ4R3);
		
		MQ5R1 = new Reponse(1, MOBILEQ5R1);
		MQ5R2 = new Reponse(2, MOBILEQ5R2);
		MQ5R2.setIsTrue(true);
		MQ5R3 = new Reponse(3, MOBILEQ5R3);

		reponsesM1.add(MQ1R1);
		reponsesM1.add(MQ1R2);
		reponsesM1.add(MQ1R3);

		reponsesM2.add(MQ2R1);
		reponsesM2.add(MQ2R2);
		reponsesM2.add(MQ2R3);

		reponsesM3.add(MQ3R1);
		reponsesM3.add(MQ3R2);
		reponsesM3.add(MQ3R3);

		reponsesM4.add(MQ4R1);
		reponsesM4.add(MQ4R2);
		reponsesM4.add(MQ4R3);

		reponsesM5.add(MQ5R1);
		reponsesM5.add(MQ5R2);
		reponsesM5.add(MQ5R3);

		Question qMOBILE1 = new Question();
		qMOBILE1.setQuestionBody(MOBILEQ1);
		qMOBILE1.setQuestionNumber(1);
		qMOBILE1.setReponseListe(reponsesM1);
		Question qMOBILE2 = new Question();
		qMOBILE2.setQuestionBody(MOBILEQ2);
		qMOBILE2.setQuestionNumber(2);
		qMOBILE2.setReponseListe(reponsesM2);
		Question qMOBILE3 = new Question();
		qMOBILE3.setQuestionBody(MOBILEQ3);
		qMOBILE3.setQuestionNumber(3);
		qMOBILE3.setReponseListe(reponsesM3);
		Question qMOBILE4 = new Question();
		qMOBILE4.setQuestionBody(MOBILEQ4);
		qMOBILE4.setQuestionNumber(4);
		qMOBILE4.setReponseListe(reponsesM4);
		Question qMOBILE5 = new Question();
		qMOBILE5.setQuestionBody(MOBILEQ5);
		qMOBILE5.setQuestionNumber(5);
		qMOBILE5.setReponseListe(reponsesM5);
		questionsMOBILE.add(qMOBILE1);
		questionsMOBILE.add(qMOBILE2);
		questionsMOBILE.add(qMOBILE3);
		questionsMOBILE.add(qMOBILE4);
		questionsMOBILE.add(qMOBILE5);

		return questionsMOBILE;

	}

	public static List<Question> getJavaQuestion() {

		jQ1R1 = new Reponse(1, JAVAQ1R1);
		jQ1R2 = new Reponse(2, JAVAQ1R2);
		jQ1R2.setIsTrue(true);
		jQ1R3 = new Reponse(3, JAVAQ1R3);
		reponsesj1.add(jQ1R1);
		reponsesj1.add(jQ1R2);
		reponsesj1.add(jQ1R3);
		jQ2R1 = new Reponse(1, JAVAQ2R1);
		jQ2R2 = new Reponse(2, JAVAQ2R2);
		jQ2R2.setIsTrue(true);
		jQ2R3 = new Reponse(3, JAVAQ2R3);
		reponsesj2.add(jQ2R1);
		reponsesj2.add(jQ2R2);
		reponsesj2.add(jQ2R3);
		jQ3R1 = new Reponse(1, JAVAQ3R1);
		jQ3R2 = new Reponse(2, JAVAQ3R2);
		jQ3R2.setIsTrue(true);
		jQ3R3 = new Reponse(3, JAVAQ3R3);
		reponsesj3.add(jQ3R1);
		reponsesj3.add(jQ3R2);
		reponsesj3.add(jQ3R3);
		jQ4R1 = new Reponse(1, JAVAQ4R1);
		jQ4R2 = new Reponse(2, JAVAQ4R2);
		jQ4R2.setIsTrue(true);
		jQ4R3 = new Reponse(3, JAVAQ4R3);
		reponsesj4.add(jQ4R1);
		reponsesj4.add(jQ4R2);
		reponsesj4.add(jQ4R3);
		jQ5R1 = new Reponse(1, JAVAQ5R1);
		jQ5R2 = new Reponse(2, JAVAQ5R2);
		jQ5R2.setIsTrue(true);
		jQ5R3 = new Reponse(3, JAVAQ5R3);
		reponsesj5.add(jQ5R1);
		reponsesj5.add(jQ5R2);
		reponsesj5.add(jQ5R3);

		Question qJava1 = new Question();
		qJava1.setQuestionBody(JAVAQ1);
		qJava1.setQuestionNumber(1);
		qJava1.setReponseListe(reponsesj1);
		Question qJava2 = new Question();
		qJava2.setQuestionBody(JAVAQ2);
		qJava2.setQuestionNumber(2);
		qJava2.setReponseListe(reponsesj2);
		Question qJava3 = new Question();
		qJava3.setQuestionBody(JAVAQ3);
		qJava3.setQuestionNumber(3);
		qJava3.setReponseListe(reponsesj3);
		Question qJava4 = new Question();
		qJava4.setQuestionBody(JAVAQ4);
		qJava4.setQuestionNumber(4);
		qJava4.setReponseListe(reponsesj4);
		Question qJava5 = new Question();
		qJava5.setQuestionBody(JAVAQ5);
		qJava5.setQuestionNumber(5);
		qJava5.setReponseListe(reponsesj5);
		questionsJAVA.add(qJava1);
		questionsJAVA.add(qJava2);
		questionsJAVA.add(qJava3);
		questionsJAVA.add(qJava4);
		questionsJAVA.add(qJava5);

		return questionsJAVA;

	}

	public static List<Question> getXMLQuestion() {

		XQ1R1 = new Reponse(1, XMLQ1R1);
		XQ1R2 = new Reponse(2, XMLQ1R2);
		XQ1R2.setIsTrue(true);
		XQ1R3 = new Reponse(3, XMLQ1R3);
		XQ2R1 = new Reponse(1, XMLQ2R1);
		XQ2R2 = new Reponse(2, XMLQ2R2);
		XQ2R2.setIsTrue(true);
		XQ2R3 = new Reponse(3, XMLQ2R3);
		XQ3R1 = new Reponse(1, XMLQ3R1);
		XQ3R2 = new Reponse(2, XMLQ3R2);
		XQ3R2.setIsTrue(true);
		XQ3R3 = new Reponse(3, XMLQ3R3);
		XQ4R1 = new Reponse(1, XMLQ4R1);
		XQ4R2 = new Reponse(2, XMLQ4R2);
		XQ4R2.setIsTrue(true);
		XQ4R3 = new Reponse(3, XMLQ4R3);
		XQ5R1 = new Reponse(1, XMLQ5R1);
		XQ5R2 = new Reponse(2, XMLQ5R2);
		XQ5R2.setIsTrue(true);
		XQ5R3 = new Reponse(3, XMLQ5R3);

		reponsesX1.add(XQ1R1);
		reponsesX1.add(XQ1R2);
		reponsesX1.add(XQ1R3);

		reponsesX2.add(XQ2R1);
		reponsesX2.add(XQ2R2);
		reponsesX2.add(XQ2R3);

		reponsesX3.add(XQ3R1);
		reponsesX3.add(XQ3R2);
		reponsesX3.add(XQ3R3);

		reponsesX4.add(XQ4R1);
		reponsesX4.add(XQ4R2);
		reponsesX4.add(XQ4R3);

		reponsesX5.add(XQ5R1);
		reponsesX5.add(XQ5R2);
		reponsesX5.add(XQ5R3);

		Question qXML1 = new Question();
		qXML1.setQuestionBody(XMLQ1);
		qXML1.setQuestionNumber(1);
		qXML1.setReponseListe(reponsesX1);
		Question qXML2 = new Question();
		qXML2.setQuestionBody(XMLQ2);
		qXML2.setQuestionNumber(2);
		qXML2.setReponseListe(reponsesX2);
		Question qXML3 = new Question();
		qXML3.setQuestionBody(XMLQ3);
		qXML3.setQuestionNumber(3);
		qXML3.setReponseListe(reponsesX3);
		Question qXML4 = new Question();
		qXML4.setQuestionBody(XMLQ4);
		qXML4.setQuestionNumber(4);
		qXML4.setReponseListe(reponsesX4);
		Question qXML5 = new Question();
		qXML5.setQuestionBody(XMLQ5);
		qXML5.setQuestionNumber(5);
		qXML5.setReponseListe(reponsesX5);
		questionsXML.add(qXML1);
		questionsXML.add(qXML2);
		questionsXML.add(qXML3);
		questionsXML.add(qXML4);
		questionsXML.add(qXML5);

		return questionsXML;

	}

}
