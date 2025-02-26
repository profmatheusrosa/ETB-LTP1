# Exercícios em Java

## 1. Programa que imprime na tela 'Hello World'
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 2. Programa que lê o nome do usuário e imprime uma mensagem de boas-vindas
```java
import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Bem vindo, " + nome + "!");
        scanner.close();
    }
}
```

## 3. Algoritmo que lê dois números e imprime a soma deles
```java
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
```

## 4. Algoritmo que lê dois números e imprime a média deles
```java
import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        double media = (num1 + num2) / 2.0;
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}