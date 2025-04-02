# Projeto Prático I-A: Conversor de Temperatura

## Objetivo
Praticar a sintaxe Java e lógica de programação com conversões de temperatura.

## Descrição
Desenvolver uma aplicação console que:
- Converta temperaturas entre Celsius, Fahrenheit e Kelvin
- Armazene as últimas 5 temperaturas convertidas em um array
- Exiba o histórico de conversões

## Funcionalidades
1. **Entrada de Dados**:
   - Receber valor numérico e unidade atual
   - Adicionar ao array de histórico

2. **Seleção de Conversão**:
   - Escolher para qual unidade converter

3. **Histórico e Exibição**:
   - Mostrar últimas conversões do array

## Exemplo de Uso
```
=== CONVERSOR DE TEMPERATURA ===
1. Converter temperatura
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[CONVERSÃO]
Digite a temperatura: 25
Unidade atual (C/F/K): C
Converter para (C/F/K): F
Resultado: 77°F

=== CONVERSOR DE TEMPERATURA ===
1. Converter temperatura
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[CONVERSÃO]
Digite a temperatura: 98.6
Unidade atual (C/F/K): F
Converter para (C/F/K): K
Resultado: 310.15K

=== CONVERSOR DE TEMPERATURA ===
1. Converter temperatura
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. 25.00°C
2. 37.00°C

=== CONVERSOR DE TEMPERATURA ===
1. Converter temperatura
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 3

[ESTATÍSTICAS]
Menor: 25.00°C
Maior: 37.00°C
Média: 31.00°C

=== CONVERSOR DE TEMPERATURA ===
1. Converter temperatura
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!

=== CONVERSOR DE TEMPERATURA ===
1. Converter temperatura
2. Ver histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 5
Opção inválida!
```

## Observações
- O array armazena apenas as últimas 5 temperaturas convertidas
- Os valores são armazenados sempre em Celsius no array
- Precisão de duas casas decimais nas conversões
