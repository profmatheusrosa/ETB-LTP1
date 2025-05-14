# Exercícios de Estruturas de Repetição

1. [Média de idade](#1-média-de-idade)
2. [Somatório de números inteiros](#2-somatório-de-números-inteiros)
3. [Sequência de números](#3-sequência-de-números)
4. [Cálculo de potência](#4-cálculo-de-potência)
5. [Tabuada](#5-tabuada)

## 1. Média de idade
Faça um programa que leia um número indeterminado de números, sendo cada um a idade de uma pessoa. O último (que não entrará nos cálculos) será o valor -1. Ao ﬁnal, imprima a média de idade deste grupo.
```java
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0, soma = 0, quantidade = 0;

        while (idade =! -1) {
            System.out.print("Digite a idade (ou -1 para sair): ");
            idade = scanner.nextInt();
            soma += idade;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média de idade é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        scanner.close();
    }
}
```

## 2. Somatório de números inteiros
Faça um programa que calcule e mostre o valor do somatório dos números inteiros de 1 até n, sendo que o valor de n deve ser informado pelo usuário.
```java
import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("O somatório de 1 até " + n + " é: " + soma);
        scanner.close();
    }
}
```

## 3. Sequência de números
Faça um programa que leia um número informado pelo usuário e imprima a sequência dos números de 1 até o número informado.
```java
import java.util.Scanner;

public class SequenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
```

## 4. Cálculo de potência
Faça um programa que peça dois números, base e expoente. Calcule o primeiro número elevado ao segundo número. (Não utilize a função de potência do Java).
```java
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        int resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
        scanner.close();
    }
}
```

## 5. Tabuada
Faça um programa que imprima a tabuada de um número informado pelo usuário. (n x 1, n x 2, n x 3 …)
```java
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
```