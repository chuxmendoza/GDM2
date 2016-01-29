package negocio.Clases;
 
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode; 
import gdm.entidades.clases.Anillo;
import gdm.entidades.clases.Metal;

/**
 *
 * @author luis
 */
public class AnilloNegocio {
    
    
     public static Boolean Guardar(int idMetal, double g, double k)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Anillo entidad = new Anillo();  
             entidad.setMetal(new Metal(idMetal));
             entidad.setG(g);
             entidad.setK(k);
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
    
    public static Boolean Editar(int id, int idMetal, double g, double k)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Anillo entidad = Obtener(id);          
             entidad.setMetal(new Metal(idMetal));
             entidad.setG(g);
             entidad.setK(k);
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
             Anillo entidad = Obtener(id); 
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
       
    public static Anillo Obtener(int id)
    { 
        Anillo entidad = new Anillo();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Anillo) session.createCriteria(Anillo.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Anillo> Listado()
    {
        List<Anillo> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Anillo.class);
            lista = (List<Anillo>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Anillo> Buscar(String metal, double g, double k)
    {
        List<Anillo> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Anillo.class);
            crit.createAlias("metal", "m");
            crit.add(Expression.like("m.nombre", metal, MatchMode.ANYWHERE));
            crit.add(Expression.eq("g", g));
            crit.add(Expression.eq("k", k));
            lista = (List<Anillo>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
     
}
