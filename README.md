# Biblioteca Java

Sistema de gerenciamento de biblioteca desenvolvido em Java 21, com foco na prática de programação orientada a objetos, Collections e outras funcionalidades da linguagem.

O projeto está sendo desenvolvido incrementalmente, com foco no aprendizado e na aplicação prática dos conceitos estudados.

## Objetivos

- Praticar orientação a objetos, encapsulamento, herança e polimorfismo.
- Implementar operações CRUD (criar, consultar, atualizar e remover).
- Trabalhar com Collections, interfaces, lambdas e Streams.
- Aplicar validações e tratamento de exceções.
- Melhorar a organização, legibilidade e manutenção do código.

## Funcionalidades implementadas

- Cadastro de livros com geração automática de identificadores.
- Listagem de livros cadastrados.
- Busca de livros por identificador.
- Atualização de título e autor, com validação dos dados.
- Remoção de livros por identificador.
- Retorno booleano para indicar o sucesso ou falha das operações de atualização e remoção.

## Funcionalidades planejadas

- Busca por outras informações do livro.
- Aprimoramento das validações e do tratamento de erros.
- Controle de empréstimos e devoluções.
- Relatórios e filtros utilizando Streams.

## Tecnologias

- Java 21
- Collections e APIs padrão do Java
- Git e GitHub

O sistema é executado pelo terminal e utiliza armazenamento em memória. Os dados não são mantidos após o encerramento do programa.

## Organização do projeto

A estrutura atual do projeto:

```text
biblioteca-java/
├── src/
│   └── biblioteca/
│       ├── Livro.java
│       ├── Biblioteca.java
│       └── Main.java
├── .gitignore
└── README.md
```

As classes são organizadas conforme suas responsabilidades, separando o modelo dos livros, o gerenciamento do acervo e a interação com o usuário.

## Etapas de desenvolvimento

| Etapa | Objetivo | Status |
|---|---|---|
| 1. Modelagem | Criar a classe `Livro` e aplicar encapsulamento. | Concluída |
| 2. CRUD inicial | Cadastrar, listar, consultar, atualizar e remover livros utilizando `ArrayList`. | Concluída |
| 3. Busca e remoção | Aprimorar a busca e trabalhar com identificadores, `List` e `Map`. | Em andamento |
| 4. Validações | Tratar dados inválidos e exceções. | Pendente |
| 5. Empréstimos | Controlar disponibilidade, empréstimos e devoluções. | Pendente |
| 6. Organização | Aplicar abstração, interfaces e polimorfismo quando apropriado. | Pendente |
| 7. Relatórios | Utilizar Streams para filtrar, ordenar e resumir dados. | Pendente |
| 8. Revisão final | Revisar o código e verificar os principais cenários de uso. | Pendente |

## Metodologia

O projeto é desenvolvido por etapas, com implementação gradual das funcionalidades, exercícios práticos, revisão de código e testes manuais.
O objetivo é compreender os conceitos e conseguir implementá-los de forma independente, sem depender de soluções completas prontas.

## Status

Em desenvolvimento — Etapas 1 e 2 concluídas.
