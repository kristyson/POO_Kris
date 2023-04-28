package POO_Kris.java.Basico.Exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HoraAtual {
    public static void main (String[]args){

        LocalDateTime relogio = LocalDateTime.now();

        System.out.println("O dia e hora do sistema atual é > " + relogio.toString());
    }
}
