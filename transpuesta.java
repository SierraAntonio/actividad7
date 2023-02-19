package matrices;

public class transpuesta {
	 public static void main(String[] args) {
	       
	        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] matrizTranspuesta = transponerMatriz(matriz);
	        imprimirMatriz(matrizTranspuesta);
	       
	    }

	    public static int[][] transponerMatriz(int[][] matriz) {
	        int filas = matriz.length;
	        int columnas = matriz[0].length;
	        int[][] transpuesta = new int[columnas][filas];
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                transpuesta[j][i] = matriz[i][j];
	            }
	        }
	        return transpuesta;
	    }

	    public static void imprimirMatriz(int[][] matriz) {
	        for (int[] fila : matriz) {
	            for (int valor : fila) {
	                System.out.print(valor + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
