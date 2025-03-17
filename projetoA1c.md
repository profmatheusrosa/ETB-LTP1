# Projeto Prático I-C: Sistema de Controle de Estoque

## Objetivo
Praticar a sintaxe Java e lógica de programação com um sistema de estoque.

## Descrição
Implementar um sistema que:
- Gerencie o estoque de um único produto
- Registre as últimas 10 movimentações de estoque
- Permita entradas e saídas do estoque
- Mostre histórico de movimentações

## Funcionalidades
1. **Entrada de Dados**:
   - Registrar nova movimentação (positivo para entrada, negativo para saída)

2. **Processamento**:
   - Atualizar saldo do estoque
   - Validar quantidade mínima (0) e máxima (999)
   - Calcular média de movimentações

3. **Exibição**:
   - Mostrar histórico de movimentações
   - Exibir saldo atual
   - Apresentar estatísticas

## Exemplo de Uso
```
=== CONTROLE DE ESTOQUE ===
1. Registrar movimentação
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[MOVIMENTAÇÃO]
Digite a quantidade (+/-): 50
Movimentação registrada!
Saldo atual: 50 unidades

=== CONTROLE DE ESTOQUE ===
1. Registrar movimentação
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[MOVIMENTAÇÃO]
Digite a quantidade (+/-): -20
Movimentação registrada!
Saldo atual: 30 unidades

=== CONTROLE DE ESTOQUE ===
1. Registrar movimentação
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. +50 unidades
2. -20 unidades
Saldo atual: 30 unidades

=== CONTROLE DE ESTOQUE ===
1. Registrar movimentação
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 3

[ESTATÍSTICAS]
Total movimentações: 2
Maior entrada: 50
Maior saída: 20
Média movimentações: 15
Saldo atual: 30

=== CONTROLE DE ESTOQUE ===
1. Registrar movimentação
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Observações
- O array armazena apenas as movimentações (positivas ou negativas)
- Capacidade máxima de 10 movimentações no histórico
- Saldo não pode ficar negativo
- Validar todas as entradas
- Armazenar apenas valores inteiros
