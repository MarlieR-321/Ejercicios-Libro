package inicarreglo;
import java.security.SecureRandom;

public class ElementoContador {
    SecureRandom numerosAleatorios = new SecureRandom();
    
    int[] frecuencia = new int [7];
    
    /*Tira el dado 6,000,000 veces y usa el valor del dadp como indice 
    de frecuencia*/
    
    public void Dados(){
        
        System.out.println("\n--Elemento de arreglo como contador--");
        
    for(int tiro = 1; tiro <=6000000; tiro++){
        ++frecuencia[1+numerosAleatorios.nextInt(6)];
        }
    System.out.printf("%s%20s%n", "Cara","Frecuencia");
    
    for(int cara = 1; cara<frecuencia.length;cara++){
        System.out.printf("%4d%20d%n", cara,frecuencia[cara]);
        }
    }
}
