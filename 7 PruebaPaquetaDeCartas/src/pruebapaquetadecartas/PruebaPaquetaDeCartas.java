package pruebapaquetadecartas;

//Ejemplo de Baraja de Cartas Pag 259
public class PruebaPaquetaDeCartas {

    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar(); //colocar cartas en orden aleatorio
        
        for(int i = 1;i<=52;i++){
            System.out.printf("%-25s", miPaqueteDeCartas.repartirCarta());
            
            if(i%4==0){
                System.out.println();
            }
        }
    }
    
}
