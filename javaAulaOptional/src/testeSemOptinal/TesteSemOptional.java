package testeSemOptinal;


import model.Caminhao;
import model.Motorista;
import model.Seguro;
import repository.Motoristas;

public class TesteSemOptional {
    

 public static void main(String[] args) {
    Motoristas motoristas = new Motoristas();
    Motorista motorista = motoristas.porNome("Tony");
    String cobertura = motorista.getCaminhao().getSeguro().getCobertura();   
     System.out.println("nosso 1º Motorista tem Seguro " + cobertura);

     // fazendo o tratamento de dados.
   //  String coberturaGeral = null;
     String coberturaGeral = "Sem Seguro";

     Motorista motoristaJuan = motoristas.porNome("Juan");
     if(motoristaJuan != null) {
         Caminhao caminhaoJuan = motoristaJuan.getCaminhao();
         if (caminhaoJuan != null) {
             Seguro seguro = caminhaoJuan.getSeguro();
             if (seguro != null) {
               /// coberturaGeral  = seguro.getCobertura() != null ? seguro.getCobertura() : "Sem Seguro";
                coberturaGeral  = seguro.getCobertura();
               }
           }         
        }
      System.out.println("nosso 2º Motorista tem Seguro ?: " + coberturaGeral);
 }




}//end class
