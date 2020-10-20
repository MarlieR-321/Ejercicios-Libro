
package condicionalifelse;

/**
 *
 * @author Marlon Ramirez
 */
public class elseSuelto {
    private int x,y;

    public void mayorQue(){
     
        if(x>5){
            if(y>5){
                System.out.println("x & y son mayores que 5");
            }
            else{
                System.out.println("y es menor o igual que 5");
            }
        }
        else{
            System.out.println("x es menor o igual que 5");
        }
        
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
