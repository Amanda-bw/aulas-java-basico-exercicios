package exercicios;
//programa que calcule a área de um quadrado e em seguida mostre o dobro desta
// área para o usuário

import java.util.Scanner;

public class Exercicio7AreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);

        System.out.println("Quanto mede um lado do quadrado?");
        double lado = scan.nextDouble();
        double areaQuadrado = lado*lado;
        System.out.println("A área do quadrado é de: " + areaQuadrado);
        System.out.println("O dobro desse valor é: " + areaQuadrado*2);

    }
}
