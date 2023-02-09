package patterns.abstract_factory.abstract_;

public abstract class Scooter extends Vehicule {
    public String type;

    public Scooter(String marque, String couleur, int puissance, int prix) {
        super(marque, couleur, puissance, prix);
        this.type = "Scooter";
    }

}
