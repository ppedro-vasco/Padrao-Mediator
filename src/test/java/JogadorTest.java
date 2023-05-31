import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {
    @Test
    void devePedirAcaoMovimento() {
        Jogador jogador = new Jogador();
        assertEquals("O pedido: 'ande' está sendo executado.\n O creep companion está andando.", jogador.pedirMovimentoCreep("'ande' "));
    }

    @Test
    void devePedirAcaoAtaqueo() {
        Jogador jogador = new Jogador();
        assertEquals("O pedido: 'ataque' está sendo executado.\n O creep companion está atacando.", jogador.pedirAtaqueCreep("'ataque' "));
    }
}