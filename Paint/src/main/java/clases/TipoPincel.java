package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoPincel{
    PINCEL_BASICO(new PincelBasico()), PINCEL_GORDO(new PincelGordo()),
    PINCEL_GROSOR_VARIABLE(new PincelGrosorVariable(4,40)), PINCEL_CONTINUO(new PincelContinuo()),
    PINCEL_RECTANGULO(new PincelRectangulo()), PINCEL_ESTRELLA(new PincelEstrella()),
    PINCEL_ESTRELLA_GORDA(new PincelEstrellaGorda(new PincelGrosorVariable(2,15),70,15)), PINCEL_CONSTELACION(new PincelEstrellaGorda(new PincelEstrella(), 70,15)),
    PINCEL_CHURRO(new PincelChurro()), PINCEL_PSICODELICO(new PincelPsicodelico()), PINCEL_SORPRESA(new PincelSorpresa());

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

        List<Pincel> EXPECTED_LIST =
                Arrays.asList(PINCEL_BASICO.getPincel(), PINCEL_CONTINUO.getPincel(),
                        PINCEL_ESTRELLA.getPincel(), PINCEL_GORDO.getPincel(),
                        PINCEL_RECTANGULO.getPincel(), PINCEL_GROSOR_VARIABLE.getPincel(),
                        PINCEL_CHURRO.getPincel(), PINCEL_SORPRESA.getPincel(),
                        PINCEL_CONSTELACION.getPincel(), PINCEL_ESTRELLA_GORDA.getPincel(),
                        PINCEL_PSICODELICO.getPincel())
                       ;

        /*for(int i = 0; i<pincel.length; i++){
            pinceles.add(pincel[i].getPincel());
        }*/
        return EXPECTED_LIST;
    }
}
