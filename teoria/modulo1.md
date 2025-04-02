# Módulo 1: Fundamentos da Programação com Java

**Bem-vindo(a) ao Módulo 1!**

Neste módulo, você dará os primeiros passos no mundo da programação Java. Começaremos configurando o ambiente de desenvolvimento necessário, entenderemos a estrutura básica de um programa Java e aprenderemos os elementos fundamentais da linguagem, como variáveis, tipos de dados, operadores e estruturas de controle. Ao final deste módulo, você será capaz de escrever, compilar e executar programas Java simples que realizam tarefas básicas.

---

# Sumário

*   [Seção 1: Preparando o Terreno - Ambiente e Introdução](#secao-1-preparando-o-terreno---ambiente-e-introducao)
    *   [1.1 Entendendo o Ecossistema Java: JDK, JRE e JVM](#11-entendendo-o-ecossistema-java-jdk-jre-e-jvm)
    *   [1.2 Instalação do JDK (Java Development Kit)](#12-instalacao-do-jdk-java-development-kit)
    *   [1.3 Configuração de Variáveis de Ambiente](#13-configuracao-de-variaveis-de-ambiente-principalmente-windows)
    *   [1.4 Escolhendo uma IDE](#14-escolhendo-uma-ide-ambiente-de-desenvolvimento-integrado)
    *   [1.5 Seu Primeiro Programa: "Hello, World!"](#15-seu-primeiro-programa-hello-world)
    *   [Prática 1.1](#prática-11-)
*   [Seção 2: A Caixa de Ferramentas - Elementos Básicos da Linguagem](#secao-2-a-caixa-de-ferramentas---elementos-basicos-da-linguagem)
    *   [2.1 Comentários](#21-comentarios)
    *   [2.2 Variáveis e Tipos Primitivos](#22-variaveis-e-tipos-primitivos)
    *   [2.3 A Classe String](#23-a-classe-string)
    *   [2.4 Operadores](#24-operadores)
    *   [2.5 Entrada e Saída Básica](#25-entrada-e-saida-basica)
    *   [Prática 2.1: Variáveis e Tipos](#prática-21-variaveis-e-tipos-)
    *   [Prática 2.2: Manipulação de Strings](#prática-22-manipulacao-de-strings-)
    *   [Prática 2.3: Operadores](#prática-23-operadores-)
    *   [Prática 2.4: Calculadora Simples](#prática-24-calculadora-simples-)
*   [Seção 3: Tomando Decisões e Repetindo Tarefas - Estruturas de Controle](#secao-3-tomando-decisoes-e-repetindo-tarefas---estruturas-de-controle)
    *   [3.1 Estruturas de Seleção (Decisão)](#31-estruturas-de-selecao-decisao)
    *   [3.2 Estrutura de Múltipla Escolha: switch-case](#32-estrutura-de-multipla-escolha-switch-case)
    *   [3.3 Estruturas de Repetição (Loops)](#33-estruturas-de-repeticao-loops)
    *   [3.4 Controle de Fluxo Dentro de Loops: break e continue](#34-controle-de-fluxo-dentro-de-loops-break-e-continue)
    *   [Prática 3.1: Verificação Par/Ímpar](#prática-31-verificacao-parimpar-)
    *   [Prática 3.2: Calculadora com switch](#prática-32-calculadora-com-switch-)
    *   [Prática 3.3: Tabuada com for](#prática-33-tabuada-com-for-)
    *   [Prática 3.4: Adivinhe o Número com while](#prática-34-adivinhe-o-numero-com-while-)
    *   [Prática 3.5: Menu com do-while](#prática-35-menu-com-do-while-)
*   [Resumo do Módulo 1](#resumo-do-modulo-1-)
*   [Desafio Final do Módulo 1](#-desafio-final-do-modulo-1-)
*   [Próximos Passos](#proximos-passos-sugestao-para-modulo-2)

---

## Seção 1: Preparando o Terreno - Ambiente e Introdução

Antes de escrevermos nossa primeira linha de código Java, precisamos garantir que nosso computador esteja pronto.

### 1.1 Entendendo o Ecossistema Java: JDK, JRE e JVM

É comum ouvir esses três acrônimos. Vamos entendê-los:

*   **JVM (Java Virtual Machine - Máquina Virtual Java):** É o "coração" do Java. A JVM é um ambiente de execução que interpreta o código Java compilado (bytecode) e o traduz para instruções que o seu sistema operacional específico entende. É isso que garante a portabilidade do Java (`Write Once, Run Anywhere` - Escreva uma vez, Rode em qualquer lugar). Você não interage diretamente com a JVM, mas ela está sempre lá quando você executa um programa Java.
*   **JRE (Java Runtime Environment - Ambiente de Execução Java):** É um pacote que contém tudo o que é necessário para *executar* aplicações Java já compiladas. Inclui a JVM e bibliotecas Java essenciais (Java Class Libraries). Se você é apenas um usuário que quer rodar um programa Java, o JRE é suficiente.
*   **JDK (Java Development Kit - Kit de Desenvolvimento Java):** É o pacote completo para *desenvolvedores* Java. Ele inclui tudo o que o JRE tem (JVM + bibliotecas) e adiciona as ferramentas necessárias para *desenvolver* aplicações Java, como o compilador (`javac`), o depurador (`jdb`), e outras utilidades. **É o JDK que precisamos instalar.**

### 1.2 Instalação do JDK (Java Development Kit)

1.  **Download:**
    *   Acesse o site oficial da Oracle ([https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)) ou uma distribuição OpenJDK como a Adoptium ([https://adoptium.net/](https://adoptium.net/)).
    *   **Recomendação:** Para iniciantes, a versão LTS (Long-Term Support) mais recente (como Java 17 ou 21 no momento da escrita) é uma ótima escolha, pois oferece estabilidade e suporte prolongado.
    *   Escolha o instalador adequado para o seu sistema operacional (Windows, macOS, Linux).
2.  **Instalação:**
    *   Execute o instalador baixado.
    *   Siga as instruções na tela. Geralmente, aceitar as opções padrão é suficiente. Anote o diretório onde o JDK foi instalado (ex.: `C:\Program Files\Java\jdk-17` ou `/usr/lib/jvm/jdk-17`).
3.  **Verificação:**
    *   Abra um terminal ou prompt de comando.
    *   Digite `java -version` e pressione Enter.
    *   Digite `javac -version` e pressione Enter.
    *   Se ambos os comandos exibirem a versão do JDK que você acabou de instalar, a instalação foi bem-sucedida! Caso contrário, você precisará configurar as variáveis de ambiente.

### 1.3 Configuração de Variáveis de Ambiente (Principalmente Windows)

**Por que configurar?** As variáveis de ambiente dizem ao sistema operacional onde encontrar os executáveis do Java (como `java` para executar e `javac` para compilar) a partir de qualquer diretório no seu terminal.

1.  **Acesse as Variáveis de Ambiente:**
    *   **Windows:** Pesquise por "Editar as variáveis de ambiente do sistema" no menu Iniciar. Clique no botão "Variáveis de Ambiente...".
    *   **macOS/Linux:** Geralmente, a configuração é feita editando arquivos como `.bash_profile`, `.zshrc` ou `/etc/environment`. Os instaladores `.pkg` (macOS) ou gerenciadores de pacotes (Linux) costumam fazer isso automaticamente.
2.  **Configure `JAVA_HOME` (Variável do Sistema):**
    *   Clique em "Novo..." na seção "Variáveis do sistema".
    *   Nome da variável: `JAVA_HOME`
    *   Valor da variável: O caminho completo para o diretório de instalação do JDK (o que você anotou antes, ex.: `C:\Program Files\Java\jdk-17`).
3.  **Atualize a Variável `Path` (Variável do Sistema):**
    *   Encontre a variável `Path` na lista de "Variáveis do sistema" e clique em "Editar...".
    *   Clique em "Novo" e adicione a seguinte entrada: `%JAVA_HOME%\bin` (No Windows. Em Linux/macOS seria algo como `$JAVA_HOME/bin`).
    *   Clique em "OK" em todas as janelas para salvar.
4.  **Verificação (Novamente):** Abra um **novo** terminal/prompt de comando (é importante abrir um novo para carregar as novas variáveis) e execute `java -version` e `javac -version` novamente. Agora deve funcionar.

### 1.4 Escolhendo uma IDE (Ambiente de Desenvolvimento Integrado)

Embora você possa escrever código Java em um editor de texto simples e compilar/executar pelo terminal, usar uma IDE torna o desenvolvimento muito mais produtivo. Uma IDE oferece:

*   **Editor de Código Inteligente:** Com destaque de sintaxe, autocompletar, sugestões e refatoração.
*   **Compilação e Execução Integradas:** Compile e execute seu código com um clique.
*   **Depuração (Debugging):** Ferramentas para encontrar e corrigir erros passo a passo.
*   **Gerenciamento de Projetos:** Organização de arquivos e dependências.

**Opções Populares (Gratuitas):**

*   **Visual Studio Code (VS Code):** Leve, extensível (requer a instalação do "Extension Pack for Java"). Ótimo para iniciantes e projetos variados.
*   **IntelliJ IDEA Community Edition:** Poderosa, muito popular no mundo Java profissional. Excelente para projetos Java maiores.
*   **Eclipse IDE for Java Developers:** Outra IDE robusta e tradicional, muito utilizada academicamente e em empresas.

**Recomendação:** Comece com o VS Code pela sua simplicidade ou experimente o IntelliJ IDEA Community if preferir uma experiência mais focada em Java desde o início.

### 1.5 Seu Primeiro Programa: "Hello, World!"

Vamos criar e entender o programa mais clássico da programação.

1.  **Crie o Arquivo:** Abra sua IDE ou um editor de texto simples. Crie um novo arquivo chamado `HelloWorld.java` (o nome do arquivo **deve** ser exatamente igual ao nome da classe pública, incluindo maiúsculas e minúsculas).
2.  **Digite o Código:**
    ```java
    /**
     * Este é um exemplo clássico de "Hello, World!" em Java.
     * Ele demonstra a estrutura básica de um programa Java.
     */
    public class HelloWorld { // Declaração da classe pública 'HelloWorld'

        // O método 'main' é o ponto de entrada para a execução do programa.
        // Todo programa Java executável precisa ter um método main como este.
        public static void main(String[] args) {

            // 'System.out.println' é usado para imprimir texto no console.
            // 'println' adiciona uma nova linha ao final da saída.
            System.out.println("Hello, World!");

        } // Fim do método main

    } // Fim da classe HelloWorld
    ```
3.  **Entendendo o Código:**
    *   `/** ... */`: Bloco de comentário Javadoc (explicaremos mais tarde).
    *   `//`: Comentário de linha única. Ignorado pelo compilador.
    *   `public class HelloWorld`: Define uma classe chamada `HelloWorld`. Em Java, todo código reside dentro de classes. `public` significa que esta classe pode ser acessada por qualquer outra classe.
    *   `public static void main(String[] args)`: Este é o método principal.
        *   `public`: Pode ser chamado de fora da classe.
        *   `static`: Pode ser executado sem criar um objeto da classe `HelloWorld`. A JVM o chama diretamente.
        *   `void`: Indica que o método não retorna nenhum valor.
        *   `main`: Nome padrão que a JVM procura para iniciar a execução.
        *   `(String[] args)`: Define um parâmetro chamado `args`, que é um array de Strings. Ele pode receber argumentos passados pela linha de comando (veremos isso mais tarde).
    *   `System.out.println("Hello, World!");`:
        *   `System`: Uma classe pré-definida do Java que contém facilidades do sistema.
        *   `out`: Um objeto dentro de `System` que representa a saída padrão (geralmente o console/terminal).
        *   `println()`: Um método do objeto `out` que imprime o texto fornecido (entre aspas) seguido por uma quebra de linha.

4.  **Compilação e Execução (Via Terminal):**
    *   Navegue pelo terminal até o diretório onde você salvou `HelloWorld.java`.
    *   **Compilar:** Digite `javac HelloWorld.java` e pressione Enter. Se não houver erros, isso criará um novo arquivo chamado `HelloWorld.class`. Este arquivo contém o *bytecode* Java, que a JVM pode entender.
    *   **Executar:** Digite `java HelloWorld` (sem `.class`) e pressione Enter.
    *   **Saída Esperada:** `Hello, World!` será impresso no seu terminal.

5.  **Compilação e Execução (Via IDE):**
    *   A maioria das IDEs tem um botão "Run" (geralmente um ícone de triângulo verde ▶️).
    *   Clique com o botão direito no arquivo `HelloWorld.java` ou dentro do editor e procure por uma opção como "Run 'HelloWorld.main()'".
    *   A IDE compilará e executará o código para você, exibindo a saída em um painel de console integrado.

### ✨ Prática 1.1 ✨

1.  Certifique-se de que seu JDK está instalado e configurado corretamente (`java -version`, `javac -version`).
2.  Crie, compile e execute o programa `HelloWorld.java` usando o terminal.
3.  Tente executar o mesmo programa usando uma IDE de sua escolha.
4.  Modifique a mensagem dentro de `System.out.println()` para exibir seu nome e execute novamente.

---

## Seção 2: A Caixa de Ferramentas - Elementos Básicos da Linguagem

Agora que temos nosso ambiente pronto e rodamos nosso primeiro programa, vamos explorar os blocos de construção fundamentais da linguagem Java.

### 2.1 Comentários

Comentários são textos ignorados pelo compilador, usados para explicar o código para outros desenvolvedores (ou para você mesmo no futuro).

```java
// Este é um comentário de linha única. Tudo após '//' nesta linha é ignorado.

/*
  Este é um comentário
  de múltiplas linhas.
  Tudo entre '/*' e '*/' é ignorado.
*/

/**
 * Este é um comentário Javadoc. Ele é usado para gerar documentação
 * automática para suas classes e métodos. Geralmente vem antes
 * de declarações de classes, métodos ou variáveis de instância.
 * @param args Argumentos da linha de comando (exemplo de tag Javadoc)
 * @return void (nenhum valor de retorno)
 */
public class Comentarios {
    public static void main(String[] args) {
        // System.out.println("Esta linha não será executada.");
        System.out.println("Usar comentários torna o código mais legível!");
    }
}
```
**Boas Práticas:** Use comentários para explicar o porquê de algo ser feito de uma certa maneira, não apenas o que está sendo feito (o código em si já mostra o quê).

### 2.2 Variáveis e Tipos Primitivos

**Variáveis** são contêineres que armazenam dados na memória. Em Java, toda variável deve ter um **tipo** definido, que determina que tipo de dado ela pode armazenar e quanta memória ocupa. Java é uma linguagem ***fortemente tipada***.

**Tipos Primitivos:** São os tipos de dados mais básicos, incorporados diretamente na linguagem.

*   **Tipos Inteiros:** Para números inteiros (sem parte decimal).
    *   `byte`: 8 bits. Faixa: -128 a 127. (Uso: economia de memória em arrays grandes).
    *   `short`: 16 bits. Faixa: -32,768 a 32,767.
    *   `int`: 32 bits. Faixa: -2.147.483.648 a 2.147.483.647. (**Tipo inteiro mais comum**).
    *   `long`: 64 bits. Faixa: Muito grande. Requer o sufixo `L` ou `l` no final do número. (Uso: quando `int` não é suficiente, ex: IDs de banco de dados, timestamps).

    ```java
    byte idadeUsuario = 30;
    short anoFabricacao = 2023;
    int populacaoCidade = 1250000;
    long populacaoMundial = 7800000000L; // Note o 'L'
    ```

*   **Tipos de Ponto Flutuante:** Para números com parte decimal.
    *   `float`: 32 bits. Precisão simples. Requer o sufixo `f` ou `F`. (Uso: menos comum, gráficos 3D, economia de memória).
    *   `double`: 64 bits. Precisão dupla. (**Tipo decimal mais comum**). O sufixo `d` ou `D` é opcional, pois é o padrão.

    ```java
    float precoProduto = 19.99f; // Note o 'f'
    double piAproximado = 3.1415926535;
    double salario = 2500.75;
    ```

*   **Tipo Caractere:** Para um único caractere Unicode.
    *   `char`: 16 bits. Usa aspas simples (`'`).

    ```java
    char inicialNome = 'J';
    char simbolo = '@';
    char digito = '5';
    char caractereUnicode = '\u0041'; // Representa 'A'
    ```

*   **Tipo Booleano:** Para valores verdadeiro/falso.
    *   `boolean`: Representa `true` ou `false`. (Uso: condições lógicas, flags).

    ```java
    boolean usuarioAtivo = true;
    boolean tarefaConcluida = false;
    boolean maiorDeIdade = (idadeUsuario >= 18); // Resultado será true ou false
    ```

**Declaração e Inicialização:**

```java
// Declaração (reserva espaço na memória)
int contador;
double taxa;
boolean estaChovendo;

// Inicialização (atribui um valor inicial)
contador = 0;
taxa = 0.05;
estaChovendo = false;

// Declaração e Inicialização juntas (mais comum)
String nomeAluno = "Maria"; // String não é primitivo, mas muito usado
int numeroVidas = 3;
```

### 2.3 A Classe `String`

Embora não seja um tipo primitivo, a classe `String` é fundamental em Java para representar sequências de caracteres (texto). Strings são **objetos**.

*   **Declaração:** Usa aspas duplas (`"`).

    ```java
    String saudacao = "Olá";
    String linguagem = "Java";
    String mensagem = saudacao + ", " + linguagem + "!"; // Concatenação com '+'
    System.out.println(mensagem); // Saída: Olá, Java!
    ```

*   **Imutabilidade:** Uma característica importante das Strings em Java é que elas são **imutáveis**. Isso significa que, uma vez criado um objeto String, seu conteúdo não pode ser alterado. Qualquer operação que *parece* modificar uma String (como concatenação ou `toUpperCase()`) na verdade cria um *novo* objeto String com o resultado.

    ```java
    String nome = "ana";
    String nomeMaiusculo = nome.toUpperCase(); // Cria uma NOVA String "ANA"

    System.out.println(nome);           // Saída: ana (original não mudou)
    System.out.println(nomeMaiusculo);  // Saída: ANA (nova string)
    ```

*   **Métodos Úteis (Exemplos):**
    *   `length()`: Retorna o número de caracteres.
    *   `toUpperCase()`: Retorna uma nova String em maiúsculas.
    *   `toLowerCase()`: Retorna uma nova String em minúsculas.
    *   `charAt(int index)`: Retorna o caractere na posição especificada (índice começa em 0).
    *   `substring(int beginIndex)`: Retorna uma nova String a partir do índice especificado.
    *   `substring(int beginIndex, int endIndex)`: Retorna uma nova String entre os índices (fim exclusivo).
    *   `equals(String anotherString)`: Compara o conteúdo de duas Strings (sensível a maiúsculas/minúsculas). **Use este para comparar Strings, NÃO `==`!**
    *   `equalsIgnoreCase(String anotherString)`: Compara o conteúdo ignorando maiúsculas/minúsculas.
    *   `contains(CharSequence s)`: Verifica se a String contém a sequência de caracteres especificada.
    *   `replace(char oldChar, char newChar)`: Retorna uma nova String substituindo ocorrências de um caractere.
    *   `trim()`: Retorna uma nova String removendo espaços em branco no início e no fim.

    ```java
    String frase = "  Aprender Java é divertido!  ";
    System.out.println("Tamanho: " + frase.length()); // Saída: 29
    System.out.println("Maiúsculas: " + frase.toUpperCase());
    System.out.println("Caractere no índice 3: " + frase.charAt(3)); // Saída: p
    System.out.println("Substring (do 9): " + frase.substring(9)); // Saída: Java é divertido!
    System.out.println("Substring (9 a 13): " + frase.substring(9, 13)); // Saída: Java
    System.out.println("Contém 'Java'? " + frase.contains("Java")); // Saída: true
    System.out.println("Substituir ' ' por '-': " + frase.replace(' ', '-'));
    System.out.println("Sem espaços extras: '" + frase.trim() + "'"); // Saída: 'Aprender Java é divertido!'

    String s1 = "Teste";
    String s2 = "teste";
    System.out.println("s1.equals(s2): " + s1.equals(s2)); // Saída: false
    System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2)); // Saída: true
    ```

### 2.4 Operadores

Operadores são símbolos especiais que realizam operações em operandos (valores ou variáveis).

*   **Operadores Aritméticos:** Realizam cálculos matemáticos.
    *   `+` (Adição / Concatenação de String)
    *   `-` (Subtração)
    *   `*` (Multiplicação)
    *   `/` (Divisão)
        *   **Atenção:** Divisão entre inteiros resulta em um inteiro (truncado). Ex: `5 / 2` resulta em `2`. Para obter resultado decimal, pelo menos um operando deve ser `double` ou `float`. Ex: `5.0 / 2` resulta em `2.5`.
    *   `%` (Módulo - Resto da divisão) Ex: `5 % 2` resulta em `1`.

    ```java
    int a = 10;
    int b = 3;
    System.out.println("Soma: " + (a + b));       // Saída: 13
    System.out.println("Subtração: " + (a - b));  // Saída: 7
    System.out.println("Multiplicação: " + (a * b)); // Saída: 30
    System.out.println("Divisão Inteira: " + (a / b)); // Saída: 3
    System.out.println("Divisão Real: " + ( (double)a / b )); // Saída: 3.333... (cast)
    System.out.println("Módulo: " + (a % b));     // Saída: 1
    ```

*   **Operadores Relacionais:** Comparam dois valores e retornam `boolean` (`true` ou `false`).
    *   `==` (Igual a) - **Cuidado:** Para objetos como `String`, compara referências, não conteúdo. Use `.equals()`.
    *   `!=` (Diferente de)
    *   `>` (Maior que)
    *   `<` (Menor que)
    *   `>=` (Maior ou igual a)
    *   `<=` (Menor ou igual a)

    ```java
    int x = 5;
    int y = 8;
    System.out.println("x == y: " + (x == y)); // Saída: false
    System.out.println("x != y: " + (x != y)); // Saída: true
    System.out.println("x < y: " + (x < y));   // Saída: true
    ```

*   **Operadores Lógicos:** Combinam expressões booleanas.
    *   `&&` (E lógico - AND): Retorna `true` se **ambas** as expressões forem `true`. (Short-circuit: se a primeira for `false`, a segunda não é avaliada).
    *   `||` (OU lógico - OR): Retorna `true` se **pelo menos uma** das expressões for `true`. (Short-circuit: se a primeira for `true`, a segunda não é avaliada).
    *   `!` (NÃO lógico - NOT): Inverte o valor booleano (`true` vira `false`, `false` vira `true`).

    ```java
    boolean temSol = true;
    boolean fimDeSemana = false;
    System.out.println("Ir à praia? " + (temSol && fimDeSemana)); // Saída: false
    System.out.println("Ficar em casa? " + (temSol || fimDeSemana)); // Saída: true
    System.out.println("Não é fim de semana? " + !fimDeSemana); // Saída: true
    ```

*   **Operadores de Atribuição:** Atribuem valores a variáveis.
    *   `=` (Atribuição simples)
    *   `+=`, `-=`, `*=`, `/=`, `%=` (Atribuição composta - ex: `x += 5` é o mesmo que `x = x + 5`)

    ```java
    int saldo = 100;
    saldo += 50; // saldo agora é 150 (saldo = saldo + 50)
    saldo -= 20; // saldo agora é 130 (saldo = saldo - 20)
    System.out.println("Saldo final: " + saldo); // Saída: 130
    ```

*   **Operadores de Incremento e Decremento:** Aumentam ou diminuem o valor de uma variável numérica em 1.
    *   `++` (Incremento): `x++` (pós-incremento: usa o valor atual e depois incrementa) ou `++x` (pré-incremento: incrementa primeiro e depois usa o novo valor).
    *   `--` (Decremento): `x--` (pós-decremento) ou `--x` (pré-decremento).

    ```java
    int contador = 5;
    System.out.println("Pós-incremento: " + contador++); // Saída: 5 (usa 5, depois contador vira 6)
    System.out.println("Valor atual: " + contador);    // Saída: 6
    System.out.println("Pré-incremento: " + ++contador); // Saída: 7 (incrementa para 7, depois usa 7)

    int vidas = 3;
    System.out.println("Pós-decremento: " + vidas--); // Saída: 3 (usa 3, depois vidas vira 2)
    System.out.println("Valor atual: " + vidas);    // Saída: 2
    System.out.println("Pré-decremento: " + --vidas); // Saída: 1 (decrementa para 1, depois usa 1)
    ```

*   **Operador Ternário:** Uma forma concisa de escrever uma estrutura `if-else` simples.
    *   `condicao ? valor_se_verdadeiro : valor_se_falso`

    ```java
    int idade = 20;
    String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(status); // Saída: Maior de idade

    double nota = 7.5;
    String resultado = (nota >= 7.0) ? "Aprovado" : "Reprovado";
    System.out.println(resultado); // Saída: Aprovado
    ```

*   **Precedência de Operadores:** Assim como na matemática, os operadores têm uma ordem de execução (ex: `*` e `/` antes de `+` e `-`). Use parênteses `()` para controlar a ordem quando necessário ou para tornar o código mais claro. Ex: `(a + b) * c`.

### 2.5 Entrada e Saída Básica

Já vimos a saída com `System.out.println()`. Como lemos dados digitados pelo usuário? Usando a classe `Scanner`.

*   **Saída:**
    *   `System.out.println()`: Imprime o texto e move o cursor para a próxima linha.
    *   `System.out.print()`: Imprime o texto sem pular linha.

*   **Entrada (Usando `Scanner`):**
    1.  **Importar a classe:** Adicione `import java.util.Scanner;` no início do seu arquivo `.java` (antes da declaração da classe).
    2.  **Criar um objeto Scanner:** Dentro do método `main` (ou onde for usar), crie uma instância: `Scanner scanner = new Scanner(System.in);` (Isso diz ao Scanner para ler da entrada padrão, que é o teclado).
    3.  **Ler dados:** Use métodos do objeto `scanner`:
        *   `nextInt()`: Lê um valor inteiro.
        *   `nextDouble()`: Lê um valor double.
        *   `nextFloat()`: Lê um valor float.
        *   `nextBoolean()`: Lê um valor boolean (`true` ou `false`).
        *   `next()`: Lê a próxima "palavra" (sequência de caracteres até um espaço em branco).
        *   `nextLine()`: Lê a linha inteira de texto (até o Enter).
            *   **Cuidado:** Se você usou `nextInt()`, `nextDouble()`, etc., antes de `nextLine()`, a "quebra de linha" (Enter) que você pressionou fica no buffer. `nextLine()` lê essa quebra de linha vazia. Para resolver, consuma a quebra de linha pendente chamando `scanner.nextLine();` *antes* de ler a string desejada.
    4.  **Fechar o Scanner:** Quando não precisar mais ler dados, feche o scanner para liberar recursos: `scanner.close();`. É uma boa prática fazer isso no final do seu programa ou bloco `try-with-resources` (veremos isso mais tarde).

**Exemplo:**

```java
import java.util.Scanner; // 1. Importar

public class EntradaUsuario {
    public static void main(String[] args) {
        // 2. Criar o objeto Scanner
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine(); // Lê a linha inteira

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt(); // Lê um inteiro

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = leitor.nextDouble(); // Lê um double

        // Consumir a quebra de linha pendente após nextDouble()
        leitor.nextLine();

        System.out.print("Qual sua linguagem favorita? ");
        String linguagem = leitor.nextLine(); // Lê a linha inteira corretamente agora

        System.out.println("\n--- Dados Digitados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Linguagem: " + linguagem);

        // 4. Fechar o Scanner
        leitor.close();
    }
}
```

### ✨ Prática 2.1: Variáveis e Tipos ✨

1.  Crie um programa que declare variáveis para armazenar:
    *   O nome de um produto (`String`).
    *   O preço desse produto (`double`).
    *   A quantidade em estoque (`int`).
    *   Se o produto está disponível (`boolean`).
2.  Inicialize essas variáveis com valores fictícios.
3.  Imprima os valores no console de forma organizada, por exemplo:
    ```
    Produto: Notebook Gamer
    Preço: R$ 5499.90
    Quantidade: 15
    Disponível: true
    ```

### ✨ Prática 2.2: Manipulação de Strings ✨

1.  Crie um programa que peça ao usuário para digitar seu nome completo usando `Scanner`.
2.  Imprima:
    *   O nome completo em maiúsculas.
    *   O nome completo em minúsculas.
    *   O número total de caracteres no nome (incluindo espaços).
    *   A primeira letra do nome.
    *   As três últimas letras do nome.
    *   Substitua todos os espaços por underscores (`_`).

### ✨ Prática 2.3: Operadores ✨

1.  Crie um programa que peça ao usuário dois números inteiros.
2.  Calcule e imprima:
    *   A soma dos dois números.
    *   A diferença entre o primeiro e o segundo.
    *   O produto dos dois números.
    *   O resultado da divisão inteira do primeiro pelo segundo.
    *   O resto da divisão do primeiro pelo segundo.
    *   O resultado da divisão real (com casas decimais) do primeiro pelo segundo.
3.  Verifique e imprima se o primeiro número é maior que o segundo.
4.  Verifique e imprima se ambos os números são positivos (`> 0`).

### ✨ Prática 2.4: Calculadora Simples ✨

1.  Crie um programa que funcione como uma calculadora básica:
    *   Peça ao usuário para digitar o primeiro número (`double`).
    *   Peça ao usuário para digitar o segundo número (`double`).
    *   Peça ao usuário para digitar a operação desejada (`+`, `-`, `*`, `/`). Pode usar `leitor.next()` para ler o operador como String.
    *   **Desafio:** Use o operador ternário ou estruturas `if` (que veremos a seguir) para realizar o cálculo correto com base no operador digitado e imprimir o resultado. Lide com a divisão por zero (imprima uma mensagem de erro se o segundo número for 0 e a operação for `/`).

    ---

## Seção 3: Tomando Decisões e Repetindo Tarefas - Estruturas de Controle

Programas interessantes geralmente não executam apenas uma sequência linear de comandos. Eles precisam tomar decisões baseadas em condições e repetir tarefas. Para isso, usamos as estruturas de controle.

### 3.1 Estruturas de Seleção (Decisão)

Permitem que o programa escolha qual bloco de código executar com base em uma condição booleana (`true` ou `false`).

*   **`if`:** Executa um bloco de código *se* a condição for verdadeira.

    ```java
    int temperatura = 25;

    if (temperatura > 30) {
        System.out.println("Está muito quente! Ligue o ar condicionado.");
        // Mais código pode ir aqui dentro do bloco if
    }
    System.out.println("Continuando o programa..."); // Esta linha sempre executa
    ```

*   **`if-else`:** Executa um bloco de código se a condição for verdadeira, e *outro* bloco se a condição for falsa.

    ```java
    int idade = 17;

    if (idade >= 18) {
        System.out.println("Você é maior de idade. Pode entrar.");
    } else {
        System.out.println("Você é menor de idade. Acesso negado.");
    }
    ```

*   **`if-else if-else`:** Permite testar múltiplas condições em sequência. O primeiro `if` ou `else if` cuja condição for verdadeira terá seu bloco executado. O bloco `else` final (opcional) é executado se *nenhuma* das condições anteriores for verdadeira.

    ```java
    double nota = 6.5;

    if (nota >= 9.0) {
        System.out.println("Conceito A - Excelente!");
    } else if (nota >= 7.0) {
        System.out.println("Conceito B - Bom");
    } else if (nota >= 5.0) {
        System.out.println("Conceito C - Suficiente");
    } else {
        System.out.println("Conceito D - Insuficiente");
    }
    ```

*   **`if`s Aninhados:** Você pode colocar estruturas `if` dentro de outras estruturas `if`.

    ```java
    boolean temIngresso = true;
    int idadeCliente = 20;

    if (temIngresso) {
        System.out.println("Ingresso verificado.");
        if (idadeCliente >= 18) {
            System.out.println("Idade verificada. Pode entrar na festa!");
        } else {
            System.out.println("Idade insuficiente para esta festa.");
        }
    } else {
        System.out.println("Sem ingresso, não pode entrar.");
    }
    ```

    ### 3.2 Estrutura de Múltipla Escolha: `switch-case`

É uma alternativa ao `if-else if-else` quando você precisa comparar uma variável com vários valores constantes específicos (inteiros, caracteres, Strings ou enums - veremos enums depois).

*   **Sintaxe:**

    ```java
    switch (variavel_para_testar) {
        case valor1:
            // Código a ser executado se variavel_para_testar == valor1
            break; // Importante! Sai do switch. Sem ele, executa o próximo case (fall-through).
        case valor2:
            // Código a ser executado se variavel_para_testar == valor2
            break;
        case valor3:
        case valor4: // Múltiplos cases podem executar o mesmo bloco
            // Código para valor3 ou valor4
            break;
        default:
            // Código a ser executado se nenhum case corresponder (opcional)
            // Não precisa de break aqui, pois é o último.
    }
    ```

*   **Exemplo (Dia da Semana):**

    ```java
    int diaSemana = 3; // 1=Domingo, 2=Segunda, ... 7=Sábado
    String nomeDia;

    switch (diaSemana) {
        case 1:
            nomeDia = "Domingo";
            break;
        case 2:
            nomeDia = "Segunda-feira";
            break;
        case 3:
            nomeDia = "Terça-feira";
            break;
        case 4:
            nomeDia = "Quarta-feira";
            break;
        case 5:
            nomeDia = "Quinta-feira";
            break;
        case 6:
            nomeDia = "Sexta-feira";
            break;
        case 7:
            nomeDia = "Sábado";
            break;
        default:
            nomeDia = "Dia inválido";
            // break opcional aqui
    }
    System.out.println("Hoje é: " + nomeDia); // Saída: Hoje é: Terça-feira
    ```

*   **Exemplo (String - Java 7+):**

    ```java
    String tipoUsuario = "admin";
    String permissao;

    switch (tipoUsuario.toLowerCase()) { // Boa prática: normalizar a string
        case "admin":
            permissao = "Acesso Total";
            break;
        case "editor":
            permissao = "Acesso para Edição";
            break;
        case "viewer":
            permissao = "Acesso para Visualização";
            break;
        default:
            permissao = "Acesso Negado";
    }
    System.out.println("Permissão: " + permissao); // Saída: Permissão: Acesso Total
    ```

**`switch` vs `if-else if`:** Use `switch` quando tiver uma variável sendo comparada com múltiplos valores *constantes*. Use `if-else if` para condições mais complexas (intervalos, múltiplas variáveis, etc.).

### 3.3 Estruturas de Repetição (Loops)

Permitem executar um bloco de código várias vezes.

*   **`for`:** Ideal quando você sabe *quantas vezes* quer repetir o bloco de código.
    *   **Sintaxe:** `for (inicializacao; condicao; atualizacao) { // código a repetir }`
        *   `inicializacao`: Executada uma única vez no início (ex: `int i = 0`).
        *   `condicao`: Verificada *antes* de cada iteração. Se `true`, o bloco executa. Se `false`, o loop termina.
        *   `atualizacao`: Executada *ao final* de cada iteração (ex: `i++`).

    ```java
    // Imprimir números de 0 a 4
    System.out.println("Contagem com for:");
    for (int i = 0; i < 5; i++) {
        System.out.println("i = " + i);
    }
    // Saída:
    // i = 0
    // i = 1
    // i = 2
    // i = 3
    // i = 4

    // Contagem regressiva
    System.out.println("\nContagem regressiva:");
    for (int j = 5; j > 0; j--) {
        System.out.println(j);
    }
    System.out.println("Fogo!");
    ```

*   **`while`:** Ideal quando você quer repetir *enquanto* uma condição for verdadeira, mas não sabe exatamente quantas vezes isso vai acontecer. A condição é verificada *antes* de cada iteração.

    ```java
    Scanner leitor = new Scanner(System.in);
    int numeroDigitado = 0;

    // Pede números até que o usuário digite -1
    while (numeroDigitado != -1) {
        System.out.print("Digite um número (ou -1 para sair): ");
        numeroDigitado = leitor.nextInt();

        if (numeroDigitado != -1) {
             System.out.println("Você digitou: " + numeroDigitado);
        }
    }
    System.out.println("Programa encerrado.");
    // Lembre de fechar o scanner se não for mais usá-lo
    // leitor.close(); // Fechar aqui pode dar erro se precisar ler depois
    ```
    **Cuidado:** Certifique-se de que a condição do `while` eventualmente se torne `false`, caso contrário, você terá um *loop infinito*.

*   **`do-while`:** Similar ao `while`, mas a condição é verificada *depois* da execução do bloco. Isso garante que o bloco de código seja executado *pelo menos uma vez*, mesmo que a condição seja inicialmente falsa.

    ```java
    Scanner input = new Scanner(System.in);
    int opcao;

    // Exibe um menu e repete até que o usuário escolha sair (opção 0)
    do {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Opção A");
        System.out.println("2. Opção B");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a Opção A.");
                break;
            case 2:
                System.out.println("Você escolheu a Opção B.");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0); // Condição verificada no final

    input.close(); // Fechar o scanner no final do uso
    ```

### 3.4 Controle de Fluxo Dentro de Loops: `break` e `continue`

*   **`break`:** Interrompe imediatamente a execução do loop (`for`, `while`, `do-while` ou `switch`) mais interno em que se encontra. O programa continua na primeira instrução *após* o loop.

    ```java
    System.out.println("\nExemplo com break:");
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            System.out.println("Encontrei o 5, saindo do loop!");
            break; // Interrompe o for
        }
        System.out.println("i = " + i);
    }
    System.out.println("Loop finalizado.");
    // Saída: i = 0, i = 1, i = 2, i = 3, i = 4, Encontrei o 5..., Loop finalizado.
    ```

*   **`continue`:** Pula o restante da iteração atual do loop e passa para a próxima iteração (verifica a condição e executa a atualização no `for`).

    ```java
    System.out.println("\nExemplo com continue:");
    for (int i = 0; i < 5; i++) {
        if (i == 2) {
            System.out.println("Pulando a iteração onde i = 2");
            continue; // Pula o System.out.println abaixo para i=2
        }
        System.out.println("Processando i = " + i);
    }
    // Saída: Processando i = 0, Processando i = 1, Pulando..., Processando i = 3, Processando i = 4
    ```

    ### ✨ Prática 3.1: Verificação Par/Ímpar ✨

1.  Crie um programa que peça ao usuário um número inteiro.
2.  Use `if-else` e o operador módulo (`%`) para verificar se o número é par ou ímpar.
3.  Imprima o resultado (ex: "O número 10 é par." ou "O número 7 é ímpar.").

### ✨ Prática 3.2: Calculadora com `switch` ✨

1.  Revisite a Prática 2.4 (Calculadora Simples).
2.  Em vez de usar `if-else if`, use uma estrutura `switch` para lidar com as diferentes operações (`+`, `-`, `*`, `/`) digitadas pelo usuário (lembre-se que `switch` funciona com Strings a partir do Java 7).
3.  Inclua um `default` case para operações inválidas.
4.  Mantenha a verificação para evitar divisão por zero.

### ✨ Prática 3.3: Tabuada com `for` ✨

1.  Peça ao usuário um número inteiro.
2.  Use um loop `for` para calcular e imprimir a tabuada desse número, de 1 a 10.
    *   Exemplo de saída para o número 7:
        ```
        Tabuada do 7:
        7 x 1 = 7
        7 x 2 = 14
        ...
        7 x 10 = 70
        ```

### ✨ Prática 3.4: Adivinhe o Número com `while` ✨

1.  Gere um número aleatório entre 1 e 100. (Dica: use `int numeroSecreto = (int)(Math.random() * 100) + 1;`. Você pode precisar importar `java.util.Random` e usar `Random random = new Random(); int numeroSecreto = random.nextInt(100) + 1;` também).
2.  Use um loop `while` para pedir ao usuário que adivinhe o número.
3.  Dentro do loop:
    *   Leia o palpite do usuário.
    *   Compare o palpite com o número secreto.
    *   Dê dicas ao usuário: "Muito alto!", "Muito baixo!" ou "Parabéns, você acertou!".
    *   O loop deve continuar *enquanto* o palpite for diferente do número secreto.
4.  Conte quantas tentativas o usuário levou para acertar e mostre no final.

### ✨ Prática 3.5: Menu com `do-while` ✨

1.  Crie um programa que simule um caixa eletrônico simples usando `do-while`.
2.  Mantenha uma variável para o saldo (`double`, comece com um valor, ex: 1000.0).
3.  Exiba um menu com opções:
    *   1. Ver Saldo
    *   2. Depositar
    *   3. Sacar
    *   0. Sair
4.  Use `switch` dentro do `do-while` para tratar a opção escolhida:
    *   Ver Saldo: Mostre o saldo atual.
    *   Depositar: Peça o valor a depositar (`double`), some ao saldo.
    *   Sacar: Peça o valor a sacar (`double`), verifique se há saldo suficiente (`if`), se sim, subtraia do saldo, senão, mostre "Saldo insuficiente".
    *   Sair: Termine o loop.
    *   Default: Mostre "Opção inválida".
5.  O loop continua enquanto a opção não for 0. Certifique-se de fechar o `Scanner` após o loop.

---

## Resumo do Módulo 1 🎉

Parabéns por completar o Módulo 1!

Neste módulo, você aprendeu:

1.  **Ambiente Java:** A diferença entre **JDK**, **JRE** e **JVM**, como instalar o JDK e configurar as variáveis de ambiente. A importância de usar uma **IDE**.
2.  **Primeiro Programa:** Como criar, compilar (`javac`) e executar (`java`) um programa Java simples ("Hello, World!"), entendendo a estrutura básica (`public class`, `main`).
3.  **Elementos Básicos:**
    *   **Comentários:** Como documentar seu código (`//`, `/* */`, `/** */`).
    *   **Variáveis e Tipos Primitivos:** Como declarar e usar `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
    *   **Classe `String`:** Como manipular texto, sua **imutabilidade** e métodos comuns (`.length()`, `.toUpperCase()`, `.equals()`, etc.).
    *   **Operadores:** Aritméticos (`+`, `-`, `*`, `/`, `%`), relacionais (`==`, `!=`, `>`, `<`), lógicos (`&&`, `||`, `!`), de atribuição (`=`, `+=`), incremento/decremento (`++`, `--`) e ternário (`? :`).
    *   **Entrada/Saída:** Como ler dados do usuário com `Scanner` (`nextInt()`, `nextDouble()`, `nextLine()`) e exibir informações com `System.out.println()`.
4.  **Estruturas de Controle:**
    *   **Seleção:** Tomar decisões com `if`, `if-else`, `if-else if` e `switch-case`.
    *   **Repetição:** Executar blocos de código múltiplas vezes com `for`, `while` e `do-while`.
    *   **Controle de Fluxo:** Usar `break` para sair de loops/switch e `continue` para pular para a próxima iteração.

Com essas ferramentas, você já pode criar programas Java que interagem com o usuário, realizam cálculos, tomam decisões e repetem tarefas.

---

## 🚀 Desafio Final do Módulo 1 🚀

**Título:** Calculadora de IMC (Índice de Massa Corporal) Interativa

**Objetivo:** Criar um programa que calcula o IMC de um usuário, classifica o resultado e pergunta se ele deseja calcular novamente.

**Requisitos:**

1.  **Boas-vindas:** Cumprimente o usuário.
2.  **Loop Principal:** Use um loop (`do-while` é uma boa opção) para permitir que o usuário faça múltiplos cálculos sem reiniciar o programa. O loop deve continuar enquanto o usuário desejar.
3.  **Entrada de Dados:** Dentro do loop, peça ao usuário:
    *   Seu peso em quilogramas (`double`).
    *   Sua altura em metros (`double`). Use `Scanner` para ler os valores. Lembre-se de tratar a questão do `nextLine()` se necessário.
4.  **Cálculo do IMC:** Calcule o IMC usando a fórmula: `imc = peso / (altura * altura)`.
5.  **Classificação:** Use `if-else if-else` para classificar o IMC de acordo com as faixas comuns (pesquise as faixas padrão da OMS):
    *   Abaixo de 18.5: Abaixo do peso
    *   18.5 a 24.9: Peso normal
    *   25.0 a 29.9: Sobrepeso
    *   30.0 a 34.9: Obesidade Grau I
    *   35.0 a 39.9: Obesidade Grau II
    *   Acima de 40.0: Obesidade Grau III (Mórbida)
6.  **Exibição do Resultado:** Mostre ao usuário o valor do IMC calculado (com 2 casas decimais - Dica: use `System.out.printf("Seu IMC é: %.2f\n", imc);`) e a classificação correspondente.
7.  **Continuar?** Pergunte ao usuário se ele deseja calcular outro IMC (ex: "Deseja calcular novamente? (s/n)"). Leia a resposta (`char` ou `String`). Converta para minúsculas para facilitar a comparação (`.toLowerCase()`).
8.  **Condição de Saída:** O loop principal deve terminar se a resposta do usuário *não* for 's'.
9.  **Despedida:** Quando o loop terminar, exiba uma mensagem de despedida.
10. **Boas Práticas:** Use comentários, nomes de variáveis significativos e feche o `Scanner` corretamente no final do programa (fora do loop).

Este desafio integra `Scanner`, tipos `double`, operadores aritméticos, `if-else if-else`, formatação de saída e um loop `do-while` com condição de saída baseada na entrada do usuário. Boa sorte!

---

**Próximos Passos (Sugestão para Módulo 2):**

*   Arrays (Vetores e Matrizes)
*   Métodos (Funções)
*   Introdução à Orientação a Objetos (Classes, Atributos, Métodos, Objetos, Construtores)
*   Encapsulamento