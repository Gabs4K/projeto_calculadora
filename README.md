# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

---

## 1. Identificação do Projeto

**Projeto:** Projeto Calculadora  
**Contexto:** FinançApp  
**Aluno:** Gabriel Donizete Silva  
**RA:** 250877  
**Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas  
**Disciplina:** UX/UI e Testes de Software  
**Professor:** DANIEL OHATA  
**Semestre:** 2026.2  

---

# 2. Visão Geral

O projeto consiste no desenvolvimento de um módulo de cálculos matemáticos básicos em Java para a startup fictícia **FinançApp**.

O módulo foi desenvolvido com o objetivo de ser utilizado futuramente em funcionalidades de controle financeiro, como:

- orçamento mensal;
- divisão de despesas;
- projeções financeiras;
- cálculos auxiliares.

Além do funcionamento correto das operações, o projeto aplica práticas de qualidade de software relacionadas a:

- testes;
- tratamento de erros;
- refatoração;
- documentação;
- versionamento;
- manutenção de código.

---

# 3. Problema

Durante o desenvolvimento da aplicação FinançApp, foi identificada a necessidade de criar um módulo matemático reutilizável.

Entretanto, a equipe definiu que o módulo não deveria apenas funcionar corretamente, mas também apresentar:

- código legível;
- testes automatizados;
- tratamento de falhas;
- documentação técnica;
- controle de versões;
- facilidade de manutenção.

O desafio consiste, portanto, em desenvolver uma solução funcional e ao mesmo tempo aplicar boas práticas de Engenharia de Software.

---

# 4. Objetivo

## 4.1 Objetivo Geral

Desenvolver uma calculadora em Java aplicando práticas de qualidade, testes, documentação, refatoração e versionamento.

## 4.2 Objetivos Técnicos

- implementar operações matemáticas básicas;
- tratar entradas inválidas;
- impedir divisão por zero;
- desenvolver testes automatizados;
- refatorar o código sem alterar seu comportamento;
- documentar classes e métodos com JavaDoc;
- gerar documentação HTML;
- utilizar Git e GitHub;
- organizar commits e branches;
- manter documentação técnica no README.

---
# 5. Escopo Funcional

A aplicação deverá oferecer as seguintes operações:

| ID | Funcionalidade | Descrição | Status |
|---|---|---|---|
| RF01 | Soma | Soma dois números inteiros | ✅ |
| RF02 | Subtração | Subtrai dois números inteiros | ✅ |
| RF03 | Multiplicação | Multiplica dois números inteiros | ✅ |
| RF04 | Divisão | Divide dois números inteiros | ✅ |
| RF05 | Validação de divisão | Impede divisão por zero | ✅ |
| RF06 | Operação inválida | Trata operadores não suportados | ✅ |

---

# 6. Requisitos Não Funcionais

| ID | Categoria | Requisito |
|---|---|---|
| RNF01 | Qualidade | O código deve possuir organização e legibilidade |
| RNF02 | Testabilidade | As operações devem possuir testes automatizados |
| RNF03 | Manutenção | O código deve permitir refatoração sem alteração funcional |
| RNF04 | Documentação | Classes e métodos devem possuir JavaDoc |
| RNF05 | Versionamento | O projeto deve utilizar Git e GitHub |
| RNF06 | Confiabilidade | Erros não devem interromper inesperadamente a execução |

---
# 7. Tecnologias Utilizadas

| Tecnologia | Versão | Utilização |
|---|---|---|
| Java | 21 | Desenvolvimento |
| JDK | 21 | Compilação |
| Git | — | Controle de versão |
| GitHub | — | Repositório remoto |
| JavaDoc | JDK 21 | Documentação |
| Eclipse IDE | — | Ambiente de desenvolvimento |

---

# 8. Estrutura do Projeto

```text
projeto_calculadora/
│
├── docs/
│   └── index.html
|
├── images/
│   ├── javadoc/
│   ├── refatoracao/
│   └── testes/
|
├── src/
│   └── calculadora/
│       └── Calculadora.java
│
├── test/
│   └── calculadora/
│       └── TesteCalculadora.java
│
│
└── README.md
 ```
---

# 9. Explicação das Operações

A calculadora realiza quatro operações matemáticas básicas utilizando números inteiros. A operação desejada é identificada pelo operador informado ao método `calcular()`.

| Operador | Operação | Descrição |
|----------|----------|-----------|
| `+` | Soma | Realiza a soma de dois números inteiros. |
| `-` | Subtração | Realiza a subtração de dois números inteiros. |
| `*` | Multiplicação | Realiza a multiplicação de dois números inteiros. |
| `/` | Divisão | Realiza a divisão de dois números inteiros. |

Além das operações, o sistema possui tratamentos para situações inválidas:

- **Divisão por zero:** lança uma exceção `IllegalArgumentException` quando o divisor é zero.
- **Operador inválido:** lança uma exceção `IllegalArgumentException` quando é informado um operador não suportado.

---

# 10. Evidências dos Testes Funcionais

Após a atualização da classe `TesteCalculadora`, foram realizados testes funcionais para verificar o comportamento das operações matemáticas implementadas.

Os testes contemplam os seguintes cenários:
- Execução de soma, subtração, multiplicação e divisão;
- Verificação do tratamento de divisão por zero;
- Verificação do tratamento de operadores inválidos.

A captura abaixo apresenta o código utilizado e os resultados obtidos no console do Eclipse, demonstrando que os cenários previstos foram executados corretamente.
<img width="1596" height="656" alt="teste" src="https://github.com/user-attachments/assets/2e5e4385-77d7-4eb6-8b89-92bb1413ff42" />



