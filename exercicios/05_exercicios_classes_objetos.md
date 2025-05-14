
# Exercícios de Classes e Objetos

## Sumário
1. [Classe Cachorro](#1-classe-cachorro)
2. [Classe para testar a classe Cachorro](#2-classe-para-testar-a-classe-cachorro)

## 1. Classe Cachorro
Crie uma classe Cachorro com atributos raça, nome e idade e métodos latir e dormir.
```java
public class Cachorro {
    // Atributos da classe Cachorro
    String raca; // Raça do cachorro
    String nome; // Nome do cachorro
    int idade;   // Idade do cachorro

    // Construtor para inicializar os atributos
    public Cachorro(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    // Método para simular o latido do cachorro
    public void latir() {
        System.out.println("Au au!");
    }

    // Método para simular o cachorro dormindo
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Métodos getters para acessar os atributos
    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
```

## 2. Classe para testar a classe Cachorro
Crie uma classe para testar a classe Cachorro que imprima todos seus atributos e chame seus métodos.
```java
public class TesteCachorro {
    public static void main(String[] args) {
        // Cria um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro("Golden Retriever", "Rex", 3);

        // Imprime os atributos do cachorro
        System.out.println("Raça: " + meuCachorro.getRaca());
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Idade: " + meuCachorro.getIdade());

        // Chama os métodos do cachorro
        meuCachorro.latir();
        meuCachorro.dormir();
    }
}
```
