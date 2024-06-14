package Ex_ArrayList.Partie2;

import Ex_ArrayList.Partie2.services.ListeStringIntelligente;
import Ex_ArrayList.modeles.Exercice;

public class Ex2ListeIntelligente extends Exercice {
    public Ex2ListeIntelligente() {
        super();
    }

    public void launch() {
        // On crée une instance de notre "Tableau intelligent de chaînes de caractères"
        ListeStringIntelligente ssl = new ListeStringIntelligente();

        // Ajout de données
        ssl.ajouter("Pierre"); // Sera supprimé
        ssl.ajouter("Paul");
        ssl.ajouter("Jacques"); // Sera remplacé par Jean-Jacques
        ssl.ajouter("Jacques"); // Sera remplacé par Jean-Jacques
        ssl.ajouter("Jean"); // Sera supprimé
        ssl.ajouter("Jacques");

        // Afficher le contenu de notre tableau
        System.out.println("ETAT INITIAL...");
        afficherContenu(ssl);

        // Rechercher des données et les remplacer
        System.out.println("MODIFICATION DE DONNEES...");
        int position = ssl.premiereOccurrenceDe("Jacques");
        if (position != ListeStringIntelligente.PAS_TROUVEE) {
            ssl.modifier(position, "Jean-Jacques");
        } else {
            System.out.println("Jacques n'est pas trouvé !");
        }

        // Afficher le contenu de notre tableau
        afficherContenu(ssl);

        // Supprimer des données
        System.out.println("SUPPRESSION DE DONNEES...");
        ssl.supprimer(0);
        ssl.supprimer(0);
        ssl.supprimer(2);

        // Afficher le contenu de notre tableau
        afficherContenu(ssl);

        // Insérer des données à un endroit précis
        System.out.println("INSERTION DE DONNEES...");
        ssl.inserer(2, "Corinne");
        ssl.inserer(2, "Françoise");

        // Afficher le contenu de notre tableau
        afficherContenu(ssl);

        // Ajouter des autres données
        System.out.println("AJOUT DE DONNEES...");
        ssl.ajouter("Philippe");
        ssl.ajouter("Christophe");

        // Afficher le contenu de notre tableau
        afficherContenu(ssl);

        // Rechercher des données et les supprimer
        System.out.println("SUPPRESSION DE DONNEES...");
        position = ssl.derniereOccurrenceDe("Jacques");
        if (position != ListeStringIntelligente.PAS_TROUVEE) {
            ssl.supprimer(position);
        } else {
            System.out.println("Jacques n'est pas trouvé !");
        }

        // Afficher le contenu de notre tableau
        afficherContenu(ssl);
    }

    private void afficherContenu(ListeStringIntelligente ss) {
        System.out.println("  Voici le contenu de notre tableau d'une taille de " + ss.taille() + " cellules :");
        for (int i = 0; i < ss.taille(); i++) {
            System.out.println("  [" + i + "] = [" + ss.lire(i) + "]");
        }
    }
}
