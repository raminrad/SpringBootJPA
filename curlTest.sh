#!/bin/sh


echo curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 1", "age": 35}' http://localhost:8080/person/
curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 1", "age": 35}' http://localhost:8080/person/
echo ""


echo curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 2", "age": 22}' http://localhost:8080/person/
curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 2", "age": 22}' http://localhost:8080/person/
echo ""

curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 3", "age": 19}' http://localhost:8080/person/
echo ""

curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 4", "age": 13}' http://localhost:8080/person/
echo ""

curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 5", "age": 11}' http://localhost:8080/person/
echo ""


echo curl  http://localhost:8080/person/list
curl  http://localhost:8080/person/list
echo ""

echo curl  http://localhost:8080/person/teens
curl  http://localhost:8080/person/teens
echo ""

echo curl  http://localhost:8080/person/1
curl  http://localhost:8080/person/1
echo ""

echo curl  http://localhost:8080/person/2
curl  http://localhost:8080/person/2
echo ""

echo curl  http://localhost:8080/person/100
curl  http://localhost:8080/person/100
echo ""





