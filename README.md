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
- Validação de título e autor para impedir dados nulos ou vazios.
- Listagem de livros cadastrados na ordem de inserção.
- Busca de livros por identificador utilizando `HashMap`.
- Armazenamento dos livros em `ArrayList` e `HashMap`.
- Atualização de título e autor com validação dos dados.
- Remoção de livros por identificador, mantendo as coleções sincronizadas.
- Retorno booleano para indicar o sucesso ou a falha das operações de cadastro, atualização e remoção.
- Lançamento de `IllegalArgumentException` para dados inválidos no construtor e nos setters.
- Tratamento de exceções nas operações de cadastro e atualização.

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

```text
biblioteca-java/
├── src/
│   └── biblioteca/
│       ├── Livro.java
│       ├── Biblioteca.java
│       ├── StatusLivro.java
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
| 3. Busca e remoção | Aprimorar a busca e trabalhar com identificadores, `List` e `Map`. | Concluída |
| 4. Validações e exceções | Validar dados, lançar exceções e tratar falhas nas operações. | Concluída |
| 5. Empréstimos | Controlar disponibilidade, empréstimos e devoluções. | Concluída |
| 6. Organização | Aplicar abstração, interfaces e polimorfismo quando apropriado. | Concluída |
| 7. Relatórios | Utilizar Streams para filtrar, ordenar e resumir dados. | Concluída |
| 8. Revisão final | Revisar o código e verificar os principais cenários de uso. | Pendente |

## Metodologia

O projeto é desenvolvido por etapas, com implementação gradual das funcionalidades, exercícios práticos, revisão de código e testes manuais.

O objetivo é compreender os conceitos e conseguir implementá-los de forma independente, sem depender de soluções completas prontas.

## Status

Em desenvolvimento — Etapas 1, 2, 3, 4, 5, 6 e 7 concluídas.