package testeSemOptinal;


import model.Caminhao;
import model.Motorista;
import repository.Motoristas;

public class TesteSemOptional {
    

 public static void main(String[] args) {
    Motoristas motoristas = new Motoristas();
    Motorista motorista = motoristas.porNome("Tony");
    String corbertura = motorista.getCaminhao().getSeguro().getCobertura();

   
     System.out.println("nosso Motorista é: " + corbertura);
 }




}//end class
