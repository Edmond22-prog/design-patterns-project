package patterns.builder.concrete;

public class HtmlDocumentBuilder implements DocumentBuilder {

    private LiasseDocument liasseDocument;

    public HtmlDocumentBuilder() {
        this.liasseDocument = new LiasseDocument();
    }

    @Override
    public void buildDemanderImmatriculation() {
        Document demandeImmatriculation = new DocumentHtml("Demande d'immatriculation",
                "Demande d'immatriculation en HTML");
        liasseDocument.ajouterDemandeImmatriculation(demandeImmatriculation);

    }

    @Override
    public void buildCertificatCession() {
        Document certificatCession = new DocumentHtml("Certificat de cession", "Certificat de cession en HTML");
        liasseDocument.ajouterCertificatCession(certificatCession);
    }

    @Override
    public void buildBonCommande() {
        Document bonCommande = new DocumentHtml("Bon de commande", "Bon de commande en HTML");
        liasseDocument.ajouterBonCommande(bonCommande);
    }

    @Override
    public LiasseDocument getResult() {
        return liasseDocument;
    }

}
