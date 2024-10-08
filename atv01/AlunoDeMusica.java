package atv01;
public class AlunoDeMusica extends Aluno{

    private String instrumento;

    public AlunoDeMusica(String nome, String matricula, int idade, String instrumentos) {

        super(nome, matricula, idade);
        this.instrumento = instrumento;
    }

@Override
public void estudar(){
    sout("O aluno"+ nome +"esta estudando musica");
}
    
}
