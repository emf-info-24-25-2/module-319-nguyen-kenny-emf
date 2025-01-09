public class devoir02 {

    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1));

        System.out.println("il y a " + remplissage + " litres à remplir.");

        while (reservoirA + reservoirB < remplissage) {

            if (reservoirA < CAPACITE_RESERVOIR_A) {
                System.out.println("Remplissage du réservoir A...");
                reservoirA++;
                System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
            } else {
                System.out.println("Remplissage du réservoir B...");
                reservoirB++;
                System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);

            }
        }
        System.out.println("Remplissage terminé!");
    }
}