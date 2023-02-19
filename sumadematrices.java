package matrices;

public class sumadematrices {

	 public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
	        int filas = matriz1.length;
	        int columnas = matriz1[0].length;
	        int[][] resultado = new int[filas][columnas];
	        
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }
	        
	        return resultado;
	    }
	    
	    public static void main(String[] args) {
	        int[][] matriz1 = {{1, 7}, {8, 1}};
	        int[][] matriz2 = {{5, 7}, {12, 40}};
	        
	        int[][] resultado = sumaMatrices(matriz1, matriz2);
	        
	        for (int i = 0; i < resultado.length; i++) {
	            for (int j = 0; j < resultado[i].length; j++) {
	                System.out.print(resultado[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
