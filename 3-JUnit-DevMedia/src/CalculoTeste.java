package src;
import junit.framework.TestCase;

public class CalculoTeste extends TestCase{
  public void testeExecutaCalculo(){
    float passaValor1 = 10;
    float passarValor2 = 5;
    float retornoEsperado = 15;

    float retornoFeito = Calculo.ExecutaCalculo(passaValor1, passarValor2);
    assertEquals(retornoEsperado, retornoFeito, 0);
  }
}
