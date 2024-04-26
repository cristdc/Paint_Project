package clases;

import javafx.scene.canvas.GraphicsContext;

public class PincelContinuo extends PincelBasico implements Reseteable {
    private Punto puntoPrevio;

    PincelContinuo(){
        this.puntoPrevio = null;
    }

    @Override
    public String toString() {
        return "Pincel Continuo";
    }

    @Override
    public int getRadio() {
        return super.getRadio();
    }

    @Override
    public void resetear() {
        this.puntoPrevio = null;
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        g.setStroke(g.getFill());
        if (puntoPrevio==null){
            g.strokeLine(p.x(),p.y(),p.x(),p.y());
        }else{
            g.strokeLine(this.puntoPrevio.x(),this.puntoPrevio.y(),p.x(),p.y());
        }
        this.puntoPrevio = p;
    }

}
