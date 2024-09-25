import java.util.Scanner;
public class devoir03 {
    public static void main(String[] args) {
        // Déclaration des variables jour, mois et annee
        int jour = 25;
        int mois = 9;
        int annee = 2024;

        // Vérification de la validité de la date
        if (annee < 0 || annee > 9999) {
            System.out.println("Année non valide !");
            return;
        }
        if (mois < 1 || mois > 12) {
            System.out.println("Mois non valide !");
            return;
        }
        if (jour < 1 || jour > nombreDeJoursDansLeMois(mois, annee)) {
            System.out.println("Jour non valide pour ce mois !");
            return;
        }

        // Calcul du jour de l'année
        int jourDeLAn = calculerJourDeLAn(jour, mois, annee);
        System.out.println("Aujourd'hui est le jour N° " + jourDeLAn + " de l'année " + annee);
    }

    // Fonction pour calculer le jour de l'année
    public static int calculerJourDeLAn(int jour, int mois, int annee) {
        int[] joursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Si l'année est bissextile, février a 29 jours
        if (estBissextile(annee)) {
            joursParMois[1] = 29;
        }

        int jourDeLAn = 0;
        for (int i = 0; i < mois - 1; i++) {
            jourDeLAn += joursParMois[i];
        }
        jourDeLAn += jour;

        return jourDeLAn;
    }

    // Fonction pour vérifier si une année est bissextile
    public static boolean estBissextile(int annee) {
        if (annee % 4 == 0) {
            if (annee % 100 == 0) {
                if (annee % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Fonction pour obtenir le nombre de jours dans un mois donné
    public static int nombreDeJoursDansLeMois(int mois, int annee) {
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return estBissextile(annee) ? 29 : 28;
            default:
                return -1; // Mois invalide
        }
    }
}