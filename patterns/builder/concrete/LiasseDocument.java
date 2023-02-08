package patterns.builder.concrete;

public class LiasseDocument {
    Document demandeImmatriculation;
    Document certificatCession;
    Document bonCommande;

    public void affiche() {
        demandeImmatriculation.affiche();
        certificatCession.affiche();
        bonCommande.affiche();
    }

    public void ajouterDemandeImmatriculation(Document demandeImmatriculation) {
        this.demandeImmatriculation = demandeImmatriculation;
    }

    public void ajouterCertificatCession(Document certificatCession) {
        this.certificatCession = certificatCession;
    }

    public void ajouterBonCommande(Document bonCommande) {
        this.bonCommande = bonCommande;
    }

}
