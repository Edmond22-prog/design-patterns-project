package patterns.builder.concrete;

public class DocumentHtml extends Document {

    public DocumentHtml(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
        this.format = "HTML";
    }

}
