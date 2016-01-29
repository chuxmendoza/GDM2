package negocio.Clases;
 
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;  
import org.hibernate.criterion.Restrictions;
import gdm.entidades.clases.Egreso;

/**
 *
 * @author luis
 */
public class EgresoNegocio {
    
    
     public static Boolean Guardar(String nombre)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Egreso entidad = new Egreso();             
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
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
    
    public static Boolean Editar(int id, String nombre)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Egreso entidad = Obtener(id);          
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
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
    
    public static Boolean Eliminar(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Egreso entidad = Obtener(id); 
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
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
       
    public static Egreso Obtener(int id)
    { 
        Egreso entidad = new Egreso();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Egreso) session.createCriteria(Egreso.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Egreso> Listado()
    {
        List<Egreso> lista = new ArrayList<Egreso>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Egreso.class);
            lista = (List<Egreso>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Egreso> Buscar(String nombre)
    {
        List<Egreso> lista = new ArrayList<Egreso>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Egreso.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Egreso>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
        public static Boolean ValidarEgreso(String nombre)
    {
        boolean realizado = false;
        Integer id = 0;
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Egreso.class);
            crit.add(Expression.eq("nombre", nombre));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("id")));
            id = (Integer) crit.uniqueResult();
            realizado = id != null ? true : false;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return realizado;
    }
}
