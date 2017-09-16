package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.dao.VendaDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;

import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;
import br.senac.rn.model.Venda;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    
    public static void main(String[] args) {
        /*
        Sexo s1 = new Sexo();
        
        s1.setNome("Feminino");
        s1.setSigla('F');
        
        SexoDAO dao = new SexoDAO();
        
        dao.inserir(s1);*/
        //dao.excluir(dao.buscarPorId());
        //System.out.println(dao.buscarTodos().toString());
        //Sexo s2 = new Sexo();
        //s2.setId(1);
        //s2.setNome("Feminino");
        //s2.setSigla('F');
        //dao.atualizar(s2);
        
        /*
        Categoria c1 = new Categoria();
        
        c1.setNome("Panificadora");
        c1.setDescricao("Aquela lá");
        CategoriaDAO dao = new CategoriaDAO();
        dao.inserir(c1);*/
        
        /*
        Produto p1 = new Produto();
        p1.setNome("Pastel");
        p1.setDescricao("Recheio de vento");
        p1.setPreco(10);
        p1.setCategoria(new CategoriaDAO().buscarPorId(1));
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.inserir(p1);
        */
        
        /*
        Cliente c1 = new Cliente();
        c1.setNome("Parvolino Vieira Soares");
        c1.setCpf("44455566677");
        c1.setSexo(new SexoDAO().buscarPorId(1));
        ClienteDAO dao = new ClienteDAO();
        dao.inserir(c1);*/
        
        Venda v1 = new Venda();
        v1.setCliente(new ClienteDAO().buscarPorId(1));
        Produto p = new ProdutoDAO().buscarPorId(1);
        List<Produto> l1 = new ArrayList();
        l1.add(p);
        
        v1.setProdutos(l1);
        v1.setValor(150);
        
        VendaDAO dao = new VendaDAO();
        dao.inserir(v1);
    }
}
