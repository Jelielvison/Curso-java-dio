public class MinhaClasse {
    
public static void main (String [] args) {
    String primeiroNome = "Jeliel";
    String segundoNome = "Flores";
    String terceiroNome = "Moura";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {
    return "Meu nome é: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
}

}
