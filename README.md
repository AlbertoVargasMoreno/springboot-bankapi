# Banking API

https://www.youtube.com/watch?v=Mp7qndf3xjg

- The video uses springboot version 3.2.3

- The configuration adaptation is show in [this screenshot](./docs/projectConfiguration.startSpringIO.png)

## Installation
1. create DB
```
mysql> create database bankDB;
```

## Test
```
curl  -X POST \
  'http://localhost:8080/account/create' \
  --header 'Accept: */*' \
  --header 'Content-Type: application/json' \
  --data-raw '{
  "account_holder_name": "Maria",
  "account_balance": "423.50"
}'
```
