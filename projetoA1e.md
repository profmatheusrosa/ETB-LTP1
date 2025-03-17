# Projeto Prático I-E: Calculadora de Notas

## Objetivo
Praticar a sintaxe Java e lógica de programação com uma calculadora de notas.

## Descrição
Desenvolver uma aplicação que:
- Use um único array de números para armazenar todas as notas
- Trabalhe com 3 notas por aluno
- Calcule média e determine aprovação/reprovação
- Processe até 5 alunos por vez

## Funcionalidades
1. **Entrada de Dados**:
   - Array único de doubles para todas as notas
   - Cada 3 posições representam as notas de um aluno
   - Exemplo: notas[0], notas[1], notas[2] são do primeiro aluno

2. **Processamento**:
   - Cálculo de média usando índices do array
   - Média 7.0 para aprovação
   - Processamento sequencial de 3 em 3 notas

3. **Exibição**:
   - Mostrar notas por aluno
   - Exibir média calculada
   - Informar status final

## Estrutura do Projeto
```
/src/main/java/com/projeto
    CalculadoraNotas.java
```

## Exemplo de Uso
```
[ENTRADA DE DADOS]
Quantidade de alunos: 2

Aluno 1:
Nota 1: 7.5
Nota 2: 8.0
Nota 3: 6.5

Aluno 2:
Nota 1: 9.0
Nota 2: 8.5
Nota 3: 9.5

[RESULTADOS]
Aluno 1:
Notas: 7.5, 8.0, 6.5
Média: 7.33
Status: APROVADO

Aluno 2:
Notas: 9.0, 8.5, 9.5
Média: 9.00
Status: APROVADO
```

## Exemplos de Uso
```
=== CALCULADORA DE NOTAS ===
1. Inserir notas
2. Mostrar todas as notas
3. Calcular médias
4. Sair
Escolha uma opção: 1

[ENTRADA DE NOTAS]
Número do aluno (1-5): 1
Nota 1: 7.5
Nota 2: 8.0
Nota 3: 6.5
Notas registradas!

=== CALCULADORA DE NOTAS ===
1. Inserir notas
2. Mostrar todas as notas
3. Calcular médias
4. Sair
Escolha uma opção: 1

[ENTRADA DE NOTAS]
Número do aluno (1-5): 2
Nota 1: 9.0
Nota 2: 8.5
Nota 3: 9.5
Notas registradas!

=== CALCULADORA DE NOTAS ===
1. Inserir notas
2. Mostrar todas as notas
3. Calcular médias
4. Sair
Escolha uma opção: 2

[NOTAS]
Aluno 1:
- Nota 1: 7.5
- Nota 2: 8.0
- Nota 3: 6.5

Aluno 2:
- Nota 1: 9.0
- Nota 2: 8.5
- Nota 3: 9.5

=== CALCULADORA DE NOTAS ===
1. Inserir notas
2. Mostrar todas as notas
3. Calcular médias
4. Sair
Escolha uma opção: 3

[MÉDIAS]
Aluno 1:
Média: 7.33
Status: APROVADO

Aluno 2:
Média: 9.00
Status: APROVADO

=== CALCULADORA DE NOTAS ===
1. Inserir notas
2. Mostrar todas as notas
3. Calcular médias
4. Sair
Escolha uma opção: 7
Opção inválida!

=== CALCULADORA DE NOTAS ===
1. Inserir notas
2. Mostrar todas as notas
3. Calcular médias
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Observações
- O array terá tamanho fixo de 15 posições (5 alunos × 3 notas)
- Os nomes dos alunos serão referenciados por números (Aluno 1, Aluno 2, etc.)
- Notas devem estar entre 0 e 10
- Média calculada com duas casas decimais
- Aprovação com média maior ou igual a 7.0
- Processamento sempre em grupos de 3 notas
- Não é necessário validar preenchimento completo do array