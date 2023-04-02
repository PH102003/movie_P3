package classes;

public class Filme {
    private String nome;
    private int duracao;
    private String sinopse;
    private double valor;
    public Filme(String nome, int duracao, String sinopse, double valor) {
        this.nome = nome;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    //metodos
    
}

/*
 Filme - É a classe que representa o filme exibido na sessão da sala, ela deve
 ter os seguintes atributos: nome, 
 duração, 
 sinopse, 
 valor.

 */

 /*
  private String nome;
    private int duracao;
    private String sinopse;
    private double valor;

    public Filme(String nome, int duracao, String sinopse, double valor) {
        this.nome = nome;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public double getValor() {
        return valor;
    }
  */
