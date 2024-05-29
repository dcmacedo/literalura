<h1 align="center">LiterAlura</h1>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-17+-blue.svg">
  <img alt="Maven" src="https://img.shields.io/badge/Maven-3.6.3-blue.svg">
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-2.4.5-brightgreen.svg">
  <img alt="PostgreSQL" src="https://img.shields.io/badge/PostgreSQL-13-blue.svg">
  <img alt="Licença" src="https://img.shields.io/github/license/dcmacedo/literalura">
  <img alt="Status do Projeto" src="https://img.shields.io/badge/status-Concluído-green">
</p>

## Índice

- [Descrição](#descrição)
- [Instalação](#instalação)
- [Uso](#uso)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Acesso ao Projeto](#acesso-ao-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Empresas Envolvidas](#empresas-envolvidas)

## Descrição

<p align="justify">
Literalura é um Catálogo de Livros interativo desenvolvido em Java. O objetivo do projeto é proporcionar uma interface textual via console, permitindo aos usuários interagir com o catálogo de livros através de várias opções de interação. Os livros são buscados através da API Gutendex, garantindo que as informações estejam sempre atualizadas.
</p>

## Instalação

1. Certifique-se de ter o Java 17 instalado em seu sistema. Você pode baixá-lo em [java.com](https://www.java.com/pt-BR/download/).
2. Certifique-se de ter o Maven instalado. Você pode baixá-lo em [maven.apache.org](https://maven.apache.org/download.cgi).
3. Clone este repositório para o seu computador:

    ```bash
    git clone https://github.com/dcmacedo/literalura.git
    ```

4. Navegue até o diretório do projeto:

    ```bash
    cd literalura
    ```

5. Configure o banco de dados PostgreSQL:

    - Crie um banco de dados chamado `literalura`.
    - Atualize as credenciais do banco de dados no arquivo `src/main/resources/application.properties`.

6. Compile e execute o projeto usando Maven:

    ```bash
    mvn spring-boot:run
    ```

## Uso

1. Abra o projeto em sua IDE Java preferida ou use o terminal conforme instruções acima.
2. Execute a aplicação.
3. No console, siga as instruções para interagir com o catálogo de livros.

## Funcionalidades

Literalura oferece as seguintes opções de interação:

1. **Buscar livro por título**: Permite ao usuário buscar um livro específico pelo seu título.
2. **Listar livros registrados**: Exibe uma lista de todos os livros disponíveis no catálogo.
3. **Listar Autores**: Exibe uma lista de todos os autores registrados no catálogo.
4. **Listar Autores vivos em determinado ano**: Permite listar todos os autores que estavam vivos em um determinado ano.
5. **Listar Livros em determinado Idioma**: Exibe uma lista de livros disponíveis em um idioma específico.
6. **Exibir a quantidade de livros em um determinado idioma**: Mostra a quantidade de livros disponíveis em um idioma específico.
7. **Exibir as Estatísticas de Downloads dos Livros**: Mostra algumas estatísticas de downloads (soma, média, máximo, mínimo, contagem, etc.)

## Tecnologias Utilizadas

- IntelliJ IDEA Community Edition 2024.1
- Java 17
- Maven
- Spring Boot
- Spring Data JPA
- Banco de dados PostgreSQL
- Jackson Databind
- [API Gutendex](https://gutendex.com/) para busca de informações atualizadas

## Acesso ao Projeto

Você pode acessar o projeto no GitHub [aqui](https://github.com/dcmacedo/literalura).

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

## Empresas Envolvidas

Este projeto foi desenvolvido com o suporte das seguintes empresas:

<p align="center">
  <img src="https://www.oracle.com/webfolder/s/delivery_production/assets/oracle-logo.svg" alt="Oracle" height="50">
  <img src="https://www.alura.com.br/assets/img/alura-logo.svg" alt="Alura" height="50">
</p>

---

Desenvolvido por [Danilo C. Macedo](https://github.com/dcmacedo).
