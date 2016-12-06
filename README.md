# Sample Spring Boot Application with Spring Data/JPA

This is a sample Spring Boot app that uses Spring Data with JPA. It uses the Hibernate HSQLDB (in-memory database).

## Run HSQLDB

Assuming that you have downloaded HSQLDB jar, you can start the database, in server mode, like this:

```
$ java -cp hsqldb-2.0.0.jar org.hsqldb.Server --database.0 mem:test --dbname.0 test
```

That will start the DB Server with an in-memory database called *test*.

## Start Spring Boot application

To start the Spring Boot application, just run the gradle task, as shown:

```
$ gradle bootRun
```

The app should be running now.

## Test the Restful services

You can use *curl* to test the Restful services:

1. GET all persons: ```curl http://localhost:8080/person/list```
2. Save a new person: ```curl -H "Content-Type: application/json" -X POST -d '{"name": "Person 1", "age": 12}' http://localhost:8080/person/```

# DONE!
