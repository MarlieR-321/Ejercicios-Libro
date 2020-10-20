
package switchwhile;

import java.util.Scanner;


public class SwitchWhile {
    
    public static void main(String[] args) {
        

    int total = 0;
    int contadorCalif=0;
    int aCuenta = 0 ; //cuenta calif A
    int bCuenta = 0 ; //cuenta calif B
    int cCuenta = 0 ; //cuenta calif C
    int dCuenta = 0 ; //cuenta calif D
    int fCuenta = 0 ; //cuenta de calificaciones F
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.printf("%s%n%s%n    %s%n    %s%n",
            "Introduzca las calificaciones en el rango 0-100",
            "Esccriba el indicador de fin de archivo para terminar la entrada: ",
            "En UNIX/Linux/Mac OS escriba <Ctrl> z y oprima Intro",
            "En Windows escriba <Ctrl> z y despues oprima Intro");
    
    while(entrada.hasNext()){
        int calificacion =entrada.nextInt();
        total += calificacion;
        ++contadorCalif;
        
        switch(calificacion/10){
            case 6:{
                ++dCuenta;
                break;
                }
            case 7:{
               ++cCuenta;
               break;
                }
            
            case 8:{
                ++bCuenta;
                break;
                }
            
            case 9:{
                
                }
            case 10:{
                ++aCuenta;
                break;
                }
            default:{
                ++fCuenta;
                break;
                }
            }
        } 
    //muestra reporte
    System.out.printf("%nReporte de calificaciones:%n");
    
    if (contadorCalif!=0){
        
        //Calcula promedio
        double promedio = (double) total/contadorCalif;
        
        //Muestra resumen
        System.out.printf("El total de las %d calificaciones introducidas es %d%n",
                contadorCalif, total);
        
        System.out.printf("El promedio de la clase es %.2f%n", promedio);
        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
                "Numero de estudiantes que recibieron cada calificacion",
                "A: ", aCuenta,
                "B: ", bCuenta,
                "C: ", cCuenta,
                "D: ", dCuenta,
                "F: ", fCuenta
                );
    }
    else{
        System.out.println("No se introdujeron calificaciones");
    }
  }
}
