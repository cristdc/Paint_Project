package clases;

public class PincelGrosorVariable extends PincelCirculoDinamico {
    private int radioMinimo;
    private int radioMaximo;
    PincelGrosorVariable(int min, int max){
        super(min);
        this.radioMaximo=max;
        this.radioMinimo=min;

    }

    public int getRadioMinimo() {
        return this.radioMinimo;
    }

    public int getRadioMaximo() {
        return this.radioMaximo;
    }

    @Override
    public void setRadio(int radio) {
        if (radio > this.radioMinimo && radio < this.radioMaximo){

        }
    }
}

