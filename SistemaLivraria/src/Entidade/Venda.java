package Entidade;

public class Venda {
    private int codProd; // chave estrangeira da entidade Livro ou Produto
    private String nomeCliente; // chave estrangeira da entidade Cliente
    private int qntd; // número de produtos que o cliente quer comprar;
    private float precoCod; // chave estrangeira que remete ao preço do produto em questão;
    private int idFunc;//chave estrangeira que remete ao Id do funcionário

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public float getPrecoCod() {
        return precoCod;
    }

    public void setPrecoCod(float precoCod) {
        this.precoCod = precoCod;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }
    
    
}
