# Exercícios de Métodos

## Sumário
1. [Classe que imprime uma mensagem passada por argumento](#1-classe-que-imprime-uma-mensagem-passada-por-argumento)
2. [Classe MaiorNumero que retorna o maior valor entre dois números](#2-classe-maiornumero-que-retorna-o-maior-valor-entre-dois-números)
3. [Classe Matemática e outra classe para testar suas operações](#3-classe-matemática-e-outra-classe-para-testar-suas-operações)
4. [Classe Conta para representar uma conta corrente](#4-classe-conta-para-representar-uma-conta-corrente)
5. [Método para transferir dinheiro entre contas](#5-método-para-transferir-dinheiro-entre-contas)

## 1. Classe que imprime uma mensagem passada por argumento
Crie uma classe com um método que receba uma mensagem como argumento e a imprima no console. Crie também uma classe de teste para verificar o funcionamento do método.
```java
public class Mensagem {
    // Método que imprime uma mensagem, validando se ela é nula ou vazia
    public void imprimirMensagem(String mensagem) {
        if (mensagem == null || mensagem.isEmpty()) {
            System.out.println("Mensagem inválida.");
        } else {
            System.out.println(mensagem);
        }
    }
}

public class TesteMensagem {
    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();

        // Teste com mensagem válida
        System.out.println("Teste com mensagem válida:");
        mensagem.imprimirMensagem("Olá, mundo!");

        // Teste com mensagem vazia
        System.out.println("Teste com mensagem vazia:");
        mensagem.imprimirMensagem("");

        // Teste com mensagem nula
        System.out.println("Teste com mensagem nula:");
        mensagem.imprimirMensagem(null);
    }
}
```

## 2. Classe MaiorNumero que retorna o maior valor entre dois números
Crie uma classe com um método que receba dois números como parâmetros e retorne o maior deles. Crie também uma classe de teste para verificar o funcionamento do método.
```java
public class MaiorNumero {
    // Método que retorna o maior número entre dois valores
    public String maior(int a, int b) {
        if (a > b) {
            return "O maior número é: " + a;
        } else if (b > a) {
            return "O maior número é: " + b;
        } else {
            return "Os números são iguais: " + a;
        }
    }
}

public class TesteMaiorNumero {
    public static void main(String[] args) {
        MaiorNumero maiorNumero = new MaiorNumero();

        // Teste com números diferentes
        System.out.println(maiorNumero.maior(10, 20));
        System.out.println(maiorNumero.maior(30, 15));

        // Teste com números iguais
        System.out.println(maiorNumero.maior(25, 25));
    }
}
```

## 3. Classe Matemática e outra classe para testar suas operações
Crie uma classe com métodos para operações matemáticas básicas e outra classe para testá-los.
```java
public class Matematica {
    // Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números, com validação para divisão por zero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero.");
            return 0; // Retorna 0 como valor padrão
        }
        return a / b;
    }
}

public class TesteMatematica {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();

        // Teste das operações matemáticas
        System.out.println("Soma: " + matematica.somar(5, 3));
        System.out.println("Subtração: " + matematica.subtrair(5, 3));
        System.out.println("Multiplicação: " + matematica.multiplicar(5, 3));
        System.out.println("Divisão: " + matematica.dividir(5, 0)); // Teste com divisão por zero
    }
}
```

## 4. Classe Conta para representar uma conta corrente
Crie uma classe que represente uma conta corrente com métodos para saque, depósito e consulta de saldo.
```java
public class Conta {
    private int numero; // Número da conta
    private double saldo; // Saldo da conta
    private boolean especial; // Indica se a conta é especial

    // Métodos getters e setters para os atributos
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro: Saldo não pode ser negativo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean isEspecial() {
        return especial;
    }

    // Método para realizar saque, com validação
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Erro: Saque inválido.");
            return false;
        }
    }

    // Método para realizar depósito, com validação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro: Depósito inválido.");
        }
    }
}
```

## 5. Método para transferir dinheiro entre contas
Adicione um método para transferir dinheiro entre contas e crie uma classe de teste para verificar o funcionamento.
```java
public class Conta {
    // ...existing code...

    // Método para transferir dinheiro entre contas
    public boolean transferir(Conta destino, double valor) {
        if (valor > 0 && sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            System.out.println("Erro: Transferência inválida.");
            return false;
        }
    }
}

public class TesteTransferencia {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNumero(12345);
        conta1.setSaldo(1000.0);
        conta1.setEspecial(true);

        Conta conta2 = new Conta();
        conta2.setNumero(67890);
        conta2.setSaldo(500.0);
        conta2.setEspecial(false);

        // Imprime os saldos iniciais
        System.out.println("Saldo inicial da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo inicial da conta 2: " + conta2.getSaldo());

        // Realiza a transferência
        if (conta1.transferir(conta2, 300)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência falhou!");
        }

        // Imprime os saldos finais
        System.out.println("Saldo final da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo final da conta 2: " + conta2.getSaldo());
    }
}
```
