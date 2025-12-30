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

- ✅ Programação Orientada a Objetos (POO)
- ✅ Classe abstrata
- ✅ Herança
- ✅ Polimorfismo em tempo de execução
- ✅ Enumerações (`enum`)
- ✅ Listas (`List`)
- ✅ Estruturas de repetição
- ✅ Entrada de dados com `Scanner`
- ✅ Organização em pacotes (`application`, `entities`, `enums`)

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

```
🚀 Funcionalidades (v1.2)

📋 Menu interativo no console

➕ Cadastro dinâmico de funcionários

💼 Tipos de funcionário:

  - CLT

  - PJ

  - Estagiário

🧮 Cálculo de pagamento específico para cada tipo

📄 Listagem dos funcionários cadastrados com valores calculados
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

Quantos funcionarios voce deseja cadastrar? 3

Nome: João Souza
Tipo de Funcionário (CLT/PJ/ESTAGIARIO): CLT
Salário Base:(R$) 6000
Desconto do INSS:(R$) 850
Cadastro realizado com sucesso!
=================================

Nome: Julia Azevedo
Tipo de Funcionário (CLT/PJ/ESTAGIARIO): PJ
Valor por hora:(R$) 22
Horas trabalhadas: 165
Cadastro realizado com sucesso!
=================================

Nome: Caio Henrique
Tipo de Funcionário (CLT/PJ/ESTAGIARIO): ESTAGIARIO
Bolsa auxílio:(R$) 2200
Cadastro realizado com sucesso!
=================================

========Lista de funcionários========

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

✅ Versão 1.2 finalizada

Esta versão tem foco exclusivo na demonstração de herança e polimorfismo.


🔄 Evolução do Projeto

✔️ v1.0 – Estrutura inicial com herança e polimorfismo (sem interação)

✔️ v1.1 – Refatorações e melhorias de organização

✔️ v1.2 – Menu interativo e cadastro dinâmico via console

🔜 Próximas versões:

  - Validações de entrada

  - Melhor organização com classes de serviço

  - Tratamento de exceções (quando o conteúdo for estudado)


📎 Tecnologias Utilizadas

  - Java

  - Eclipse IDE

  - Git & GitHub


👨‍💻 Autor:

- Marcelo Nascimento
- Estudante de Análise e Desenvolvimento de Sistemas
- Foco em Backend Java


🧠 Observação

Este projeto faz parte do meu processo contínuo de aprendizado, priorizando prática, organização de código e evolução técnica.

