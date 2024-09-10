public class devoir01 {
    public static void main(String[] args) {
        int monAge =17;  
        boolean estMajeur;
        System.err.println("je m'appelle NGUYEN Kenny");
        if (monAge > 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }
        System.out.println("mon age est de " + monAge + " ans " );
        if (estMajeur) {
            System.out.println("je suis majeur.");
        } else {
            System.out.println("je ne suis pas encore majeur.");
        }
    }
}
