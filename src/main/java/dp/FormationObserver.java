package dp;

public class FormationObserver implements Observer {
	private String titre ;
	private String description ;
	private int tel ;
	private String date;

	
	private static int observerIDTracker=0 ;
	private int observerID ;
	private Subject stockGrabber ;
	
	public FormationObserver(Subject stockGrabber){
		this.stockGrabber=stockGrabber ;
		this.observerID=++observerIDTracker ;
		System.out.println("Notification de l'abonné " );
		//System.out.println(this.observerID);
		stockGrabber.register(this);
		
	}
	
	public void update(String titre,String description,int tel, String date) {
		 this.titre=titre ;
		 this.description=description ;
		 this.tel=tel ;
		 this.date=date;
		 printThePrice(); 
		
	}
	public void printThePrice(){
		
		System.out.println(observerID +"\n Titre: "+ titre+ "\n Description: "+description +"\n Téléphone: "+tel+"\n Date: "+date);
	}

}



