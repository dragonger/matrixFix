import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int search;
        int line;
        int column;

        System.out.print("Enter the numbers of lines: ");
        line = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        column = sc.nextInt();

        int[][] matrix = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the line " + i + " enter the colum " + j + " :");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Insert a number to search: ");
        search = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == search) {
                    System.out.println("Position " + i + "," + j + ":");
                    System.out.println("\n adjacent numbers: ");

                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }

                    if (j < matrix[i].length - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }

                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
