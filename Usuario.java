package classes;

public class Usuario{
    private String CPF;
    private int senha;
    private int idade;
    private char sexo;
    private String email;
    private String nomeDoCartao;
    private int cvv;
    private String user;
    private int numCartao;
    
    
    
    public Usuario(String CPF, int senha, int idade, char sexo, String email, String nomeDoCartao, int cvv, String user,
            int numCartao) {
        this.CPF = CPF;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nomeDoCartao = nomeDoCartao;
        this.cvv = cvv;
        this.user = user;
        this.numCartao = numCartao;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeDoCartao() {
        return nomeDoCartao;
    }
    public void setNomeDoCartao(String nomeDoCartao) {
        this.nomeDoCartao = nomeDoCartao;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public int getNumCartao() {
        return numCartao;
    }
    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }
    

}

/*
 A classe de usuário representa quem está comprando os bilhetes online, este
usuário deve ter os seguintes atributos: 
user, 
CPF, 
senha, 
idade, 
sexo, 
email,
nome do cartão, 
número do cartão e 
código verificador do cartão; 
Além disto
o usuário pode realizar, 
alterar ou cancelar uma compra. A classe de compra
será explanada a seguir.

 */

 /*
  private String user;
    private String cpf;
    private String senha;
    private int idade;
    private char sexo;
    private String email;
    private String nomeCartao;
    private String numCartao;
    private String codVerifCartao;

    public Usuario(String user, String cpf, String senha, int idade, char sexo, String email, String nomeCartao, String numCartao, String codVerifCartao) {
        this.user = user;
        this.cpf = cpf;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nomeCartao = nomeCartao;
        this.numCartao = numCartao;
        this.codVerifCartao = codVerifCartao;
    }

    public String getUser() {
        return user;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public String getCodVerifCartao() {
        return codVerifCartao;
    }

    public void realizarCompra() {
        // Implementação do método para realizar a compra
    }

    public void alterarCompra() {
        // Implementação do método para alterar a compra
    }

    public void cancelarCompra() {
        // Implementação do método para cancelar a compra
    }
  */