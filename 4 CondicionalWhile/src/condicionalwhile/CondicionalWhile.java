
package condicionalwhile;
import java.util.Scanner;
//Pag 116

public class CondicionalWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //inicializar
        int total = 0;
        int contadorCalificaciones = 1;
        
        //procesamiento
        while (contadorCalificaciones <= 10 ){
            System.out.print("Escriba la calificacion: ");//indicador
            int calificacion = entrada.nextInt();//recibe siguiente calificacion de entrada
            
            total = total + calificacion;
            contadorCalificaciones = contadorCalificaciones +1;
        }
        
        //Terminacion
        int promedio = total /10;//division de enteros produce un resultado entero
        
        //Muestra del roral y el promedio de las calificaiones 
        System.out.printf("%nEl total de las 10 calificaiones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
    
}
