import java.util.Locale;
import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        if (primeiroNumero == segundoNumero) {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são iguais!");
        }
    }
}
