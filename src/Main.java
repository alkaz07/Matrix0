public class Main {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(10, 10);
        printMatrix(matrix);

        int[][] matr2 = new int[15][15];
        printMatrix(matr2);
    }

    static int[][] generateMatrix(int nRow, int nCol)
    {
        int[][] matr = new int[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            int a = i+1;
            for (int j = 0; j < nCol; j++) {
                matr[i][j] = a;
            }
        }
        return matr;
    }

    static void printMatrix(int[][] matr)
    {
        System.out.println("Матрица содержит "+matr.length+" строк");
        for (int i = 0; i < matr.length; i++) {
            //System.out.println("строка "+i+" имеет длину "+matr[i].length);
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf("%4d", matr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}