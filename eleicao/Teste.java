package eleicao;
public class Teste{
    public static void main(String[] args){
        candidato joaoCampos = new candidato(40,"joão campos",300);
        System.out.println(" O candidato obteve "+ joaoCampos.getVotos()+"votos na eleição.");
        joaoCampos.incrementoVoto();
        System.out.println("O candidato "+ joaoCampos.getNome()+
                " de número "+joaoCampos.getNumero()+" obteve "+
                joaoCampos.getVotos()+ " votos nesta eleição.");

}