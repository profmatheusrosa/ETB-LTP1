# Projeto Prático I-D: Calculadora de Descontos

## Objetivo
Praticar operações matemáticas e lógica condicional em Java.

## Descrição
Desenvolver uma aplicação que:
- Use um array para armazenar valores de produtos
- Aplique desconto fixo por tipo de cliente
- Calcule total com desconto
- Limite de 10 produtos por compra

## Funcionalidades
1. **Entrada de Dados**:
   - Array para valores dos produtos
   - Tipo de cliente (Regular=5%, VIP=10%)

2. **Operações**:
   - Inserir valor de produto
   - Mostrar todos os valores
   - Calcular total com desconto

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
[MENU]
1. Adicionar produto
2. Mostrar produtos
3. Calcular total
4. Sair

[PRODUTO]
Valor: 100.00
Adicionado com sucesso!

[TOTAL]
Tipo cliente: VIP
Valor original: R$ 100.00
Desconto (10%): R$ 10.00
Valor final: R$ 90.00
```

## Observações
- O array armazena apenas os valores dos produtos
- Máximo de 50 itens por compra
- Desconto é aplicado sobre o valor total
- Valores negativos não são permitidos
- Desconto máximo de 30%
- Arredondamento para duas casas decimais
