package repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import model.Caminhao;
import model.Motorista;
import model.Seguro;

public class Motoristas {// quando criar o Objeto Motoristas ele cria este HashMap e com ele temos os Metodos abaixo, que Simulam o DB
    private Map<String, Motorista> motoristas = new HashMap<>(); // Tudo que adcionado em "motoristas" passa a ser Mapeado

    public Motoristas() {
        Seguro seguro = new Seguro("Parcial - Não cobre roubo ", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Ford", seguro);
        // Nosso Motorista 01
        Motorista motoriasta01comCaminhao = new Motorista("Tony", 47, caminhao);

        // Nosso Motorista 02
        Motorista motorista02semCaminhao = new Motorista("Juan", 13, null);// fabricando nullExections

        motoristas.put("Tony", motoriasta01comCaminhao);
        motoristas.put("Juan", motorista02semCaminhao);

    }

    public Motorista porNome(String nome){
        return motoristas.get(nome);

    }

}// end class
