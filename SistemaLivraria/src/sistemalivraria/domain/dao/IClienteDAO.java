package sistemalivraria.domain.dao;

import sistemalivraria.domain.Entidades.Cliente;
import java.util.List;

public interface IClienteDAO {
    
    public void cadastrar (Cliente ent);
    
    public void atualizar (Cliente ent);
    
    public void remover (Cliente ent);
    
    public List<Cliente> consultar();
}
