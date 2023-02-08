package patterns.builder.concrete;

public abstract class Document {

    String contenu;
    String titre;
    String format;

    public void affiche() {
        System.out.println("Document " + titre + " au format " + format);
        System.out.println(contenu);
    }

   
}
