/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalifelse;

/**
 *
 * @author Marlon Ramirez
 */
public class Estudiante {
    private int cantidad;

    
    public void calcularEstado(){
        if(cantidad>=60){
            System.out.println("Aprobado\n");
        }
        else{
            System.out.println("Reprobado");
            System.out.println("Debe tomar el curso de nuevo\n");
        }
    }
    
    public void estadoDos(){
        System.out.println(cantidad>=60 ? "Aprobado": "Reprobado");
    }
    
    public void calcularNota(){
        
        if(cantidad>=90){
            System.out.println("A\n");
        }
        else{
            if(cantidad>=80){
                System.out.print("B\n");
            }
            else{
                if(cantidad>=70){
                    System.out.print("C\n");
                }
                else{
                    if(cantidad>=60){
                        System.out.print("D\n");
                    }
                    else{
                        System.out.print("F\n");
                    }
                }
            }
        }
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
