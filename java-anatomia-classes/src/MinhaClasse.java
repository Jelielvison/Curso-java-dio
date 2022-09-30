public class MinhaClasse {
    
public static void main (String [] args) {
    String primeiroNome = "Jeliel";
    String segundoNome = "Flores";
    String terceiroNome = "Moura";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
    System.out.println(nomeCompleto);   //Utilizando o método para apresentar o nome

    System.out.println("Sem método: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome)); //Sem utilizar o método para apresentar o nome

}

public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {
    return "Com método: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
}

}
