# Projeto Prático I-C: Sistema de Controle de Estoque

## Objetivo
Desenvolver habilidades com arrays e operações básicas de CRUD.

## Descrição
Implementar um sistema que:
- Use um único array para quantidades de produtos
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

### Exemplo 1: Cadastro de Produto
```
[MENU]
1. Atualizar quantidade
2. Mostrar estoque
3. Calcular total
4. Sair

[ATUALIZAÇÃO]
Produto (1-10): 1
Nova quantidade: 5

[ESTOQUE]
1. Produto A: 5 un
2. Produto B: 3 un
3. Produto C: 7 un

[TOTAL]
Valor em estoque: R$ 1.500,00
```

## Observações
- O array armazena apenas as quantidades dos produtos
- Capacidade máxima de 20 produtos
- Valores negativos não são permitidos
