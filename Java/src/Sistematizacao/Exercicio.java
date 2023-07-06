package Sistematizacao;

import calculos.Estatistica;
import java.security.SecureRandom;
//import java.text.DecimalFormat;
import java.util.ArrayList;



public class Exercicio {
    private final static int MAX_ALUNOS = 50;
    private final static byte[] SEED = {1, 10};
    public static void main(String[] args) {
        SecureRandom randNum = new SecureRandom(SEED);
        double notaRand;
        int numAlunos = randNum.nextInt(MAX_ALUNOS);
        ArrayList<Double> notas = new ArrayList<>();


        //Adicionando as notas dos alunos
        for(int i = 0; i < numAlunos; i++) {
        notaRand = randNum.nextFloat()*10;
            notas.add(notaRand);
        }

        //Acrescetando as funções matemáticas
        double m = Estatistica.media(notas);
        double dP = Estatistica.desvioPadrao(notas);

        //Imprimindo os valores
        System.out.println("Qtd Alunos: " + numAlunos);
        System.out.printf("%n Notas:" + notas);
        System.out.printf(" %n Média das notas : " + m);
        System.out.printf("%n Desvio Padrão das notas: " + dP);
        }
}