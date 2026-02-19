# Linketinder MVP – Groovy (MVC Edition)

**Autor:** Henrique Roberto dos Santos

---

## 📝 Descrição

Este projeto é um **MVP (Minimum Viable Product)** do sistema **Linketinder**. A aplicação simula o ecossistema de contratação unindo perfis profissionais e empresas. 

Nesta versão, o foco foi a implementação do padrão **MVC (Model-View-Controller)** rigoroso, separando a lógica de negócio (Services), a interface de terminal (View) e a orquestração do sistema (Controller). O projeto também utiliza **Interfaces** para padronizar os modelos de dados.

---

## 🚀 Funcionalidades Atuais

- **Login Automático (Mocado):** Sistema de sessão simulada para agilizar testes, utilizando dados pré-definidos no `DadosMock`.
- **Menu de Candidato:** - Acesso exclusivo após "Login como Candidato".
    - Visualização do perfil completo (Pessoa Física).
    - Listagem detalhada de todas as empresas disponíveis.
- **Menu de Empresa:** - Acesso exclusivo após "Login como Empresa".
    - Visualização dos dados corporativos (Pessoa Jurídica).
    - Listagem detalhada de todos os candidatos disponíveis.
- **Dados Completos:** Exibição via `toString()` customizado, mostrando CPF, CNPJ, competências, descrição e localização.

---

## 🏗️ Estrutura do Projeto (MVC)

- **Model:** Uso de interface `Pessoa` e implementações `PessoaFisica` e `PessoaJuridica`.
- **View:** `MenuView` centraliza toda a interação de entrada (Scanner) e saída (println).
- **Controller:** `AppController` gerencia o fluxo de navegação entre os menus.
- **Service:** `LoginService` isola a lógica de recuperação dos usuários ativos.
- **Data:** `DadosMock` provê a persistência em memória com 5 candidatos e 5 empresas.

---

## 🛠️ Tecnologias Utilizadas

- **Groovy 4**
- **Git (GitFlow)**: Desenvolvimento realizado na branch `feature/login-sistema`.
- **IntelliJ IDEA**
- **Interface & POO**

---

## 💻 Ambiente de Desenvolvimento

- **SO:** Linux (Pop!_OS)
- **Gerenciador de Build:** Gradle (opcional) ou execução direta via Groovy.

---

## 🏃 Como Executar

### Passos
1. Clone o repositório:
   ```bash
   git clone [https://github.com/HenriqueRoberto/Linketinder-Project.git](https://github.com/HenriqueRoberto/Linketinder-Project.git)
   ```
2. Acesse a pasta do projeto:
   ```bash
    cd Linketinder-Project
   ```
3. Execute a aplicação:
   ```bash
    # Caso use o terminal direto:
    groovy src/main/groovy/linketinder/Main.groovy
   ```
