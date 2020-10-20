package inicarreglo;

public class Inicializado {
    
    public void Iniciar(){
    System.out.println("\n------Inicializador de arreglos---------");
        
        int[] arreglo1 = {32, 72, 64, 22, 18, 54, 43,66, 90, 12};
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        
        for(int contador1 = 0; contador1 < arreglo1.length;contador1++){
            System.out.printf("%5d%8d%n", contador1,arreglo1[contador1]);
        }
    }
}
