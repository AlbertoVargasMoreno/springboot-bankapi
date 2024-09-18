# Banking API

https://www.youtube.com/watch?v=Mp7qndf3xjg

- The video uses springboot version 3.2.3

- The configuration adaptation is show in [this screenshot](./docs/projectConfiguration.startSpringIO.png)

## Installation
1. clone this repository
2. create DB
```
mysql> create database bankDB;
```
3. In VScode in the left menu choose option
`SPRING BOOT DASHBOARD > APPS > Run`

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
## Acknowledgements

This code is my version of the tutorial made by the youtube creator:

- youtube.com/@SJProgrammingSolutions

- topmate.io/shitaljadhav
