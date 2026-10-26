# Biblioteca Java

Sistema de gerenciamento de biblioteca desenvolvido em Java 21, com foco na prática de programação orientada a objetos, Collections, tratamento de exceções e recursos modernos da linguagem.

O projeto foi desenvolvido incrementalmente, aplicando conceitos estudados por meio da implementação de funcionalidades e da realização de testes manuais.

## Objetivos

- Praticar orientação a objetos e encapsulamento.
- Implementar operações CRUD (criar, consultar, atualizar e remover).
- Trabalhar com Collections, interfaces funcionais, lambdas e Streams.
- Aplicar validações e tratamento de exceções.
- Utilizar `enum` e a API de datas do Java.
- Desenvolver código organizado, legível e de fácil manutenção.

## Funcionalidades

- Cadastro de livros com geração automática de identificadores.
- Validação de títulos e autores para impedir dados nulos ou vazios.
- Listagem de livros cadastrados.
- Busca por identificador utilizando `HashMap`.
- Armazenamento dos livros em `ArrayList` e `HashMap`.
- Atualização de títulos e autores com validação.
- Remoção de livros disponíveis, mantendo as coleções sincronizadas.
- Controle de status dos livros: disponível, emprestado, reservado e em manutenção.
- Empréstimo e devolução com validação das regras de negócio.
- Registro da data do empréstimo e cálculo dos dias emprestados.
- Contagem de livros disponíveis e emprestados.
- Busca de livros por autor.
- Busca por parte do título, sem diferenciar maiúsculas e minúsculas.
- Listagem de livros ordenados por título.
- Relatório de livros emprestados ordenados pelo tempo de empréstimo.
- Tratamento de entradas inválidas e retorno de resultados para as operações.

## Tecnologias e conceitos

- Java 21
- Programação orientada a objetos
- `ArrayList`, `HashMap`, `List` e `Map`
- Enumerações (`enum`)
- `LocalDate` e `ChronoUnit`
- Interfaces funcionais (`Consumer`)
- Lambdas e referências a métodos
- Streams e operações como `filter`, `sorted` e `count`
- Exceções e validação de dados
- Git e GitHub

## Como executar

### Pré-requisitos

- JDK 21 instalado.
- Terminal ou ambiente de desenvolvimento compatível com Java.

### Compilação

Na raiz do projeto, execute:

```bash
javac -d out src/biblioteca/*.java
```

### Execução

Após compilar, execute:

```bash
java -cp out biblioteca.Main
```

O programa será iniciado no terminal e apresentará um menu interativo para acessar as funcionalidades da biblioteca.

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

### Responsabilidades das classes

- **`Livro`**: representa um livro, valida seus dados e controla seu status, empréstimos e devoluções.
- **`Biblioteca`**: gerencia o acervo, realiza operações CRUD e disponibiliza buscas e relatórios.
- **`StatusLivro`**: define os possíveis estados de um livro.
- **`Main`**: apresenta o menu e gerencia a interação com o usuário.

## Regras de negócio

- Títulos e autores não podem ser nulos ou vazios.
- Cada livro recebe um identificador automático.
- Somente livros disponíveis podem ser emprestados.
- Somente livros emprestados podem ser devolvidos.
- Livros que não estejam disponíveis não podem ser removidos.
- A devolução limpa a data do empréstimo e restaura o status de disponibilidade.

## Etapas de desenvolvimento

| Etapa | Objetivo | Status |
|---|---|---|
| 1. Modelagem | Criar a classe `Livro` e aplicar encapsulamento. | Concluída |
| 2. CRUD inicial | Implementar as operações básicas com `ArrayList`. | Concluída |
| 3. Busca e remoção | Trabalhar com identificadores, coleções e `Map`. | Concluída |
| 4. Validações e exceções | Validar dados e tratar falhas nas operações. | Concluída |
| 5. Empréstimos | Controlar status, empréstimos e devoluções. | Concluída |
| 6. Organização | Melhorar a abstração e reutilizar operações. | Concluída |
| 7. Relatórios | Aplicar Streams para filtrar, ordenar e resumir dados. | Concluída |
| 8. Revisão final | Revisar o código e realizar testes manuais. | Concluída |

## Testes

Foram realizados testes manuais das funcionalidades, incluindo:

- Cadastro e validação de dados.
- Busca por título com diferentes combinações de maiúsculas e minúsculas.
- Tratamento de termos de busca vazios, nulos e sem correspondências.
- Atualização e remoção de livros.
- Empréstimos e devoluções, incluindo tentativas inválidas.
- Contagem, filtragem e ordenação de livros.
- Tratamento de entradas inválidas no menu.

## Armazenamento

O sistema utiliza armazenamento em memória. Os dados cadastrados são perdidos quando o programa é encerrado.

## Status do projeto

**Concluído:** as oito etapas de desenvolvimento foram finalizadas, incluindo as funcionalidades principais, a organização do código e os testes manuais.
