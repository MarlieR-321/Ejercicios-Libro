package contador;
import java.util.Scanner;


public class CalificacionesLetra {
    int total = 0;
    int contadorCalif=0;
    int aCuenta = 0 ; //cuenta calif A
    int bCuenta = 0 ; //cuenta calif B
    int cCuenta = 0 ; //cuenta calif C
    int dCuenta = 0 ; //cuenta calif D
    int fCuenta = 0 ; //cuenta de calificaciones F
    
    Scanner entrada = new Scanner(System.in);
    
    public void proceso(){
    System.out.printf("%s%n%s%n     %s%n    %s%n",
            "Introduzca las calificaciones en el rango 0-100",
            "Esccriba e; indicador de fin de archivo para terminar la entrada: ",
            "En UNIX/Linux/Mac OS escriba <Ctrl> z y oprima Intro");
    
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
    }
}
