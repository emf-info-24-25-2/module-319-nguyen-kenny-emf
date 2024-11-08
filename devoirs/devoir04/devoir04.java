public class devoir04 {


    public static void main(String[] args) {
        int year = 2024;   
        int month = 11;    
        int day = 50;       

        if (year < 0 || year > 9999) {
            System.out.println("L'année " + year + " est invalide.");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Le mois " + month + " est invalide.");
            return;
        }

        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDay = 0;

        switch (month) {
            case 1: 
            case 3:
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                maxDay = 31;
                break;
            case 4:  // Avril
            case 6:  // Juin
            case 9:  
            case 11: 
                maxDay = 30;
                break;
            case 2:  // Février
                if (isLeapYear) {
                    maxDay = 29;  // Année bissextile
                } else {
                    maxDay = 28;  // Année non bissextile
                }
                break;
            default:
                System.out.println("Le mois " + month + " est invalide.");
                return;
        }

        if (day < 1 || day > maxDay) {
            System.out.println("Le jour " + day + " est invalide pour le mois " + month + ".");
            return;
        }

        // Affichage de la date plus lisible pour l'utilisateur
        String monthName = "";
        switch (month) {
            case 1: monthName = "Janvier"; break;
            case 2: monthName = "Février"; break;
            case 3: monthName = "Mars"; break;
            case 4: monthName = "Avril"; break;
            case 5: monthName = "Mai"; break;
            case 6: monthName = "Juin"; break;
            case 7: monthName = "Juillet"; break;
            case 8: monthName = "Août"; break;
            case 9: monthName = "Septembre"; break;
            case 10: monthName = "Octobre"; break;
            case 11: monthName = "Novembre"; break;
            case 12: monthName = "Décembre"; break;
        }
        System.out.println("La date du jour est : " + day + " " + monthName + " " + year);
    }
}