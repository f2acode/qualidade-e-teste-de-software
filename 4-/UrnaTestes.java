package src;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UrnaTestes{
  @Test

  public void checarResultadoEleicao() {
    Urna urna = new Urna();
    String resultadoFavor = urna.resultadoEleicao(1, 2);
    assertEquals("A favor ganhou", resultado);
    String resultadoContra = urna.resultadoEleicao(2, 1);
    assertEquals("Contra ganhou", resultado);
  }

}
