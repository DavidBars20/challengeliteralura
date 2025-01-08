# challengeliteralura
Chalenge SpringBoot

# LiterAlura

**LiterAlura** é uma aplicação desenvolvida para o desafio **LiterAlura**, promovido pela **Alura** em parceria com o programa **Oracle Next Education**. O objetivo principal do projeto é buscar informações de livros utilizando a API pública **Gutendex**, registrar essas informações em um banco de dados **PostgreSQL** e fornecer uma interface de API REST para manipulação e consulta dos dados.

## Tecnologias Utilizadas

Este projeto utiliza as seguintes tecnologias e ferramentas:

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento rápido e eficiente de aplicações Java.
- **Maven**: Gerenciador de dependências e construção do projeto.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenamento das informações.
- **Spring Data JPA**: Integração entre a aplicação e o banco de dados, facilitando operações de persistência.
- **API Gutendex**: Fonte de dados externa para informações sobre livros ([documentação da API](https://gutendex.com/)).
- **Jackson**: Biblioteca para manipulação de JSON.

## Dependências

As principais dependências do projeto incluem:

- **Spring Boot Starter Web**: Para criação e gerenciamento de APIs REST.
- **Spring Data JPA**: Para operações de persistência com o banco de dados PostgreSQL.
- **PostgreSQL Driver**: Para conectar a aplicação ao banco de dados PostgreSQL.
- **Jackson Databind**: Para manipular e processar dados no formato JSON.

As dependências completas podem ser visualizadas no arquivo `pom.xml`.

## Funcionalidades da Aplicação

A aplicação foi desenvolvida para oferecer as seguintes funcionalidades:

### 1. Buscar Livros por Título
Realiza uma consulta à API **Gutendex** com base no título fornecido pelo usuário. Os resultados incluem informações como:
- Título
- Autor(es)
- Idioma
- Número de downloads

### 2. **Armazenar Livros no Banco de Dados**
Os livros obtidos da API podem ser registrados no banco de dados PostgreSQL caso ainda não tenham sido armazenados. As informações salvas incluem:
- Título
- Autor(es)
- Idioma
- Número de downloads

### 3. **Listar Livros Registrados**
Permite a consulta de todos os livros registrados no banco de dados.

### 4. **Listar Autores Registrados**
Exibe uma lista de todos os autores cujos livros estão armazenados no banco de dados.

### 5. **Listar Autores Vivos em um Ano Específico**
Ao informar um ano, o sistema retorna os autores que estavam vivos durante aquele período.

### 6. **Listar Livros por Idioma**
Permite filtrar os livros registrados no banco de dados com base no idioma especificado.

## Configuração do Projeto

### Banco de Dados
- Certifique-se de que o PostgreSQL esteja instalado e configurado em seu ambiente.
- Crie um banco de dados chamado `literalura` e ajuste as configurações no arquivo `application.properties`.

### Arquivo `application.properties`
Configure as seguintes propriedades para conectar ao banco de dados:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true

### Endpoints Disponíveis
Método	Endpoint	Descrição
GET	/api/books	Lista todos os livros registrados.
POST	/api/books	Armazena um novo livro no banco.
GET	/api/books/search	Busca livros na API Gutendex.
GET	/api/authors	Lista todos os autores registrados.
GET	/api/authors/vivos/{ano}	Lista autores vivos em um ano.
GET	/api/books/language/{id}	Lista livros em um idioma específico.

### Contribuindo

Se deseja contribuir para este projeto, sinta-se à vontade para enviar sugestões, relatórios de bugs ou pull requests.








