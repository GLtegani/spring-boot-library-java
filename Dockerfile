FROM maven:3.8.7-eclipse-temurin-17

WORKDIR /app

COPY pom.xml /app

RUN mvn dependency:go-offline

COPY . /app

RUN mvn clean install

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]