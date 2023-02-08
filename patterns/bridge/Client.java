package patterns.bridge;

import patterns.bridge.abstract_.Formulaire;
import patterns.bridge.concrete.FormulaireClient;
import patterns.bridge.concrete.FormulaireCommande;
import patterns.bridge.concrete.HTML;
import patterns.bridge.concrete.Widget;

public class Client {
    
    public static void main(String [] args) {

        Formulaire formulaireA1 = new FormulaireCommande(new Widget());
        formulaireA1.construire();

        Formulaire formulaireA2 = new FormulaireClient(new Widget());
        formulaireA2.construire();

        Formulaire formulaireB1 = new FormulaireCommande(new HTML());
        formulaireB1.construire();

        Formulaire formulaireB2 = new FormulaireClient(new HTML());
        formulaireB2.construire();
    }
}
