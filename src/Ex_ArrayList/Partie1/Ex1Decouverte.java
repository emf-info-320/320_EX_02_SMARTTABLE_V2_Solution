package Ex_ArrayList.Partie1;

import java.util.ArrayList;

import Ex_ArrayList.modeles.Exercice;

public class Ex1Decouverte extends Exercice {
    public Ex1Decouverte() {
        super();
    }

    public void launch() {
        // 1. Création et ajout d'éléments
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Pomme");
        fruits.add("Banana");
        fruits.add("Cerise");
        fruits.add("Date");
        fruits.add("Kiwi");
        System.out.print("ArrayList de fruits: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + ", ");
        }
        System.out.println("");

        // 2. Accès et modification des éléments
        System.out.println("Troisième élément: " + fruits.get(2));
        fruits.set(1, "Mirtille");
        System.out.print("ArrayList après modification: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + ", ");
        }
        System.out.println("");

        // 3. Suppression d'éléments
        fruits.remove(3);
        System.out.print("ArrayList après suppression: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + ", ");
        }
        System.out.println("");

        // 4. Recherche d'éléments
        boolean contientPomme = fruits.contains("Pomme");
        System.out.println("La liste contient 'Pomme': " + contientPomme);

        // 5. Conversion et manipulation avec des int
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.print("ArrayList de nombres: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println("");

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Somme des éléments: " + sum);

        // 6. Parcours de la liste
        System.out.println("Parcours de la liste de fruits:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("Parcours de la liste de nombres:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
