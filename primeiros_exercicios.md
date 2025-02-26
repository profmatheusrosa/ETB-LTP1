# Exercícios em Java

## Sumário
1. [Programa que imprime na tela 'Hello World'](#1-programa-que-imprime-na-tela-hello-world)
2. [Programa que lê o nome do usuário e imprime uma mensagem de boas-vindas](#2-programa-que-lê-o-nome-do-usuário-e-imprime-uma-mensagem-de-boas-vindas)
3. [Algoritmo que lê dois números e imprime a soma deles](#3-algoritmo-que-lê-dois-números-e-imprime-a-soma-deles)
4. [Algoritmo que lê dois números e imprime a média deles](#4-algoritmo-que-lê-dois-números-e-imprime-a-média-deles)

## 1. Programa que imprime na tela 'Hello World'
Este programa é um exemplo básico de como imprimir uma mensagem na tela usando Java.
```java
public class HelloWorld {
    public static void main(String[] args) {
        // Imprime "Hello, World!" na tela
        System.out.println("Hello, World!");
    }
}
```

## 2. Programa que lê o nome do usuário e imprime uma mensagem de boas-vindas
Este programa utiliza a classe `Scanner` para ler a entrada do usuário e depois imprime uma mensagem de boas-vindas.
```java
import java.util.Scanner;

public class BoasVindasUsuario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite seu nome
        System.out.print("Digite seu nome: ");
        
        // Lê o nome digitado pelo usuário
        String nome = scanner.nextLine();
        
        // Imprime uma mensagem de boas-vindas
        System.out.println("Bem vindo, " + nome + "!");
        
        // Fecha o objeto Scanner
        scanner.close();
    }
}
```

## 3. Algoritmo que lê dois números e imprime a soma deles
Este programa lê dois números inteiros fornecidos pelo usuário, calcula a soma deles e imprime o resultado.
```java
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        // Solicita que o usuário digite o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Calcula a soma dos dois números
        int soma = num1 + num2;
        
        // Imprime o resultado da soma
        System.out.println("A soma dos números é: " + soma);
        
        // Fecha o objeto Scanner
        scanner.close();
    }
}
```

## 4. Algoritmo que lê dois números e imprime a média deles
Este programa lê dois números inteiros fornecidos pelo usuário, calcula a média deles e imprime o resultado.
```java
import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        // Solicita que o usuário digite o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Calcula a média dos dois números
        double media = (num1 + num2) / 2.0;
        
        // Imprime o resultado da média
        System.out.println("A média dos números é: " + media);
        
        // Fecha o objeto Scanner
        scanner.close();
    }
}