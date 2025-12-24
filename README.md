# 💼 Sistema de Pagamento de Funcionários – Java

## 📌 Sobre o projeto
Este projeto foi desenvolvido com o objetivo de **praticar e consolidar os conceitos de Herança e Polimorfismo em Java**, de forma simples, clara e objetiva.

A aplicação simula o cálculo de pagamento de diferentes tipos de funcionários, utilizando **Programação Orientada a Objetos** e explorando o comportamento polimórfico das classes.

---

## 🎯 Objetivo principal
Demonstrar o uso correto de:
- Classe abstrata
- Herança
- Sobrescrita de métodos
- Polimorfismo em tempo de execução
- Listas (`List`)

Tudo isso sem o uso de condicionais (`if` / `switch`) para o cálculo de pagamento.

---

## 🧠 Conceitos aplicados
- Programação Orientada a Objetos (POO)
- Abstração
- Herança
- Polimorfismo
- Enumerações (`enum`)
- Coleções (`ArrayList` / `List`)

---

## 🏗️ Estrutura do projeto

```
src
├── application
│ └── Main.java
├── entities
│ ├── Funcionario.java
│ ├── FuncionarioCLT.java
│ ├── FuncionarioPJ.java
│ └── Estagiario.java
└── entities.enums
└── TipoFuncionario.java
```

---

## 📋 Regras de negócio
- **CLT**
  - Pagamento = salário base − desconto INSS
- **PJ**
  - Pagamento = valor da hora × horas trabalhadas
- **Estagiário**
  - Pagamento = bolsa auxílio fixa

Cada tipo de funcionário implementa sua própria regra através do método: calcularPagamento()

```java



🖥️ Exemplo de saída no console

==========================
   SISTEMA DE PAGAMENTO
==========================

Funcionário: João Souza
Tipo: CLT
Pagamento calculado: R$ 5150.00
----------------------------
Funcionário: Julia Azevedo
Tipo: PJ
Pagamento calculado: R$ 3630.00
----------------------------
Funcionário: Caio Henrique
Tipo: ESTAGIARIO
Pagamento calculado: R$ 2200.00
----------------------------

Processamento finalizado com sucesso!

```

🚀 Status do projeto:

✅ Versão 1.0 finalizada

Esta versão tem foco exclusivo na demonstração de herança e polimorfismo.


Possíveis evoluções futuras:

- Interação com usuário (Scanner)

- Menu de opções

- Entrada dinâmica de dados

- Testes unitários

- Separação de camadas (service)


👨‍💻 Autor:

- Marcelo Nascimento
- Estudante de Análise e Desenvolvimento de Sistemas
- Foco em Backend Java


🧠 Observação

Este projeto faz parte do meu processo contínuo de aprendizado, priorizando prática, organização de código e evolução técnica.

