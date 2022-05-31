package exercicios;

import java.util.Scanner;

// programa que peça o raio de um circulo e calcule sua área
// A = pi * raio²
public class Exercicio6Raio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o raio do círculo a ser calculado a área? ");
        double raio = scan.nextDouble();
        double pi = 3.14;
        double area = pi * (raio*raio);

        System.out.println("A área do círculo com raio de " + raio + " é de: " + area + "m");

    }

}
