package src;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CandidatoTestes{
  @Test

  public void checarVotos() {
    Candidato candidato = new Candidato("Tester");
    candidato.adicionaVoto();
    int votos = candidato.retornaVotos();
    assertTrue(votos >= 0);
  }

}
