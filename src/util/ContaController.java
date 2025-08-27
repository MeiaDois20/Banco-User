package util;
import java.util.Scanner;
import entities.Conta;

public class ContaController {
    public void deposito(Conta conta, double valor) {
        Scanner sc = new Scanner(System.in);
        while (valor < 0.0) {
            System.out.println();
            System.out.println("ERROR[] Valor não identificado");
            System.out.print("Digite um valor para depósito: ");
            valor = sc.nextDouble();
        }
        conta.deposito(valor);
    }

    public void saque(Conta conta, double valor) {
        Scanner sc = new Scanner(System.in);
        while (valor > conta.getValor() || valor <= 0.0) {
            System.out.println("ERROR[] Digite um valor valído para saque.");
            System.out.print("Digite um valor para saque: ");
            valor = sc.nextDouble();
            System.out.println();

        }
        conta.saque(valor);
    }
}
