# 🎬 Projeto Final Bloco 01 - Locadora de Filmes (Console)

- Este projeto foi desenvolvido como parte da entrega do **Bloco 01**, utilizando a linguagem **Java** e os conceitos de **Programação Orientada a Objetos (POO)**.  
- O sistema simula uma **locadora de filmes**, rodando no console, com funcionalidades de CRUD (Create, Read, Update, Delete).

---
## 📌 Funcionalidades

- 📥 **Cadastrar Filme**
- 📋 **Listar Filmes**
- ✏️ **Atualizar Filme**
- ❌ **Remover Filme**
- ℹ️ **Sobre o Projeto**

---
## 🔄 Fluxo de Desenvolvimento

1. Criação do repositório locadora_pg no GitHub
2. Conexão do projeto local com o repositório remoto
3. Organização em branches:
- 01_Menu → Implementação do menu
- 02_Model_Repository → Criação das classes abstratas, herança e interface
- 03_Controller → CRUD com Collections e Exceptions
- 04_Extras → Funcionalidades adicionais (opcional)

---
## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17 ou superior recomendado)
- **Eclipse / Spring Tool Suite (STS)**
- **Git & GitHub**

---
## 📂 Estrutura do Projeto
```text
locadora_pg/
├── src/
│ ├── app/
│ │ └── Menu.java
│ ├── controller/
│ │ └── LocadoraController.java
│ ├── model/
│ │ ├── Filme.java # Classe abstrata
│ │ └── FilmeAcao.java # Classe que herda de Filme (exemplo)
│ ├── repository/
│ │ └── LocadoraRepository.java

├── README.md
└── .gitignore
```

---
## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/nicollyjesus/locadora_pg.git

- Importe o projeto no Eclipse/STS/Intellij como Java Project.
- Localize a classe Menu.java (com.locadora_pg.app).
- Clique com o botão direito → Run As → Java Application.
- Use o menu exibido no console para navegar pelas opções.

---
## 🖥️ Menu Principal
```text
========== LOCADORA - MENU ==========

       1 - Cadastrar filme
       2 - Listar filmes
       3 - Atualizar filme
       4 - Remover filme
       5 - Sobre
       0 - Sair
```

---
## 🎬 Cadastro de Filme
```text
Título: Velozes e Furiosos
Preço: 15.00
Quantidade: 3
Gênero: Ação
Filme cadastrado com sucesso: ID: 1 | Velozes e Furiosos | R$ 15.00 | Qtde: 3
```

--- 
## 👩‍💻 Autora

- Nome: Nicolly Jesus
- Linkedln: https://www.linkedin.com/in/nicolly-jesus/
- Curso: Java Full-Stack -  Bloco 01 - Projeto Final
- Data: 2025

---
