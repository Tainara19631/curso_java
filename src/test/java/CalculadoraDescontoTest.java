import org.junit.jupiter.api.Test;

import lista_teste.CalculadoraDesconto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class CalculadoraDescontoTest {
    @Test
    public void deveManterValorParaClienteComum(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.aplicarDesconto(50.0, false);

        assertEquals(50.0, resultado);
    }

    @Test
    public void devePerpararCompraClienteVip(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.aplicarDesconto(200.0, true);

        assertEquals(180.0, resultado);
    }
    @Test 
    public void deveLancarExcecaoValorNegativo(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        assertThrows(IllegalArgumentException.class, () -> {
        calculadora.aplicarDesconto(-10.0, false);
    });
    }
}
