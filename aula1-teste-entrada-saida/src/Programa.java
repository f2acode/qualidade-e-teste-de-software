package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Programa {

    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {

        try {
            BigDecimal vetorEntrada[] = new BigDecimal[3];
            BigDecimal vetorResultado[] = new BigDecimal[3];

            File folder = new File(System.getProperty("user.dir"));

            String arquivo;
            arquivo = folder + "/data/data.txt";

            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            while (br.ready()) {
                String linha = br.readLine();
                String vetor[] = linha.split("\t");

                for (int i = 0; i < 3; i++) {
                    vetorEntrada[i] = new BigDecimal(vetor[i]);
                }

                if(vetorEntrada[0].compareTo(BigDecimal.ZERO) != 0){
                  for (int i = 0; i < 3; i++) {
                    vetorResultado[i] = new BigDecimal(vetor[i+3]);
                  }
                  checarValores(vetorEntrada, vetorResultado);
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void checarValores(BigDecimal[] vetorEntrada, BigDecimal[] vetorResultado){

        BigDecimal tempo = vetorEntrada[2].divide(vetorEntrada[0].add(vetorEntrada[1]), 3, RoundingMode.UP);
        BigDecimal distanciaTremA = vetorEntrada[0].multiply(tempo);
        BigDecimal distanciaTremB = vetorEntrada[1].multiply(tempo);

        if(tempo.compareTo(vetorResultado[0]) != 0){
          System.out.println("\nErro de calculo encontrado:\n"+
          "Valores de entrada: " + vetorEntrada[0] + " " + vetorEntrada[1] +
          " " + vetorEntrada[2] +
          "\nValores de saida: " + vetorResultado[0] + " " + vetorResultado[1] +
          " " + vetorResultado[2]);
        }
    }
}
