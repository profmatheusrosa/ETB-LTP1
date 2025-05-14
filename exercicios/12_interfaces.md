# Exercício de Interfaces

1. [Interface Forma, classes Retangulo e Circulo](#1-interface-forma-classes-retangulo-e-circulo)  
2. [Interface Veiculo, classes Carro e Bicicleta](#2-interface-veiculo-classes-carro-e-bicicleta)  
3. [Interface Descontavel, classes Produto e Servico](#3-interface-descontavel-classes-produto-e-servico)  

## 1. Interface Forma, classes Retangulo e Circulo

Crie uma interface Forma com método calcularArea(). Implemente Forma nas classes Retangulo e Circulo.

```java
public interface Forma {
    double calcularArea();
}

public class Retangulo implements Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class FormaTeste {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 3);
        Forma circulo = new Circulo(2);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
```

## 2. Interface Veiculo, classes Carro e Bicicleta

Crie uma interface chamada Veiculo, com os métodos acelerar() e frear(). Em seguida, crie duas classes: Carro e Bicicleta, que implementam a interface Veiculo. Cada classe deve fornecer a implementação dos métodos acelerar() e frear(), mas com comportamentos diferentes: o Carro deve acelerar até uma certa velocidade e o Bicicleta deve simular um aumento na cadência de pedais. Crie uma classe de teste que crie instâncias de Carro e Bicicleta, e chame os métodos acelerar() e frear() em ambas as instâncias.

```java
public interface Veiculo {
    void acelerar();
    void frear();
}

public class Carro implements Veiculo {
    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        if (velocidade < 120) {
            velocidade += 20;
            System.out.println("Carro acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Carro já está na velocidade máxima!");
        }
    }

    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade -= 20;
            System.out.println("Carro freando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Carro já está parado.");
        }
    }
}

public class Bicicleta implements Veiculo {
    private int cadencia;

    public Bicicleta() {
        this.cadencia = 0;
    }

    @Override
    public void acelerar() {
        cadencia += 10;
        System.out.println("Bicicleta acelerando. Cadência atual: " + cadencia + " rpm");
    }

    @Override
    public void frear() {
        if (cadencia > 0) {
            cadencia -= 10;
            System.out.println("Bicicleta freando. Cadência atual: " + cadencia + " rpm");
        } else {
            System.out.println("Bicicleta já está parada.");
        }
    }
}

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        System.out.println("Testando Carro:");
        carro.acelerar();
        carro.acelerar();
        carro.frear();

        System.out.println("\nTestando Bicicleta:");
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.frear();
    }
}
```

## 3. Interface Descontavel, classes Produto e Servico

Crie uma interface chamada Descontavel, com o método calcularDesconto(). Em seguida, crie duas classes que implementam a interface; Produto e Servico. Ambas as classes devem implementar o método calcularDesconto(), mas com comportamentos diferentes. A classe Produto deve aplicar um desconto de 5% sobre o preço, enquanto a classe Servico deve aplicar um desconto de 10%. Crie uma classe de teste que calcule o desconto para um produto e um serviço.

```java
public interface Descontavel {
    double calcularDesconto();
}

public class Produto implements Descontavel {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }
}

public class Servico implements Descontavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.10;
    }
}

public class DescontoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto(200.0);
        Servico servico = new Servico(150.0);

        System.out.println("Desconto do produto: R$ " + produto.calcularDesconto());
        System.out.println("Desconto do serviço: R$ " + servico.calcularDesconto());
    }
}
```
