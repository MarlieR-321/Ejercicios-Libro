
package condicionalifelse;

public class CondicionalIfElse {

   
    public static void main(String[] args) {
        Estudiante Nota = new Estudiante();
        
        //Pruebas con clase Estudiante
        //Pag 108
        System.out.println("\n----Estudiante----");
        Nota.setCantidad(76);
        Nota.calcularNota();
        Nota.calcularEstado();
            //Segunda forma de calcular estado con operador condicional
        Nota.estadoDos();
        
        System.out.println("\n----Segundo Ejercicio----");
        //Pruebas con clase elseSuelto
            //Se tienen que usar llaves para que funcione la longica
            //Pag 109
        elseSuelto Clase = new elseSuelto();
        
        Clase.setX(8);
        Clase.setY(4);
        Clase.mayorQue();
        
        System.out.println("\n----Ejercicio Estudiante Completo----");
        //Ejercicio completo de Estudiante(clase EstudianteFinal)
        //Pag 112
        EstudianteFinal cuenta1 = new EstudianteFinal("Jane Green", 93.5);
        EstudianteFinal cuenta2 = new EstudianteFinal("John Blue", 72.23);
        
        System.out.printf("La calificacion en letra de %s es: %s%n",
                cuenta1.obtenerNombre(),cuenta1.obtenerCalificacion());
        
        System.out.printf("La calificacion en letra de %s es: %s%n", 
                cuenta2.obtenerNombre(), cuenta2.obtenerCalificacion());
    }
    
}
