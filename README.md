## Linketinder MVP – Groovy

**Autor:** Henrique Roberto dos Santos

---

## Descrição

Este projeto é um **MVP (Minimum Viable Product)** do sistema **Linketinder**, uma aplicação inspirada na ideia de unir o conceito de perfis profissionais (LinkedIn) com a lógica de visualização interativa de perfis (Tinder).

O objetivo é permitir a visualização e interação entre **candidatos** e **empresas** por meio de um menu de terminal. O sistema possibilita que usuários demonstrem interesse (Like) em outros perfis, gerando um "Match" automático quando a reciprocidade é detectada.

O sistema foi desenvolvido em **Groovy**, utilizando **POO**, **Interfaces** e o padrão **MVC (Model–View–Controller)**.

---

## Funcionalidades

- **Login Automático (Mock):** Sistema de sessão simulada para candidatos e empresas.
- **Perfil Próprio:** Visualização detalhada dos dados do usuário logado.
- **Exploração Interativa:** Navegação de perfis um a um, permitindo escolher entre:
    - **[L] Like:** Demonstrar interesse no perfil.
    - **[P] Próximo:** Pular para o próximo perfil da lista.
    - **[S] Sair:** Retornar ao menu principal.
- **Sistema de Match:** Identificação em tempo real de interesses mútuos.
- **Lista de Matches:** Listagem completa de todos os perfis onde houve reciprocidade.

### Dados do Candidato
- Nome, E-mail, CPF, Idade, Estado, CEP, Descrição pessoal e Competências.

### Dados da Empresa
- Nome, E-mail corporativo, CNPJ, País, Estado, CEP, Descrição da empresa e Competências esperadas.

---

## 🛠️ Tecnologias Utilizadas

- **Groovy 4**
- **Git (GitFlow)**: Desenvolvimento realizado na branch `feature/login-sistema`.
- **IntelliJ IDEA**
- **Interface & POO**

---

## 💻 Ambiente de Desenvolvimento

- **SO:** Linux (Pop!_OS)

---

## 🏃 Como Executar

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/HenriqueRoberto/Linketinder-Project.git
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
