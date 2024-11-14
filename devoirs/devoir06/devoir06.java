package devoirs.devoir06;

import java.util.Random;

public class devoir06 {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 6;
    public static final int VALEUR_MAX = 50; 
    public static final int VALEUR_RECHERCHEE = 7;
    
    public static int[] genereTableau(int min, int max, int taille) {
            Random random = new Random();
        int[] tableau = new int[taille];
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;
        }
        return tableau;
    }

    // Méthode pour trouver la valeur minimale dans un tableau
    public static int rechercheMin(int[] pomme) {
        int min = pomme[0];
        for (int valeur : pomme) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    // Méthode pour trouver la valeur maximale dans un tableau
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

    // Méthode pour rechercher une valeur spécifique dans un tableau
    public static int rechercheValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Initialisation du tableau avec des valeurs aléatoires
        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);

        // Affichage du contenu du tableau
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = [" + tableau[i] + "]");
        }

        // Affichage du minimum et du maximum
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);
        System.out.println("La plus grande valeur trouvée est : " + max);

        // Recherche de la valeur spécifique et affichage de sa position
        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + position + "] du tableau");
    }
}
 

    


