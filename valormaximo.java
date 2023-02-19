package matrices;

public class valormaximo {
	public static int obtenerValorMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }
    
    public static void main(String[] args) {
        int[][] miMatriz = {{1, 5, 34}, {2, 4, 10}, {12, 11, 10}};
        int valorMaximo = obtenerValorMaximo(miMatriz);
        System.out.println("El valor máximo de la matriz escrita es: " + valorMaximo);
    }
}
