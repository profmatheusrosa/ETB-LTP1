# ETB LTP1 Avaliação (A3): Sistema Escolar  🏫

## Sumário 📚

- [Objetivo do Projeto](#objetivo-do-projeto-)
- [Descrição do Projeto](#descrição-do-projeto-)
- [Conceitos Utilizados](#conceitos-utilizados-)
- [Requisitos do Projeto](#requisitos-do-projeto-)
- [Exemplos de Execução do Sistema Escolar](#exemplos-de-execução-do-sistema-escolar-)
- [Critérios de Avaliação](#critérios-de-avaliação-)

---

## Objetivo do Projeto 🎯
Desenvolver um sistema simples de cadastro para uma escola, incluindo alunos e funcionários, que permita praticar conceitos básicos de Programação Orientada a Objetos (POO) em Java.

## Descrição do Projeto 📜
Este sistema escolar terá duas entidades principais: **Alunos** e **Funcionários**. A ideia é criar um programa que permita cadastrar, listar e exibir informações desses indivíduos. Para isso, serão utilizadas classes, herança, encapsulamento e polimorfismo.

## Conceitos Utilizados 💡
Serão utilizados os seguintes conceitos relativos ao plano de curso para realização do projeto:

1. **Programação Orientada a Objetos (POO):**  
   Introdução aos princípios básicos de POO, como organização do código em classes e objetos.

2. **Classes e Objetos:**  
   Criação e utilização de classes como modelos e instâncias representando objetos.

3. **Encapsulamento:**  
   Uso de modificadores de acesso (`private`, `public`) e métodos `getters` e `setters`.

4. **Herança:**  
   Criação de subclasses para aproveitar características de uma classe base.

5. **Polimorfismo:**  
   Sobrescrita de métodos para personalizar comportamentos em subclasses.

6. **Sobrescrita de Métodos:**  
   Modificação de métodos da classe base nas subclasses.

7. **Listas e Estruturas de Dados:**  
   Uso de `ArrayList` para armazenar múltiplos objetos.

8. **Iteração com laços de repetição:**  
   Percorrendo listas com `for-each` ou outros laços.

9. **Entrada e Saída de Dados (I/O):**  
   - Coleta de informações com `Scanner`.  
   - Exibição de mensagens no console.

10. **Validação de Dados:**  
    Verificação e tratamento de entradas inválidas.

11. **Menu e Fluxo de Controle:**  
    Controle do programa com estruturas como `switch-case` ou `if-else`.

12. **Construtores:**  
    Métodos especiais para inicializar objetos.

13. **Documentação:**  
    Comentários claros no código para facilitar a leitura e manutenção.

## Requisitos do Projeto 📝

### 1. Classe Pessoa
- **Atributos:** `nome`, `idade`, `endereco`, `matricula`
- **Métodos:**
  - Construtor para inicializar `nome`, `idade` e `endereco`
  - Métodos `getters` e `setters` para acessar e modificar os atributos
  - Método `exibirInformacoes()` para mostrar os dados da pessoa

### 2. Classe Aluno (Subclasse de Pessoa)
- **Atributos adicionais:** `curso` (nome do curso)
- **Métodos:**
  - Construtor para inicializar `nome`, `idade`, `endereco`, `curso`
  - Sobrescrever o método `exibirInformacoes()` para incluir o curso na exibição
  - Métodos `getters` e `setters` para `curso`

### 3. Classe Funcionario (Subclasse de Pessoa)
- **Atributos adicionais:** `cargo` (cargo ocupado na escola)
- **Métodos:**
  - Construtor para inicializar `nome`, `idade`, `endereco`, `idFuncionario`, `cargo`
  - Sobrescrever o método `exibirInformacoes()` para incluir o cargo na exibição
  - Métodos `getters` e `setters` para `cargo`

### 4. Classe Main (Classe Principal do Programa)
- Criar uma lista para armazenar objetos `Aluno` e `Funcionario`.
- Métodos para:
  - Adicionar um novo aluno.
  - Adicionar um novo funcionário.
  - Listar todos os alunos e funcionários cadastrados, chamando o método `exibirInformacoes()` de cada objeto.
- Menu de opções para o usuário (ex.: `1` para cadastrar aluno, `2` para cadastrar funcionário, `3` para listar todos os cadastros, `0` para sair).

---

## Exemplos de Execução do Sistema Escolar 💻
### 1. Inicialização do Sistema
```
Menu:
1. Cadastrar Aluno
2. Cadastrar Funcionario
3. Listar todos
0. Sair
Escolha uma opcao:
```
### 2. Cadastrar um Aluno 
**Entrada do Usuário:** 
O usuário escolhe a opção 1 para cadastrar um aluno.
```
Escolha uma opcao: 1
```
O sistema pede as informações do aluno:
```
Nome: João Silva 
Idade: 20 
Endereco: Rua A, 123 
Matricula: A12345 
Curso: Engenharia
```
**Resposta do Sistema:**  
Após o cadastro, o sistema exibe uma confirmação:
```
Aluno cadastrado com sucesso!
```
### 3. Cadastrar um Funcionário 
**Entrada do Usuário:** 
O usuário escolhe a opção 2 para cadastrar um funcionário.
```
Escolha uma opcao: 2
```
O sistema pede as informações do aluno:
```
Nome: João Silva 
Idade: 20 
Endereco: Rua A, 123 
Matricula: A12345 
Cargo: Professora
```
**Resposta do Sistema:**  
Após o cadastro, o sistema exibe uma confirmação:
```
Funcionario cadastrado com sucesso!
```

### 4. Listar Todos os Cadastros
#### **Entrada do Usuário** 
O usuário escolhe a opção 3 para listar todos os cadastros de alunos e funcionários. 
```
Escolha uma opcao: 3
```
#### Resposta do Sistema
O sistema exibe as informações detalhadas de cada pessoa cadastrada: 
```
Nome: João Silva
Idade: 20
Endereco: Rua A, 123
Matricula: A12345
Curso: Engenharia
------------
Nome: Maria Oliveira
Idade: 35
Endereco: Rua B, 456
ID Funcionario: F9876
Cargo: Professora
------------
```
## Critérios de Avaliação ✅

| Critério                                           | Pontuação |
|----------------------------------------------------|-----------|
| Funcionamento do sistema (cadastro e listagem)     | 3.0       |
| Implementação correta de classes e herança         | 2.0       |
| Utilização de encapsulamento (atributos e métodos) | 1.0       |
| Uso de polimorfismo (sobrescrita de métodos)       | 1.5       |
| Estrutura de menu funcional e amigável             | 1.0       |
| Organização do código e boas práticas              | 1.0       |
| Validação e robustez (tratamento de entradas)      | 0.5       |
| Documentação e comentários no código               | 0.5       |
| **Total**                                          | **10.0**  |
