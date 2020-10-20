package paneldibujo;
import javax.swing.JFrame;

public class PanelDibujo {

    
    public static void main(String[] args) {
        Dibujo panel = new Dibujo();
        
        //crear marco para panel
        JFrame aplicacion = new JFrame();
        
        //establece marco para salida
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacion.add(panel);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);
    }
    
}
