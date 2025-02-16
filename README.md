ReviewSystem
API para gerenciar avaliações de filmes, séries e livros. Desenvolvida para portfólio.

🚀 Funcionalidades
Usuários: Criar, visualizar e deletar.

Itens: Cadastrar filmes, séries e livros, além de visualizar e deletar.

Avaliações: Criar, visualizar e deletar avaliações de itens.

🛠 Tecnologias
Java 17

Spring Boot

PostgreSQL (Banco de dados)

Maven (Gerenciamento de dependências)

Insomnia (Testes de API)

▶️ Como Executar
Clone o repositório:

bash
Copy
git clone https://github.com/jonasvlima/reviewsystem.git
Acesse a pasta do projeto:

bash
Copy
cd reviewsystem
Configure o banco de dados no arquivo src/main/resources/application.properties.

Execute o projeto:

bash
Copy
./mvnw spring-boot:run
A API estará disponível em:

Copy
http://localhost:8080
🔗 Endpoints
Usuários:

POST /users: Cria um usuário.

GET /users/{id}: Retorna um usuário específico.

GET /users: Retorna todos os usuários.

DELETE /users/{id}: Deleta um usuário.

Itens:

POST /items: Cadastra um item (filme, série ou livro).

GET /items/{id}: Retorna um item específico.

GET /items: Retorna todos os itens.

DELETE /items/{id}: Deleta um item.

Avaliações:

POST /reviews: Cria uma avaliação para um item.

GET /reviews/{id}: Retorna uma avaliação específica.

GET /reviews: Retorna todas as avaliações.

DELETE /reviews/{id}: Deleta uma avaliação.

🔮 Melhorias Futuras
Adicionar autenticação de usuários.

Implementar sistema de recomendação.

Adicionar validações de avaliação (ex: 1 a 5 estrelas).

Migrar para um banco de dados real (MySQL/PostgreSQL).

📞 Contato
Nome: Jonas Lima

GitHub: jonasvlima

LinkedIn: Jonas Lima