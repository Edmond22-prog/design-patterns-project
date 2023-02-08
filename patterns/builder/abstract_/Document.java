package patterns.builder.abstract_;

public abstract class Document {
    protected String titre;
    protected String contenu = "";

    public Document(String titre) {
        this.titre = titre;
    }

    public void affiche() {}

}
