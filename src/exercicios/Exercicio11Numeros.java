package exercicios;

import java.util.Scanner;

public class Exercicio11Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva dois numeros inteiros e um real: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double num3 = scan.nextDouble();

        System.out.println("O produto do dobro do primeiro com metade do segundo");
        System.out.println((num1 * 2) * (num2/2));

        System.out.println("a soma do triplo do primeiro com o terceiro");
        System.out.println((num1 * 3) + num3);

        System.out.println("o terceiro elevado ao cubo");
        System.out.println((Math.pow(num3,3)));
    }
}
