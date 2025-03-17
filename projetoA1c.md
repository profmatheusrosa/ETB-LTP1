# Projeto Prático I-C: Sistema de Controle de Estoque

## Objetivo
Praticar a sintaxe Java e lógica de programação com um sistema de controle de estoque 

## Descrição
Implementar um sistema que:
- Use um array para quantidades de produtos
- Permita atualização de quantidades
- Calcule valor total do estoque
- Limite-se a 10 produtos fixos pré-cadastrados

## Funcionalidades
1. **Gestão de Quantidades**:
   - Array único para quantidades
   - Produtos são posições fixas no array

2. **Operações**:
   - Atualizar quantidade
   - Mostrar estoque atual
   - Calcular valor total

## Estrutura do Projeto
```
/src/main/java/com/projeto
    ControleEstoque.java
    Produto.java
```

## Exemplos de Uso
```
=== CONTROLE DE ESTOQUE ===
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair
Escolha uma opção: 1

[PRODUTOS DISPONÍVEIS]
1. Arroz     - R$ 20.00
2. Feijão    - R$ 8.00
3. Açúcar    - R$ 5.00
4. Café      - R$ 8.00
5. Óleo      - R$ 10.00

Número do produto (1-5): 1
Nova quantidade: 10
Quantidade atualizada!

=== CONTROLE DE ESTOQUE ===
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair
Escolha uma opção: 1

[PRODUTOS DISPONÍVEIS]
1. Arroz     - R$ 20.00
2. Feijão    - R$ 8.00
3. Açúcar    - R$ 5.00
4. Café      - R$ 8.00
5. Óleo      - R$ 10.00

Número do produto (1-5): 2
Nova quantidade: 15
Quantidade atualizada!

=== CONTROLE DE ESTOQUE ===
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair
Escolha uma opção: 2

[ESTOQUE ATUAL]
1. Arroz:   10 un x R$ 20.00 = R$ 200.00
2. Feijão:  15 un x R$ 8.00  = R$ 120.00
3. Açúcar:   0 un x R$ 5.00  = R$ 0.00
4. Café:     0 un x R$ 8.00  = R$ 0.00
5. Óleo:     0 un x R$ 10.00 = R$ 0.00

=== CONTROLE DE ESTOQUE ===
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair
Escolha uma opção: 3

[VALOR TOTAL EM ESTOQUE]
Quantidade total de itens: 25
Valor total em estoque: R$ 320.00

=== CONTROLE DE ESTOQUE ===
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair
Escolha uma opção: 7
Opção inválida!

=== CONTROLE DE ESTOQUE ===
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Observações
- O array armazena apenas as quantidades dos produtos
- Capacidade máxima de 20 produtos
- Valores negativos não são permitidos
