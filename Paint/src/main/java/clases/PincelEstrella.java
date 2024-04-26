package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PincelEstrella implements Pincel{
    private static final Image ESTRELLA = new Image(ClassLoader.getSystemResourceAsStream("estrella.png"));

    PincelEstrella(){

    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        g.drawImage(ESTRELLA,p.x(),p.y());
    }

    @Override
    public String toString() {
        return "Pincel estrella";
    }
}
