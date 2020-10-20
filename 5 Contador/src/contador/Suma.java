package contador;

public class Suma {
    int total =0;
    public void suma(){
        
        for(int numero = 2; numero <= 20;numero += 2){
            total+=numero;
        }
        
        System.out.println("\n\n------Suma con For------");
        System.out.printf("La suma es %d%n",total);
    }
}
