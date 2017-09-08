package urna;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Urna urna = new Urna();
        Scanner scan = new Scanner(System.in);

        do{
            urna.mostrarMenuOpcoes();
            char opcao = scan.nextLine().charAt(0);
            
            if(urna.validarOpcao(opcao)){
                urna.opcao = opcao;
            }

            if(urna.eleicaoAtiva){
                switch(urna.opcao){
                    case '1': 
                        System.out.println("\tInforme o nome do candidato:\t");
                        boolean votado = urna.votar(scan.nextLine()); 
                        if(votado){
                            System.out.println("\tVoto computado!");
                        }else{
                            System.out.println("\tO candidato não existe!");
                        }
                    break;

                    case '2': 
                    System.out.println(urna.mostrarResultadoEleicao());
                    urna.iniciarEncerrarEleicao(); 
                    break;
                }
            }else{
                switch(urna.opcao){
                    case '1': 
                    System.out.print("\tInforme o nome do candidato:\t");
                    String nome = scan.nextLine();
                    boolean cadastrado = urna.cadastrarCandidato(nome);

                    if(cadastrado){
                        System.out.println("\tCandidato cadastrado com sucesso!");
                    }else{
                        System.out.println("\tNao foi possivel cadastrar o candidato!");
                    }
                    break;

                    case '2': 
                    urna.iniciarEncerrarEleicao(); 
                    break;
                }
            }
        
        }while((urna.eleicaoAtiva) || (urna.opcao == '1'));

    }
}