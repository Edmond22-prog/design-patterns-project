package patterns.builder.concrete;

public class PdfDocumentBuilder implements DocumentBuilder {

    private LiasseDocument liasseDocument;

    public PdfDocumentBuilder() {
        this.liasseDocument = new LiasseDocument();
    }

    @Override
    public void buildDemanderImmatriculation() {
        Document demandeImmatriculation = new DocumentPdf("Demande d'immatriculation",
                "Demande d'immatriculation en PDF");
        liasseDocument.ajouterDemandeImmatriculation(demandeImmatriculation);

    }

    @Override
    public void buildCertificatCession() {
        Document certificatCession = new DocumentPdf("Certificat de cession", "Certificat de cession en PDF");
        liasseDocument.ajouterCertificatCession(certificatCession);
    }

    @Override
    public void buildBonCommande() {
        Document bonCommande = new DocumentPdf("Bon de commande", "Bon de commande en PDF");
        liasseDocument.ajouterBonCommande(bonCommande);
    }

    @Override
    public LiasseDocument getResult() {
        return liasseDocument;
    }

}
