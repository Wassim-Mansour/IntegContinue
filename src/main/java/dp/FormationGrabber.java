package dp;

import java.util.ArrayList;

public class FormationGrabber implements Subject {

	private ArrayList<Observer> observers;
	private String titre;
	private String description;
	private int tel= 202020202;
	private String date;

	
	public FormationGrabber() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}
	
	public FormationGrabber(String titre, String description, int tel, String date) {
		super();
		this.titre = titre;
		this.description = description;
		this.tel = tel;
		this.date = date;
	}

	
	public void register(Observer newObserver) {
		observers.add(newObserver) ;
		 

	}

	
	public void unregister(Observer deleteObserver) {
		 int observerIndex =observers.indexOf(deleteObserver) ;
		 System.out.println("Observer"+(observerIndex+1)+"deleted");
		 observers.remove(observerIndex) ;
	}

	
	public void notifyObserver() {
		for(Observer observer:observers){
			observer.update(titre, description, tel, date);
		}

	}
	public void setTitre(String newTitre) {
		this.titre=newTitre ;
		notifyObserver();
		
	}
	public void setDescription(String newDescription) {
		this.description=newDescription ;
		notifyObserver();
		
	}
	public void setTel(int newTel) {
		this.tel=newTel ;
		notifyObserver();
	}
	
	public void setDate(String date) {
		this.date=date ;
		notifyObserver();
	}

	@Override
	public String toString() {
		return "Formation [titre=" + titre + ", description=" + description + ", date=" + date + "]";
	}


	


}
