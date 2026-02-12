# Linketinder MVP – Groovy

**Autor:** Henrique Roberto dos Santos

---

## Descrição

Este projeto é um **MVP (Minimum Viable Product)** do sistema **Linketinder**, uma aplicação inspirada na ideia de unir o conceito de perfis profissionais (LinkedIn) com a lógica de visualização simples de perfis (Tinder).

O objetivo é permitir a visualização de **candidatos** e **empresas** em um menu de terminal, validando estrutura de dados, orientação a objetos e organização de projeto.

O sistema foi desenvolvido em **Groovy**, utilizando **POO** e o padrão **MVC (Model–View–Controller)**.

---

## Funcionalidades

- Lista de **5 candidatos pré-cadastrados**
- Lista de **5 empresas pré-cadastradas**
- Menu no terminal para:
    - Listar candidatos
    - Listar empresas
    - Encerrar o programa

### Dados do Candidato
- Nome
- E-mail
- CPF
- Idade
- Estado
- CEP
- Descrição pessoal
- Competências

### Dados da Empresa
- Nome
- E-mail corporativo
- CNPJ
- País
- Estado
- CEP
- Descrição da empresa
- Competências esperadas

---

## Tecnologias Utilizadas

- **Groovy**
- **IntelliJ IDEA**
- **Git**
- **GitHub**
- **Programação Orientada a Objetos**
- **MVC**

---

## Ambiente de Desenvolvimento

- Java 21
- Groovy 5
- IntelliJ IDEA
- Sistema Operacional: Linux (Pop!_OS)


## Como Executar

### Pré-requisitos
- Java instalado
- Groovy instalado

### Passos

```bash
git clone https://github.com/seu-usuario/linketinder-project.git
cd linketinder-project
groovy src/linketinder/Main.groovy