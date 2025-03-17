# Projeto Prático I-C: Sistema de Controle de Estoque

## Objetivo
Desenvolver habilidades com arrays e operações básicas de CRUD.

## Descrição
Implementar um sistema que:
- Use um único array para produtos
- Permita adição e remoção sequencial
- Mostre lista atual de produtos

## Funcionalidades
1. **Gestão de Produtos**:
   - Array único para produtos
   - Operações sequenciais de CRUD

2. **Relatórios**:
   - Exibição sequencial dos produtos
   - Cálculo de valor total

## Estrutura do Projeto
```
/src/main/java/com/projeto
    ControleEstoque.java
    Produto.java
```

## Exemplos de Uso

### Exemplo 1: Cadastro de Produto
```
[CADASTRO]
Produto: Notebook Dell
Quantidade: 5
Preço: 3500.00

Produto cadastrado com sucesso!
```

### Exemplo 2: Atualização de Estoque
```
[ATUALIZAÇÃO DE ESTOQUE]
Produto: Notebook Dell
Nova quantidade: 3
Motivo: Venda

Estoque atualizado:
- Notebook Dell: 3 unidades (R$ 10.500,00 total)
```

### Exemplo 3: Relatório
```
[LISTA ATUAL]
1. Notebook Dell (5) - R$3500.00
2. Mouse USB (10) - R$50.00
3. Teclado (8) - R$100.00

Total em estoque: R$18.300,00
```

### Exemplo 4: Operações em Lote
```
[OPERAÇÕES EM LOTE]
Cadastrar produtos:
1. Notebook Dell, 5, R$3500.00
2. Mouse USB, 10, R$50.00
3. Teclado, 8, R$100.00
```

### Exemplo 5: Busca
```
[BUSCA]
Buscar "Mouse"
Encontrado: Mouse USB (10 un)
```

### Exemplo 6: Ordenação
```
[ORDENAÇÃO]
Produtos por preço:
1. Mouse USB - R$50.00
2. Teclado - R$100.00
3. Notebook Dell - R$3500.00
```

### Exemplo 7: Filtros
```
[FILTROS]
Produtos com estoque < 10:
- Notebook Dell (5)
- Teclado (8)
```

## Observações
- O array armazena apenas as quantidades dos produtos
- Capacidade máxima de 20 produtos
- Posição no array serve como identificador do produto
- Valores negativos não são permitidos
- Total do estoque limitado a 1000 itens
- Não é necessário manter histórico de alterações
