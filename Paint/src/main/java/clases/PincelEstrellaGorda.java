package clases;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class PincelEstrellaGorda extends PincelCirculoDinamico{
    private Pincel pincel;
    private int densidad;
    PincelEstrellaGorda(Pincel p, int r, int d){
        super(r);
        this.pincel= p;
        this.densidad= d;
    }

    @Override
    public String toString() {
        return "Pincel Estrella Gorda";
    }
    @Override
    public void dibujar(GraphicsContext g, Punto p){
        for(int i=0; i<densidad; i++){
            int r= new Random().nextInt(1, super.getRadio());
            int gr= new Random().nextInt(0, 360);
            int a= (int) Math.toRadians(gr);
            this.pincel.dibujar(g, new Punto(p.x() + r * cos(a), p.y() + r * sin(a)));
        }
    }
}