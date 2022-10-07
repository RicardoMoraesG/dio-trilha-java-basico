
    // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

    public class Desafio2 {
        public static void main(String[] args) {
            int A, N;
            Scanner input = new Scanner(System.in);
            A = input.nextInt();
            N = input.nextInt();
            //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
            int soma = 0;
            int multiplo = A;
            while (multiplo <= N){
                soma += multiplo;
                multiplo += A;
            }
            System.out.println(soma);


        }

}
