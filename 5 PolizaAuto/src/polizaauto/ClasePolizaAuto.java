package polizaauto;


public class ClasePolizaAuto {
    private int numeroCuenta;
    private String marcaYModelo;
    private String estado;
    
    //constructor
    public ClasePolizaAuto(int numeroCuenta, String marcaYModelo, String estado){
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }
    
    //establecer numeroCuenta
    public void establecerNumeroCuenta(){
        this.numeroCuenta = numeroCuenta;
    }
    
    public int obtenerNumeroCuenta(){
        return numeroCuenta;
    }
    
    public void establecerMarcaYModelo(){
        this.marcaYModelo = marcaYModelo;
    }
    
    public String obtenerMarcaYModelo(){
        return marcaYModelo;
    }
    
    public void establecerEstado(){
        this.estado = estado;
    }
    
    public String obtenerEstado(){
        return estado;
    }
    
    public boolean esEstadoSinCulpa(){
        boolean estadoSinCulpa;
        
        //Det si tiene seguro de auto sin culpa
        switch (obtenerEstado()){
            case "MA":
            case "NJ":
            case "NY":
            case "PA":{
                estadoSinCulpa = true;
                break;
            }
            default:{
                estadoSinCulpa = false;
                break;
            }
        }
        return estadoSinCulpa;
    }
}
