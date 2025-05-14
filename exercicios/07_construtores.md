# Exercícios de Construtores

1. [Classe Carro](#1-classe-carro)  
2. [Segundo construtor na classe Carro](#2-segundo-construtor-na-classe-carro)  
3. [Classe Produto com dois construtores e método exibirInformacoes](#3-classe-produto-com-dois-construtores-e-método-exibirinformacoes)  
4. [Classe Data com validação no construtor](#4-classe-data-com-validação-no-construtor)  
5. [Classe Funcionario com dois construtores e classe de teste](#5-classe-funcionario-com-dois-construtores-e-classe-de-teste)  

## 1. Classe Carro
Crie uma classe Carro com os atributos modelo e potencia. Sempre que um novo objeto da classe for instanciado, será exibido uma mensagem de confirmação no console.S

```java
public class Carro {
    private String modelo;
    private double potencia;

    public Carro() {
        System.out.println("Carro criado com sucesso!");
    }
}
```

## 2. Segundo construtor na classe Carro
Adicione um segundo construtor à classe Carro, que permita passar os valores de modelo e potencia como parâmetros no momento da criação do objeto, e utilize esses valores para inicializar os atributos da classe.

```java
public class Carro {
    private String modelo;
    private double potencia;

    public Carro() {
        System.out.println("Carro criado com sucesso!");
    }

    public Carro(String modelo, double potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
        System.out.println("Carro " + modelo + " com potência " + potencia + " criado com sucesso!");
    }
}
```

## 3. Classe Produto com dois construtores e método exibirInformacoes
Crie uma classe Produto com os atributos nome, codigo, preco e quantidade, e implemente dois construtores: um que inicializa todos os atributos e outro que inicializa apenas nome e codigo, atribuindo valores padrão para os outros atributos. Adicione um método exibirInformacoes para imprimir os dados do produto e, em seguida, crie objetos na classe ProdutoTeste para testar os construtores e exibir as informações.

```java
public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 101, 2.5, 100);
        Produto p2 = new Produto("Lápis", 102);

        System.out.println("Produto 1:");
        p1.exibirInformacoes();

        System.out.println("\nProduto 2:");
        p2.exibirInformacoes();
    }
}
```

## 4. Classe Data com validação no construtor
Crie uma classe Data em Java que tenha um construtor que receba os valores correspondentes ao dia, mês e ano, e inicialize os campos da classe. Antes de inicializar a data, o construtor deve verificar se a data fornecida é válida. Caso a data seja inválida, os campos da classe devem ser configurados com valores que indiquem que a data não é válida (por exemplo, 0 para dia, mês e ano).

```java
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) return false;
        int[] diasMes = {31, (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasMes[mes - 1];
    }
}
```

## 5. Classe Funcionario com dois construtores e classe de teste
Crie a classe Funcionario com um atributo para armazenar o nome, e implemente dois construtores: um que recebe o nome como argumento e outro sem argumentos. Além disso, crie uma classe de teste que instancie objetos da classe Funcionario, utilizando ambos os construtores, para verificar seu funcionamento.

```java
public class Funcionario {
    private String nome;

    public Funcionario() {
        this.nome = "Sem nome";
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Carlos");

        System.out.println("Funcionário 1: " + f1.getNome());
        System.out.println("Funcionário 2: " + f2.getNome());
    }
}
```