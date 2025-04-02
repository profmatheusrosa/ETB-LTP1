# Exercícios de Encapsulamento

## Sumário
1. [Classe Pessoa](#1-classe-pessoa)
2. [Classe CadernoDeEnderecos](#2-classe-cadernodeenderecos)

## 1. Classe Pessoa
Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade e altura. Crie os métodos públicos gets e sets e crie também uma classe de teste para verificar o funcionamento.
```java
public class Pessoa {
    // Atributos privados para encapsulamento
    private String nome;
    private int idade;
    private double altura;

    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

public class TestePessoa {
    public static void main(String[] args) {
        // Cria um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Define os valores dos atributos
        pessoa.setNome("João");
        pessoa.setIdade(25);
        pessoa.setAltura(1.75);

        // Imprime os dados da pessoa usando os getters
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}
```

## 2. Classe CadernoDeEnderecos
Crie uma classe CadernoDeEnderecos que represente os dados de uma pessoa, como nome, telefone, e-mail e endereço. Crie os getters e setters e uma classe teste para imprimir seus valores.
```java
public class CadernoDeEnderecos {
    // Atributos privados para encapsulamento
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

public class TesteCadernoDeEnderecos {
    public static void main(String[] args) {
        // Cria um objeto da classe CadernoDeEnderecos
        CadernoDeEnderecos caderno = new CadernoDeEnderecos();

        // Define os valores dos atributos
        caderno.setNome("Maria");
        caderno.setTelefone("1234-5678");
        caderno.setEmail("maria@email.com");
        caderno.setEndereco("Rua das Flores, 123");

        // Imprime os dados do caderno de endereços usando os getters
        System.out.println("Nome: " + caderno.getNome());
        System.out.println("Telefone: " + caderno.getTelefone());
        System.out.println("E-mail: " + caderno.getEmail());
        System.out.println("Endereço: " + caderno.getEndereco());
    }
}
```
