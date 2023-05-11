# DBMS-Lab-Caching

## Execution
```
git clone https://github.com/lomayd/DBMS-Lab-Caching.git

cd ./DBMS-Lab-Caching

[Write down "MYSQL_ROOT_PASSWORD" in docker-compose.yml]

docker-compose up -d

[Write down "spring.datasource.password" in /src/main/resources/application.yml]

sudo chmod 755 ./gradlew

./gradlew build

java -jar build/libs/DBMS-Lab-Caching-0.0.1-SNAPSHOT.jar 
```

## Contents
- Caching Data When GET Request Receives
- Deleting Cache When DELETE Request Receives
