# Exercícios de Herança

1. [ContaBancaria, ContaCorrente e ContaPoupanca](#1-contabancaria-contacorrente-e-contapoupanca)  
2. [Automovel, Carro, Motocicleta e TesteAutomovel](#2-automovel-carro-motocicleta-e-testeautomovel)  

## 1. ContaBancaria, ContaCorrente e ContaPoupanca

Crie uma classe ContaBancaria com os atributos titular e saldo, e duas subclasses: ContaCorrente, que adiciona limiteCredito, e ContaPoupanca, que adiciona taxaJuros, implementando o método exibirInformacoes() em cada subclasse.

```java
public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class ContaCorrente extends ContaBancaria {
    private double limiteCredito;

    public ContaCorrente(String titular, double saldo, double limiteCredito) {
        super(titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    public void exibirInformacoes() {
        System.out.println("Conta Corrente");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite de Crédito: " + limiteCredito);
    }
}

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        System.out.println("Conta Poupança");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Taxa de Juros: " + taxaJuros);
    }
}
```

## 2. Automovel, Carro, Motocicleta e TesteAutomovel

Crie uma classe base chamada Automovel, contendo os atributos privados marca e potencia, e seus respectivos métodos construtores, getters e setters, além de duas subclasses, Carro e Motocicleta, com atributos numeroDePortas e cilindradas respectivamente, também com encapsulamento e construtores apropriados, finalizando com uma classe TesteAutomovel que instancie objetos dessas subclasses e exiba os valores de seus atributos.

```java
public class Automovel {
    private String marca;
    private double potencia;

    public Automovel(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}

public class Carro extends Automovel {
    private int numeroDePortas;

    public Carro(String marca, double potencia, int numeroDePortas) {
        super(marca, potencia);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
}

public class Motocicleta extends Automovel {
    private int cilindradas;

    public Motocicleta(String marca, double potencia, int cilindradas) {
        super(marca, potencia);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}

public class TesteAutomovel {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 120.0, 4);
        Motocicleta moto = new Motocicleta("Honda", 40.0, 250);

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Potência: " + carro.getPotencia());
        System.out.println("Número de portas: " + carro.getNumeroDePortas());

        System.out.println("\nMotocicleta:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Potência: " + moto.getPotencia());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
```