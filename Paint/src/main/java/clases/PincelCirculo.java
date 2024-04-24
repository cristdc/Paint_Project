package clases;

public interface PincelCirculo extends Pincel{
    public int getRadio(){
        throw new UnsupportedOperationException();
    }
    public default void dibujar(GraphicsContext g, Punto p){
        throw new UnsupportedOperationException();
    }
}
