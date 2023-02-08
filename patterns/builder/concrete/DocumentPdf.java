package patterns.builder.concrete;

import patterns.builder.abstract_.Document;

public class DocumentPdf extends Document {

    public DocumentPdf(String titre) {
        super(titre);
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void affiche() {
        System.out.println("Document " + titre + " au format PDF");
        System.out.println("Contenu : " + contenu + "\n");
    }

}
