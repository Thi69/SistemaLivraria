package dao;

import Entidade.Livro;
import java.util.List;

public interface ILivroDAO {
    
    public void cadastrar (Livro ent);
    
    public void atualizarEstoque (Livro ent);
    
    
    
    public List<Livro> consultar();
}
