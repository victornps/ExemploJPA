package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
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
        
        Categoria c1 = new Categoria();
        
        c1.setNome("Teste");
        c1.setDescricao("Teste d");
        CategoriaDAO dao = new CategoriaDAO();
        dao.inserir(c1);
        
        System.exit(0);
    }
}
