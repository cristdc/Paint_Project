package test;

import clases.Pincel;
import clases.Punto;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class LineaDiagonal {
    private Pincel pincel;

    public LineaDiagonal(Pincel p){
        this.pincel = p;
    }

    public void dibujarLinea(GraphicsContext g){
        int x = 0;
        int y = 0;
        Punto p = new Punto(x, y);
        double anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double altoPantalla = Toolkit.getDefaultToolkit().getScreenSize().getHeight();


        boolean repetir = true;
        while(repetir){
            this.pincel.dibujar(g, new Punto(x,y));
            x+=20;
            y+=20;

            if(x>anchoPantalla || y>altoPantalla){
                repetir=false;
            }
        }
    }
}