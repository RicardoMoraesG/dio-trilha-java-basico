// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        int numero = leitor.nextInt();
        boolean achei = false;
        for(int index = 0; index < elementos.length; index++) {
            if (elementos[index] == numero) {
                achei = true;
                System.out.println("Achei " + numero + " na posicao " + index);
                break;
            }
        }
        if(!achei) {
            System.out.println("Numero " + numero + " nao encontrado!");
        }
    }


}
