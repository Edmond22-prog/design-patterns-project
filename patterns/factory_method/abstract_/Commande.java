package patterns.factory_method.abstract_;

public abstract class Commande {
    // Implémentation du patron Template Method
    protected long montant;
    protected long montantTva;
    protected long montantTtc;

    public void calculeMontantTtc() {
        calculeMontant();
        calculeMontantTva();
        montantTtc = montant + montantTva;
    }

    public long obtenirMontantTtc() {
        return montantTtc;
    }

    protected void calculeMontantTva() {}

    protected void calculeMontant() {}

    public void afficherMontant() {
        System.out.println("Montant : " + montant + " FCFA");
        System.out.println("Montant TVA : " + montantTva + " FCFA");
        System.out.println("Montant TTC : " + montantTtc + " FCFA");
    }
    // Fin de l'implémentation du patron Template Method

    public void afficher() {};
    
}
