package patterns.abstract_factory.abstract_;

import java.util.Random;

public abstract class Scooter extends Vehicule {
    public int id;
    public String marque;
    public String couleur;
    public int puissance;
    public int prix;

    public void seDecrire() {
    }

    public void setId() {
        Random rand = new Random();
        this.id = rand.nextInt(10000);
    }

    public int buildId() {
        Random rand = new Random();
        return rand.nextInt(10000);

    }

    public int getId() {
        return this.id;
    }

}
