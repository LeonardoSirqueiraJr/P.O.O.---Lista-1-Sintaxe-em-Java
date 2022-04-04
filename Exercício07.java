

import java.util.Scanner;


public class Exercício07 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int pessimas = 0;
        int ruins=0;
        int boas=0;
        int otimas=0;
        int total = 0;
        
       System.out.print("Entre com notas entre 0 e 100.");
       int nota = 0;
       
       while (nota >= 0 && nota <=100) {
           nota = teclado.nextInt();
            if (nota>=0 && nota <= 25) {
                pessimas++;
                total++;
                }
            else if (nota>25 && nota <=50 ){
                ruins++;
                total++;
                } 
            else if (nota >50 && nota <= 75){
                boas++;
                total++;
                } 
            else if ( nota>75 && nota <= 100){
                otimas++;
                total++;
                }
            else System.out.println ("O valor de resposta é inválido.");
        } 
       
             
float porcentagem_pessimas = (pessimas*100/total);
float porcentagem_ruins = (ruins*100/total);
float porcentagem_boas = (boas*100/total);
float porcentagem_otimas = (otimas*100/total);

//float aux = porcentagem_pessimas + porcentagem_ruins + porcentagem_boas + porcentagem_otimas;

System.out.println("O percentual de funcionários que votou 'pessimo' foi de " + porcentagem_pessimas + "%");
System.out.println("O percentual de funcionários que votou 'ruim' foi de " + porcentagem_ruins + "%");
System.out.println("O percentual de funcionários que votou 'boa' foi de " + porcentagem_boas + "%");
System.out.println("O percentual de funcionários que votou 'otima' foi de " + porcentagem_otimas + "%");

//System.out.print("SOMA PORCENTAGEM" + aux + "TOTAL DE NOTAS" + total);

    }}
