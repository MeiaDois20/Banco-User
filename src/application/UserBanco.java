package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import util.ContaController;

public class UserBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja abrir sua conta bancaria(s/n)? ");
        char bancoEntrar = sc.next().charAt(0);
        sc.nextLine();
        while (Character.toLowerCase(bancoEntrar) != 's' && Character.toLowerCase(bancoEntrar) != 'n') {
            System.out.println();
            System.out.print("Deseja abrir sua conta bancaria(s/n)? ");
            bancoEntrar = sc.next().charAt(0);
        }
            if (Character.toLowerCase(bancoEntrar) == 's') {
                System.out.print("Digite o número da conta: ");
                int numeroConta = sc.nextInt();
                sc.nextLine();

                System.out.print("Digite o nome do titular: ");
                String titular = sc.nextLine();

                Conta usuario = new Conta(numeroConta, titular);
                ContaController controller = new ContaController(sc);
                System.out.print("Deseja ver o menu de opções(s/n)? ");
                char opcoes = sc.next().charAt(0);
                sc.nextLine();
                System.out.println();
                if (opcoes == 's') {
                    int escolha;
                    do {
                        System.out.println("<------------>");
                        System.out.println("MENU:");
                        System.out.println("Ver conta(1)");
                        System.out.println("Depósitar(2)");
                        System.out.println("Saque(3)");
                        System.out.println("Sair(4)");
                        System.out.println("<------------>");
                        escolha = sc.nextInt();

                        double valor;
                        switch (escolha) {
                            case 1:
                                System.out.println(usuario);
                                break;

                            case 2:
                                System.out.print("Digite um valor para depósito: ");
                                valor = sc.nextDouble();
                                controller.deposito(usuario, valor);
                                sc.nextLine();
                                System.out.println();
                                break;

                            case 3:
                                if (usuario.getValor() > 0.0) {
                                    System.out.print("Digite um valor para saque: ");
                                    valor = sc.nextDouble();
                                    controller.saque(usuario, valor);
                                    System.out.println();
                                } else {
                                    System.out.println("Sem saldo para saque.");
                                }
                                break;

                            case 4:
                                System.out.println("Saindo do aplicativo.");
                                break;

                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    } while (escolha != 4);
                }
            }

        sc.close();
    }
}
