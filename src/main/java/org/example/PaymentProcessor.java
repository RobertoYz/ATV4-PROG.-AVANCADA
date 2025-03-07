package org.example;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPaymentDOPROCESSOR(double amount){
        if(paymentStrategy != null){
            paymentStrategy.processPayment(amount);
        }else{
            System.out.println("MÉTODO DE PAGAMENTO NÃO ESCOLHIDO");
        }
    }
}
