package sample;

public class Pessoa {
    private String nome;
    private Integer identificacao;
    private Integer idade;
    private String contato;

    public Pessoa(String nome, Integer idade, String contato){
        this.nome = nome;
        this.idade = idade;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    } //pega o nome

    public void setNome(String nome) {
        this.nome = nome;
    } // seta o nome

    public Integer getIdentificacao() {
        return identificacao;
    } // seta o id

    public void setIdentificacao(Integer identificacao) {
        this.identificacao = identificacao;
    } // seta a identificacao

    public Integer getIdade() {
        return idade;
    } // pega  a idade

    public void setIdade(Integer idade) {
        this.idade = idade;
    } // seta a idade

    public String getContato() {
        return contato;
    } // pega o contato

    public void setContato(String contato) {
        this.contato = contato;
    } // seta o contato
}
