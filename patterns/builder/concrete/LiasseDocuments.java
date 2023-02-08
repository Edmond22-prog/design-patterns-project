package patterns.builder.concrete;

import patterns.builder.abstract_.Document;

public class LiasseDocuments {
    Document demandeImmatriculation;
    Document certificatCession;
    Document bonCommande;

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
