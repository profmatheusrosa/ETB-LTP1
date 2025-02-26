# Exercícios em Java - Condicionais

## Sumário
1. [Verificar se dois números são pares ou ímpares](#1-verificar-se-dois-números-são-pares-ou-ímpares)
2. [Verificar se dois números são iguais ou qual é o maior](#2-verificar-se-dois-números-são-iguais-ou-qual-é-o-maior)
3. [Imprimir três números em ordem crescente](#3-imprimir-três-números-em-ordem-crescente)
4. [Operações matemáticas](#4-operações-matemáticas)

## 1. Verificar se dois números são pares ou ímpares
Este programa recebe dois números inteiros e verifica se são pares ou ímpares.
```java
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        // Solicita que o usuário digite o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Verifica se o primeiro número é par ou ímpar
        if (num1 % 2 == 0) {
            System.out.println("O primeiro número é par.");
        } else {
            System.out.println("O primeiro número é ímpar.");
        }
        
        // Verifica se o segundo número é par ou ímpar
        if (num2 % 2 == 0) {
            System.out.println("O segundo número é par.");
        } else {
            System.out.println("O segundo número é ímpar.");
        }
        
        scanner.close();
    }
}
```

## 2. Verificar se dois números são iguais ou qual é o maior
Este programa recebe dois números e imprime uma mensagem indicando se os dois números são iguais ou qual é o maior.
```java
import java.util.Scanner;

public class MaiorOuIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        // Solicita que o usuário digite o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Verifica se os números são iguais ou qual é o maior
        if (num1 == num2) {
            System.out.println("Os dois números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }
        
        scanner.close();
    }
}
```

## 3. Imprimir três números em ordem crescente
Este programa lê três números diferentes e os imprime na tela em ordem crescente.
```java
import java.util.Scanner;
import java.util.Arrays;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite três números diferentes
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        
        // Coloca os números em um array e ordena
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        
        // Imprime os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        
        scanner.close();
    }
}
```

## 4. Operações matemáticas
Este programa exibe uma lista de operações matemáticas e permite que o usuário escolha uma operação para realizar entre dois valores.
```java
import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exibe a lista de operações
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potenciação");
        
        // Lê a escolha do usuário
        int escolha = scanner.nextInt();
        
        // Solicita que o usuário digite dois valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        // Realiza a operação escolhida
        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Resultado: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("Resultado: " + (valor1 * valor2));
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println("Resultado: " + (valor1 / valor2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case 5:
                System.out.println("Resultado: " + Math.pow(valor1, valor2));
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        
        scanner.close();
    }
}
