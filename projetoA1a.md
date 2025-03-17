# Projeto Prático I-A: Converter de Temperatura

## Objetivo
Praticar a sintaxe Java e lógica de programação com conversões de temperatura.

## Descrição
Desenvolver uma aplicação console que:
- Converta temperaturas entre Celsius, Fahrenheit e Kelvin
- Armazene as últimas 5 temperaturas convertidas em um array
- Exiba o histórico de conversões

## Funcionalidades
1. **Entrada de Temperatura**:
   - Receber valor numérico e unidade atual
   - Adicionar ao array de histórico

2. **Seleção de Conversão**:
   - Escolher para qual unidade converter

3. **Histórico e Exibição**:
   - Mostrar últimas conversões do array

## Estrutura do Projeto
```
/src/main/java/com/projeto
    ConversorTemperatura.java
    Temperatura.java
```

## Exemplos de Uso

### Exemplo 1: Celsius para Fahrenheit
```
Digite a temperatura: 25
Unidade atual (C/F/K): C
Converter para (C/F/K): F
Resultado: 77°F
```

### Exemplo 2: Kelvin para Celsius
```
Digite a temperatura: 300
Unidade atual (C/F/K): K
Converter para (C/F/K): C
Resultado: 26.85°C
```

### Exemplo 3: Fahrenheit para Kelvin
```
Digite a temperatura: 98.6
Unidade atual (C/F/K): F
Converter para (C/F/K): K
Resultado: 310.15K
```

## Exemplos de Uso
```
[NOVA CONVERSÃO]
Digite a temperatura: 25
Unidade atual (C/F/K): C
Converter para (C/F/K): F
Resultado: 77°F

[HISTÓRICO]
Últimas conversões:
1. 25°C -> 77°F
2. 30°C -> 86°F
3. 20°C -> 68°F
```

## Observações
- O array armazena apenas as últimas 5 temperaturas convertidas
- Não é necessário armazenar a unidade de origem/destino no array
- Os valores são armazenados sempre em Celsius no array
- Precisão de duas casas decimais nas conversões
