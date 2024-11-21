public class Main {

    // Méthode pour remplir un tableau 2D avec des valeurs aléatoires
    public static void remplirTableauAleatoire(int[][] tableau) {
        Random rand = new Random();

        // Remplir le tableau avec des valeurs aléatoires entre 0 et 100
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = rand.nextInt(101);  // Valeur aléatoire entre 0 et 100
            }
        }
    }

    // Méthode pour afficher un tableau 2D
    public static void afficherTableau(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Dimensions du tableau
        int lignes = 5;
        int colonnes = 4;
        
        // Créer un tableau 2D
        int[][] tableau = new int[lignes][colonnes];

        // Remplir le tableau avec des valeurs aléatoires
        remplirTableauAleatoire(tableau);

        // Afficher le tableau
        System.out.println("Tableau rempli avec des valeurs aléatoires :");
        afficherTableau(tableau);
    }
}