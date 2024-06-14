# Les tableaux dynamiques en Java
[Accueil](../../README.md)
## Durée : 30'

Les tableaux dynamiques en Java permettent de gérer des collections d'objets de manière flexible, en facilitant l'ajout, la suppression et la recherche d'éléments. Les principales structures de données dynamiques en Java sont `ArrayList`, `Vector`.

## ArrayList
### Description: 
Un ArrayList est une collection ordonnée qui permet de stocker des éléments et d'accéder à ceux-ci via des indices (comme un tableau classique), mais avec une taille dynamique.
### Caractéristiques:
- Taille dynamique : la taille s'ajuste automatiquement lorsque des éléments sont ajoutés ou supprimés.
- Accès rapide aux éléments par index.
- Permet les éléments dupliqués.

```Java
ArrayList<String> list = new ArrayList<String>();
list.add("Apple");
list.add("Banana");
System.out.println(list.get(0)); // Affiche "Apple"
```

## Vector
### Description: 
Vector est similaire à ArrayList mais est synchronisé, ce qui le rend thread-safe.
### Caractéristiques:
- Taille dynamique : la taille s'ajuste automatiquement lorsque des éléments sont ajoutés ou supprimés.
- Accès rapide aux éléments par index.
- Permet les éléments dupliqués.

```Java
Vector<String> vector = new Vector<String>();
vector.add("Apple");
vector.add("Banana");
System.out.println(vector.get(0)); // Affiche "Apple"

```

# Exercice de Découverte des `ArrayList`

## Objectif 
Comprendre et utiliser les différentes méthodes des `ArrayList` en Java.

## Tâches

1. **Création et ajout d'éléments**:
   - Créez une `ArrayList` de type `String`.
   - Ajoutez cinq noms de fruits différents.
   - Affichez tous les éléments de la liste.

2. **Accès et modification des éléments**:
   - Affichez le troisième élément de la liste.
   - Modifiez le deuxième élément de la liste par un autre fruit et affichez la liste mise à jour.

3. **Suppression d'éléments**:
   - Supprimez le quatrième élément de la liste.
   - Affichez la liste après la suppression.

4. **Recherche d'éléments**:
   - Vérifiez si un certain fruit (par exemple "Apple") est présent dans la liste et affichez le résultat.

5. **Conversion et manipulation avec des `int`**:
   - Créez une `ArrayList` de type `Integer`.
   - Ajoutez les nombres de 1 à 5.
   - Affichez tous les éléments de la liste.
   - Calculez la somme de tous les éléments de la liste et affichez le résultat.

6. **Parcours de la liste**:
   - Parcourez la liste de fruits avec une boucle `for` et affichez chaque élément.
   - Parcourez la liste de nombres avec une boucle `foreach` et affichez chaque élément.