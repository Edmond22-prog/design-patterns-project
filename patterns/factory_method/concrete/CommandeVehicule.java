package patterns.factory_method.concrete;

import patterns.factory_method.abstract_.Commande;

public class CommandeVehicule extends Commande {
    public int numero;
    public String nomClient;
    public String nomVehicule;
    public int prixVehicule;
    public int quantite;

    public CommandeVehicule() {
    }

    public CommandeVehicule(String nomC, String nomV, int prixV, int q) {
        this.nomClient = nomC;
        this.nomVehicule = nomV;
        this.prixVehicule = prixV;
        this.quantite = q;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomC) {
        nomClient = nomC;
    }

    public String getNomVehicule() {
        return nomVehicule;
    }

    public void setNomVehicule(String nomV) {
        nomVehicule = nomV;
    }

    public int getPrixVehicule() {
        return prixVehicule;
    }

    public void setPrixVehicule(int p) {
        prixVehicule = p;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int q) {
        quantite = q;
    }

    public void afficher() {
        System.out.println(
                "\nCommande client " + nomClient + "\nNom du véhicule : " + nomVehicule + "\nQuantité : " + quantite);
        afficherMontant();
    }

    @Override
    protected void calculeMontant() {
        montant = prixVehicule * quantite;
    }

    @Override
    protected void calculeMontantTva() {
        montantTva = (long) (montant * 19.25);
    }
}
