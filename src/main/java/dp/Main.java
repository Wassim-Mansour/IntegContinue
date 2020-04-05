package dp;

import java.util.Scanner;

public class Main {
	// Nouvelle formation
	static Serveur serveur = new Serveur();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Nouveau centre

		// Esprit.afficherCn();

		System.out.println("--------------------------------------HELLO--------------------------------------------");

		// Nouveau utilisateur
		UtilisateurFactory utilisateurFactory = new UtilisateurFactory();
		// role entrer par le console
		String Role = null;
		// pour existe de la console
		boolean exist = false;
		// nom de formation entrer depuis la console
		String formation = null;
		UtilisateurInterface user = null;
		// date entrer par l utilisateur
		String date;

		while (!exist) {
			System.out.println("Entrer votre ROLE(Admin|Apprenant)");

			Role = input.nextLine();
			if (Role.equals("Admin")) {

				user = utilisateurFactory.getUtlisateur("Admin");

			} else if (Role.equals("Apprenant")) {
				user = utilisateurFactory.getUtlisateur("Apprenant");

			}

			if (user instanceof Apprenant) {

				System.out.println("\n Bonjour Vous devez choisir le test du niveaux pour la formation (JAVA|XML|MOBILE)");

				factory.Factory.FactoryQuestionTest(args);

				System.out.println("\n Voici Nos Centre Disponible  à rejoindre");

				compositeWorker();

				System.out.println("\n Merci pour votre visite ");

			} else if (user instanceof Admin) {
				System.out.println("choisir la formation pour actualiser sa Date(JAVA|XML|MOBILE) ");
				formation = input.nextLine();
				System.out.println("Enter La date");
				date = input.nextLine();

					builderWorker(formation);
					observerWorker(date);


			}
			exist = true;
		}
	}

	public static void observerWorker(String date) {
		FormationGrabber f1 = serveur.getFormation();
		FormationObserver Observer1 = new FormationObserver(f1);
		f1.setDate(date);
	}

	public static void builderWorker(String formation) {
		FormationBuilder formationBuilder;

		if (formation.equals("java")) {
			formationBuilder = new FormationJava();
		} else if (formation.equals("mobile")) {
			formationBuilder = new FormationMobile();
		} else {
			formationBuilder = new FormationXml();
		}
		serveur.setFormationBuilder(formationBuilder);
		serveur.constructFormation();
	}

	public static void compositeWorker() {

		Centre Esprit = new Centre("Ghazela", "Siège", 10);
		Centre courJours = new Centre("Tunis", "Commerce", 2);
		Centre coursSoirs = new Centre("Khawerezmi", "Informatique", 3);
		Centre bissnesScool = new Centre("Khawerezmi", "Informatique", 3);

		Esprit.add(coursSoirs);
		Esprit.add(courJours);
		Esprit.add(bissnesScool);

		Esprit.afficherCn();

	}
}
