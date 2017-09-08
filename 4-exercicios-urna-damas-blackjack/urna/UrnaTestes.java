package urna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class UrnaTestes{

  @Test
  public void checarConstrutorUrna() {
    Urna urna = new Urna();
    assertTrue(urna.candidatos.isEmpty());
    assertFalse(urna.eleicaoAtiva);
    assertTrue(urna.vencedorEleicao == "");
    assertTrue(urna.vencedorVotos == 0);
  }

  @Test
  public void checarIniciarEncerrarEleicao(){
    Urna urna = new Urna();
    urna.iniciarEncerrarEleicao();
    assertTrue(urna.eleicaoAtiva);
    urna.iniciarEncerrarEleicao();
    assertFalse(urna.eleicaoAtiva);
  }

  @Test
  public void checarCadastrarCandidato(){
    Urna urna = new Urna();
    urna.cadastrarCandidato("Felipe");
    assertTrue((String) urna.candidatos.get(urna.candidatos.size()-1).nome == "Felipe");
  }

  @Test
  public void checarVotar(){
    Urna urna = new Urna();

    assertFalse(urna.votar("Felipe"));

    urna.cadastrarCandidato("Felipe");
    assertTrue(urna.votar("Felipe"));
  }

  @Test
  public void checarResultadoEleicao(){
    Urna urna = new Urna();

    urna.cadastrarCandidato("Felipe1");
    urna.votar("Felipe1");
    urna.votar("Felipe1");

    urna.cadastrarCandidato("Felipe2");
    urna.votar("Felipe2");

    String resultado = urna.mostrarResultadoEleicao();
    assertTrue(resultado.equalsIgnoreCase("Nome vencedor: Felipe1 Votos: 2"));
  }

  @Test
  public void checarMostrarMenuOpcoes(){
    //Checar depois como fazer com menus sem opcoes
  }

@Test
  public void checarValidarOpcao(){
    //Pesquisar metodo para digitar no terminal por meio de testes
    Urna urna = new Urna();
    char ascii;

    for(int i = 0; i <= 255; i++){
      ascii = (char)i;

      switch(ascii)
      {
        case '1': 
        assertTrue(urna.validarOpcao(ascii));
          break;

        case '2': 
        assertTrue(urna.validarOpcao(ascii));
          break;

        default: 
        assertFalse(urna.validarOpcao(ascii));
          break;
      }
    
    }

  }

}
