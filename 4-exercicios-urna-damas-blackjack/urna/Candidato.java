package urna;

public class Candidato{

  public String nome;
  public int votos;

  public Candidato(String nome){
    this.nome = nome;
    this.votos = 0;
  }

  public void adicionaVoto(){
    this.votos++;
  }

  public int retornaVotos(){
    return this.votos;
  }
}
