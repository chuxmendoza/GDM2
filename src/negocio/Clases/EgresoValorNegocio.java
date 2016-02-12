package negocio.Clases;
 
import gdm.entidades.clases.Contrato;
import gdm.entidades.clases.Egreso;
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;  
import org.hibernate.criterion.Expression;
import gdm.entidades.clases.EgresoValor; 
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author luis
 */
public class EgresoValorNegocio {
      
    public static EgresoValor Obtener(int id)
    { 
          EgresoValor entidad = new EgresoValor();
       
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (EgresoValor) session.createCriteria(EgresoValor.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
 public static Boolean Guardar(int idContrato,int idEgreso, double valor)
    {
        boolean realizado = false;
        Transaction tx = null; 
       
        Contrato contrato = ContratoNegocio.Obtener(idContrato);
        try
             (Session session = HibernateUtils.getSession()){    
             tx = session.beginTransaction();
             EgresoValor entidad = new EgresoValor();  
             entidad.setEgreso(new Egreso(idEgreso));
             entidad.setValor(valor);
               if(contrato.getEgresoValor() == null)
             {
                List<EgresoValor> lista = new ArrayList();
                lista.add(entidad);
                contrato.setEgresoValor(lista);
             }
             else
             {               
                contrato.getEgresoValor().add(entidad);             
             }
           
             session.update(contrato);
            
            
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
  public static Boolean Editar(int id, int idEgreso, double valor)
    {
        boolean realizado = false;
        Transaction tx = null; 
        EgresoValor entidad = Obtener(id); 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();        
             entidad.setEgreso(new Egreso(idEgreso));
             entidad.setValor(valor);
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
             EgresoValor entidad = Obtener(id); 
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
    public static List<EgresoValor> Listado()
    {
        List<EgresoValor> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(EgresoValor.class);
            lista = (List<EgresoValor>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    
    
}
