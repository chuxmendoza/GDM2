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
import gdm.entidades.clases.Especialidad;

/**
 *
 * @author luis
 */
public class EspecialidadNegocio {
    
    
     public static Boolean Guardar(String nombre)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Especialidad entidad = new Especialidad();             
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
             Especialidad entidad = Obtener(id);          
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
             Especialidad entidad = Obtener(id); 
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
       
    public static Especialidad Obtener(int id)
    { 
        Especialidad entidad = new Especialidad();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Especialidad) session.createCriteria(Especialidad.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Especialidad> Listado()
    {
        List<Especialidad> lista = new ArrayList<Especialidad>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Especialidad.class);
            lista = (List<Especialidad>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
       
    public static List<Especialidad> Buscar(String nombre)
    {
        List<Especialidad> lista = new ArrayList<Especialidad>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Especialidad.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Especialidad>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
        public static Boolean ValidarEspecialidad(String nombre)
    {
        boolean realizado = false;
        Integer id = 0;
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Especialidad.class);
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
