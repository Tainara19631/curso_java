package lista_factory_adapter_facade;

public class PayPalAdapter implements Pagamento{
    private PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI paypal){
        this.paypal = paypal;
    }

     @Override
    public void pagar() {
        paypal.sendPayment();
    }
}
