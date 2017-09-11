package src;
import java.util.Scanner;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class Teste{
    public static void main(String[] args){

        //exemplo 1 - variável não utilizada
        int inteiro = 0 / 0;

        if(true == true)
        //exemplo 2 - auto atribuição
            inteiro = inteiro;

        System.out.println("Qualquer coisa");

    }

    //exemplo 3 - método sem finalidade
    public static void outroMetodo(int numero){
        String inutil = "inutil";
    }
}