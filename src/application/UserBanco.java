package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class UserBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja abrir sua conta bancaria(s/n)? ");
        char bancoEntrar = sc.next().charAt(0);
        sc.nextLine();

        if (Character.toLowerCase(bancoEntrar) == 's') {
            System.out.print("Digite o número da conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome do titular: ");
            String titular = sc.nextLine();

            Conta usuario = new Conta(numeroConta, titular);

            System.out.print("Deseja ver o menu de opções(s/n)? ");
            char opcoes = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            while (opcoes != 'n') {
                System.out.println("MENU:");
                System.out.println("Ver conta(1)");
                System.out.println("Depósitar(2)");
                System.out.println("Saque(3)");
                int escolha = sc.nextInt();

                double valor;
                switch (escolha) {
                    case 1:
                        System.out.println("Dados da conta:");
                        System.out.println(usuario);
                        break;

                    case 2:
                        System.out.print("Digite um valor para depósito: ");
                        valor = sc.nextDouble();
                        while (valor < 0.0) {
                            System.out.println();
                            System.out.println("ERROR[] Valor não identificado");
                            System.out.print("Digite um valor para depósito: ");
                            valor = sc.nextDouble();
                        }
                        usuario.deposito(valor);
                        sc.nextLine();
                        System.out.println();
                        break;

                    case 3:
                        if (usuario.getValor() > 0.0) {
                            System.out.print("Digite um valor para saque: ");
                            valor = sc.nextDouble();
                            if (valor <= 0.0) {
                                System.out.println();
                                System.out.println("Não é possivel realizar o saque deste valor.");
                            } else if (valor > usuario.getValor()) {
                                System.out.println("Não é possível realizar o saque deste valor.");
                                System.out.println();
                                while (valor > usuario.getValor() || valor <= 0.0) {
                                    System.out.print("Digite um valor para saque: ");
                                    valor = sc.nextDouble();
                                    if (valor > usuario.getValor()) {
                                        System.out.println("Não é possível realizar o saque: saldo insuficiente.");
                                        System.out.println();
                                    } else if (valor <= 0.0) {
                                        System.out.println();
                                        System.out.println("ERROR[] Valor impossivel");
                                    }
                                }
                                usuario.saque(valor);
                                System.out.println();
                            } else {
                                usuario.saque(valor);
                                System.out.println();
                            }
                        } else {
                            System.out.println("Sem saldo para saque.");
                        }
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

                System.out.println();
                System.out.print("Deseja retornar para o menu(s/n)? ");
                opcoes = sc.next().charAt(0);
                sc.nextLine();
                System.out.println();
            }
        }

        sc.close();
    }
}