package matrices;

public class escalar {
	public static int[][] multiplicarEscalar(int[][] matriz, int escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int[][] matriz = {{1, 7}, {8, 4}};
        int escalar = 5;
        
        int[][] resultado = multiplicarEscalar(matriz, escalar);
        System.out.print( "La matriz final ya con el escalar es la siguiente: ");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
            	
                System.out.print(resultado[i][j] + ",");
                
            }
            System.out.println();
        }
    }
}
