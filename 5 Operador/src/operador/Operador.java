package operador;

//Pag 180

public class Operador {

    public static void main(String[] args) {
        System.out.printf("%s%n%s:  %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
                "AND condicional (&&) Ambas se deben cumplir",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));
        
        System.out.printf("%s%n%s:  %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
                "OR condicional (||) Una se debe cumplir",
                "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));
        
        System.out.printf("%s%n%s:  %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
                "AND lógico booleano (&)",
                "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));
        
        System.out.printf("%s%n%s:  %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
                "OR inclusivo lógico booleano (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));
        
        System.out.printf("%s%n%s:  %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
                "OR exclusivo lógico (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));
        
        System.out.printf("%s%n%s:  %b%n%s: %b%n", "NOT lógico (!)",
                "!false", (!false),"!true", (!true));
    }
}
