package Entidade.Relacionamentos;

import Entidade.Funcionario;
import Entidade.Venda;

public class FuncionarioVenda {
    private int Id;
    private Funcionario funcionario;
    private Venda venda;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    
}
