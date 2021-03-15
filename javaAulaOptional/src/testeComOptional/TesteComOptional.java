package testeComOptional;

import java.math.BigDecimal;
import java.util.Optional;

import model.Seguro;

public class TesteComOptional {
    public static void main(String[] args) {
        Seguro seguro = new Seguro("Cobertura total ", new BigDecimal("600.00"));
        // cria-se a Cx do Optional com Generics do Objeto e passa o Objeto no metodo.args
        Optional<Seguro> sOptional = Optional.ofNullable(seguro);

        // Ou podemos criar um cx Vazia
        String seguro2String = null; //Supor que fomos a DB e buscamos um dados Nulo.
     //   Optional<Seguro> sOptional2Vazio = Optional.ofNullable(seguro2String);

        // Buscando na Entidade um valor bigdecimal ou
       Optional<BigDecimal> valorFraOptional = sOptional.map(Seguro:: getValorFranquia);
       System.out.println("Var valorFranOPtional: "+ valorFraOptional);
        //Podemos fazer em cadeia, direto, falando assim: Execute este OPTIONAL,Crie um NOVO OPTIONAL de BIGDECIMAL e VEJA se tem dados
       //SI existir Dados, passe para este metodo PrintLn  da class System.out.
        sOptional.map(Seguro:: getValorFranquia).ifPresent(System.out::println);

       // Buscando na Entidade um valor String
       Optional<String> valorSegOptional = sOptional.map(Seguro:: getCobertura);
       System.out.println("Var valorSegOptional " + valorSegOptional);
       //Podemos fazer em cadeia, direto,falando assim: Execute este OPTIONAL,Crie um NOVO OPTIONAL de STRING e VEJA se tem dados
       // SI existir Dados, passe para este metodo PrintLn  da class System.out. Caso Não exista NADA dentro do NOVO OPTIONAL não 
       // Mostrará nenhum erro de  NullPointerException!
       sOptional.map(Seguro:: getCobertura).ifPresent(System.out:: println);







        

    }
    
}//end class
