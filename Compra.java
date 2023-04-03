package classes;

public class Compra {
    private double valorPipoca;
    private double CocaCola;
    private int numsBilhetes;
    
    public Compra(String valorPipoca, String cocaCola, int numsBilhetes) {
        this.valorPipoca = valorPipoca;
        CocaCola = cocaCola;
        this.numsBilhetes = numsBilhetes;
    }

    public String getValorPipoca() {
        return valorPipoca;
    }
    public void setValorPipoca(String valorPipoca) {
        this.valorPipoca = valorPipoca;
    }
    public String getCocaCola() {
        return CocaCola;
    }
    public void setCocaCola(String cocaCola) {
        CocaCola = cocaCola;
    }
    public int getNumsBilhetes() {
        return numsBilhetes;
    }
    public void setNumsBilhetes(int numsBilhetes) {
        this.numsBilhetes = numsBilhetes;
    }
    
    //metodos
    public double pegarItens(int quantiCoca, int quantiPipoca){
        double resultadoItens = valorPipoca * quantiPipoca + CocaCola * quantiCoca;
        return resultadoItens;
    }
    public double valorBilhete(int quantidadeBilhetes){
        double soma = quantidadeBilhetes * 20;
        return soma;

    }  
    public double valorFinal(){
        double somaTotal = pegarItens(numsBilhetes, numsBilhetes) + valorBilhete(numsBilhetes);
        return somaTotal;
    }
}

