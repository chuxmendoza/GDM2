package negocio.Clases;
 
import gdm.entidades.clases.Modelo;
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;   

/**
 *
 * @author luis
 */
public class ModeloNegocio {
    
    
     public static Boolean Guardar(String nombre, String imagen)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Modelo entidad = new Modelo();   
             entidad.setNombre(nombre);
             entidad.setImagen(imagen);
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
    
    public static Boolean Editar(int id, String nombre, String imagen)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Modelo entidad = Obtener(id);           
             entidad.setNombre(nombre); 
             entidad.setImagen(imagen);
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
             Modelo entidad = Obtener(id); 
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
       
    public static Modelo Obtener(int id)
    { 
        Modelo entidad = new Modelo();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Modelo) session.createCriteria(Modelo.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Modelo> Listado()
    {
        List<Modelo> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Modelo.class);
            lista = (List<Modelo>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Modelo> Buscar(String nombre)
    {
        List<Modelo> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Modelo.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE)); 
            lista = (List<Modelo>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
     
}
