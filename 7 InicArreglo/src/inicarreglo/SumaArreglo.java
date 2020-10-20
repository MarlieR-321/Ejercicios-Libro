package inicarreglo;

public class SumaArreglo {
    
    public void Suma(){
        System.out.println("\n\n-------------Suma de arreglo 2-----------");
        int[] arreglo2 = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;
        
        for(int contador = 0; contador<arreglo2.length; contador++){
            total+=arreglo2[contador];
        }
        System.out.printf("Total de los elementos del arreglo: %d%n", total);
    }
    
}
