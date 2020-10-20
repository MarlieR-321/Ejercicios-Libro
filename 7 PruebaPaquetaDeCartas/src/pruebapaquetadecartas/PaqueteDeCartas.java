package pruebapaquetadecartas;
import  java.security.SecureRandom;


public class PaqueteDeCartas {
    private Carta[] paquete;
    private int CartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    
    public PaqueteDeCartas(){
        String[] caras = {"As","Dos","Tres","Cuatro","Cinco","Cinco","Seis","Siete","Ocho","Nueve",
        "Diez","Joker","Reina","Rey"};
        String[] palos = {"Corazones","Diamantes","Treboles","Espadas"};
        
        paquete = new Carta[NUMERO_DE_CARTAS];
        CartaActual = 0;
        
        for(int cuenta =0;cuenta<paquete.length;cuenta++){
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
        }
    }
    
    public void barajar(){
        CartaActual = 0;
        
        for(int primera = 0; primera<paquete.length;primera++){
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }
    
    public Carta repartirCarta(){
        if(CartaActual<paquete.length){
            return paquete[CartaActual++];
        }
        else{
            return null;
        }
    }
    
}
