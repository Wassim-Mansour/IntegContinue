package dp;

import java.util.ArrayList;
import java.util.List;

public class Centre implements Component {
	private int idCentre;
	private String name;
	private String Zone;
	private int NbrAnciennte;
	private List<Component> subordinates;

	public Centre(String name, String zone, int nbrAnciennte) {
		super();
		this.name = name;
		Zone = zone;
		NbrAnciennte = nbrAnciennte;
		subordinates = new ArrayList<Component>();
	}

	
	public void add(Centre e) {
		subordinates.add(e);
	}

	
	public void remove(Centre e) {
		subordinates.remove(e);
	}

	@Override
	public String toString() {
		return "Centre [name=" + name + ", Zone=" + Zone + ", NbrAnciennte=" + NbrAnciennte + "]";
	}

	
	public void afficherCn() {
		System.out.println(toString());
		for (Component c : subordinates) {
			c.afficherCn();
		}

	}

}