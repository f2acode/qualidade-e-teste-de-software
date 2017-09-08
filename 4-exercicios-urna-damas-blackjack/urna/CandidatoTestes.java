package urna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CandidatoTestes{

  @Test
  public void checarVotos() {

    Candidato candidato = new Candidato("Felipe");

    assertTrue(candidato.votos == 0);
    candidato.adicionaVoto();

    assertTrue(candidato.votos == 1);
  }

  @Test
  public void checarNomeCandidato(){
    Candidato candidato = new Candidato("Felipe");

    assertTrue(candidato.nome.equals("Felipe"));

  }

}
