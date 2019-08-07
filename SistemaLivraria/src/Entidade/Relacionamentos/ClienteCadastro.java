package Entidade.Relacionamentos;

import Entidade.Cadastro;
import Entidade.Cliente;

public class ClienteCadastro {
    private int Id;
    private Cliente cliente;
    private Cadastro cadastro;

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

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    
}
