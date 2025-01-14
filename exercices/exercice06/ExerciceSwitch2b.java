public class ExerciceSwitch2b {

    public static void main(String[] args) {
        int age = 11;

        switch (age) {
            case 7:
             System.out.println("poussin");
                break;
        
            case 8 : case 9:
            System.out.println("pupille");
                break;
            
            case 10: case 11:
            System.out.println("minime");
            break;
            default :
            System.out.println("inconnu");
            break;
        }
    }
}