package patterns.factory_method.abstract_;

public abstract class FabriqueCommande {
    
    public Commande obtenirCommande() {
        return creerCommande();
    }

    public Commande obtenirCommande(String nomClient, String nomVehicule, int prixVehicule, int quantite) {
        return creerCommande(nomClient, nomVehicule, prixVehicule, quantite);
    }

    protected abstract Commande creerCommande(String nomC, String nomV, int prixV, int q);

    protected abstract Commande creerCommande();
}
