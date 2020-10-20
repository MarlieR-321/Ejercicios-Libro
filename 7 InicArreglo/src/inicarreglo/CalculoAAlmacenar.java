package inicarreglo;

public class CalculoAAlmacenar {
    
    public void nuevoArreglo(){
        
        final int LONGITUD_ARREGLO = 10; //declara la constante
        int [] arreglo = new int [LONGITUD_ARREGLO];//crea el arreglo
        
        System.out.println("\n-------Con operaciones--------");
        System.out.printf("%s%8s%n", "Indice", "Valor");
        
        //calcula el valor para cada elemento del arreglo
        for(int contador=0; contador < arreglo.length; contador++){
            arreglo[contador] = 2+2 * contador;
            
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);
        }
    }
}
