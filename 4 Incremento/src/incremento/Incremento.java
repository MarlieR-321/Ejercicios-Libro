package incremento;
//Pag 133

public class Incremento {

    public static void main(String[] args) {
        int c = 5;
        
        System.out.printf("c antes del posincremento:   %d%n", c); //imprime 5
        System.out.printf("         posincremento de c: %d%n", c++); //imprime 5
        System.out.printf("c despues del posincremento: %d%n", c); //imprime 6
        
        System.out.println();//omitir una linea
        
        c = 5;
        System.out.printf("c antes del preincremento:   %d%n", c);//imprime 5
        System.out.printf("         preincremento de c: %d%n", ++c); //imprime 6
        System.out.printf("c despues del presincremento: %d%n", c); //imprime 6
    }
    
}
