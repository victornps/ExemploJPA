package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;


public class Principal {
    
    public static void main(String[] args) {
        /*
        Sexo s1 = new Sexo();
        
        s1.setNome("Masculino");
        s1.setSigla('M');*/
        
        //SexoDAO dao = new SexoDAO();
        
        //dao.inserir(s1);
        //dao.excluir(dao.buscarPorId());
        //System.out.println(dao.buscarTodos().toString());
        //Sexo s2 = new Sexo();
        //s2.setId(1);
        //s2.setNome("Feminino");
        //s2.setSigla('F');
        
        //dao.atualizar(s2);
        /*
        Categoria c1 = new Categoria();
        
        c1.setNome("Teste");
        c1.setDescricao("Teste d");
        CategoriaDAO dao = new CategoriaDAO();
        dao.inserir(c1);*/
        
        /*
        Produto p1 = new Produto();
        p1.setNome("Pastel");
        p1.setDescricao("Recheio de vento");
        p1.setPreco(10);
        p1.setCategoria(new CategoriaDAO().buscarPorId(1));
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.inserir(p1);*/
        Sexo s2 = new Sexo(2, "Masculino", 'M');
        
        Cliente c1 = new Cliente();
        c1.setNome("Astrogildo Tavares Almeida");
        c1.setCpf("00011122233");
        c1.setSexo(new SexoDAO().buscarPorId(0));
        
        System.exit(0);
    }
}
