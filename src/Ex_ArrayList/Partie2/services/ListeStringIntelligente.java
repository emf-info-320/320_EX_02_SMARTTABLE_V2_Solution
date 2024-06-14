package Ex_ArrayList.Partie2.services;

import java.util.ArrayList;

/**
 * Exercice "TableauSmart", reprendre en main les fondamentaux de Java. Cette
 * classe représente un "Tableau intelligent
 * de chaînes de caractères" pouvant contenir tant des nulls que des chaînes
 * valides. Ce tableau intelligent se
 * redimensionne automatiquement à chaque opération d'ajout, de suppression, ...
 * de telle manière que sa taille
 * correspond toujours au nombre d'éléments qu'il contient effectivement.
 */
public class ListeStringIntelligente {

    public final static int PAS_TROUVEE = -1;

    /**
     * La seule structure de données utilisée pour implémenter notre "tableau
     * intelligent".
     */
    private ArrayList<String> valeurs;

    /**
     * Constructeur de notre classe "Tableau intelligent de chaînes de caractères".
     * Ce constructeur prépare un tableau
     * vide car pour l'instant il n'y a encore aucun contenu.
     */
    public ListeStringIntelligente() {
        valeurs = new ArrayList<String>();
    }

    /**
     * Constructeur de notre classe "Tableau intelligent de chaînes de caractères".
     * Ce constructeur prépare un tableau
     * de même taille et avec le même contenu que celui qu'il reçoit en paramètres.
     *
     * @param contenuInitial une autre tableau intelligent de chaînes de caractères
     *                       qu'il faut "copier"
     */
    public ListeStringIntelligente(ListeStringIntelligente contenuInitial) {
        if (contenuInitial != null) {
            // Là on n'a même pas besoin de copier élément par élément, il y a déjà un
            // constructeur qui fait le travail pour nous :-)
            valeurs = new ArrayList<String>(contenuInitial.valeurs);
            //
            // valeurs = new ArrayList<String>();
            // for ( String elementDansLautreListe : contenuInitial.valeurs) {
            // this.valeurs.add( elementDansLautreListe );
            // }
        } else {
            valeurs = new ArrayList<String>();
        }
    }

    /**
     * Retourne le nombre de chaînes de caractères contenues dans notre "tableau
     * intelligent". Ce nombre retourné est
     * identique au nombre de cases de notre tableau intelligent puisqu'il n'est
     * jamais ni plus grand ni plus petit que
     * le nombre de chaînes de caractères (null y compris) à stocker.
     *
     * @return le nombre de chaînes de caractères présentes (nulls y compris)
     */
    public int taille() {
        return valeurs.size();
    }

    /**
     * Retourne la chaîne de caractères à la position indiquée de notre "tableau
     * intelligent".
     *
     * @param position la position (0..N-1) que l'on souhaite lire
     * @return le contenu de notre "tableau intelligent" à cette position si elle
     *         est valable (0..N-1), ou null si cette
     *         position est non valable (<0 ou >=N)
     */
    public String lire(int position) {
        String resultat = null;

        if ((position >= 0) && (position < valeurs.size())) {
            resultat = valeurs.get(position);
        }

        return resultat;
    }

    /**
     * Ajoute la chaîne de caractères à la fin de notre "tableau intelligent".
     * L'ajout se fait toujours en fin de
     * tableau, après tous les autres éléments déjà présents. Les nulls sont
     * autorisés. Le tableau est redimensionné
     * pour accueillir ce nouvel élément et donc, cette méthode n'a nul besoin de
     * valeur de retour pour informer de la
     * réussite ou échec de son travail.
     *
     * @param s la chaîne de caractères à ajouter
     */
    public void ajouter(String s) {
        valeurs.add(s);
    }

    /**
     * Insère la chaîne de caractères à la position indiquée de notre "tableau
     * intelligent". Les nulls sont autorisés.
     * Le tableau est redimensionné pour accueillir ce nouvel élément. Cette
     * insertion va décaler tous les éléments déjà
     * présents après la position indiquée afin d'accueillir celui à insérer.
     *
     * @param position la position (0..N-1) où l'on souhaite insérer la chaîne de
     *                 caractères
     * @param s        la chaîne de caractères à insérer
     * @return faux si la position est une position non valable (<0 ou >=N), vrai
     *         autrement
     */
    public boolean inserer(int position, String s) {
        boolean resultat = false;

        if ((position >= 0) && (position < valeurs.size())) {
            valeurs.add(position, s);
            resultat = true;
        }

        return resultat;
    }

    /**
     * Modifie la chaîne de caractères à la position indiquée de notre "tableau
     * intelligent". Les nulls sont autorisés.
     *
     * @param position la position (0..N-1) où l'on souhaite modifier la chaîne de
     *                 caractères contenue
     * @param s        la nouvelle chaîne de caractères à cette position
     * @return faux si la position est une position non valable (<0 ou >=N), vrai
     *         autrement
     */
    public boolean modifier(int position, String s) {
        boolean resultat = false;

        if ((position >= 0) && (position < valeurs.size())) {
            // On modifie ce qui se trouve à cet endroit-là
            valeurs.set(position, s);

            // Tout s'est bien passé !
            resultat = true;
        }

        return resultat;
    }

    /**
     * Supprime la chaîne de caractères à la position indiquée de notre "tableau
     * intelligent". Le tableau est
     * redimensionné en conséquence.
     *
     * @param position la position (0..N-1) que l'on souhaite supprimer
     * @return faux si la position est une position non valable (<0 ou >=N), vrai
     *         autrement
     */
    public boolean supprimer(int position) {
        boolean resultat = false;

        if ((position >= 0) && (position < valeurs.size())) {
            valeurs.remove(position);

            // Tout s'est bien passé !
            resultat = true;
        }

        return resultat;
    }

    /**
     * Retourne la 1ère position où l'on trouve la chaîne de caractères indiquée
     * dans notre "tableau intelligent". Un
     * null peut également être recherché.
     *
     * @param s la chaîne de caractères recherchée
     * @return la position (0..N-1) trouvée, ou la constante PAS_TROUVEE autrement
     */
    public int premiereOccurrenceDe(String s) {
        return valeurs.indexOf(s);
    }

    /**
     * Retourne la dernière position où l'on trouve la chaîne de caractères indiquée
     * dans notre "tableau intelligent".
     * Un null peut également être recherché.
     *
     * @param s la chaîne de caractères recherchée
     * @return la position (0..N-1) trouvée, ou la constante PAS_TROUVEE autrement
     */
    public int derniereOccurrenceDe(String s) {
        return valeurs.lastIndexOf(s);
    }

    /**
     * Convertit notre "tableau intelligent" en un tableau standard de chaînes de
     * caractères Java. Attention, on
     * retourne un nouveau tableau, pas celui qu'on utilise nous-même.. car sinon on
     * ne pourrait pas le modifier sans
     * nous impacter nous-même.
     *
     * @return un tableau standard de chaînes de caractères Java avec le même
     *         contenu
     */
    public String[] toTable() {
        return valeurs.toArray(new String[valeurs.size()]);
    }
}
