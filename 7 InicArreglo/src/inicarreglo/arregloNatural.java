package inicarreglo;

public class arregloNatural {
    int[] arreglo = new int[10];//crear el objeto arreglo
        
    public void contadorArreglo(){
        System.out.printf("%s%8s%n", "Indice", "Valor");
        
        for(int contador = 0; contador<arreglo.length;contador++){
            System.out.printf("%5d%8d%n",contador,arreglo[contador]);
        }
    }
}
