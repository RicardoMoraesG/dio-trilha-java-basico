// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        String Palavra1 = "", Palavra2 = "";
        boolean multiploDe3 = num % 3 == 0;
        boolean multiploDe5 = num % 5 == 0;
        if(multiploDe3){
            Palavra1 = "Fizz";
        }
        if(multiploDe5){
            Palavra2 = "Buzz";
        }
        if(!(multiploDe3 || multiploDe5)) {
            System.out.println(num);
        } else
            System.out.println(Palavra1 + Palavra2);

    }
}
