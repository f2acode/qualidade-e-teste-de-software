@echo off

javac urna/Candidato.java
javac urna/Urna.java

javac -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar urna/CandidatoTestes.java
javac -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar urna/UrnaTestes.java

java -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore urna.CandidatoTestes
java -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore urna.UrnaTestes
