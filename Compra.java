package classes;

public class Compra {
    private double valorPipoca;
    private double CocaCola;
    
    
    public Compra(String valorPipoca, String cocaCola ) {
        this.valorPipoca = valorPipoca;
        CocaCola = cocaCola;
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
    //metodos
    public double pegarItens(int quantiCoca, int quantiPipoca){
        double resultadoItens = valorPipoca * quantiPipoca + CocaCola * quantiCoca;
        return resultadoItens;
    }
    public double valorBilhete(double numsBilhetes){
        return numsBilhetes * 20;
        
    }  
    public void valorFinal(double numsBilhetes){
        double somaTotal = pegarItens(CocaCola, valorPipoca)  + valorBilhete(numsBilhetes);
        System.out.println("Preço total:" + somaTotal);
        
    }
<<<<<<< HEAD
    
    public void quantidadeDeBilhetes(){



      Bilhete quantidade = new Bilhete();
      if(quantidade != null){
        quantidade++;
      }
      


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
=======
}
>>>>>>> d804dd732466ea2f5c221c57b69b268c025571e5

