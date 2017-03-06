# product-basic
## Introduction:
This is a Restful microservice which provide basic product information of Item Id and Item name as shown below:
[  {    "product_id": "789",    "name": "product3"  },  {    "product_id": "123",    "name": "product1"  },  {    "product_id": "456",    "name": "product2"  }]

## Technology Stack
* Java 8
* SpringBoot
* SpringDataJPA
* SpringDataCassandra
* Maven
* Docker

## Dependency
### Apache cassandra
It requires the database up and running at node mentioned in application.properties. At present it uses EC2 instance.
If not please create the below keyspace, table info and provide cassandra host info as part of cassandra.contactpoints in application.properties

create KEYSPACE product WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

create table product_basic (product_id text, name text,PRIMARY KEY (product_id) );

sample insert statement: INSERT INTO product_basic (product_id, name) values ('123','product1');

## Running app

./mvnw package && java -jar target/product-basic-0.0.1-SNAPSHOT.jar

## To build docker image

./mvnw package docker:build   - This command builds a docker image with name: sudhakarbathina/product-basic:latest

## Running docker image

docker run -p 9000:9000 -t sudhakarbathina/product-basic   
