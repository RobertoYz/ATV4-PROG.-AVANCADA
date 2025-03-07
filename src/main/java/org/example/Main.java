package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Digite o número da opção: ");
        int escolha = scanner.nextInt();

        System.out.println("Digite o valor de pagamento: ");
        double amount = scanner.nextDouble();

        switch (escolha){
            case 1:
                paymentProcessor.setPaymentStrategy(new PixPayment());
                break;
            case 2:
                paymentProcessor.setPaymentStrategy(new CreditCardPayment());
                break;
            case 3:
                paymentProcessor.setPaymentStrategy(new BoletoPayment());
                break;
        }
            paymentProcessor.processPaymentDOPROCESSOR(amount);
    }
}