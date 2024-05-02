package clases;

import javafx.scene.canvas.GraphicsContext;

public class PincelBasico implements PincelCirculo{
    public static int RADIO = 1;
    PincelBasico(){
    }

    @Override
    public String toString() {
        return "Pincel Basico";

    }

    @Override
    public int getRadio() {
        return RADIO;
    }
}
