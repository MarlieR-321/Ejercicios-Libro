package analisis;
import java.util.Scanner;

public class Analisis {
    //Pag 129

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 0;
        
        while(contadorEstudiantes < 10){
            System.out.print("Escriba el resultado (1 = Aprobado, 2 = Reprobado)");
            int resultado = entrada.nextInt();
            //if...else anidado al while
            
            if(resultado == 1){
                aprobados = aprobados + 1;
            }
            
            else{
                reprobados = reprobados + 1;
            }
            
            contadorEstudiantes =contadorEstudiantes +1;
        }
        
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);
        
        if(aprobados > 8){
            System.out.println("Bono para el instructor!");
        }
    }
    
}
