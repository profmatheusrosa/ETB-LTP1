# Projeto Prático I-E: Calculadora de Notas

## Objetivo
Praticar a sintaxe Java e lógica de programação com uma calculadora de notas.

## Descrição
Desenvolver uma aplicação que:
- Armazene as últimas 10 notas registradas em um array
- Calcule médias quando solicitado
- Mantenha histórico das notas inseridas
- Apresente estatísticas das notas

## Funcionalidades
1. **Entrada de Dados**:
   - Receber nota do aluno (0 a 10)
   - Armazenar em array
   - Validar valores de entrada

2. **Processamento**:
   - Calcular média das notas
   - Determinar maior e menor nota
   - Contar aprovações/reprovações

3. **Exibição**:
   - Mostrar histórico de notas
   - Exibir estatísticas
   - Informar status de cada nota

## Exemplo de Uso
```
=== CALCULADORA DE NOTAS ===
1. Inserir nota
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[NOVA NOTA]
Digite a nota (0-10): 7.5
Nota registrada!
Status: APROVADO

=== CALCULADORA DE NOTAS ===
1. Inserir nota
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[NOVA NOTA]
Digite a nota (0-10): 5.0
Nota registrada!
Status: REPROVADO

=== CALCULADORA DE NOTAS ===
1. Inserir nota
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. 7.50 (Aprovado)
2. 5.00 (Reprovado)

=== CALCULADORA DE NOTAS ===
1. Inserir nota
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 3

[ESTATÍSTICAS]
Total de notas: 2
Maior nota: 7.50
Menor nota: 5.00
Média: 6.25

=== CALCULADORA DE NOTAS ===
1. Inserir nota
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Observações
- O array armazena apenas as notas (tipo double)
- Capacidade máxima de 10 notas no histórico
- Notas devem estar entre 0 e 10
- Média 7.0 para aprovação
- Usar array circular para histórico
- Precisão de duas casas decimais
- Não é necessário armazenar nomes dos alunos