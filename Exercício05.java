

import java.util.Scanner;


public class Exercício05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // leitor do teclado
        System.out.println ("Digite o valor inteiro: ");
        int valor = teclado.nextInt ();
        long fat = 1;
               
        if (valor > 0){
            for (int i = 1; i <=valor ; i++){
                fat = fat * i;
            }
            System.out.println ("O fatorial de " + valor + " é: " + fat);
        }
        else{System.out.println (-1);
            
        }
    }}

//PARA NÚMERO MAIORES O RESULTADO ESTÁ SAINDO NEGATIVO