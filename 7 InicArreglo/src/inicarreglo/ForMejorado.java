package inicarreglo;

public class ForMejorado {
    public void ciclo(){
        int[] arreglo = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;
        
        for(int numero:arreglo){
            total+=numero;
        }
        
        System.out.println("\n-----Suma con For Mejorado-----");
        System.out.printf("Total entre elementos del arreglo: %d%n", total);
    }
}
