package exercicios;

import java.util.Scanner;

public class Exercicio9Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura em Farehnheit: ");
        double tempFahrenheit = scan.nextDouble();

        double conversaoCelsius = (5* (tempFahrenheit - 32) / 9);
        System.out.println("A temperatura " + tempFahrenheit + "F" + " em Celsius é de " + conversaoCelsius + "ºC");
    }
}
