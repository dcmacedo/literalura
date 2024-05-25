<h1 align="center">LiterAlura</h1>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-8+-blue.svg">
  <img alt="Licença" src="https://img.shields.io/github/license/dcmacedo/literalura">
  <img alt="Última Versão" src="https://img.shields.io/github/release-date/dcmacedo/literalura">
  <img alt="Status do Projeto" src="https://img.shields.io/badge/status-Em Desenvolvimento-yellow">
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

literalura é um Catálogo de Livros interativo desenvolvido em Java. O objetivo do projeto é proporcionar uma interface textual via console, permitindo aos usuários interagir com o catálogo de livros através de pelo menos 5 opções de interação. Os livros são buscados através de uma API específica, garantindo que as informações estejam sempre atualizadas.

## Instalação

1. Certifique-se de ter o Java instalado em seu sistema. Você pode baixá-lo em [java.com](https://www.java.com/pt-BR/download/).
2. Clone este repositório para o seu computador:

    ```bash
    git clone https://github.com/dcmacedo/literalura.git
    ```

3. Navegue até o diretório do projeto:

    ```bash
    cd literalura
    ```

4. Compile o projeto:

    ```bash
    javac -d bin src/*.java
    ```

5. Execute o projeto:

    ```bash
    java -cp bin Main
    ```

## Uso

1. Abra o projeto em sua IDE Java preferida ou use o terminal conforme instruções acima.
2. Execute o arquivo `Main.java`.
3. No console, siga as instruções para interagir com o catálogo de livros.

## Funcionalidades

literalura oferece as seguintes opções de interação:

1. **Listar todos os livros**: Exibe uma lista de todos os livros disponíveis no catálogo.
2. **Buscar livro por título**: Permite ao usuário buscar um livro específico pelo seu título.
3. **Adicionar um novo livro**: Possibilita adicionar um novo livro ao catálogo.
4. **Remover um livro**: Permite remover um livro do catálogo.
5. **Atualizar informações de um livro**: Possibilita atualizar as informações de um livro existente no catálogo.

## Tecnologias Utilizadas

- Java
- Biblioteca JSON (Gson)
- [API Gutendex](https://gutendex.com/) para busca de informações atualizadas

## Acesso ao Projeto

Você pode acessar o projeto no GitHub [aqui](https://github.com/dcmacedo/literalura).

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

## Empresas Envolvidas

Este projeto foi desenvolvido como parte da formação Backend do programa ONE, uma parceria das seguintes empresas:

<p align="center">
  <img src="https://www.oracle.com/webfolder/s/delivery_production/assets/oracle-logo.svg" alt="Oracle" height="50">
  <img src="https://www.alura.com.br/assets/img/alura-logo.svg" alt="Alura" height="50">
</p>

---

Desenvolvido por [Danilo C. Macedo](https://github.com/dcmacedo).
