package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class PincelGordo implements PincelCirculo{
    public static final int RADIO = 20;

    PincelGordo(){}

    @Override
    public String toString() {
        return "Pincel Gordo";
    }

    @Override
    public int getRadio() {
        return RADIO;
    }

}
