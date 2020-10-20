package paneldibujo;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Dibujo extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int anchura = getWidth();
        int altura = getHeight();
        
        //Siguiente dibuja la linea de esquina superior izquiera a esquina inferior derecha
        g.drawLine(0, 0, anchura, altura);
        
        //Esquina inferior izquierda a esquina superior derecha
        g.drawLine(0, altura, anchura, 0);
    }   
}
