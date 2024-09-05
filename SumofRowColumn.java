import java.util.Scanner;
class SumofRowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Rows:");
        int rows = sc.nextInt();
		System.out.println("Enter the no.of Columns:");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
		System.out.println("Enter the values of rowsz and columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            int sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow += a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }
        for (int i = 0; i < cols; i++) {
            int sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol += a[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column: " + sumCol);
        }
        sc.close();
    }
}
