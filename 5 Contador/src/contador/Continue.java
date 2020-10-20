package contador;

public class Continue {
    
    public void continuar(){
        
        System.out.println("\n---------Uso de continue---------");
        
        for(int cuenta=1;cuenta<=10;cuenta++){
            if(cuenta == 5){
                continue;
            }
            System.out.printf("%d ", cuenta);
        }
        System.out.println("\nSe uso continue para omitir imprimir el numero 5\n");
    }
}
