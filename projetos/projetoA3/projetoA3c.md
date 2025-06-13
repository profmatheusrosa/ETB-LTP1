# Projeto Prático III-C: Sistema de Controle de Estoque com POO, ArrayList e Exceções Personalizadas

## Objetivo
Aprimorar os conceitos de Programação Orientada a Objetos (POO) em Java, incluindo o uso de `ArrayList` e seus principais métodos, tratamento de exceções e criação de exceções personalizadas, além dos conceitos já praticados anteriormente (Classes, Objetos, Herança, Polimorfismo, Interface, Classe Abstrata, Sobrecarga de Métodos).

## Descrição
Implementar um sistema que:
- Gerencie o estoque de um único produto usando classes e objetos
- Registre as movimentações de estoque em um `ArrayList` de objetos
- Permita entradas e saídas do estoque
- Mostre histórico de movimentações e estatísticas
- Utilize herança, polimorfismo, interface, classe abstrata, sobrecarga de métodos, `ArrayList` e tratamento de exceções
- Implemente exceções personalizadas para validação de movimentações

## Funcionalidades
1. **Estrutura de Classes**:
   - Classe abstrata `MovimentacaoEstoque` com atributos e métodos comuns (quantidade, data, tipo)
   - Subclasses para diferentes tipos de movimentação (Entrada, Saída), cada uma com regras específicas de validação
   - Interface `Processavel` com métodos para processar movimentações
   - Sobrecarga de métodos para registrar movimentação
   - **Uso de `ArrayList<MovimentacaoEstoque>`** para armazenar o histórico
   - Utilização dos principais métodos do `ArrayList`: `add`, `remove`, `get`, `size`, `clear`, `contains`, etc.
   - **Exceções personalizadas** para validação de quantidade e saldo (ex: `MovimentacaoInvalidaException`)
   - Tratamento de exceções com `try-catch` e lançamento de exceções personalizadas

2. **Entrada de Dados**:
   - Registrar nova movimentação (positivo para entrada, negativo para saída)
   - Validar os dados lançando exceções personalizadas em caso de valores inválidos
   - Criar objeto correspondente e adicionar ao `ArrayList` de histórico

3. **Processamento**:
   - Atualizar saldo do estoque usando métodos das classes
   - Validar quantidade mínima (0) e máxima (999)
   - Calcular média de movimentações

4. **Exibição**:
   - Mostrar histórico de todas as movimentações armazenadas no `ArrayList`
   - Permitir remoção de movimentações do histórico
   - Exibir saldo atual
   - Apresentar estatísticas
   - Permitir limpar todo o histórico usando `clear()`

5. **Tratamento de Exceções**:
   - Utilizar blocos `try-catch` para capturar exceções de entrada e de lógica
   - Lançar exceções personalizadas para valores inválidos
   - Exibir mensagens de erro amigáveis ao usuário

## Exemplo de Uso
```
=== CONTROLE DE ESTOQUE (POO/ArrayList) ===
1. Registrar movimentação
2. Ver histórico
3. Remover movimentação
4. Limpar histórico
5. Ver estatísticas
6. Sair
Escolha uma opção: 1

[MOVIMENTAÇÃO]
Digite a quantidade (+/-): -200
Erro: Saldo insuficiente para saída!
Digite a quantidade (+/-): 50
Movimentação registrada!
Saldo atual: 50 unidades

=== CONTROLE DE ESTOQUE (POO/ArrayList) ===
1. Registrar movimentação
2. Ver histórico
3. Remover movimentação
4. Limpar histórico
5. Ver estatísticas
6. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. +50 unidades (Entrada)
2. -20 unidades (Saída)
Saldo atual: 30 unidades

=== CONTROLE DE ESTOQUE (POO/ArrayList) ===
1. Registrar movimentação
2. Ver histórico
3. Remover movimentação
4. Limpar histórico
5. Ver estatísticas
6. Sair
Escolha uma opção: 3

Digite o índice da movimentação para remover: 2
Movimentação removida com sucesso!

=== CONTROLE DE ESTOQUE (POO/ArrayList) ===
1. Registrar movimentação
2. Ver histórico
3. Remover movimentação
4. Limpar histórico
5. Ver estatísticas
6. Sair
Escolha uma opção: 4

Histórico limpo!

=== CONTROLE DE ESTOQUE (POO/ArrayList) ===
1. Registrar movimentação
2. Ver histórico
3. Remover movimentação
4. Limpar histórico
5. Ver estatísticas
6. Sair
Escolha uma opção: 5

[ESTATÍSTICAS]
Total movimentações: 1
Maior entrada: 50
Maior saída: 0
Média movimentações: 50
Saldo atual: 50

=== CONTROLE DE ESTOQUE (POO/ArrayList) ===
1. Registrar movimentação
2. Ver histórico
3. Remover movimentação
4. Limpar histórico
5. Ver estatísticas
6. Sair
Escolha uma opção: 6
Programa finalizado!
```

