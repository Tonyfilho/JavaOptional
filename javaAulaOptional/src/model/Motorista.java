package model;

public class Motorista{

    private String nome;
    private Integer idade;
    private Caminhao caminhao;

    public Motorista (){

    }

    public Motorista(String nome, Integer idade, Caminhao caminhao) {
        this.nome = nome;
        this.idade = idade;
        this.caminhao = caminhao;
    }

    public String getName() {
        return this.nome;
    }
    
    public Integer getIdade() {
        return this.idade;
    }
    
    public Caminhao getCaminhao() {
        return this.caminhao;
    }

    public void setName(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }


    
}//class

