package clases;

public class PincelBasico implements PincelCirculo{
    public static int RADIO;
    PincelBasico(){
        throw new UnsupportedOperationException("Sin programar");
    }

    @Override
    public int getRadio() {
        return 0;
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        PincelCirculo.super.dibujar(g, p);
    }
}
