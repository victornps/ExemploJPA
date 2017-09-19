package br.senac.rn.util;

import javax.persistence.EntityManager;


public abstract class GenericDAO<T> {
    
    protected static EntityManager manager;
    
    public abstract Class<T> getClassType();
    
    public EntityManager getEm(){
        if (manager == null){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    
    public void insert(T t){
        
      try{  
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
      }catch(Exception e){
          System.out.println("Erro" + e);
       }
    }
}
