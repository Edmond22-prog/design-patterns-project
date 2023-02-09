package utils;

import java.util.Scanner;

import patterns.abstract_factory.abstract_.Vehicule;
import patterns.builder.abstract_.MonteurLiasseDocuments;
import patterns.builder.concrete.Directeur;
import patterns.builder.concrete.MonteurLiasseDocumentsHtml;
import patterns.builder.concrete.MonteurLiasseDocumentsPdf;
import patterns.composite.abstract_.Societe;
import patterns.composite.concrete.Compose;
import patterns.composite.concrete.Simple;
import patterns.decorator.abstract_.DecorateurVehicule;
import patterns.decorator.concrete.DecorateurCatalogue;
import patterns.factory_method.abstract_.Commande;
import patterns.factory_method.abstract_.FabriqueCommande;
import patterns.factory_method.concrete.FabriqueCommandeVehicule;
import patterns.singleton.LiasseDocuments;

public class Menu {

    public static void showMenu(TestData data) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Rechercher un véhicule");
            System.out.println("2. Consulter le catalogue");
            System.out.println("3. Passer une commande");
            System.out.println("0. Quitter");
            System.out.print("\nVotre choix: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nRecherche de véhicule en cours...");
                    break;
                case 2:
                    System.out.println("\n********** Notre catalogue de vehicule **********\n");
                    afficherCatalogue(data);
                    break;
                case 3:
                    System.out.println("\n********** Passer une commande **********\n");
                    passerCommande(data);
                    break;
                case 0:
                    System.out.println("\nAu revoir!");
                    break;
                default:
                    System.out.println("\nChoix non valide, veuillez réessayer.");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }

    public static void passerCommande(TestData data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********** Commande **********");
        System.out.println("\nVeuillez remplir les informations suivantes:\n");

        Vehicule vehicule = null;

        while (true) {
            System.out.print("Id du vehicule: ");
            int idVehicule = sc.nextInt();
            sc.nextLine();
            vehicule = data.searchById(idVehicule);
            if (vehicule == null) {
                System.out.println("Vehicule non trouvé");
                continue;
            } else {
                break;
            }
        }
        
        Societe societe;
        System.out.print("\nNom de la société cliente: ");
        String client = sc.nextLine();

        System.out.print("\nAvez-vous des filiales? (O/N): ");
        String reponse = sc.nextLine();
        if (reponse == "O" || reponse == "o") {

            Compose societeF = new Compose(client);
            System.out.print("\nCombien de filiales avez-vous?: ");
            int nbFiliales = sc.nextInt();
            for (int i = 0; i < nbFiliales; i++) {
                System.out.print("\nNom de la filiale: ");
                String nomFiliales = sc.nextLine();
                societeF.ajouterFiliale(new Simple(nomFiliales));
            }
            societe = societeF;
        } else {
            Simple societeSF = new Simple(client);
            societe = societeSF;
        }

        System.out.print("\nQuantité a commander: ");
        int quantite = sc.nextInt();

        FabriqueCommande commandeEnCours = new FabriqueCommandeVehicule();
        Commande commande = commandeEnCours.obtenirCommande(societe.name, vehicule.marque, vehicule.prix, quantite);
        commande.calculeMontantTtc();
        commande.afficher();
        // fabriquer la liasse

        int choice2;
        do {
            System.out.println("\nFormat:");
            System.out.println("1. PDF");
            System.out.println("2. HTML");
            System.out.print("\nSpecifier le format du document: ");
            choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("\nLiasse documents PDF\n");
                    MonteurLiasseDocuments monteurPdf = new MonteurLiasseDocumentsPdf();
                    Directeur directeur = new Directeur(monteurPdf);
                    LiasseDocuments liasse = directeur.construireDocument();
                    liasse.affiche();
                    break;
                case 2:
                    System.out.println("\nLiasse documents HTML\n");
                    MonteurLiasseDocuments monteurHtml = new MonteurLiasseDocumentsHtml();
                    Directeur directeur2 = new Directeur(monteurHtml);
                    LiasseDocuments liasse2 = directeur2.construireDocument();
                    liasse2.affiche();
                    break;
                default:
                    System.out.println("\nChoix non valide, veuillez réessayer.");
                    break;
            }
        } while (choice2 != 1 && choice2 != 2);
        
        // sc.close();
    }

    public static void afficherCatalogue(TestData data) {
        System.out.println("********** Voiture ancienne **********");
        data.voitureAncienne.afficherVehicules();
        data.scooterAncien.afficherVehicules();
        
        System.out.println("********** Voiture moderne **********");
        DecorateurVehicule catalogueADecore = new DecorateurCatalogue(data.voitureAncienne);
        catalogueADecore.afficherVehicules();
        catalogueADecore = new DecorateurCatalogue(data.scooterModerne);
        catalogueADecore.afficherVehicules();

    }
}
