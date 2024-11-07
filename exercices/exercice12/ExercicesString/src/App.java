public class App {
    public static void main(String[] args) throws Exception {

        // affectation variable maChaineDeCaractere
            String maChaineDeCaractere = "voici du contenu stocké dans un Strig";
            
        System.out.println("nombre de caractères contenu dans la variable maChaineDeCaractere" + maChaineDeCaractere.length());
        System.out.println("Le mot \"contenu\" commence a la position" + maChaineDeCaractere.indexOf("contenu"));
        System.out.println("la position 10 contient la lettre : " + maChaineDeCaractere.charAt(10));
    
    
    
    //affectation d'une varibale "monPrénom"
        String monPrenom = "test";
    for(int i = 0; i < monPrenom.length(); i++)
        System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        
        }    
    }


