package logica_programacao;

import java.util.Scanner;

public class Exercicio99 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matrizA = new int[2][2];
            int[][] matrizB = new int[2][2];
            int[][] matrizSoma = new int[2][2];

            System.out.println("Digite os elementos da primeira matriz 2x2:");
            lerMatriz(scanner, matrizA);

            System.out.println("Digite os elementos da segunda matriz 2x2:");
            lerMatriz(scanner, matrizB);

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

            System.out.println("Matriz A:");
            exibirMatriz(matrizA);

            System.out.println("Matriz B:");
            exibirMatriz(matrizB);

            System.out.println("Soma das matrizes:");
            exibirMatriz(matrizSoma);
        }

        private static void lerMatriz(Scanner scanner, int[][] matriz) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Nova linha para separar as linhas da matriz
            }
            System.out.println(); // Nova linha para melhor formatação
        }
}


