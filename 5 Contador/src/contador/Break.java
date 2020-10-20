package contador;

public class Break {
    int cuenta;
    
    public void Breaker(){
        
        System.out.println("\n---------Uso de break---------");
        for(cuenta =1; cuenta<=10; cuenta++){
            if(cuenta == 5){
                break;
            }
            System.out.printf("%d ", cuenta);
        }
        System.out.printf("%nSalio del ciclo en cuenta = %d%n", cuenta);
    }
}
