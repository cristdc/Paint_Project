package clases;


import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PincelSorpresa implements Pincel{
    private GraphicsContext g;
    private Punto p;

    PincelSorpresa(){

    }
    private Pincel getPincelAleatorio(){
        List<Pincel> pincelesDisponibles = TipoPincel.getPinceles();
        List<Pincel> pincelesElegibles = new ArrayList<>(pincelesDisponibles);

        pincelesElegibles.removeIf(pincel ->
                pincel instanceof PincelEstrella ||
                        pincel instanceof PincelSorpresa ||
                        pincel instanceof PincelContinuo ||
                        pincel instanceof PincelPsicodelico);

        if (pincelesElegibles.isEmpty()) {
            return null;
        }

        Random rand = new Random();
        return pincelesElegibles.get(rand.nextInt(pincelesElegibles.size()));
    }

    @Override
    public String toString() {
        return "Pincel Sorpresa";
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        Pincel pincel = getPincelAleatorio();
        pincel.dibujar(g, p);
    }
}