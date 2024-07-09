# Banco Digital em Java

Bem-vindo ao projeto Banco Digital em Java! Este projeto tem como objetivo demonstrar a aplicação dos conceitos de Programação Orientada a Objetos (POO) no desenvolvimento de um sistema bancário simplificado. A seguir, você encontrará todas as informações necessárias para entender, executar e expandir o projeto.

## Objetivo
Reforçar o conhecimento em POO utilizando Java, através da implementação de um banco digital que simula operações bancárias básicas.

## Descrição
Este projeto implementa um banco digital utilizando os quatro pilares da orientação a objetos:
1. **Abstração**
2. **Encapsulamento**
3. **Herança**
4. **Polimorfismo**

As principais funcionalidades do banco digital incluem:
- Criação de contas bancárias (Conta Corrente e Conta Poupança)
- Realização de saques, depósitos e transferências
- Emissão de extratos

## Estrutura do Projeto

- **Cliente**: Representa um cliente do banco.
- **Conta**: Classe abstrata que define os métodos e atributos comuns a todas as contas.
- **ContaCorrente**: Classe que herda de `Conta` e representa uma conta corrente.
- **ContaPoupanca**: Classe que herda de `Conta` e representa uma conta poupança.
- **BancoDigital**: Classe principal com o método `main` que demonstra a criação e manipulação das contas.

