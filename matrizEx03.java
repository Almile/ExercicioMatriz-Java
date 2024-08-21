import java.util.Scanner;

public class matrizEx03{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o número de linhas: ");
    int linhas = scan.nextInt();
    System.out.println("Digite o número de colunas: ");
    int colunas = scan.nextInt();

    int matriz[][] = new int[linhas][colunas];
    
    for (int linha = 0; linha < linhas; linha++) {
        for (int coluna = 0; coluna < colunas; coluna++) {
            System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
            matriz[linha][coluna] = scan.nextInt();
        }
    }

    
    System.out.println("\n Matriz digitada: \n");
    for (int linha = 0; linha < linhas; linha++) {
        for (int coluna = 0; coluna < colunas; coluna++) {
            System.out.print(matriz[linha][coluna] + " ");
        }
        System.out.println();
    }

    System.out.println("\n Matriz transposta: \n");
    for (int linha = 0; linha < colunas; linha++) {
        for (int coluna = 0; coluna < linhas; coluna++) {
            System.out.print(matriz[coluna][linha] + " ");
        }
        System.out.println();
    }

    scan.close();
    }
}