package patterns.builder.concrete;

public class DocumentPdf extends Document {

    public DocumentPdf(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
        this.format = "PDF";
    }

}
