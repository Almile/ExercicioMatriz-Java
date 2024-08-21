import java.util.Scanner;

public class matrizEx01 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int[][] matriz = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // int[][] matriz2 = {
        //     {3, 2, 3},
        //     {3, 2, 3},
        //     {3, 2, 3}
        // };
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        // Preenchendo a primeira matriz com valores
        System.out.println("Matriz A: \n");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }

        // Preenchendo a segunda matriz com valores
        System.out.println("Matriz B: \n");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
                matriz2[linha][coluna] = scan.nextInt();
            }
        }

        // Exibindo a soma dos elementos das duas matrizes
        System.out.println("A Soma das é matrizes: \n");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print((matriz[linha][coluna] + matriz2[linha][coluna]) + " ");
            }
            System.out.println();
        }

        scan.close();
    }

}
