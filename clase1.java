package matrices;

public class clase1 {
	public static void main(String[] args) {
       
        int[][] matriz1 = {{2, 4, 6}, {1, 2, 3}, {3, 6, 9}};
        int[][] matriz2 = {{10, 6, 12}, {16, 15, 3}, {5, 4, 8}};
        int[][] result = multiplcarMatrices(matriz1, matriz2);
        printMatrix(result);
    }

    public static int[][] multiplcarMatrices(int[][] matriz1, int[][] matriz2) {
        int fila1 = matriz1.length;
        int columna1 = matriz1[0].length;
        int fila2 = matriz2.length;
        int columna2 = matriz2[0].length;
        if (columna1 != fila2) {
            throw new IllegalArgumentException("Las matrices no son iguales por lo tanto no se puede realizar multiplicación");
        }
        int[][] result = new int[fila1][columna2];
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna2; j++) {
                for (int k = 0; k < columna1; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int valor : row) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
