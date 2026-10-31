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
│   ├── index.html
|   └── demais arquivos da documentação JavaDoc
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

---

# 11. Documentação JavaDoc

A documentação técnica do projeto foi desenvolvida utilizando JavaDoc, ferramenta integrada ao JDK que permite gerar documentação em formato HTML a partir dos comentários presentes no código-fonte.

Foram documentadas as classes `Calculadora` e `TesteCalculadora`, incluindo suas descrições, métodos, parâmetros, retornos e exceções.

A documentação gerada está disponível na pasta `docs/` do projeto.

## 11.1 Evidências da Documentação

**Documentação da classe Calculadora:**

<img width="1544" height="742" alt="image" src="https://github.com/user-attachments/assets/9f7abf9b-9251-46b5-9463-9e22b2af77de" />


**Documentação dos métodos de operações matemáticas:**

<img width="1541" height="687" alt="image" src="https://github.com/user-attachments/assets/06a1a18b-241f-4675-b8c0-1be37ddd5a4d" />


**Documentação dos métodos de divisão e cálculo:**

<img width="1525" height="670" alt="image" src="https://github.com/user-attachments/assets/c95a5d34-dc59-4153-a972-49c64177109d" />

---

# 12. Evidências da Refatoração

A refatoração teve como objetivo melhorar a organização, a legibilidade e a manutenção do código, preservando as funcionalidades da calculadora.

As principais alterações realizadas foram:
- Separação das operações matemáticas em métodos específicos;
- Substituição de nomes genéricos por nomes mais descritivos;
- Organização da lógica de seleção de operações com `switch`;
- Implementação de tratamento de exceções para divisão por zero e operadores inválidos;
- Inclusão de documentação JavaDoc.

**Classe Calculadora após a refatoração:**
<img width="835" height="715" alt="image" src="https://github.com/user-attachments/assets/55bd83d5-5cff-433a-8986-2d9aa29e502f" />
<img width="808" height="693" alt="image" src="https://github.com/user-attachments/assets/5969559a-925c-4dc3-9d09-2c6d67ebeb7e" />


**Classe TesteCalculadora após a refatoração:**
<img width="875" height="575" alt="image" src="https://github.com/user-attachments/assets/b14b0b4e-a1b2-4bca-95cf-dff9b5d82d28" />

---

# 13. Repositório GitHub

O projeto está disponível no GitHub, com o código-fonte, a documentação JavaDoc, as evidências dos testes e as versões organizadas em branches.

**Repositório:** [projeto_calculadora](https://github.com/Gabs4K/projeto_calculadora)

**Branches:**
- `main`: versão original do projeto.
- `Refatoracao`: versão refatorada, documentada e com as evidências da atividade.

---
