package atv01;
public class AlunoDePintura extends Aluno {

    private String estiloPintura;

    public AlunoDePintura(String nome, String matricula, int idade, String estiloPintura) {
        super(nome, matricula, idade);
        this.estiloPintura = estiloPintura;
  
    }

  @Override
  public void estudar(){
    sout("o aluno " + getNome() + "esta estudfando Pintura Barroca") ;
  }

  //gettrs e settrs
    
}
