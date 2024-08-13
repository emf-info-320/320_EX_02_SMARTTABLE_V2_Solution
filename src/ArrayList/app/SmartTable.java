package ArrayList.app;

import ArrayList.services.SmartStringTable;

public class SmartTable {
    public static void main(String[] args) {
        // On crée une instance de notre "Tableau intelligent de chaînes de caractères"
        SmartStringTable sst = new SmartStringTable();

        // Ajout de données
        sst.ajouter("Pierre"); // Sera supprimé
        sst.ajouter("Paul");
        sst.ajouter("Jacques"); // Sera remplacé par Jean-Jacques
        sst.ajouter("Jacques"); // Sera remplacé par Jean-Jacques
        sst.ajouter("Jean"); // Sera supprimé
        sst.ajouter("Jacques");

        // Afficher le contenu de notre tableau
        System.out.println("ETAT INITIAL...");
        afficherContenu(sst);

        // Rechercher des données et les remplacer
        System.out.println("MODIFICATION DE DONNEES...");
        int position = sst.premiereOccurrenceDe("Jacques");
        if (position != SmartStringTable.PAS_TROUVEE) {
            sst.modifier(position, "Jean-Jacques");
        } else {
            System.out.println("Jacques n'est pas trouvé !");
        }

        // Afficher le contenu de notre tableau
        afficherContenu(sst);

        // Supprimer des données
        System.out.println("SUPPRESSION DE DONNEES...");
        sst.supprimer(0);
        sst.supprimer(0);
        sst.supprimer(2);

        // Afficher le contenu de notre tableau
        afficherContenu(sst);

        // Insérer des données à un endroit précis
        System.out.println("INSERTION DE DONNEES...");
        sst.inserer(2, "Corinne");
        sst.inserer(2, "Françoise");

        // Afficher le contenu de notre tableau
        afficherContenu(sst);

        // Ajouter des autres données
        System.out.println("AJOUT DE DONNEES...");
        sst.ajouter("Philippe");
        sst.ajouter("Christophe");

        // Afficher le contenu de notre tableau
        afficherContenu(sst);

        // Rechercher des données et les supprimer
        System.out.println("SUPPRESSION DE DONNEES...");
        position = sst.derniereOccurrenceDe("Jacques");
        if (position != SmartStringTable.PAS_TROUVEE) {
            sst.supprimer(position);
        } else {
            System.out.println("Jacques n'est pas trouvé !");
        }

        // Afficher le contenu de notre tableau
        afficherContenu(sst);
    }

    private static void afficherContenu(SmartStringTable ss) {
        System.out.println("  Voici le contenu de notre tableau d'une taille de " + ss.taille() + " cellules :");
        for (int i = 0; i < ss.taille(); i++) {
            System.out.println("  [" + i + "] = [" + ss.lire(i) + "]");
        }
    }

}
