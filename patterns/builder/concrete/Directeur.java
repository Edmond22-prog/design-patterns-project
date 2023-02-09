package patterns.builder.concrete;

import patterns.builder.abstract_.MonteurLiasseDocuments;
import patterns.singleton.LiasseDocuments;

public class Directeur {
    protected MonteurLiasseDocuments monteur;

    public Directeur(MonteurLiasseDocuments monteur) {
        this.monteur = monteur;
    }

    public LiasseDocuments construireDocument(){
        monteur.monterDemandeImmatriculation();
        monteur.monterCertificatCession();
        monteur.monterBonCommande();
        return monteur.obtenirLiasseDocuments();
    }
}
