
package br.fructus.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;


public interface InterfaceDao<T> {
    void save(T entity);
    void update(T entity);
    void remove(T entity);
    void marge(T entity);
    T getEntity (Serializable id);
    T getEntityByDetachedCriteria(DetachedCriteria criteria);
    List <T> getEntities();
    List<T> getListDetachedCriteria(DetachedCriteria criteria);
    
}
