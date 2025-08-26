💳 Banco do Usuário

Aplicativo de console em Java que simula operações bancárias básicas.
O programa permite que o usuário crie uma conta, realize depósitos e saques (com validação e taxa) e visualize os dados da conta,
tudo por meio de um menu interativo no terminal.

📌 Projeto com fins didáticos, ideal para praticar lógica, controle de fluxo e Programação Orientada a Objetos (POO) em Java.

📂 Estrutura do Projeto
banco-usuario/
├── application/
│   └── UserBanco.java   # Classe principal com o menu interativo
└── entities/
    └── Conta.java       # Modelo da conta bancária

🧠 Visão Geral das Classes
🧾 Conta.java

Representa uma conta bancária com os atributos:
```
private int numConta;
private String titular;
private double valor;
private final double TAXA = 5.0;
```

Métodos principais:

deposito(double valor) – Adiciona um valor ao saldo.

saque(double valor) – Remove um valor do saldo.

Até R$50,00 → sem taxa

Acima de R$50,00 → aplica taxa fixa de R$5,00

toString() – Retorna os dados da conta formatados.

Exemplo da regra de saque:
```
if (valor <= 50.0) {
    this.valor -= valor;
} else {
    this.valor -= valor + TAXA;
}
```
🧾 UserBanco.java

Classe responsável pela interação com o usuário via terminal.

Fluxo principal:

Pergunta se o usuário deseja abrir uma conta.

Solicita o número da conta e o nome do titular.

Exibe o menu de opções:

Ver dados da conta

Realizar depósito

Realizar saque

Exemplo de menu:
```
System.out.println("MENU:");
System.out.println("Ver conta (1)");
System.out.println("Depositar (2)");
System.out.println("Saque (3)");
```
🔧 Funcionalidades

✅ Criação de Conta – Usuário informa número da conta e nome do titular.

💰 Depósito – Apenas valores positivos são aceitos.

🏧 Saque – Segue as regras:

Até R$50,00 → sem taxa

Acima de R$50,00 → taxa fixa de R$5,00

Necessário saldo suficiente.

📄 Visualização de Conta – Exibe número, titular e saldo.

⚠️ Validações – Impede depósitos negativos e saques sem saldo suficiente.

Exemplo de validação:
```
while (valor < 0.0) {
    System.out.println("ERROR[] Valor inválido!");
    System.out.print("Digite um valor para depósito: ");
    valor = sc.nextDouble();
}
```
💻 Como Executar
✅ Pré-requisitos

Java Development Kit (JDK) 8 ou superior

Terminal ou IDE (IntelliJ IDEA, Eclipse, VS Code com suporte Java)

▶️ Passo a passo

Clone este repositório ou copie os arquivos UserBanco.java e Conta.java.

Compile os arquivos:

javac application/UserBanco.java entities/Conta.java

Execute o programa:

java application.UserBanco

💡 Exemplo de Uso
```
Deseja abrir sua conta bancária (s/n)? s
Digite o número da conta: 101
Digite o nome do titular: Maria Souza

Deseja ver o menu de opções (s/n)? s

MENU:
Ver conta (1)
Depositar (2)
Saque (3)
2
Digite um valor para depósito: 300

MENU:
1
Conta: 101
Titular: Maria Souza
Saldo: R$ 300.00

Deseja retornar ao menu (s/n)? s

MENU:
3
Digite um valor para saque: 80
Saque realizado com taxa de R$5.00

MENU:
1
Conta: 101
Titular: Maria Souza
Saldo: R$ 215.00
````
👤 Autor
Thalys Ravel

📄 Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE
 para mais detalhes.
