package clases;

import java.util.ArrayList;
import java.util.List;

public enum TipoPincel{
    PINCEL_BASICO((Pincel) new PincelBasico()), PINCEL_GORDO((Pincel) new PincelGordo()),
    PINCEL_GROSOR_VARIABLE((Pincel) new PincelGrosorVariable(2,20)), PINCEL_CONTINUO((Pincel) new PincelContinuo()),
    PINCEL_RECTANGULO(), PINCEL_ESTRELLA();

    private Pincel pincel;

    private TipoPincel(Pincel p){
        this.pincel=p;
    }

    public Pincel getPincel(){
        return this.pincel;
    }
    public static List<Pincel> getPinceles(){
        List<Pincel> pinceles = new ArrayList<>();
        TipoPincel[] pincel = TipoPincel.values();
        for(int i = 0; i<TipoPincel.values().length; i++){
            pinceles.add(pincel[i].pincel);
        }
        return pinceles;
    }
}
