package negocio.Clases;
  
import gdm.entidades.clases.Directorio; 
import negocio.utils.HibernateUtils;  
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction; 
import org.hibernate.criterion.Projections;

/**
 *
 * @author luis
 */
public class DirectorioNegocio {
          
    public static Directorio Obtener()
    { 
        Directorio entidad = new Directorio();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Directorio) session.createCriteria(Directorio.class).setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    public static Boolean Editar(String contratos, String recibos, String modelos, String agradecimientos)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Directorio entidad = Obtener();
             entidad.setContratos(contratos);
             entidad.setRecibos(recibos);
             entidad.setModelos(modelos);
             entidad.setAgradecimientos(agradecimientos);
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
     
    public static String ObtenerRutaModelos()
    {
        String ruta = null; 
        try
        {
          Session session = HibernateUtils.getSession();
          Criteria crit = session.createCriteria(Directorio.class);
          crit.setProjection(Projections.projectionList()
                .add(Projections.property("modelos")));
          ruta = (String)crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return ruta+"\\"; 
    }
    
    public static String ObtenerRutaRecibos()
    {
        String ruta = null; 
        try
        {
          Session session = HibernateUtils.getSession();
          Criteria crit = session.createCriteria(Directorio.class);
          crit.setProjection(Projections.projectionList()
                .add(Projections.property("recibos")));
          ruta = (String)crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return ruta+"\\"; 
    }
    
    public static String ObtenerRutaAgradecimientos()
    {
        String ruta = null; 
        try
        {
          Session session = HibernateUtils.getSession();
          Criteria crit = session.createCriteria(Directorio.class);
          crit.setProjection(Projections.projectionList()
                .add(Projections.property("agradecimientos")));
          ruta = (String)crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return ruta+"\\"; 
    }
    
    public static String ObtenerRutaContratos()
    {
        String ruta = null; 
        try
        {
          Session session = HibernateUtils.getSession();
          Criteria crit = session.createCriteria(Directorio.class);
          crit.setProjection(Projections.projectionList()
                .add(Projections.property("contratos")));
          ruta = (String)crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return ruta+"\\"; 
    }
}

  

