package clases;
import javafx.scene.canvas.GraphicsContext;
public class PincelCirculoDinamico implements PincelCirculo{
    private int radio;
    PincelCirculoDinamico(int radio){
        if (radio > 0){
            this.radio=radio;
        }else {
            throw new IllegalStateException("El radio debe ser positivo");
        }

    }

    public void setRadio(int radio) {
        if (radio > 0){
            this.radio=radio;
        }else {
            throw new IllegalStateException("El radio debe ser positivo");
        }
    }

    @Override
    public int getRadio() {
        return this.radio;
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        PincelCirculo.super.dibujar(g, p);
    }
}
