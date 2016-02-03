package negocio.Clases;
  
import gdm.entidades.clases.Directorio; 
import negocio.utils.HibernateUtils;  
import org.hibernate.Session;
import org.hibernate.Transaction; 

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
     
}

  

