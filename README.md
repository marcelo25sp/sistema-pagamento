# 💼 Sistema de Pagamento de Funcionários – Java Console (v3.0)

## 📌 Sobre o projeto
Este projeto foi desenvolvido com o objetivo de **praticar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO) em Java**, com foco em **Herança, Polimorfismo e organização de código em camadas**.

A aplicação simula o **gerenciamento e cálculo de pagamento de funcionários**, utilizando boas práticas de design orientado a objetos e evolução incremental por versões.

Esta versão introduz melhorias arquiteturais importantes, como **DTOs, Factory Pattern, tratamento de exceções customizadas e testes unitários**.

---

## 🎯 Objetivo principal
Demonstrar o uso correto de:

- Classe abstrata  
- Herança  
- Sobrescrita de métodos  
- Polimorfismo em tempo de execução  
- Separação de responsabilidades (Menu / Serviço / Entidades)  

➡️ **Sem uso de condicionais (`if` / `switch`) para o cálculo de pagamento**, delegando essa responsabilidade às classes concretas.

---

## 🧠 Conceitos aplicados


✅ Programação Orientada a Objetos (POO)  
✅ Classe abstrata  
✅ Herança  
✅ Polimorfismo em tempo de execução  
✅ Enumerações (`enum`)  
✅ Listas (`List`)  
✅ Estruturas de repetição  
✅ Entrada de dados com `Scanner`  
✅ Organização em pacotes  
✅ Classes de serviço (Service Layer)  
✅ Experiência do usuário (UX) no console 
✅ Arquitetura e Organização
✅ DTO (Data Transfer Object)
✅ Testes Unitários com JUnit
✅ Validações de dominio
✅ Exceptions Customizadas



---

## 🏗️ Estrutura do projeto

```

src
├── application
│   ├── Main.java
│   ├── Menu.java
│   └── FuncionarioConsoleUI.java
│
├── services
│   ├── FuncionarioGerenciamento.java
│   └── FuncionarioFactory.java
│
├── entities
│   ├── Funcionario.java
│   ├── FuncionarioCLT.java
│   ├── FuncionarioPJ.java
│   └── Estagiario.java
│
├── entities.enums
│   └── TipoFuncionario.java
│
├── dto
│   ├── FuncionarioDTO.java
│   └── PagamentoDTO.java
│
├── exception
│   ├── FuncionarioInvalidoException.java
│   └── TipoFuncionarioInvalidoException.java
│
├── utils
│   └── InputUtils.java
│
└── tests
    └── FuncionarioGerenciamentoTest.java
```



---

## 🚀 Funcionalidades (v3.0)

📋 Menu interativo no console (UX aprimorada)  
➕ Cadastro dinâmico de funcionários  
💼 Tipos de funcionário:
- CLT  
- PJ  
- Estagiário  

🧮 Cálculo de pagamento específico para cada tipo  
📄 Listagem detalhada dos funcionários cadastrados  
💰 **Cálculo do total da folha de pagamento**  
🧠 Centralização da lógica de negócio na classe de serviço  

---

## 📋 Regras de negócio

### CLT
Pagamento = salário base − desconto do INSS  

### PJ
Pagamento = valor da hora × horas trabalhadas  

### Estagiário
Pagamento = bolsa auxílio  

Cada tipo de funcionário implementa sua própria regra através do método calcularPagamento()

```
==========================
   SISTEMA DE PAGAMENTO
==========================

1 - Cadastrar funcionário
2 - Listar funcionários
3 - Relatório de pagamentos
4 - Total da folha
0 - Sair

Opção escolhida: 3

====== RELATÓRIO DE PAGAMENTOS ======

Funcionário: João Souza
Tipo: CLT
Pagamento: R$ 5150.00
-----------------------------------

Funcionário: Julia Azevedo
Tipo: PJ
Pagamento: R$ 3630.00
-----------------------------------

Funcionário: Caio Henrique
Tipo: ESTAGIARIO
Pagamento: R$ 2200.00
-----------------------------------

Total da folha de pagamento: R$ 10980.00
```

---
## ⚠️ Validações de domínio

O sistema utiliza **fail-fast**, impedindo a criação de objetos inválidos.

Exemplos:

- Nome do funcionário não pode ser vazio
- Tipo de funcionário não pode ser nulo
- Salário base deve ser maior que zero
- Valor da hora deve ser positivo
- Horas trabalhadas devem ser maiores que zero

Caso alguma regra seja violada, o sistema lança **exceções customizadas**.



---
## 🧪 Testes Unitários

O projeto possui **testes automatizados com JUnit**, garantindo o funcionamento correto das regras de negócio.

Testes implementados:

- Cálculo de pagamento CLT
- Cálculo de pagamento PJ
- Cálculo de pagamento Estagiário
- Cálculo do total da folha
- Cenário sem funcionários cadastrados



## 🚀 Status do projeto
- ✅ Versão 3.0 finalizada
---

## 🔄 Evolução do Projeto

✔️ v1.0 – Estrutura inicial

✔️ v1.1 – Refatorações

✔️ v1.2 – Menu interativo

✔️ v1.3 – Introdução da classe de gerenciamento, UX, relatórios e valor total da folha de pagamento

✔️ v3.0 – Testes Unitários(JUnit 5), Exceptions Customizadas, Validações de domínio e Arquitetura mais profissional




## 📎 Tecnologias Utilizadas

- Java
- Eclipse IDE
- Git & GitHub
- JUnit5


## 👨‍💻 Autor

- Marcelo Nascimento
- Estudante de Análise e Desenvolvimento de Sistemas
- Foco em Backend Java

🧠 Observação

Este projeto faz parte do meu processo contínuo de aprendizado, priorizando prática, clareza de código e evolução técnica.
Novas versões estão sendo planejadas, incluindo: 

➡️ **Versão 4.0 – API REST com Spring Boot**
