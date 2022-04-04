public class Exercício06 {
    public static void main(String[] args) {
        int fibo = 0;
        int b = 1;
        int aux;
                
        for(int i = 0; i<100; i++){
            if (fibo <=200){
                System.out.println(fibo);
                aux =  fibo;
                fibo = fibo + b;
                b = aux;
        }
    }
}}

//FIZ O CÓDIGO PARA APÓS IMPRIMIR UM RESULTADO QUE TIVESSE PASSADO DE 100. 
//FOI O QUE INTERPRETEI DO ENUNCIADO