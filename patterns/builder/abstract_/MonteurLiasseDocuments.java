package patterns.builder.abstract_;

import patterns.builder.concrete.LiasseDocuments;

public abstract class MonteurLiasseDocuments {
    protected LiasseDocuments liasseDocuments;

    public LiasseDocuments obtenirLiasseDocuments() {
        return liasseDocuments;
    };

    public void monterDemandeImmatriculation() {};

    public void monterCertificatCession() {};

    public void monterBonCommande() {};

}
