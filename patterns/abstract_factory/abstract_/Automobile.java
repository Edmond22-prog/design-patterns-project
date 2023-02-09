package patterns.abstract_factory.abstract_;

public abstract class Automobile extends Vehicule {
    public String type;

    public Automobile(String marque, String couleur, int puissance, int prix) {
        super(marque, couleur, puissance, prix);
        this.type = "Automobile";
    }

}
