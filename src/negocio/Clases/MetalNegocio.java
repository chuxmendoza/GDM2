package negocio.Clases;
 
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;  
import gdm.entidades.clases.Metal;

/**
 *
 * @author luis
 */
public class MetalNegocio {
    
    
     public static Boolean Guardar(String nombre)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Metal entidad = new Metal();   
             entidad.setNombre(nombre);
             session.save(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
      return realizado;
    }
    
    public static Boolean Editar(int id, String nombre)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Metal entidad = Obtener(id);           
             entidad.setNombre(nombre); 
             session.update(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
      return realizado;
    }
    
    public static Boolean Eliminar(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Metal entidad = Obtener(id); 
             session.delete(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
      return realizado;
    }
       
    public static Metal Obtener(int id)
    { 
        Metal entidad = new Metal();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Metal) session.createCriteria(Metal.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Metal> Listado()
    {
        List<Metal> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Metal.class);
            lista = (List<Metal>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Metal> Buscar(String nombre)
    {
        List<Metal> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Metal.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE)); 
            lista = (List<Metal>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
     
}
