package patterns.singleton;

import patterns.builder.abstract_.Document;

public class LiasseDocuments {
    // Implémentation du pattern singleton
    private static LiasseDocuments instance;

    private Document demandeImmatriculation;
    private Document certificatCession;
    private Document bonCommande;

    private LiasseDocuments() {}

    public static LiasseDocuments getInstance() {
        if (instance == null) {
            instance = new LiasseDocuments();
        }
        return instance;
    }

    public void affiche() {
        demandeImmatriculation.affiche();
        certificatCession.affiche();
        bonCommande.affiche();
    }

    public void mettreDemandeImmatriculation(Document demandeImmatriculation) {
        this.demandeImmatriculation = demandeImmatriculation;
    }

    public void mettreCertificatCession(Document certificatCession) {
        this.certificatCession = certificatCession;
    }

    public void mettreBonCommande(Document bonCommande) {
        this.bonCommande = bonCommande;
    }

}
