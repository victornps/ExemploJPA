package br.senac.rn.dao;

import br.senac.rn.model.Sexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SexoDAO {
   
    private EntityManager manager;
    private EntityManagerFactory factory;

    public SexoDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Sexo sexo){
        manager.getTransaction().begin();
        manager.persist(sexo);
        manager.getTransaction().commit();
    }
    
    public void excluir(Sexo sexo){
        manager.getTransaction().begin();
        manager.remove(sexo);
        manager.getTransaction().commit();
    }
    
    public void atualizar(Sexo sexo){
        manager.getTransaction().begin();
        manager.merge(sexo);
        manager.getTransaction().commit();
    }
    
    public List<Sexo> buscarTodos(){
        TypedQuery<Sexo> consulta = manager.createQuery("SELECT s FROM Sexo s", Sexo.class);
        return consulta.getResultList();
    }
    
    public Sexo buscarPorId(int id){
        return manager.find(Sexo.class, id);
    }
}
