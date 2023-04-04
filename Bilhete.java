package classes;

public class Bilhete {
    private String CPF;
    private Sala sala;
    private Sessao sessao;
    private Filme filme;
    private double valor;
    public Bilhete(String CPF, Sala sala, Sessao sessao, Filme filme, double valor) {
        this.CPF = CPF;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = filme;
        this.valor = valor;
        
    }
    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public Sessao getSessao() {
        return sessao;
    }
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    //metodo
    public double calcularValor(){
        return getValor();

    }   
    public void imprimirBilhete(){
        System.out.println(getCPF(), getFilme(), getSala(), getSessao(), getValor()); 
    }
    
    


    }

/*
 
Bilhete - A classe bilhete irá conter as seguintes informações: 
user, 
CPF, 
sala,
sessão, 
filme, 
valor(o valor é calculado baseado no filme e na sala escolhidos),
cadeira comprada;

 */

 /*
  private Usuario usuario;
    private String cpf;
    private Sala sala;
    private Sessao sessao;
    private Filme filme;
    private double valor;
    private int coluna;
    private int fileira;

    public Bilhete(Usuario usuario, String cpf, Sala sala, Sessao sessao, int coluna, int fileira) {
        this.usuario = usuario;
        this.cpf = cpf;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = sessao.getFilme();
        this.coluna = coluna;
        this.fileira = fileira;
        this.valor = calcularValor();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public Sala getSala() {
        return sala;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public double getValor() {
        return valor;
    }

    public int getColuna() {
        return coluna;
    }

    public int getFileira() {
        return fileira;
    }

    private double calcularValor() {
        double valorSala = sala.getValor();
        double valorFilme = filme.getValor();
        return valorSala + valorFilme;
    }
  */
