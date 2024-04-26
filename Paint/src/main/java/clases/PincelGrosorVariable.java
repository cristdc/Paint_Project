package clases;

public class PincelGrosorVariable extends PincelCirculoDinamico {
    private int radioMinimo;
    private int radioMaximo;
    PincelGrosorVariable(int min, int max){
        super(min);
        if  (min>0 && max>0){
            this.radioMaximo=max;
            this.radioMinimo=min;
        }else {
            throw new IllegalArgumentException("Los dos radios deben ser positivos");
        }


    }

    @Override
    public int getRadio() {
        return super.getRadio();
    }

    @Override
    public void setRadio(int radio) {
        if (radio >= this.radioMinimo && radio <= this.radioMaximo){
             super.setRadio(radio);
        }
    }
}

