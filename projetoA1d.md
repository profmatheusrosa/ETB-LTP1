# Projeto Prático I-D: Calculadora de Descontos

## Objetivo
Praticar a sintaxe Java e lógica de programação com cálculos de desconto.

## Descrição
Desenvolver uma aplicação que:
- Use um array para armazenar os últimos descontos aplicados
- Calcule descontos baseados no valor da compra
- Mantenha histórico das últimas 10 operações
- Exiba estatísticas dos descontos

## Funcionalidades
1. **Entrada de Dados**:
   - Valor da compra
   - Tipo de cliente (Regular=5%, VIP=10%)
   - Armazenar desconto calculado no array

2. **Processamento**:
   - Calcular valor do desconto
   - Calcular valor final
   - Armazenar no histórico

3. **Exibição**:
   - Mostrar resultado atual
   - Exibir histórico de descontos
   - Apresentar estatísticas

## Exemplo de Uso
```
=== CALCULADORA DE DESCONTOS ===
1. Calcular desconto
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[NOVA COMPRA]
Valor da compra: 100.00
Tipo de cliente (R/V): V

[RESULTADO]
Valor original: R$ 100.00
Desconto (10%): R$ 10.00
Valor final: R$ 90.00

=== CALCULADORA DE DESCONTOS ===
1. Calcular desconto
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[NOVA COMPRA]
Valor da compra: 200.00
Tipo de cliente (R/V): R

[RESULTADO]
Valor original: R$ 200.00
Desconto (5%): R$ 10.00
Valor final: R$ 190.00

=== CALCULADORA DE DESCONTOS ===
1. Calcular desconto
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. R$ 10.00
2. R$ 10.00

=== CALCULADORA DE DESCONTOS ===
1. Calcular desconto
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 3

[ESTATÍSTICAS]
Total descontos: R$ 20.00
Maior desconto: R$ 10.00
Menor desconto: R$ 10.00
Média: R$ 10.00

=== CALCULADORA DE DESCONTOS ===
1. Calcular desconto
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!

=== CALCULADORA DE DESCONTOS ===
1. Calcular desconto
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 5
Opção inválida!
```

## Observações
- O array armazena apenas os valores dos descontos aplicados
- Capacidade máxima de 10 descontos no histórico
- Usar array circular para histórico
- Valores negativos não são permitidos
- Desconto calculado com duas casas decimais
- Tipos de cliente: Regular (5%) e VIP (10%)
