package patterns.builder.abstract_;

import patterns.singleton.LiasseDocuments;

public abstract class MonteurLiasseDocuments {
    protected LiasseDocuments liasseDocuments;

    public LiasseDocuments obtenirLiasseDocuments() {
        return liasseDocuments;
    };

    public void monterDemandeImmatriculation() {};

    public void monterCertificatCession() {};

    public void monterBonCommande() {};

}
