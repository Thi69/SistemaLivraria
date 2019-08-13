package sistemalivraria.domain.Entidades;

public class Carrinho {
    private int CodProd; // chave estrangeira da classe livro 
    private float PrecoProd; // chave estrangeira da classe livro
    private int QtdeProd; // chave estrangeira da classe livro para saber a quantidade em estoque de cada livro
    private int Qtde; // qntd que o cliente deseja comprar
    private boolean Adicionar; // caso o cliente queira adicionar mais coisas no carrinho
    private boolean Remover; // caso o cliente queira remover algo do carrinho
    private float Subtotal;

    public int getCodProd() {
        return CodProd;
    }

    public void setCodProd(int CodProd) {
        this.CodProd = CodProd;
    }

    public float getPrecoProd() {
        return PrecoProd;
    }

    public void setPrecoProd(float PrecoProd) {
        this.PrecoProd = PrecoProd;
    }

    public int getQtdeProd() {
        return QtdeProd;
    }

    public void setQtdeProd(int QtdeProd) {
        this.QtdeProd = QtdeProd;
    }

    public int getQtde() {
        return Qtde;
    }

    public void setQtde(int Qtde) {
        this.Qtde = Qtde;
    }

    public boolean isAdicionar() {
        return Adicionar;
    }

    public void setAdicionar(boolean Adicionar) {
        this.Adicionar = Adicionar;
    }

    public boolean isRemover() {
        return Remover;
    }

    public void setRemover(boolean Remover) {
        this.Remover = Remover;
    }

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(float Subtotal) {
        this.Subtotal = Subtotal;
    }
    
    
}
