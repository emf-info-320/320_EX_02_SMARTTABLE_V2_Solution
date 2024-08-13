# Tableaux dynamiques

## Objectifs

- Découverte des tableaux dynamiques (`ArrayList`) :
  - leur utilité
  - leur caractéristiques
  - leur fonctionnement
- Extension de la "caisse à outil développeur" de l'apprenti avec ce nouvel outil très pratique et facile d'emploi
- Amélioration de la capacité à résoudre des problèmes (algorithmique simple)
- Compréhension et expérimentation de toutes les particularités des tableaux associatifs afin de les maîtriser
- Découverte de variantes spécifiques de tableaux dynamiques (version avec valeurs triées, ...)

## Contenu

Ce projet gitté contient :

- **de la théorie et documentation**, afin de découvrir et comprendre le principe de fonctionnement de ces tableaux dynamiques puissants et faciles à utiliser.
- **plusieurs exercices progressifs** pour découvrir ce nouvel outil et, ensuite, pour progressivement donner des perspectives en l'utilisant afin de résoudre quelques problèmes d'une difficulté progressive.

## Principes d'utilisation

Les postes de travail pouvant être refaits à tout moment, le travail pouvant être commencé à l'EMF et poursuivi à la maison ou le contraire, ..., l'idée est de `commit`/`push` au moins 1x en fin de journée afin que le cloud soit toujours la source de référence **à jour** (comme déjà entraîné au 319 et D400).

> [!WARNING]
> Il est très important de **prendre le temps de bien lire et de comprendre la documentation initiale** au sujet de ces tableaux dynamiques avant d'aller plus loin, c'est-à-dire **avant de plonger dans les exercices**  !

## *Découverte des ArrayLists*
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

## *Utilisation concrête des ArrayLists*
Ex1 - [TableSmart](src/ArrayList/README_SmartTable.md)
