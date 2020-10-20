package inicarreglo;

public class InicArreglo {

    public static void main(String[] args) {
        
        //Normal Pag 248
        arregloNatural arreglo = new arregloNatural();
        arreglo.contadorArreglo();
        
        //Inicializado Pag 249
        Inicializado primero = new Inicializado();
        primero.Iniciar();
        
        //Calculo con arreglo Pag 249-250
        CalculoAAlmacenar uno = new CalculoAAlmacenar();
        uno.nuevoArreglo();
        
        //Suma Arreglo Pag 251
        SumaArreglo dos = new SumaArreglo();
        dos.Suma();
        
        //Grafico de Barras 252
        GraficoBarras tres = new GraficoBarras();
        tres.Grafica();
        
        //Elemento de arreglo como contador Pag 253
        ElementoContador cuatro = new ElementoContador();
        cuatro.Dados();
        
        //Analisis de Datos Pag 254
        AnalisisResultados analiza = new AnalisisResultados();
        analiza.Analisis();
        
        //For Mejorado Pag 262
        ForMejorado mejora = new ForMejorado();
        mejora.ciclo();
    }
}
