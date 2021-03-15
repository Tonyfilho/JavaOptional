package modelOptional;

import java.math.BigDecimal;

public class SeguroOptional {
    private String cobertura;
    private BigDecimal valorFranquia;


    public SeguroOptional(String cobertura, BigDecimal valorFranquia) {
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

    
}

