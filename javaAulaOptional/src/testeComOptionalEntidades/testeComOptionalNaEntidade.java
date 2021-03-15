package testeComOptionalEntidades;

import java.util.Optional;

import model.Seguro;
import modelOptional.CaminhaoOptional;
import modelOptional.MotoristaOptional;
import modelOptional.SeguroOptional;
import repository.MotoristasOptional;

public class testeComOptionalNaEntidade {

    public static void main(String[] args) {
        MotoristasOptional motoristasOptional = new MotoristasOptional();

        Optional<MotoristaOptional> motorOptional = motoristasOptional.porNome("Tony");
        //o Metodo FLATMAP server para Juntar 2 OPTIONAL e Retornar 
        //1º.Optional<CaminhaoOptional> 2ºMotoristaOptional::getCaminhao
        Optional<CaminhaoOptional> cOptional = motorOptional.flatMap(MotoristaOptional::getCaminhao);
        
        //Navegando em Cadeia da Entidade Motorista.Caminhao.Seguro para pegar a STRING Cobertura
        Optional<String> cobeOptional = motoristasOptional.porNome("Tony")
        .flatMap(MotoristaOptional:: getCaminhao)
        .flatMap(CaminhaoOptional:: getSeguro)
        .map(SeguroOptional::getCobertura);

        cobeOptional.ifPresent(System.out::println);

        //Usando o ORElse
        String coberturaJuan = motoristasOptional.porNome("Juan")
        .flatMap(MotoristaOptional:: getCaminhao)
        .flatMap(CaminhaoOptional:: getSeguro)
        .map(SeguroOptional::getCobertura).orElse("Sem Seguro ");

        System.out.println("Nosso Optional com Null " + coberturaJuan);

    }
    
}
