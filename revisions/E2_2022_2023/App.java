public class App {
    //declaration des constantes
   public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;
    
    //declaration d'un tableau constant  CATEGORIE_SALLE
    public static final int[] CATEGORIE_SALLE = new int[]{3,3,2,2,1,1,2,2,3,3};

    public static void main(String[] args) {
    }    
    
    public static void afficherTarifs(){
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF" );
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_TROIS + " CHF");
    }

}