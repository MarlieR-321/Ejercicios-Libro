package inicarreglo;

public class GraficoBarras {
    
    public void Grafica(){
        int[] arreglo = {0,0,6,2,1,0,1,2,10,2,8};
        
        System.out.println("\n----Distribución de Calificaciones-----");
        
        for(int contador = 0; contador<arreglo.length; contador++){
            if (contador == 10){
                System.out.printf("%5d: ",100);
            }
            else{
                System.out.printf("%02d-%02d: ", contador * 10, contador*10+9);
            }
            
            for(int estrellas=0;estrellas<arreglo[contador]; estrellas++){
                System.out.print("*");
            }
            
            System.out.println();   
        }   
    }
}
