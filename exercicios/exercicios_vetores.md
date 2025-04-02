# Exercícios de Vetores

## Sumário
1. [Vetor com valores pré-definidos](#1-vetor-com-valores-pré-definidos)
2. [Vetor com valores digitados pelo usuário](#2-vetor-com-valores-digitados-pelo-usuário)
3. [Construir vetor B a partir do vetor A](#3-construir-vetor-b-a-partir-do-vetor-a)

## 1. Vetor com valores pré-definidos
Crie um vetor com 5 valores pré-deﬁnidos e imprima esse vetor.
```java
public class VetorPreDefinido {
    public static void main(String[] args) {
        // Define um vetor com 5 valores pré-definidos
        int[] vetor = {1, 2, 3, 4, 5};

        // Percorre o vetor e imprime cada elemento
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetor[i]);
        }
    }
}
```

## 2. Vetor com valores digitados pelo usuário
Crie um programa que peça para o usuário digitar 5 números, armazene em um vetor e imprima todos os valores na tela.
```java
import java.util.Scanner;

public class VetorUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria um vetor para armazenar 5 números
        int[] vetor = new int[5];

        // Solicita ao usuário que digite os números
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Imprime os números digitados
        System.out.println("Os valores digitados foram:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetor[i]);
        }

        scanner.close(); // Fecha o scanner
    }
}
```

## 3. Construir vetor B a partir do vetor A
Crie um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A.
```java
public class VetorAB {
    public static void main(String[] args) {
        // Define o vetor A com 8 elementos
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8};
        // Cria o vetor B com o mesmo tamanho de A
        int[] vetorB = new int[vetorA.length];

        // Copia os elementos de A para B
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        // Imprime os elementos do vetor A
        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetorA[i]);
        }

        // Imprime os elementos do vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetorB[i]);
        }
    }
}
```
