package modelOptional;

import java.util.Optional;



public class CaminhaoOptional {

    private String modelo;
    private Optional<SeguroOptional> seguro;


    public CaminhaoOptional(String modelo, Optional<SeguroOptional>seguro) {
        this.modelo = modelo;
        this.seguro = seguro;
    }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Optional<SeguroOptional> getSeguro() {
        return this.seguro;
    }

    public void setSeguro(Optional<SeguroOptional> seguro) {
        this.seguro = seguro;
    }

    
}// end class
