package patterns.builder;

import patterns.builder.abstract_.MonteurLiasseDocuments;
import patterns.builder.concrete.Directeur;
import patterns.builder.concrete.LiasseDocuments;
import patterns.builder.concrete.MonteurLiasseDocumentsHtml;
import patterns.builder.concrete.MonteurLiasseDocumentsPdf;

public class Client {

    public static void main(String[] args) {
        LiasseDocuments liasseDocumentsA;
        LiasseDocuments liasseDocumentsB;

        System.out.println("\n\n==> Construction de la liasse de documents A");
        MonteurLiasseDocuments monteurPdf = new MonteurLiasseDocumentsPdf();
        Directeur directeurA = new Directeur(monteurPdf);
        liasseDocumentsA = directeurA.construireDocument();
        liasseDocumentsA.affiche();

        System.out.println("\n\n==> Construction de la liasse de documents B");
        MonteurLiasseDocuments monteurHtml = new MonteurLiasseDocumentsHtml();
        Directeur directeurB = new Directeur(monteurHtml);
        liasseDocumentsB = directeurB.construireDocument();
        liasseDocumentsB.affiche();

    }

}
