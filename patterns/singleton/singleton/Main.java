package singleton;

import java.util.List;

import javax.swing.text.Document;

import singleton.classe.LiasseVierge;
import singleton.classe.Liasses;;

public class Main {
    public static void main(String[] args) {
        LiasseVierge liasseVierge = LiasseVierge.Instance();
        liasseVierge.ajouter(new BonDeCommande());
        liasseVierge.retirer(new certification() );
        liasseVierge.ajouter(new DemmandeImmatriculation());

        List<Document> documentsVierges = liasseVierge.getDocuments();

    }
}
