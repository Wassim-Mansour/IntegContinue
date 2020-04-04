package dp;

public abstract class FormationBuilder {
	protected FormationGrabber formation;

    public FormationGrabber getFormation() {
        return formation;
    }

    public void createNewFormation() {
        formation = new FormationGrabber();
    }

    public abstract void buildTitre();
    public abstract void buildDescription();
    public abstract void buildDate();
}
