# Exercícios de Classes Abstratas

1. [ContaBancaria, ContaCorrente, ContaPoupanca e TesteContaBancaria](#1-contabancaria-contacorrente-contapoupanca-e-testecontabancaria)  
2. [Funcionario, FuncionarioCLT, FuncionarioPJ e TesteFuncionario](#2-funcionario-funcionarioclt-funcionariopj-e-testefuncionario)  

## 1. ContaBancaria, ContaCorrente, ContaPoupanca e TesteContaBancaria

Crie uma classe abstrata chamada ContaBancaria, com os métodos abstratos depositar() e sacar(), além de um atributo para o saldo. Em seguida, crie duas subclasses: ContaCorrente: Implementa o método depositar() para adicionar dinheiro à conta e o método sacar() para realizar um saque, com a possibilidade de ter um limite de saque. ContaPoupanca: Implementa os métodos depositar() e sacar() de forma simples, sem limite de saque. Na classe de teste, crie instâncias das duas contas e simule depósitos e saques.

```java
public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}

public class ContaCorrente extends ContaBancaria {
    private double limiteSaque;

    public ContaCorrente(double saldo, double limiteSaque) {
        super(saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limiteSaque) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Limite de saque excedido.");
            return false;
        }
    }
}

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(500.0, 200.0);
        ContaPoupanca cp = new ContaPoupanca(1000.0);

        cc.depositar(100.0);
        cc.sacar(700.0); // usa limite
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());

        cp.depositar(200.0);
        cp.sacar(100.0);
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
```

## 2. Funcionario, FuncionarioCLT, FuncionarioPJ e TesteFuncionario

Crie uma classe abstrata chamada Funcionario, que deve conter um atributo nome e construtor da classe. Essa classe deve definir dois métodos abstratos: calcularSalario() e exibirInformacoes(). Implemente duas subclasses concretas:
FuncionarioCLT: Esta classe deve possuir os atributos cargo e salario e o construtor da classe. O método calcularSalario() deve retornar o valor do salário fixo, enquanto o método exibirInformacoes() todos os atributos.
FuncionarioPJ: Esta classe deve ter os atributos valorHora e horasTrabalhadas e o construtor da classe. O método calcularSalario() deve retornar o salário baseado no valor hora e o número de horas trabalhadas. O método exibirInformacoes() deve exibir o todos os atributos.
Por fim, crie uma classe de teste, demonstrando o funcionamento do sistema.

```java
public abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
    public abstract void exibirInformacoes();
}

public class FuncionarioCLT extends Funcionario {
    private String cargo;
    private double salario;

    public FuncionarioCLT(String nome, String cargo, double salario) {
        super(nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário CLT");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}

public class FuncionarioPJ extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioPJ(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário PJ");
        System.out.println("Nome: " + nome);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário: " + calcularSalario());
    }
}

public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioCLT clt = new FuncionarioCLT("Ana", "Analista", 3500.0);
        FuncionarioPJ pj = new FuncionarioPJ("Bruno", 80.0, 40);

        clt.exibirInformacoes();
        System.out.println("Salário CLT: " + clt.calcularSalario());

        System.out.println();

        pj.exibirInformacoes();
        System.out.println("Salário PJ: " + pj.calcularSalario());
    }
}
```
