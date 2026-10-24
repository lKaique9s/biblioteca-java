# Biblioteca Java

Sistema de gerenciamento de biblioteca desenvolvido em Java 21, com foco na prática de programação orientada a objetos, Collections e outras funcionalidades da linguagem.

O projeto será desenvolvido incrementalmente, com foco no aprendizado e na aplicação prática dos conceitos estudados.

## Objetivos

- Praticar orientação a objetos, encapsulamento, herança e polimorfismo.
- Implementar operações CRUD (criar, consultar, atualizar e remover).
- Trabalhar com Collections, interfaces, lambdas e Streams.
- Aplicar validações e tratamento de exceções.
- Melhorar a organização, legibilidade e manutenção do código.

## Funcionalidades planejadas

- Cadastro, consulta, atualização e remoção de livros.
- Busca por identificador e informações do livro.
- Validação de dados e tratamento de erros.
- Controle de empréstimos e devoluções.
- Relatórios e filtros utilizando Streams.

## Tecnologias

- Java 21
- Collections e APIs padrão do Java
- Git e GitHub

O sistema será executado pelo terminal e utilizará armazenamento em memória inicialmente. Os dados não serão mantidos após o encerramento do programa.

## Organização do projeto

A estrutura será evoluída conforme o desenvolvimento:

```text
biblioteca-java/
├── src/
│   └── biblioteca
│       └── Livro.java
│       └── Main.java
├── .gitignore
└── README.md
```

As classes serão organizadas conforme suas responsabilidades, separando o modelo dos livros, o gerenciamento do acervo e a interação com o usuário.

## Etapas de desenvolvimento

| Etapa | Objetivo |
|---|---|
| 1. Modelagem | Criar a classe `Livro` e aplicar encapsulamento. |
| 2. CRUD inicial | Cadastrar, listar, consultar e atualizar livros. |
| 3. Busca e remoção | Trabalhar com identificadores, `List` e `Map`. |
| 4. Validações | Tratar dados inválidos e exceções. |
| 5. Empréstimos | Controlar disponibilidade, empréstimos e devoluções. |
| 6. Organização | Aplicar abstração, interfaces e polimorfismo quando apropriado. |
| 7. Relatórios | Utilizar Streams para filtrar, ordenar e resumir dados. |
| 8. Revisão final | Revisar o código e verificar os principais cenários de uso. |

## Metodologia

O projeto será desenvolvido por etapas, com implementação gradual das funcionalidades, exercícios práticos, revisão de código e testes manuais.

O objetivo é compreender os conceitos e conseguir implementá-los de forma independente, sem depender de soluções completas prontas.

## Status

Em desenvolvimento.
