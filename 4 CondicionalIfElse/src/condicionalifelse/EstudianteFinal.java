
package condicionalifelse;

public class EstudianteFinal {
    private String nombre;
    private double promedio;
    
    //inicializar variables
    public EstudianteFinal(String nombre, double promedio){
        this.nombre = nombre;
        
        //validar cantidad de promedio
        if(promedio>0.0){
            if(promedio<=100.0){
                this.promedio = promedio;
            }
        }
    }
    
    
     //Establecer nombre;
        public void establecerNombre(String nombre){
            this.nombre = nombre;
        }
        
        //recuperar nombre estudiante
        public String obtenerNombre(){
            return nombre;
        }
        
        //establecer promedio del estudiante
        public void establecerPromedio(double promedio){
            if(promedio>0.0){
                if(promedio<=100.0){
                    this.promedio = promedio;
                }
            }
            
        }
        
        //recupera promedio de estudiante
        public double obtenerPromedio(){
            return promedio;
        }
        
        //determina y devuelve nota en letras
        public String obtenerCalificacion(){
            
            String calificacionEstudiante = "";
            
        if(promedio>=90){
            calificacionEstudiante = "A";
        }
        else{
            if(80>=promedio){
                if(promedio>=70){
                    calificacionEstudiante = "C";
                }
                else{
                    if(promedio>=60){
                        calificacionEstudiante = "D";
                    }
                    else{
                        calificacionEstudiante = "F";
                    }
                }
            }
            else{
                calificacionEstudiante = "B";
            }
        }
        
        return calificacionEstudiante;
    }
}
