package eleicao;
public class Candidato {
    private int numero;
    private String nome;
    private int votos;
    public Candidato(int numero, String nome, int votos){
        super();
        this.numero = numero;
        this.nome = nome;
        this.votos = votos;
    }
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVotos(){
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    public void incrementoVoto(){
        this.votos++;
    }
}
