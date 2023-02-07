package patterns.abstract_factory.concrete;

import patterns.abstract_factory.abstract_.Automobile;

public class AutomobileEssence extends Automobile {
    public int id;
    public String marque;
    public String couleur;
    public int puissance;
    public int prix;

    public AutomobileEssence() {}

    public AutomobileEssence(String marque, String couleur, int puissance, int prix) {
        this.marque = marque;
        this.couleur = couleur;
        this.puissance = puissance;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void seDecrire() {
        System.out.println("Automobile " + marque + "\nType Essence\nCouleur " + couleur + "\nPuissance " + puissance +" Chevaux\nPrix : " + prix + " Fcfa");
    }
}
