package clases;


public class PincelChurro extends PincelEstrellaGorda {
    PincelChurro(){
        super(new PincelEstrella(),10,200);
    }

    @Override
    public String toString() {
        return "Pincel Churro";
    }
}
