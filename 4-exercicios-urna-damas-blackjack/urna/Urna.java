package urna;

import java.util.ArrayList;

public class Urna{
  String vencedorEleicao;
  int vencedorVotos;
  ArrayList<Candidato> candidatos;
  boolean eleicaoAtiva;
  char opcao;

  public Urna(){
    this.vencedorEleicao = "";
    this.vencedorVotos = 0;
    this.candidatos =  new ArrayList();
    this.eleicaoAtiva = false;
    this.opcao = ' ';
  }

  public boolean validarOpcao(char opcao){
    
    if(opcao == '1' || opcao == '2'){
      this.opcao = opcao;
      return true;
    }
    return false;
  }

  public void iniciarEncerrarEleicao(){
    this.eleicaoAtiva = !this.eleicaoAtiva;
  }

  public boolean cadastrarCandidato(String nome){

    if(!nome.isEmpty()){
      Candidato candidato = new Candidato(nome);
      this.candidatos.add(candidato);
      return true;
    }else{
      return false;
    }
  }

  public boolean votar(String nome){

    int i = -1;
    for(int j = 0; j <= this.candidatos.size()-1;j++){
      System.out.println(this.candidatos.get(j).nome + nome);
      if(this.candidatos.get(j).nome.equalsIgnoreCase(nome)){
        i = j;
      }
    }
    
    if(i == -1){
      return false;
    }

    this.candidatos.get(i).votos++;
    return true;
  }

  public String mostrarResultadoEleicao(){

    String nomeVencedor = "";
    int votosVencedor = 0;

    for(int i=0;i<this.candidatos.size();i++){
      if(votosVencedor < this.candidatos.get(i).votos){
        votosVencedor = this.candidatos.get(i).votos;
        nomeVencedor = this.candidatos.get(i).nome;
      }
    }

    return "Nome vencedor: "+nomeVencedor + " Votos: " + String.valueOf(votosVencedor);
  }

  public void mostrarMenuOpcoes(){
    
    if(this.eleicaoAtiva){
      System.out.println("\t Menu de opcoes"+
      "\n\t1 - Votar" +
      "\n\t2 - Encerrar eleicao" +
      "\n\n\t - Escolha uma opcao(1 ou 2):\t");
    }else{
      System.out.print("\t Menu de opcoes"+
      "\n\t1 - Cadastrar candidato"+
      "\n\t2 - Iniciar eleicao"+
      "\n\n\t - Escolha uma opcao(1 ou 2):\t");
    }
    
  }

}
