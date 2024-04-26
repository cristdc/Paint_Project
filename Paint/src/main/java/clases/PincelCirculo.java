package clases;
import javafx.scene.canvas.GraphicsContext;
public interface PincelCirculo extends Pincel{
    public int getRadio();
    public default void dibujar(GraphicsContext g, Punto p){
        g.fillOval(p.x(),p.y(),this.getRadio(),this.getRadio());
    }
}

