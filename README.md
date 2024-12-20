# Voll Med API  

## Sobre o Projeto  
A **Voll Med API** é uma aplicação desenvolvida em **Java com Spring Boot** para facilitar a gestão de dados relacionados a médicos e pacientes. O projeto foi criado com foco no desenvolvimento de um backend robusto, organizado e escalável, utilizando boas práticas e ferramentas modernas.  
![Imagem de ilustração](src/main/java/med/voll/api/illustration/vollmed.PNG)

## Tecnologias Utilizadas  
- **Java 17**  
- **Spring Boot 3**  
- **MySQL**  
- **Flyway** (para migrações de banco de dados)  
- **Bean Validation** (para validação de dados)  
- **Postman** (para testes da API)  

---

## Funcionalidades  
- **CRUD para médicos e pacientes**: Permite criar, ler, atualizar e excluir informações.  
- **Paginação de dados**: Otimiza a consulta de grandes volumes de informações.  
- **Validação de dados**: Garante que apenas informações consistentes sejam processadas.  
- **Gerenciamento de migrações**: Evolução do banco de dados facilitada com Flyway.  

---

## Organização do Projeto  
Toda a documentação do projeto foi organizada no Trello, detalhando as regras e validações das funcionalidades implementadas.  

- **Trello:** [Acesse aqui](https://trello.com/invite/b/6758a72e4763e56a265fa4dc/ATTIc9d61f3ffe93eddb35fb00e73c81c9275CC33A91)  

---

## Testes  
Como o foco do projeto foi no desenvolvimento do backend, utilizei o **Postman** para testar e validar todas as funcionalidades implementadas.  

---

## Como Executar o Projeto  

1. **Clone o repositório:**  
   ```bash
   git clone https://github.com/rodrigolima-dev/med.voll.api.git
   cd med.voll.api

   Configure o banco de dados MySQL:

## Configuração do Banco de Dados  

1. **Configure o banco de dados MySQL:**  
   - Crie um banco de dados com o nome `vollmed`.  

2. **Atualize as credenciais no arquivo `application.properties`:**  
   Abra o arquivo e configure suas credenciais de acesso ao MySQL:  
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/vollmed
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA

Importe o arquivo de configuração do Postman (se aplicável).
Acesse as rotas documentadas para testar as funcionalidades.
Contribuição
Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

Contato

LinkedIn: [Rodrigo Lima](https://www.linkedin.com/in/rodrigo-lima-95a548242/)

