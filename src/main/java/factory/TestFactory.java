package factory;

import java.util.ArrayList;
import java.util.List;

public class TestFactory {

	// use getShape method to get object of type shape
	public Test getQuestion(String testType,List<Question> liste) {
		if (testType == null) {
			return null;
		} else if (testType.equalsIgnoreCase("XML")) {
			return new XmlTest((ArrayList<Question>)liste);

		} else if (testType.equalsIgnoreCase("MOBILE")) {
			return new MobileTest((ArrayList<Question>)liste);

		} else if (testType.equalsIgnoreCase("JAVA")) {
			return new JavaTest((ArrayList<Question>)liste);
		}
		return null;


	}
}