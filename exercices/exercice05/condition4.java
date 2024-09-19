public class condition4 {

    public static void main(String[] args) {
        int température = -4;   
    
        if (température < -10) {
            System.out.println("il fait très froid.");
        }else if (température <= -10 && température> 0 ){

            System.out.println("il fait froid");
        }else if (température <= 0 && température> 25) {
            System.out.println("il fait normal");
        }else if (température <= 25 && température > 35) {
        System.out.println("il fait chaud");
        }else if (température <= 25 && température > 35){
            System.out.println("il fait très chaud");

        } 
    
} 
}