import java.util.Scanner;

public class devoir05 {

    public static void main(String[] args) {
        int nombreMystere = (int) (Math.random() * (100 - 1 + 1)) + 1;
        
        Scanner scanner = new Scanner( System.in );
        int valeur ;
        do{
        System.out.println("Veuillez entrer un nombre :");
        valeur = scanner.nextInt();
            if (valeur == nombreMystere) {
                System.out.println("Bravo, trouvé!");
            } else if (valeur < nombreMystere){
                System.out.println("trop petit!");
            } else if (valeur > nombreMystere){
                System.out.println("trop grand !");
            }
        } while (valeur != nombreMystere);
        scanner.close();
    }
}