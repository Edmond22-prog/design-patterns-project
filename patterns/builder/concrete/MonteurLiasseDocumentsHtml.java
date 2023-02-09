package patterns.builder.concrete;

import patterns.builder.abstract_.MonteurLiasseDocuments;
import patterns.singleton.LiasseDocuments;

public class MonteurLiasseDocumentsHtml extends MonteurLiasseDocuments {

    public MonteurLiasseDocumentsHtml() {
        liasseDocuments = LiasseDocuments.getInstance();
    }

    @Override
    public void monterDemandeImmatriculation() {
        DocumentHtml demandeImmatriculation = new DocumentHtml("Demande Immatriculation");
        liasseDocuments.mettreDemandeImmatriculation(demandeImmatriculation);
    }

    @Override
    public void monterCertificatCession() {
        DocumentHtml certificatCession = new DocumentHtml("Certificat Cession");
        liasseDocuments.mettreCertificatCession(certificatCession);
    }

    @Override
    public void monterBonCommande() {
        DocumentHtml bonCommande = new DocumentHtml("Bon Commande");
        liasseDocuments.mettreBonCommande(bonCommande);
    }
}
