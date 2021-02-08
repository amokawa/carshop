# carshop

Desafio Itaú para criar um serviço de cadastro de veículos.

## Requisitos

* o API gateway (Zuul) deve esta estar rodando. [Link do projeto](https://github.com/amokawa/zull-api-gateway)

## Como executar

* Baixar o código para a máquina destino.
* Executar: `.\mvnw spring-boot:run`.

## Verificando a aplicação

* Acessar `http://localhost:8080/carshop/automoveis` (caso o serviço do API Gateway esteja rodando) OU
  `http://localhost:8090/automoveis` para acessar diretamente.

## Exemplos

### Chamada do método "/automoveis"

* Requisição:
  ```text
  curl --location --request GET 'localhost:8080/carshop/automoveis'
  ```
* Resposta:
  ```json
  [
    {
      "id": 1,
      "brand": "Land Rover",
      "model": "Discovery Sport",
      "price": 219999.0,
      "createdAt": "2019-01-01"
    },
    {
      "id": 2,
      "brand": "Ford",
      "model": "Fusion",
      "price": 27990.0,
      "createdAt": "2018-01-01"
    },
    {
      "id": 3,
      "brand": "Citroen",
      "model": "C3",
      "price": 16900.0,
      "createdAt": "2015-01-01"
    },
    {
      "id": 4,
      "brand": "Volkswagen",
      "model": "Gol",
      "price": 34900.0,
      "createdAt": "2015-01-01"
    },
    {
      "id": 5,
      "brand": "Audi",
      "model": "A6",
      "price": 162800.0,
      "createdAt": "2001-01-01"
    },
    {
      "id": 6,
      "brand": "BMW",
      "model": "X5",
      "price": 65000.0,
      "createdAt": "2010-01-01"
    },
    {
      "id": 7,
      "brand": "Hyundai",
      "model": "Genesis",
      "price": 70900.0,
      "createdAt": "2008-01-01"
    }
  ]
  ```

### Chamada do método "/cadastroAutomoveis"

* Requisição:
  ```text
  curl --location --request POST 'localhost:8080/carshop/cadastroAutomoveis' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "brand":"Honda",
    "model":"Fit",
    "price":23000.59 }'
    ```

* Resposta:
  ```json
  {
    "id": 8,
    "brand": "Honda",
    "model": "Fit",
    "price": 23000.59,
    "createdAt": "2021-02-07"
  }
  ```
    