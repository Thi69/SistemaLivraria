package sistemalivraria.domain.Entidades;

public class Papelaria {
    private int codProd; // chave primária do pruduto
    private String tipo; // caneta, lápis, caderno, borracha, tesoura, cola, lapiseira
    private float preco;
    private int qtde;

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
}
