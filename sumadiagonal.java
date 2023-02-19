package matrices;

public class sumadiagonal {
	 public static void main(String[] args) {    
	        int[][] matriz = {{1, 4, 9}, {4, 13, 3}, {5, 12, 13}};
	        int sumaDiagonal = sumarDiagonalPrincipal(matriz);
	        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
	    }

	    public static int sumarDiagonalPrincipal(int[][] matriz) {
	        int suma = 0;
	        int n = matriz.length;
	        for (int i = 0; i < n; i++) {
	            suma += matriz[i][i];
	        }
	        return suma;
	    }
}
