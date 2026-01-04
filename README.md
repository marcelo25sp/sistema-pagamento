# 💼 Sistema de Pagamento de Funcionários – Java

## 📌 Sobre o projeto
Este projeto foi desenvolvido com o objetivo de **praticar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO) em Java**, com foco em **Herança, Polimorfismo e organização de código em camadas**.

A aplicação simula o **gerenciamento e cálculo de pagamento de funcionários**, utilizando boas práticas de design orientado a objetos e evolução incremental por versões.

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

---

## 🏗️ Estrutura do projeto

src

 - application
        Main.java
        Menu.java
 - services
         FuncionarioGerenciamento.java
 - entities
         Funcionario.java
         FuncionarioCLT.java
         FuncionarioPJ.java
         Estagiario.java
 - entities.enums
         TipoFuncionario.java



---

## 🚀 Funcionalidades (v1.3)

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


🚀 Status do projeto

✅ Versão 1.3 finalizada

🔄 Evolução do Projeto

✔️ v1.0 – Estrutura inicial
✔️ v1.1 – Refatorações
✔️ v1.2 – Menu interativo
✔️ v1.3 – Introdução da classe de gerenciamento, UX, relatórios e valor total da folha de pagamento

Esta versão foca em:

- Organização do código
- Separação de responsabilidades
- Melhor experiência de uso no console
- Relatórios e cálculo agregado da folha

📎 Tecnologias Utilizadas

- Java
- Eclipse IDE
- Git & GitHub


👨‍💻 Autor

Marcelo Nascimento
Estudante de Análise e Desenvolvimento de Sistemas
Foco em Backend Java

🧠 Observação

Este projeto faz parte do meu processo contínuo de aprendizado, priorizando prática, clareza de código e evolução técnica.
