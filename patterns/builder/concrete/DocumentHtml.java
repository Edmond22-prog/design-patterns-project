package patterns.builder.concrete;

import patterns.builder.abstract_.Document;

public class DocumentHtml extends Document {

    public DocumentHtml(String titre) {
        super(titre);
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void affiche() {
        System.out.println("Document " + titre + " au format HTML");
        System.out.println("Contenu : " + contenu + "\n");
    }

}
