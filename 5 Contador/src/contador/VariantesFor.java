package contador;

public class VariantesFor {
    public void Variantes(){
        
        System.out.println("\n-----Variantes en For------");
        System.out.println("\nDe 10 a 1 en decrementos de 1:");
        //De 10 a 1 en decrementos de 1
        for(int i = 10; i>=1; i--){
            System.out.printf("%d ", i);
        }
        
        System.out.println("\n\nDe 7 a 77 en incrementos de 7:");
        //De 7 a 77 en incrementos de 7
        for(int i = 7; i<=77; i+=7){
            System.out.printf("%d ", i);
        }
        
        System.out.println("\n\nDe 99 a 0 en decremento de 11:");
        //De 99 a 0 en decremento de 11
        for(int i = 99; i>=0; i-=11){
            System.out.printf("%d ", i);
        }
    }
}
