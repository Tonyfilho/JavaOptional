package model;

public class Caminhao {
    private String modelo;
    private Seguro seguro;

    public Caminhao(String modelo, Seguro seguro) {
        this.modelo = modelo;
        this.seguro = seguro;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Seguro getSeguro() {
        return this.seguro;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    
}//enc class

