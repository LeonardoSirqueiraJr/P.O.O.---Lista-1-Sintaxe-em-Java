
import java.util.Scanner;

public class Exercício8 {
    
    public static void main(String[] args) {
        System.out.println("Qual vai ser o tamanho da matriz? ");
        Scanner teclado = new Scanner(System.in);
        int tamanho = teclado.nextInt ();
        System.out.println("Insira os valores da matriz da esquerda para a direita e de cima para baixo: ");
        
        int soma_referencia = 0;
        int soma_L;
        int soma_C;
        int soma_D_P = 0;
        int soma_D_S = 0;
        
        int [][] matriz = new int [tamanho][tamanho] ;
        
        for (int i = 0 ; i <tamanho; i++){
            for (int j=0; j<tamanho; j++){
                int entradas = teclado.nextInt ();
                matriz [i][j]=entradas;
            }
            
        }    
        
        //Achando o número mágico
        for (int i = 0; i< tamanho; i++){
            soma_referencia += matriz[0][i];
        }
        
        //calcular os valores das linhas e colunas
        for (int i = 0; i<tamanho; i++){
            soma_L = 0;
            soma_C = 0;
            for (int j = 0; j<tamanho; j++){
                soma_L += matriz[i][j];
                soma_C += matriz[j][i];
            }
            if (soma_L != soma_referencia || soma_C!=soma_referencia){
                System.out.println("Não eh um Quadrado Mágico");
                System.exit(1);
            }
        }
        
        //somar as diagonais
        for (int i = 0; i < tamanho; i++){
            soma_D_P += matriz[i][i];
            soma_D_S += matriz[i][tamanho - 1- i];
            
        }
        
        //verificar se é quadrado mágico
        if (soma_D_S != soma_referencia || soma_D_P!=soma_referencia)
                System.out.println("Não eh um Quadrado Mágico");
        else 
            System.out.println("Eh um quadrado magico!");
        
        
    }
}

//INDICA ERROS NAS LINHAS 17 E 74