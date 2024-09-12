 //package exercice04;

public class EchangeValeurs {
public static void main(String[] args) {
    int variable1 = 1;
    int variable2 = 2;
System.out.println("avant échange");
System.out.println("le contenu de la variable1 est de " + variable1);
System.out.println("le contenue de la variable2 est " + variable2);
System.out.println("----TRAITRETMENT----");

int newvariable = variable1;
variable1 = variable2;
variable2 = newvariable;

System.out.println("après echange");
System.out.println("variable1 = " + variable1);
System.out.println("variable2 = " + variable2);

}
}