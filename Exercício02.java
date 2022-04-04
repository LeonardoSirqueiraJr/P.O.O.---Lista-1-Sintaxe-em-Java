

import java.util.Scanner;


public class Exercício02 {
   public static void main(String[] args) {     
        Scanner teclado = new Scanner(System.in); // leitor do teclado
        System.out.println ("Insira os valores de R, S e T: ");
        float R, S, T;
        R = teclado.nextFloat ();
        S = teclado.nextFloat ();
        T = teclado.nextFloat ();
    
        if (R>S && R>T){
            System.out.println (R);
        } 
        else if (S>R && S>T) {
            System.out.println (S);
        }
        else 
            System.out.println (T);
    
    
    }
}
