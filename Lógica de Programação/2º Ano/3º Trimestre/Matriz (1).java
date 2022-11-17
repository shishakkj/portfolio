package matriz;


public class Matriz {

    
    public static void main(String[] args) {
        int[][] numeros = {{9,8,7},{4,5,6},{3,1,2}};
        String matriz = "Matriz\n";
        for (int linha = 0; linha < 3; linha ++){
            for (int coluna = 0; coluna < 3; coluna ++){
            matriz += numeros [linha] [coluna]+ " ";
            
        }
            matriz += "\n";
        }
        System.out.println(matriz);
        int det = (numeros[0][0]) * (numeros [1][1]) * (numeros[2][2]) + (numeros[0][1]) * (numeros [1][2]) * (numeros[2][0]) + (numeros[0][2]) * (numeros [1][0]) * (numeros[2][1]);
        int det2 = (numeros[0][2]) * (numeros [1][1]) * (numeros[2][0]) + (numeros[2][1]) * (numeros [1][2]) * (numeros[0][0]) + (numeros[2][2]) * (numeros [1][0]) * (numeros[0][1]);
        System.out.println(det - det2);
    }
    
}
