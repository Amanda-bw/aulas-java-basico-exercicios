package exercicios;

import java.util.Scanner;
// programa que pergunte quanto voce ganha por hora e o número de horas trabalhadas
// no mes. Calcule e mostre o referido salário do mês

public class Exercicio8SalarioMes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        int horaMes = scan.nextInt();
        double salario = horaMes*valorHora;

        System.out.println("O seu salário é de " + salario);





    }
}
