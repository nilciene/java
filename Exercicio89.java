package logica_programacao;

import java.util.Scanner;

public class Exercicio89 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numerosPositivos = 0;
            int numerosNegativos = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero > 0) {
                    numerosPositivos++;
                } else if (numero < 0) {
                    numerosNegativos++;
                }
            }

            System.out.println("Quantidade de números positivos: " + numerosPositivos);
            System.out.println("Quantidade de números negativos: " + numerosNegativos);}
}
