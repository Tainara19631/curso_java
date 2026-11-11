package lista_teste;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVip){

        if (valorCompra <= 0.0){
            throw new IllegalArgumentException("Valor de compra não pode ser negativa!");
        }

        if(valorCompra < 100 &&  clienteVip == false){
          
            return valorCompra;
        }
        else if(clienteVip == true){
            return valorCompra * 0.90;
        }

        return valorCompra;
         
    }
}
