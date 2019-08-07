package Entidade.Relacionamentos;

import Entidade.Cliente;
import Entidade.Venda;

public class ClienteVenda {
    private int Id;
    private Cliente cliente;
    private Venda venda;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    
}
