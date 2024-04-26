package clases;


import javafx.scene.canvas.GraphicsContext;

public class PincelRectangulo implements Pincel {
    PincelRectangulo(){

    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        g.fillRect(p.x(),p.y(),10,10);
    }

    @Override
    public String toString() {
        return "Pincel rectangular";
    }
}
