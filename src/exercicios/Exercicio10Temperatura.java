package exercicios;

import java.util.Scanner;

public class Exercicio10Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura em Celsius: ");
        double tempCelsius = scan.nextDouble();

        double conversao = ((tempCelsius - 32) / 1.8);
        System.out.println("A temperatura " + tempCelsius + "ºC" + " em Fahrenheit é de " + conversao + "F");
    }
}
