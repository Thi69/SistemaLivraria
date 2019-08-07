package dao;

import Entidade.Cadastro;
import java.util.List;

public interface ICadastroDAO {
    
    public void cadastrar (Cadastro ent);
    
    public void atualizar (Cadastro ent);
    
    public void remover (int Id);
    
    public List<Cadastro> consultar();
}
