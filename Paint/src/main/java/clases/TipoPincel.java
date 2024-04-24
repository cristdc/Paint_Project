package clases;

public enum TipoPincel {
    PINCEL_BASICO, PINCEL_GORDO, PINCEL_GROSOR_VARIABLE, PINCEL_CONTINUO, PINCEL_RECTANGULO, PINCEL_ESTRELLA;

    private Pincel pincel;

    private TipoPincel(Pincel p){
        throw new UnsupportedOperationException("SIn programar");
    }

    public Pincel getPincel(){
        throw new UnsupportedOperationException("SIn programar");
    }
    public static List<Pincel> getPinceles(){
        throw new UnsupportedOperationException("SIn programar");
    }
}
