# Projeto Prático I-B: Calculadora de IMC

## Objetivo
Praticar a sintaxe Java e lógica de programação com sistema de cálculo de IMC.

## Descrição
Criar uma aplicação console que:
- Calcule o IMC de várias pessoas
- Armazene os dados em um único array
- Mostre resultados sequencialmente

## Funcionalidades
1. **Entrada de Dados**:
   - Array único para armazenar IMC das pessoas

2. **Cálculo e Exibição**:
   - Processamento sequencial do array
   - Exibição na ordem de entrada

## Exemplos de Uso
```
=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[CÁLCULO DE IMC]
Digite o peso (kg): 70
Digite a altura (m): 1.75

Resultado:
IMC: 22.86
Classificação: Peso Normal

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[CÁLCULO DE IMC]
Digite o peso (kg): 80
Digite a altura (m): 1.65

Resultado:
IMC: 29.38
Classificação: Sobrepeso

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. IMC: 22.86 (Normal)
2. IMC: 29.38 (Sobrepeso)

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 3

[ESTATÍSTICAS]
Total de registros: 2
Menor IMC: 22.86
Maior IMC: 29.38
Média: 26.12

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 5
Opção inválida!
```

## Observações
- O array armazena apenas os valores de IMC calculados
- Capacidade máxima de 10 IMCs no array
- Não é necessário armazenar nome, peso ou altura
- IMC deve ser apresentado com duas casas decimais
- Usar as faixas padrão de classificação do IMC
