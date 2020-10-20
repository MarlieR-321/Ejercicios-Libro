package contador;

public class Interes {
    double monto;
    double principal = 1000.0;
    double tasa =0.05;
    
    
    public void Intereses(){
        
        //Encabezado
        
        System.out.println("\n----Intereses entre Años-----");
        System.out.printf("%s%20s%n", "Anio", "Monto en deposito");
        
        //Monto en Deposito
        for(int Anio = 1; Anio <= 10; ++Anio){
            
            //Nuevo monto para año especifico
            monto = principal * Math.pow(1.0 + tasa, Anio);
            
            //muestra año y monto
            System.out.printf("%4d%, 20.2f%n", Anio, monto);
            
        }
    }
}
