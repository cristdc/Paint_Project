package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Random;

public class PincelPsicodelico extends PincelSorpresa {
    PincelPsicodelico(){

    }

    @Override
    public String toString(){
        return "Pincel Psicodélico";
    }

    private Color getColorAleatorio(){
        Random rand= new Random();
        int r= rand.nextInt(0, 360);
        int g= rand.nextInt(0, 360);
        int b= rand.nextInt(0, 360);
        Color color= Color.rgb(r,g,b);
        return color;
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        Paint color= g.getFill();
        Random random= new Random();
        int r= random.nextInt(0, 360);
        int ga= random.nextInt(0, 360);
        int b= random.nextInt(0, 360);
        Color colorAleatorio= Color.color(r, ga,b);
        g.setFill(colorAleatorio);
        super.dibujar(g, p);
    }


}
