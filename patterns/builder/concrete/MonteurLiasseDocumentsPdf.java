package patterns.builder.concrete;

import patterns.builder.abstract_.MonteurLiasseDocuments;
import patterns.singleton.LiasseDocuments;

public class MonteurLiasseDocumentsPdf extends MonteurLiasseDocuments {

    public MonteurLiasseDocumentsPdf() {
        liasseDocuments = LiasseDocuments.getInstance();
    }
    
    @Override
    public void monterDemandeImmatriculation() {
        DocumentPdf demandeImmatriculation = new DocumentPdf("Demande Immatriculation");
        liasseDocuments.mettreDemandeImmatriculation(demandeImmatriculation);
    }

    @Override
    public void monterCertificatCession() {
        DocumentPdf certificatCession = new DocumentPdf("Certificat Cession");
        liasseDocuments.mettreCertificatCession(certificatCession);
    }

    @Override
    public void monterBonCommande() {
        DocumentPdf bonCommande = new DocumentPdf("Bon Commande");
        liasseDocuments.mettreBonCommande(bonCommande);
    }

}
