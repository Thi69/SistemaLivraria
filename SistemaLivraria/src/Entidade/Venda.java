package Entidade;

public class Venda {
    private int IdVenda;
    private String CpfCliente; // chave estrangeira da classe cliente
    private float Total;

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    public String getCpfCliente() {
        return CpfCliente;
    }

    public void setCpfCliente(String CpfCliente) {
        this.CpfCliente = CpfCliente;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
}
