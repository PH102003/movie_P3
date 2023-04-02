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
/*
 A classe compra é a classe que contém as compras que podem ser realizadas,  a
compra pode conter itens como pipoca, refrigerante, chocolate ou qualquer outro
item que esteja disponível(para este projeto não vamos trabalhar com estoque de
itens, suponha que o estoque para os itens vendidos seja infinito),e deve ter um ou
mais bilhetes. 
O método de compra de bilhetes deve ser um método a parte,
inicialmente o usuário irá buscar pelas sessões em cada sala, cada sala deve conter
o filme em cartaz juntamente com o horário do filme(para este projeto, não vamos
levar em consideração a comparação do horário atual com o horário de exibição do
filme), uma vez que a sessão da sala tenha sido escolhida o usuário pode comprar
os bilhetes, caso ele compre apenas um bilhete ele vai escolher uma poltrona livre
dentro da sessão, o usuário também pode comprar vários bilhetes, 
caso seja
comprado o sistema dará sugestões de cadeiras que estejam juntas para que todos
possam se sentar juntos.
 */

 /*
  import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Bilhete> bilhetes;
    private List<ItemCompra> itensCompra;

    public Compra() {
        this.bilhetes = new ArrayList<>();
        this.itensCompra = new ArrayList<>();
    }

    public List<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void adicionarBilhete(Bilhete bilhete) {
        bilhetes.add(bilhete);
    }

    public void adicionarItemCompra(ItemCompra item) {
        itensCompra.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Bilhete bilhete : bilhetes) {
            valorTotal += bilhete.getValor();
        }
        for (ItemCompra item : itensCompra) {
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }
  */
