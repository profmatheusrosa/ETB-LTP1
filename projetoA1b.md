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
   - Array único para armazenar dados das pessoas
   - Cada posição contém nome, peso, altura e IMC

2. **Cálculo e Exibição**:
   - Processamento sequencial do array
   - Exibição na ordem de entrada

## Estrutura do Projeto
```
/src/main/java/com/projeto
    CalculadoraIMC.java
    Pessoa.java
```

## Exemplos de Uso

### Exemplo 1: IMC Normal
```
Digite o nome: João Silva
Digite o peso (kg): 70
Digite a altura (m): 1.75

Resultado:
Nome: João Silva
IMC: 22.86
Classificação: Peso Normal
Recomendação: Manter hábitos saudáveis
```

### Exemplo 2: IMC Sobrepeso
```
Digite o nome: Maria Santos
Digite o peso (kg): 80
Digite a altura (m): 1.65

Resultado:
Nome: Maria Santos
IMC: 29.38
Classificação: Sobrepeso
Recomendação: Considerar dieta balanceada e exercícios
```

## Exemplos de Uso
```
[CADASTRO]
Número de pessoas: 3

Pessoa 1:
Nome: João
Peso: 70
Altura: 1.75

[RESULTADOS]
1. João: IMC = 22.86 (Peso Normal)
2. Maria: IMC = 23.87 (Peso Normal)
3. Pedro: IMC = 24.69 (Peso Normal)
```

### Exemplo de Interação com Menu
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
Escolha uma opção: 2

[HISTÓRICO]
1. IMC: 22.86 (Normal)
2. IMC: 25.30 (Sobrepeso)
3. IMC: 21.50 (Normal)

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Exemplo Completo de Uso
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
Escolha uma opção: 0
Opção inválida!

=== CALCULADORA DE IMC ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Observações
- O array armazena apenas os valores de IMC calculados
- Capacidade máxima de 10 IMCs no array
- Não é necessário armazenar nome, peso ou altura
- IMC deve ser apresentado com duas casas decimais
- Usar as faixas padrão de classificação do IMC
