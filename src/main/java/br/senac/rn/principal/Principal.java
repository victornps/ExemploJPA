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
import java.util.Calendar;
import java.util.List;


public class Principal {
    
    public static void main(String[] args) {
        
        Sexo s1 = new Sexo();
        s1.setNome("Indefinido");
        s1.setSigla('I');
        s1.setId(3);
        SexoDAO dao = new SexoDAO();
        //dao.delete(dao.selectById(3));
        System.out.println(dao.selectAll().toString());
        
    }
}
