package POO_Kris.java;

public class VariavelMeuNome {

    public static void main (String [] args) {
        String primeiroNome = "Kristyson" ;
        String segundoNome = "Alpino" ;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome) ;
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

    
}
