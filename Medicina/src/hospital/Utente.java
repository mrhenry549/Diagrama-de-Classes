package hospital;

public class Utente {

    String nome,
            dataNascimento,
            obcervacoes;

    public Utente(String nome, String dataNascimento, String obcervacoes) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.obcervacoes = obcervacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getObcervacoes() {
        return obcervacoes;
    }

    public void setObcervacoes(String obcervacoes) {
        this.obcervacoes = obcervacoes;
    }

}
