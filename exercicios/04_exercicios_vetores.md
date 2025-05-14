# Exercícios de Vetores

1. [Vetor com valores pré-definidos](#1-vetor-com-valores-pré-definidos)
2. [Vetor com valores digitados pelo usuário](#2-vetor-com-valores-digitados-pelo-usuário)
3. [Construir vetor B a partir do vetor A](#3-construir-vetor-b-a-partir-do-vetor-a)

## 1. Vetor com valores pré-definidos
Crie um vetor com 5 valores pré-deﬁnidos e imprima esse vetor.
```java
public class VetorPreDefinido {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

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
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Os valores digitados foram:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}
```

## 3. Construir vetor B a partir do vetor A
Crie um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A.
```java
public class VetorAB {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetorA[i]);
        }

        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + vetorB[i]);
        }
    }
}
```
