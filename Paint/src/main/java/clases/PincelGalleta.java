package clases;


public class PincelGalleta extends PincelSpray {
    PincelGalleta(){
        super(new PincelEstrella(),10,200);
    }

    @Override
    public String toString() {
        return "Pincel Galleta";
    }
}
