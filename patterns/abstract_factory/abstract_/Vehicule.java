package patterns.abstract_factory.abstract_;

import java.util.Random;

public abstract class Vehicule {
    public int id;
    public String marque;
    public String couleur;
    public int puissance;
    public int prix;

    public Vehicule(String marque, String couleur, int puissance, int prix) {
        this.id = getId();
        this.marque = marque;
        this.couleur = couleur;
        this.puissance = puissance;
        this.prix = prix;
    }

    public void seDecrire() {
    }

    private void setId() {
        Random rand = new Random();
        this.id = rand.nextInt(10000);
    }

    public int getId() {
        setId();
        return this.id;
    }

}
