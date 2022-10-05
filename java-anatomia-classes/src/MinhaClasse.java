public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Demonstração de funcionalidades do curso de Java Básico no Bootcamp Potência Tech.");
        String primeiroNome = "Macalé";
        String segundoNome = "Tujira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}