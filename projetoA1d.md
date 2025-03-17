# Projeto Prático I-D: Calculadora de Descontos

## Objetivo
Praticar operações matemáticas e lógica condicional em Java.

## Descrição
Desenvolver uma aplicação que:
- Use um array único para itens da compra
- Aplique desconto em todos os itens
- Mostre resumo da compra

## Funcionalidades
1. **Entrada de Dados**:
   - Array de itens da compra
   - Tipo de cliente único para todos os itens

2. **Processamento**:
   - Aplicação sequencial de desconto
   - Cálculo de totais

## Estrutura do Projeto
```
/src/main/java/com/projeto
    CalculadoraDesconto.java
    Compra.java
```

## Funcionalidades
1. **Arrays de Dados**:
   - Array de produtos na compra
   - Array de descontos aplicáveis
   - Array de histórico de vendas

2. **Processamento em Lote**:
   - Cálculo de desconto para múltiplos itens
   - Aplicação de regras em sequência

## Exemplos de Uso

### Exemplo 1: Cliente Regular
```
Tipo de Cliente: Regular
Valor do produto: 100.00
Quantidade: 2

Resumo da Compra:
Valor Original: R$ 200.00
Desconto (5%): R$ 10.00
Valor Final: R$ 190.00
```

### Exemplo 2: Cliente VIP
```
Tipo de Cliente: VIP
Valor do produto: 150.00
Quantidade: 3

Resumo da Compra:
Valor Original: R$ 450.00
Desconto (15%): R$ 67.50
Valor Final: R$ 382.50
```

## Exemplos de Uso
```
[COMPRA]
Cliente: VIP
Número de itens: 3

1. Camisa - R$50.00 x 2
2. Calça - R$100.00 x 1
3. Tênis - R$200.00 x 1

[RESUMO]
Valor Original: R$400.00
Desconto (15%): R$60.00
Valor Final: R$340.00
```

## Observações
- O array armazena apenas os valores dos produtos
- Máximo de 50 itens por compra
- Desconto é aplicado sobre o valor total
- Valores negativos não são permitidos
- Desconto máximo de 30%
- Arredondamento para duas casas decimais
```
