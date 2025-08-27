## 💳 Banco do Usuário
**Um aplicativo de console em Java que simula operações bancárias básicas, ideal para quem está aprendendo a linguagem. O programa permite que o usuário crie uma conta, realize depósitos e saques com validação e taxas, e visualize os dados da conta, tudo por meio de um menu interativo no terminal.**

**Este projeto é uma excelente ferramenta para praticar a lógica de programação, controle de fluxo e Programação Orientada a Objetos (POO) em Java.**

## 📂 Estrutura do Projeto
- **O projeto está organizado em pacotes para uma melhor organização e separação de responsabilidades.**
```
banco-usuario
├── application
│   └── UserBanco.java      # Classe principal com o menu interativo
├── entities
│   └── Conta.java          # Modelo da conta bancária
└── util
    └── ContaController.java    # Classe auxiliar para as operações
```
## 🧠 Visão Geral das Classes
**🧾 Conta.java**
- Esta classe representa uma conta bancária com os seguintes atributos:
```
 private int numConta;

 private String titular;

 private double valor;

 private final double TAXA = 5.0;
```
## Métodos principais:
- **deposito(double valor):** Adiciona um valor ao saldo da conta.

- **saque(double valor):** Remove um valor do saldo.

**Se o valor do saque for até R$50,00, não há taxa.**

**Se o valor do saque for acima de R$50,00, aplica-se uma taxa fixa de R$5,00.**

- **toString():** Retorna uma string formatada com todos os dados da conta.

## 🧾 UserBanco.java
**A classe principal do projeto, responsável por toda a interação com o usuário via terminal.**

## Fluxo principal:
**Pergunta se o usuário deseja abrir uma conta.**

**Solicita o número da conta e o nome do titular.**

**Exibe um menu de opções em um loop, permitindo que o usuário realize diversas operações até que decida sair.**

## 🧾 ContaController.java
- **Esta classe auxiliar centraliza a lógica de validação para as operações de depósito e saque, garantindo que o UserBanco.java se concentre apenas na interação com o usuário.**

## Métodos:
- **deposito(Conta conta, double valor): Valida se o valor do depósito é positivo.**

- **saque(Conta conta, double valor): Valida se o valor do saque é positivo e se há saldo suficiente na conta.**

## 🔧 Funcionalidades
**✅ Criação de Conta:** O usuário informa o número da conta e o nome do titular.

**💰 Depósito:** Apenas valores positivos são aceitos. A validação é realizada na classe ContaController.

## 🏧 Saque:

Aplica-se uma taxa de R$5,00 para saques acima de R$50,00.

É necessário ter saldo suficiente para realizar a operação. A validação também é feita na classe ContaController.

📄 Visualização de Conta: Exibe o número, o nome do titular e o saldo atual.

⚠️ Validações: Impede depósitos negativos e saques de valor inválido ou sem saldo suficiente.

💻 Como Executar
Pré-requisitos
Java Development Kit (JDK) 8 ou superior.

Terminal ou uma IDE com suporte a Java (como IntelliJ IDEA, Eclipse ou VS Code).

Passo a passo
Clone este repositório ou copie os arquivos UserBanco.java, Conta.java e ContaController.java para a estrutura de pacotes correta.

Navegue até a pasta raiz do projeto (banco-usuario/).

## Compile os arquivos:
```
javac application/UserBanco.java entities/Conta.java util/ContaController.java
```
## Execute o programa:

```
java application.UserBanco
💡 Exemplo de Uso
Deseja abrir sua conta bancaria(s/n)? s
Digite o número da conta: 101
Digite o nome do titular: Maria Souza
Deseja ver o menu de opções(s/n)? s

<------------>
MENU:
Ver conta(1)
Depósitar(2)
Saque(3)
Sair(4)
<------------>
2
Digite um valor para depósito: 300

<------------>
MENU:
Ver conta(1)
Depósitar(2)
Saque(3)
Sair(4)
<------------>
1
Conta: 101
Titular: Maria Souza
Saldo: $ 300.00
<------------>
MENU:
Ver conta(1)
Depósitar(2)
Saque(3)
Sair(4)
<------------>
3
Digite um valor para saque: 80
<------------>
MENU:
Ver conta(1)
Depósitar(2)
Saque(3)
Sair(4)
<------------>
1
Conta: 101
Titular: Maria Souza
Saldo: $ 215.00
```
👤 Autor: Thalys Ravel

📄 Licença: Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE para mais detalhes.
