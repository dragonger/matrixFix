import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int search;
        int line;
        int column;

        System.out.print("Enter the numbers of lines:");
        line = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        column = sc.nextInt();

        int[][] matrix = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("insira o numero a pesquisar");
        search = sc.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == search) {
                    System.out.println("position "+ i+ ","+ j);
                    if (i<0){
                        System.out.println("up: "+ matrix[i-1][j]);
                        if (i<matrix.length-1){
                            System.out.println("Down: "+ matrix[i+1][j]);
                        }
                        if (j>0){
                            System.out.println("Right:");
                        }
                    }
                }
            }
        }
    }
}