## Observações
- O histórico agora é um `ArrayList<MovimentacaoEstoque>`, permitindo tamanho dinâmico
- Utilize os principais métodos do `ArrayList` no código
- Implemente e utilize exceções personalizadas para validação de dados
- Utilize todos os conceitos de POO: Classes, Objetos, Atributos, Métodos, Construtores, Herança, Polimorfismo, Encapsulamento, Interface, Classe Abstrata, Sobrecarga de Métodos, Coleções e Exceções

## Critérios de Avaliação
| Critério                               | Pontos |
|---------------------------------------|--------|
| **Funcionalidade (2.5)**              |        |
| - Implementação dos requisitos        | 1.0    |
| - Uso correto do ArrayList           | 1.0    |
| - Precisão nos cálculos              | 0.5    |
| **Qualidade do Código (2.0)**         |        |
| - Organização e clareza              | 0.5    |
| - Comentários e documentação         | 0.5    |
| - Tratamento de erros e exceções     | 1.0    |
| **Interface e Usabilidade (1.0)**     |        |
| - Clareza nas mensagens              | 1.0    |
| **Apresentação (4.5)**                |        |
| - Domínio do código                  | 2.0    |
| - Explicação da lógica               | 2.0    |
| - Respostas às perguntas             | 0.5    |
| **Total**                             | 10.0   |

### Observações da Avaliação
- Nota mínima para aprovação: 5.0 pontos
- Trabalhos não apresentados recebem nota zero
- Leitura durante apresentação recebe nota zero
- Membros ausentes recebem nota zero
- Códigos que não executam recebem nota zero
- Cada membro deve apresentar
- A nota da apresentação será individual
- Demonstração prática obrigatória

## Instruções de Entrega
1. **Email**:
   - Para: matheusluis103@gmail.com
   - Assunto: "ETB-LTP1-ProjetoA3-[TURMA][GRUPO]"
   - Até: 25/06, 14:00
   - O remetente do email deve copiar (CC) todos os demais integrantes do grupo.

2. **Conteúdo**:
   - Códigos fonte (.java)
   - Nomes dos integrantes

## Diagrama UML
```mermaid
classDiagram
    class MovimentacaoEstoque {
        <<abstract>>
        -int quantidade
        -String data
        -String tipo
        +MovimentacaoEstoque(int quantidade, String data)
        +getQuantidade() int
        +getData() String
        +getTipo() String
        +validarQuantidade() boolean
    }

    class Processavel {
        <<interface>>
        +processarMovimentacao() boolean
        +validarMovimentacao() boolean
    }

    class Entrada {
        +Entrada(int quantidade, String data)
        +processarMovimentacao() boolean
        +validarMovimentacao() boolean
    }

    class Saida {
        +Saida(int quantidade, String data)
        +processarMovimentacao() boolean
        +validarMovimentacao() boolean
    }

    class MovimentacaoInvalidaException {
        +MovimentacaoInvalidaException(String mensagem)
    }

    class Main {
        -ArrayList~MovimentacaoEstoque~ historico
        -int saldoAtual
        +registrarMovimentacao(int quantidade, String data) MovimentacaoEstoque
        +getHistorico() ArrayList~MovimentacaoEstoque~
        +adicionarAoHistorico(MovimentacaoEstoque mov) void
        +removerDoHistorico(int indice) void
        +limparHistorico() void
        +getEstatisticas() String
    }

    MovimentacaoEstoque <|-- Entrada
    MovimentacaoEstoque <|-- Saida
    Processavel <|.. Entrada
    Processavel <|.. Saida
    Main --> MovimentacaoEstoque
    Main --> MovimentacaoInvalidaException
```

O diagrama acima representa:
- `MovimentacaoEstoque`: Classe abstrata base com atributos e métodos comuns
- `Processavel`: Interface para métodos de processamento e validação
- Classes concretas: `Entrada` e `Saida` que herdam de `MovimentacaoEstoque` e implementam `Processavel`
- `MovimentacaoInvalidaException`: Exceção personalizada para validação de movimentações
- `Main`: Classe principal que gerencia as movimentações e o histórico usando um `ArrayList` e tratamento de exceções
