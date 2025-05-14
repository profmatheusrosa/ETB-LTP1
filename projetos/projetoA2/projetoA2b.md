# Projeto Prático II-B: Calculadora de IMC Orientada a Objetos

## Objetivo
Praticar conceitos de Programação Orientada a Objetos (POO) em Java, incluindo Classes, Objetos, Atributos, Métodos, Construtores, Encapsulamento, Herança, Polimorfismo, Classe Abstrata, Interface e Sobrecarga de Métodos.

## Descrição
Desenvolver uma aplicação console que:
- Calcule o IMC de várias pessoas utilizando classes específicas
- Armazene os dados das últimas 10 pessoas em um vetor de objetos
- Mostre resultados sequencialmente e exiba histórico e estatísticas
- Utilize herança, polimorfismo, interface, classe abstrata e sobrecarga de métodos para os cálculos e classificações

## Funcionalidades
1. **Estrutura de Classes**:
   - Criar uma **classe abstrata** `RegistroIMC` com atributos e métodos comuns (peso, altura, IMC, classificação)
   - Implementar **subclasses** para diferentes perfis (ex: Adulto, Idoso), cada uma podendo ter regras de classificação específicas
   - Utilizar **encapsulamento** para proteger os atributos
   - Utilizar **construtores** para inicializar os objetos
   - Definir uma **interface** `Calculavel` com métodos para cálculo e classificação do IMC, que será implementada pelas subclasses
   - Implementar **sobrecarga de métodos** para cálculo do IMC (por exemplo, calcular apenas com peso/altura, ou com precisão desejada)

2. **Entrada de Dados**:
   - Receber peso e altura do usuário
   - Criar objeto correspondente e adicionar ao vetor de histórico

3. **Cálculo e Exibição**:
   - Calcular IMC e classificação utilizando polimorfismo e interface
   - Exibir resultado formatado

4. **Histórico e Estatísticas**:
   - Mostrar histórico das últimas 10 pessoas (objetos de IMC)
   - Exibir estatísticas: total de registros, menor IMC, maior IMC, média

## Exemplo de Uso
```
=== CALCULADORA DE IMC (POO) ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 1

[CÁLCULO DE IMC]
Digite o peso (kg): 70
Digite a altura (m): 1.75
Perfil (A)dulto/(I)doso: A

Resultado:
IMC: 22.86
Classificação: Peso Normal

=== CALCULADORA DE IMC (POO) ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 2

[HISTÓRICO]
1. IMC: 22.86 (Normal) - Adulto
2. IMC: 29.38 (Sobrepeso) - Idoso

=== CALCULADORA DE IMC (POO) ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 3

[ESTATÍSTICAS]
Total de registros: 2
Menor IMC: 22.86
Maior IMC: 29.38
Média: 26.12

=== CALCULADORA DE IMC (POO) ===
1. Calcular novo IMC
2. Mostrar histórico
3. Ver estatísticas
4. Sair
Escolha uma opção: 4
Programa finalizado!
```

## Observações
- O vetor armazena apenas os últimos 10 registros de IMC (objetos)
- Os valores são armazenados como objetos da classe base `RegistroIMC`
- Precisão de duas casas decimais nos cálculos
- Utilize todos os conceitos de POO: Classes, Objetos, Atributos, Métodos, Construtores, Herança, Polimorfismo, Encapsulamento, Interface, Classe Abstrata e Sobrecarga de Métodos
