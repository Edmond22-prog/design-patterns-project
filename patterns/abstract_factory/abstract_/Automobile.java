package patterns.abstract_factory.abstract_;

import java.util.Random;

public abstract class Automobile extends Vehicule {
    public int id;
    public String marque;
    public String couleur;
    public int puissance;
    public int prix;

    public void seDecrire() {
    }

    public int buildId() {
        Random rand = new Random();
        return rand.nextInt(10000);

    }

    public int getId() {
        return this.id;
    }

}
