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
import gdm.entidades.clases.Agradecimiento;

/**
 *
 * @author luis
 */
public class AgradecimientoNegocio {
    
    
     public static Boolean Guardar(String clave, String mensaje)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Agradecimiento entidad = new Agradecimiento();             
             entidad.setClave(clave);
             entidad.setMensaje(mensaje);
             entidad.setPersonalizada(false);
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
    
    public static Boolean Editar(int id, String clave, String mensaje)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Agradecimiento entidad = Obtener(id);          
             entidad.setClave(clave);             
             entidad.setMensaje(mensaje);
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
             Agradecimiento entidad = Obtener(id); 
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
       
    public static Agradecimiento Obtener(int id)
    { 
        Agradecimiento entidad = new Agradecimiento();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Agradecimiento) session.createCriteria(Agradecimiento.class)
                  .add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Agradecimiento> Listado()
    {
        List<Agradecimiento> lista = new ArrayList<Agradecimiento>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Agradecimiento.class);
            lista = (List<Agradecimiento>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Agradecimiento> Buscar(String clave)
    {
        List<Agradecimiento> lista = new ArrayList<Agradecimiento>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Agradecimiento.class);
            crit.add(Expression.like("clave", clave, MatchMode.ANYWHERE));
            lista = (List<Agradecimiento>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static Boolean ValidarEdicion(int id)
    {
        boolean edicion = false; 
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Agradecimiento.class);
            crit.add(Expression.eq("id", id));
//            crit.setProjection(Projections.projectionList()
//                .add(Projections.property("personalizada")));
           Agradecimiento personalizada = (Agradecimiento) crit.uniqueResult(); 
           if(!personalizada.getPersonalizada()){
               edicion = true;
           }
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return edicion;
    }
}
