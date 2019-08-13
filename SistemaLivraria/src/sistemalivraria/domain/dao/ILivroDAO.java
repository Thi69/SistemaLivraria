package sistemalivraria.domain.dao;

import sistemalivraria.domain.Entidades.Livro;

public interface ILivroDAO {
    public void buscaCod (Livro ent);
    
    public void buscaNome (Livro ent);
    
    public void buscaAutor (Livro ent);
    
    //public void adicionarCarrinho (Livro ent)
}
