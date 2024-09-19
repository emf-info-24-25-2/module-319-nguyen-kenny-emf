package exempleifswitch;

public class ifswitch {
    public static void main(String[] args) {
        int note =5;

        System.out.println("Ma note est "+ note); note = 5;
    
        if (note<4){
            System.out.println("Ma note est insuffisante");
        }
    else of (note<6){
        System.out.println("Ma note est suffisante mais peut etre améliorée");
    }
    else {
        System.out.println("parfait");
    }
    System.out.println("parfait");
//test avec switch
switch (note) {
    case 1:
    System.out.println("j'ai triché c'est mal!");
        
       case 2;("y'a du boulot!");
break;
    case 3:("encore un effort!")
        break;
           
}
}
}
