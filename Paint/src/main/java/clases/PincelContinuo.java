package clases;

import javafx.scene.canvas.GraphicsContext;

public class PincelContinuo extends PincelBasico implements Reseteable {
    private Punto puntoPrevio;

    PincelContinuo(){
        this.puntoPrevio = null;
    }

    @Override
    public void resetear() {

    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        g.setStroke(g.getFill());
        if (puntoPrevio==null){
            g.
        }else{
            g.strokeLine(this.puntoPrevio.x(),this.puntoPrevio.y(),p.x(),p.y());
        }
    }

}
