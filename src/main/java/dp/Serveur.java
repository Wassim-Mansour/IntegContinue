package dp;

public class Serveur {
    private FormationBuilder formationBuilder;

    public void setFormationBuilder(FormationBuilder pb) {
        formationBuilder = pb;
    }

    public FormationGrabber getFormation() {
        return formationBuilder.getFormation();
    }

    public void constructFormation() {
    	formationBuilder.createNewFormation();
    	formationBuilder.buildTitre();
    	formationBuilder.buildDescription();
    	formationBuilder.buildDate();
    }
}
