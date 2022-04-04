

import java.util.Scanner;

public class Exercício01 {
      
    public static void main(String[] args) {     
        Scanner teclado = new Scanner(System.in); // leitor do teclado
        System.out.println ("Diga quantos números quer avaliar: ");
        int total = teclado.nextInt ();
        System.out.println ("Insira os números inteiros que quer avaliar: ");
        int numeros;
        
        for (int i = 0; i<total; i++){
            numeros = teclado.nextInt ();
            if (numeros < 0) System.out.println ("Negativo");
           
            else System.out.println ("Positvo");
            }   
     System.out.println ("Lista avaliada com sucesso!");    
    }
           
    }