package classes;

public class Sessao {
    private boolean[][] cadeiras;
    private Filme filme;

    public Sessao(Filme filme) {
        this.cadeiras = new boolean[10][15];
        this.filme = filme;
        // for foi criado pra percorrer numeros de linhas e coluna se a cadeira nessa
        // posição está vazia, está verdadeira
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                cadeiras[i][j] = true;

            }
        }

    }

    // gets e sets
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    // metodos
    public void pegarCadeira(char linha, int coluna) {
        if (cadeiras[linha][coluna] == true) {
            // vai ser false porque assim que ocupar, não vai ser mais true
            cadeiras[linha][coluna] = false;
            
        } else {
            System.out.println("");
        }

    }

    public void mostrarCadeirasDispo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println(cadeiras[i][j]); 
            }
        }
    }
}
/*
 * A sessão deve conter o filme exibido juntamente com as cadeiras disponíveis
 * para
 * compras, as cadeiras devem ser implementadas de acordo com a seguir sendo que
 * existem 15 colunas.
 * 
 */
/*
 * private Filme filme;
 * private boolean[][] cadeiras;
 * 
 * public Sessao(Filme filme) {
 * this.filme = filme;
 * this.cadeiras = new boolean[15][10];
 * for (int i = 0; i < 15; i++) {
 * for (int j = 0; j < 10; j++) {
 * cadeiras[i][j] = true; // todas as cadeiras são inicialmente disponíveis
 * }
 * }
 * }
 * 
 * public Filme getFilme() {
 * return filme;
 * }
 * 
 * public boolean isCadeiraDisponivel(int coluna, int fileira) {
 * return cadeiras[coluna][fileira];
 * }
 * 
 * public void reservarCadeira(int coluna, int fileira) {
 * cadeiras[coluna][fileira] = false;
 * }
 * 
 * public void liberarCadeira(int coluna, int fileira) {
 * cadeiras[coluna][fileira] = true;
 * }
 */