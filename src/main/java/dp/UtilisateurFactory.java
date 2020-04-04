package dp;

import dp.UtilisateurInterface;;

public class UtilisateurFactory  {
	
	   //use getShape method to get object of type shape 
	   public UtilisateurInterface getUtlisateur(String utilisateurType){
	      if(utilisateurType == null){
	         return null;
	      }		
		if (utilisateurType.equalsIgnoreCase("Apprenant")){
	         return new Apprenant();
	         
	      } else if(utilisateurType.equalsIgnoreCase("Formateur")){
	         return new Formateur();
	         
	      } else if(utilisateurType.equalsIgnoreCase("Admin")){
	         return new Admin();
	      }
	      
	      return null;
	   }
	}