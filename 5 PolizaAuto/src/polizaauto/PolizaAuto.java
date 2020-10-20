package polizaauto;

//Pag 172

public class PolizaAuto { 

    public static void main(String[] args) {
        //crea dos objetos
        
        ClasePolizaAuto poliza1 =
                new ClasePolizaAuto(11111111, "Toyota Camry", "NJ") ;
        
        ClasePolizaAuto poliza2 =
                new ClasePolizaAuto(33333333, "Ford Fusion", "ME") ;
        
        polizaEnEstadoSinCulpa(poliza1);
        polizaEnEstadoSinCulpa(poliza2);
    }
    
    public static void polizaEnEstadoSinCulpa(ClasePolizaAuto poliza){
        System.out.println("La poliza del auto: ");
        
        System.out.printf("Cuenta #: %d; Auto: %s; Estado: %s %s un estado sin Culpa%n%n", 
                poliza.obtenerNumeroCuenta(), poliza.obtenerMarcaYModelo(), poliza.obtenerEstado(),
                (poliza.esEstadoSinCulpa() ? "esta en": "no esta en"));
    }
}
