package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class PincelGordo implements PincelCirculo{
    public static final int RADIO;

    PincelGordo(){
        throw new UnsupportedOperationException("Sin programar");
    }

    @Override
    public int getRadio() {
        return 0;
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {

    }
}
