package calculos;

import java.util.ArrayList;

public class Estatistica {
    public static double media(ArrayList<Double> notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public static double desvioPadrao(ArrayList<Double> notas) {
        double media = media(notas);
        double soma = 0;
        for (double nota : notas) {
            soma += Math.pow(nota - media, 2);
        }
        double variancia = soma / notas.size();
        return Math.sqrt(variancia);
    }
}