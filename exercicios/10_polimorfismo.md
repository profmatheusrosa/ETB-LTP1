# Exercícios de Polimorfismo

- [1 - Crie uma classe Pagamento com os atributos valor e dia, e duas subclasses: PagamentoCartao e PagamentoBoleto, sobrescrevendo o método processarPagamento() em cada uma, e uma classe de teste](#1-pagamento-pagamentocartao-pagamentoboleto-e-testepagamento)
- [2 - Crie uma classe base ContaCorrente com atributo saldo e métodos de saque, e duas subclasses ContaPF e ContaPJ, cada uma com taxa diferente sobre o saque, e teste o funcionamento](#2-contacorrente-contapf-contapj-e-testeconta)
- [3 - Crie uma classe Usuario com o método registrar() e uma subclasse Administrador com o método sobrecarregado para registrar usuários de diferentes formas, e uma classe de teste](#3-usuario-administrador-e-testeusuario)
- [4 - Crie uma classe Comunicado com método enviar(), e uma subclasse Email que sobrecarrega o método para diferentes parâmetros, e uma classe de teste](#4-comunicado-email-e-testecomunicado)
- [5 - Crie uma classe ContaBancaria com métodos depositar, sacar e exibirInformacoes(), e subclasses ContaCorrente e ContaPoupanca com comportamentos específicos](#5-contabancaria-contacorrente-contapoupanca-e-testecontabancaria)

## 1. Pagamento, PagamentoCartao, PagamentoBoleto e TestePagamento

Crie uma classe Pagamento com os atributos valor e dia, e duas subclasses: PagamentoCartao, que adiciona numeroCartao e sobrescreve o método processarPagamento() para exibir os detalhes do pagamento via cartão, e PagamentoBoleto, que adiciona codigoBarras e sobrescreve o método para exibir os detalhes do pagamento via boleto. Crie uma classe de teste para verificar a exibição correta dos detalhes.

```java
public class Pagamento {
    protected double valor;
    protected String dia;

    public Pagamento(double valor, String dia) {
        this.valor = valor;
        this.dia = dia;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento genérico.");
    }
}

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String dia, String numeroCartao) {
        super(valor, dia);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão");
        System.out.println("Valor: " + valor);
        System.out.println("Dia: " + dia);
        System.out.println("Número do Cartão: " + numeroCartao);
    }
}

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String dia, String codigoBarras) {
        super(valor, dia);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto");
        System.out.println("Valor: " + valor);
        System.out.println("Dia: " + dia);
        System.out.println("Código de Barras: " + codigoBarras);
    }
}

public class TestePagamento {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao(150.0, "10/06/2024", "1234-5678-9012-3456");
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(200.0, "11/06/2024", "23793381286000000012345678901234567890123456");

        pagamentoCartao.processarPagamento();
        System.out.println();
        pagamentoBoleto.processarPagamento();
    }
}
```

## 2. ContaCorrente, ContaPF, ContaPJ e TesteConta

Crie uma classe base ContaCorrente com atributo saldo e métodos para realizar um saque (reduzindo o saldo) e obter o saldo atual. Crie duas subclasses da classe ContaCorrente; ContaPF. Os clientes pessoa física devem pagar uma taxa de 1% sobre o valor sacado. ContaPJ. Os clientes pessoa jurídica devem pagar uma taxa de 5% sobre o valor sacado. Implemente e teste o funcionamento das duas subclasses. Ao final, exiba o valor do saque realizado em cada conta, considerando a taxa aplicável, e verifique o saldo restante após o saque.

```java
public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double sacar(double valor) {
        // Método genérico, sobrescrito nas subclasses
        return 0;
    }
}

public class ContaPF extends ContaCorrente {
    public ContaPF(double saldo) {
        super(saldo);
    }

    @Override
    public double sacar(double valor) {
        double taxa = valor * 0.01;
        double total = valor + taxa;
        if (saldo >= total) {
            saldo -= total;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para saque PF.");
            return 0;
        }
    }
}

public class ContaPJ extends ContaCorrente {
    public ContaPJ(double saldo) {
        super(saldo);
    }

    @Override
    public double sacar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;
        if (saldo >= total) {
            saldo -= total;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para saque PJ.");
            return 0;
        }
    }
}

public class TesteConta {
    public static void main(String[] args) {
        ContaPF contaPF = new ContaPF(1000.0);
        ContaPJ contaPJ = new ContaPJ(2000.0);

        double valorSaquePF = 200.0;
        double valorSacadoPF = contaPF.sacar(valorSaquePF);
        System.out.println("Conta PF - Valor sacado: " + valorSacadoPF);
        System.out.println("Conta PF - Saldo restante: " + contaPF.getSaldo());

        double valorSaquePJ = 500.0;
        double valorSacadoPJ = contaPJ.sacar(valorSaquePJ);
        System.out.println("Conta PJ - Valor sacado: " + valorSacadoPJ);
        System.out.println("Conta PJ - Saldo restante: " + contaPJ.getSaldo());
    }
}
```

## 3. Usuario, Administrador e TesteUsuario

Crie uma classe Usuario com o método registrar() e uma subclasse Administrador com o método sobrecarregado para registrar um usuário com nome e email; nome, email e senha; e crie uma classe de teste que registre diferentes usuários usando todas as sobrecargas.

```java
public class Usuario {
    public void registrar(String nome, String email) {
        System.out.println("Usuário registrado: " + nome + ", Email: " + email);
    }
}

public class Administrador extends Usuario {
    // Sobrecarga do método registrar
    public void registrar(String nome, String email, String senha) {
        System.out.println("Administrador registrado: " + nome + ", Email: " + email + ", Senha: " + senha);
    }
}

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.registrar("João", "joao@email.com");

        Administrador admin = new Administrador();
        admin.registrar("Maria", "maria@email.com");
        admin.registrar("Carlos", "carlos@email.com", "senha123");
    }
}
```

## 4. Comunicado, Email e TesteComunicado

Crie uma classe Comunicado, com método enviar() que deve aceitar dois parâmetros: o remetente e o destinatário. Em seguida, crie uma subclasse chamada Email que, sobrecarregue o método enviar() para aceitar diferentes combinações de parâmetros. A primeira versão do método deve aceitar remetente, destinatário e a mensagem. A segunda versão deve aceitar remetente, destinatário, assunto e mensagem. Por fim, crie uma classe de teste.

```java
public class Comunicado {
    public void enviar(String remetente, String destinatario) {
        System.out.println("Comunicado enviado de " + remetente + " para " + destinatario);
    }
}

public class Email extends Comunicado {
    // Sobrecarga 1
    public void enviar(String remetente, String destinatario, String mensagem) {
        System.out.println("Email de " + remetente + " para " + destinatario + ": " + mensagem);
    }

    // Sobrecarga 2
    public void enviar(String remetente, String destinatario, String assunto, String mensagem) {
        System.out.println("Email de " + remetente + " para " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}

public class TesteComunicado {
    public static void main(String[] args) {
        Comunicado comunicado = new Comunicado();
        comunicado.enviar("Ana", "Bruno");

        Email email = new Email();
        email.enviar("Ana", "Bruno", "Olá, tudo bem?");
        email.enviar("Ana", "Bruno", "Reunião", "A reunião será às 14h.");
    }
}
```

## 5. ContaBancaria, ContaCorrente, ContaPoupanca e TesteContaBancaria

Crie uma classe ContaBancaria com os atributos nome e saldo, além dos métodos depositar para adicionar dinheiro, sacar para retirar dinheiro (caso haja saldo suficiente), e exibirInformacoes() para mostrar os dados da conta; depois, crie a subclasse ContaCorrente, que herda de ContaBancaria e adiciona o atributo limiteCredito, permitindo saques que ultrapassem o saldo até esse limite, e a subclasse ContaPoupanca, que adiciona o atributo taxaJuros e um método aplicarJuros() que atualiza o saldo com base nessa taxa, sendo que cada classe deve implementar sua própria versão do método exibirInformacoes() mostrando todos os dados relevantes.

```java
public class ContaBancaria {
    protected String nome;
    protected double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Conta Bancária");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}

public class ContaCorrente extends ContaBancaria {
    private double limiteCredito;

    public ContaCorrente(String nome, double saldo, double limiteCredito) {
        super(nome, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Limite insuficiente.");
            return false;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Corrente");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite de Crédito: " + limiteCredito);
    }
}

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String nome, double saldo, double taxaJuros) {
        super(nome, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Poupança");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Taxa de Juros: " + taxaJuros);
    }
}

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Lucas", 500.0, 200.0);
        ContaPoupanca cp = new ContaPoupanca("Julia", 1000.0, 0.05);

        cc.depositar(100.0);
        cc.sacar(700.0); // usa limite
        cc.exibirInformacoes();

        cp.depositar(200.0);
        cp.aplicarJuros();
        cp.sacar(100.0);
        cp.exibirInformacoes();
    }
}
```
