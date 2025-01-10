public class devoir03 {
    public static void main(String[] args) {
        int jour = 9;
        int mois = 1;
        int annee = 2025;

        if (annee < 0 || annee > 9999) {
            System.out.println("Année invalide");
        }else if(mois < 1 || mois > 12){
            System.out.println("mois invalide");
        
            int jourMois ;
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            jourMois = 31;
            break;
            case 4 : case 6: case 9: case 11:
            jourMois = 30;
            break;
            case 2 :
            if((annee % 4 == 0 && annee % 100 !=0) || (annee % 400 ==0)){
            jourMois = 29;    
             
           } else {
            jourMois = 28;
           } if (jour < 1 || jour > jourMois) {
            System.out.println("jour invalide");
            return ;
        }
        int jourDeLAn = jour;
        switch (mois - 1) { // Ajouter les jours des mois précédents
            case 11: jourDeLAn += 30; // Novembre
            case 10: jourDeLAn += 31; // Octobre
            case 9:  jourDeLAn += 30; // Septembre
            case 8:  jourDeLAn += 31; // Août
            case 7:  jourDeLAn += 31; // Juillet
            case 6:  jourDeLAn += 30; // Juin
            case 5:  jourDeLAn += 31; // Mai
            case 4:  jourDeLAn += 30; // Avril
            case 3:  jourDeLAn += 31; // Mars
            case 2:  jourDeLAn += (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) ? 29 : 28; // Février
            case 1:  jourDeLAn += 31; // Janvier
            case 0:  break; // Aucun mois précédent
        }

        // Affichage du résultat
        System.out.println("Nous sommes le jour N°" + jourDeLAn + " de l'année " + annee + ".");
    }
}
        }

}