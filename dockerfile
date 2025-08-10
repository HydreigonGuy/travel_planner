FROM openjdk:latest

COPY ./src /usr/src/travel_planner

WORKDIR /usr/src/travel_planner

RUN javac Main.java

CMD ["java", "Main"]
