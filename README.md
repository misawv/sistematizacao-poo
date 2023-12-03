# Sistematização Poo
[![NPM](https://img.shields.io/npm/l/react)](https://https://github.com/misawv/sistematizacao-poo/blob/main/LICENSE) 

# Sobre o projeto

Uma API REST simples para controle de entregadores da empresa fictícia Dianome

## Funcionalidades

- Cadastro, listagem, atualização e deleção de entregadores
- Cadastro, listagem, atualização e deleção de veículos

## Tecnologias utilizadas

- Java
- Spring Boot
- JPA
- Lombok
- Maven
- MySQL

## Como executar o projeto

Pré-requisitos: Java 17

```bash
# Clonar o repositório
git clone https://github.com/misawv/sistematizacao-poo.git

# Acessar a pasta do projeto
cd sistematizacao-poo

# Para iniciar a aplicação
./mvnw spring-boot:run
```

## Documentação

### Cadastrar um veículo

```
# Requisição

POST /vehicle
Content-Type: application/json

{
  "licensePlate" : "HOQ-8096",
  "capacity" : 90.0,
  "type" : "Moto"
}

# Resposta

Status: 201 Created
```

## Autor

Rafaela Souza Farias

