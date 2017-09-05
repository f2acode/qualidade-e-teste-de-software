@echo off

javac src/Calculo.java
javac -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar src/CalculoTeste.java

java -cp .;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore src.CalculoTeste
