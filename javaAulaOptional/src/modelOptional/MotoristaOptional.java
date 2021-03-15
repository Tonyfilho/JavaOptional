package modelOptional;

import java.util.Optional;



public class MotoristaOptional {
    private String nome;
    private Integer idade;
    private Optional<CaminhaoOptional> caminhao;



    public MotoristaOptional(String nome, Integer idade, Optional<CaminhaoOptional> caminhao) {
        this.nome = nome;
        this.idade = idade;
        this.caminhao = caminhao;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Optional<CaminhaoOptional> getCaminhao() {
        return this.caminhao;
    }

    public void setCaminhao(Optional<CaminhaoOptional> caminhao) {
        this.caminhao = caminhao;
    }
    
}// end class
