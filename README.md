# Sistema de Cadastro de Pessoas

API REST desenvolvida em Java com Spring Boot e MySQL para gerenciamento de cadastros de pessoas.

O projeto tem como objetivo aplicar conceitos de programação orientada a objetos, arquitetura em camadas, persistência de dados e desenvolvimento de APIs REST.

## Tecnologias utilizadas

- Java 25
- Spring Boot 4.1.1
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Jakarta Validation
- Git e GitHub
- Postman

## Funcionalidades

- Cadastro de pessoas.
- Listagem de pessoas cadastradas.
- Busca de pessoas por ID.
- Atualização de cadastros.
- Exclusão de registros.
- Validação dos dados recebidos.
- Tratamento centralizado de erros.

## Endpoints da API

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/api/pessoas` | Cadastrar pessoa |
| GET | `/api/pessoas` | Listar pessoas |
| GET | `/api/pessoas/{id}` | Buscar pessoa por ID |
| PUT | `/api/pessoas/{id}` | Atualizar pessoa |
| DELETE | `/api/pessoas/{id}` | Excluir pessoa |

## Arquitetura do projeto

O backend utiliza arquitetura em camadas, separando as responsabilidades:

- **Entity:** representação das entidades e mapeamento com o banco de dados.
- **Repository:** acesso e persistência dos dados.
- **Service:** implementação das regras de negócio.
- **Controller:** gerenciamento das requisições HTTP.
- **Exception:** tratamento centralizado de exceções.

## Banco de dados

O projeto utiliza MySQL para armazenar os dados das pessoas.

- Banco de dados: `cadastro_pessoas`
- Persistência realizada com Spring Data JPA e Hibernate.

## Como executar o projeto

1. Instale o JDK 25 e o MySQL.
2. Crie o banco de dados `cadastro_pessoas`.
3. Configure as credenciais do banco no arquivo `application.properties`.
4. Abra o projeto no IntelliJ IDEA.
5. Aguarde o carregamento das dependências Maven.
6. Execute a classe `CadastroApplication`.
7. Utilize o Postman para testar os endpoints.

## Próximos passos

- Desenvolver uma interface utilizando HTML, CSS e JavaScript.
- Integrar o frontend à API REST.
- Aprimorar a experiência de utilização do sistema.

## Autor

**Marcos Vinicius de Souza Vack Salines**

- GitHub: [@marcossalines-dev](https://github.com/marcossalines-dev)
- LinkedIn: [Marcos Vinicius de Souza](https://www.linkedin.com/in/marcos-vinicius-de-souza-92728037b/)

---

Projeto desenvolvido para fins de aprendizado e evolução prática em Desenvolvimento de Software, com foco em Java e Backend.
