package model;

import java.math.BigDecimal;

public class Seguro {

    private String cobertura;
    private BigDecimal valorFranquia;


    public Seguro() {
    }

    public Seguro(String cobertura, BigDecimal valorFranquia) {
        this.cobertura = cobertura;
        this.valorFranquia = valorFranquia;
    }

    public String getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public BigDecimal getValorFranquia() {
        return this.valorFranquia;
    }

    public void setValorFranquia(BigDecimal valorFranquia) {
        this.valorFranquia = valorFranquia;
    }

    public Seguro cobertura(String cobertura) {
        setCobertura(cobertura);
        return this;
    }

    public Seguro valorFranquia(BigDecimal valorFranquia) {
        setValorFranquia(valorFranquia);
        return this;
    }




    
}// end class

