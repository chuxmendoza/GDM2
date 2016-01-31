package negocio.Clases;
 
import gdm.entidades.clases.Agradecimiento;
import gdm.entidades.clases.Anillo;
import gdm.entidades.clases.Anticipo;
import gdm.entidades.clases.Cliente;
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode; 
import gdm.entidades.clases.Contrato; 
import gdm.entidades.clases.ContratoCliente;
import gdm.entidades.clases.Modelo;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

/**
 *
 * @author luis
 */
public class ContratoClienteNegocio {
    
    
    public static Boolean Guardar(int idContrato, 
            int idCliente,
            int folio, int idModelo, boolean reconocimiento,boolean titulo, int agradecimiento, String mensaje,String dirigido, boolean fotoPanoramica,
            boolean fotoPersonalizada,boolean fotoMisa, boolean fotoEstudio, Anillo anillo, boolean rentaToga, boolean misa, boolean baile, int mesaExtra, int fotosExtra, 
            boolean triptico, double precio, Date fechaEntregaPaquete, Date fechaEntregaDatos, Date fechaLimitePago, String contratoImagen, 
            Date fechaContrato, String comentarios)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Contrato contrato = ContratoNegocio.Obtener(idContrato);
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             ContratoCliente entidad = new ContratoCliente();
             entidad.setFolio(folio);
             entidad.setCliente(new Cliente(idCliente));
             entidad.setModelo(new Modelo(idModelo));
             entidad.setReconocimiento(reconocimiento);
             entidad.setTitulo(titulo);
             entidad.setAgradecimiento(new Agradecimiento(agradecimiento));
             entidad.setMensaje(mensaje);
             entidad.setDirigido(dirigido);
             entidad.setFotoPanoramica(fotoPanoramica);
             entidad.setFotoPersonalizada(fotoPersonalizada);
             entidad.setFotoMisa(fotoMisa);
             entidad.setFotoEstudio(fotoEstudio);
             entidad.setAnillo(anillo);
             entidad.setRentaToga(rentaToga);
             entidad.setMisa(misa);
             entidad.setBaile(baile);
             entidad.setMesaExtra(mesaExtra);
             entidad.setFotosExtra(fotosExtra);
             entidad.setTriptico(triptico);
             entidad.setPrecio(precio);
             entidad.setFechaEntregaPaquete(fechaEntregaPaquete);
             entidad.setFechaEntregaDatos(fechaEntregaDatos);
             entidad.setFechaLimitePago(fechaLimitePago);
             entidad.setContratoImagen(contratoImagen);
             //entidad.setAnticipos(anticipos);
             entidad.setFechaContrato(fechaContrato);            
             entidad.setComentarios(comentarios);
             /*double total = 0;
             boolean liquidado = false;
             for(Anticipo a : anticipos)
             {
                 total = total + a.getCantidad();
             }
             if (entidad.getPrecio() == total)
                 liquidado = true;*/
             entidad.setLiquidado(false);
             //session.save(entidad);
             if(contrato.getContratoCliente() == null)
             {
                List<ContratoCliente> lista = new ArrayList();
                lista.add(entidad);
                contrato.setContratoCliente(lista);
             }
             else
             {               
                contrato.getContratoCliente().add(entidad);             
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
    
    public static Boolean Editar(int id,int idCliente,  int folio, int idModelo, boolean reconocimiento,boolean titulo, int agradecimiento, String mensaje,String dirigido, boolean fotoPanoramica,
            boolean fotoPersonalizada,boolean fotoMisa, boolean fotoEstudio, Anillo anillo, boolean rentaToga, boolean misa, boolean baile, int mesaExtra, int fotosExtra, 
            boolean triptico, double precio, Date fechaEntregaPaquete, Date fechaEntregaDatos, Date fechaLimitePago, String contratoImagen, 
            Date fechaContrato, String comentarios)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             ContratoCliente entidad = Obtener(id);
             entidad.setFolio(folio);
             entidad.setCliente(new Cliente(idCliente));             
             entidad.setModelo(new Modelo(idModelo));
             entidad.setReconocimiento(reconocimiento);
             entidad.setTitulo(titulo);
             entidad.setTitulo(titulo);
             entidad.setAgradecimiento(new Agradecimiento (agradecimiento));
             entidad.setMensaje(mensaje);
             entidad.setDirigido(dirigido);
             entidad.setFotoPanoramica(fotoPanoramica);
             entidad.setFotoPersonalizada(fotoPersonalizada);
             entidad.setFotoMisa(fotoMisa);
             entidad.setFotoEstudio(fotoEstudio);
             entidad.setAnillo(anillo);
             entidad.setRentaToga(rentaToga);
             entidad.setMisa(misa);
             entidad.setBaile(baile);
             entidad.setMesaExtra(mesaExtra);
             entidad.setFotosExtra(fotosExtra);
             entidad.setTriptico(triptico);
             entidad.setPrecio(precio);
             entidad.setFechaEntregaPaquete(fechaEntregaPaquete);
             entidad.setFechaEntregaDatos(fechaEntregaDatos);
             entidad.setFechaLimitePago(fechaLimitePago);
             entidad.setContratoImagen(contratoImagen); 
             entidad.setFechaContrato(fechaContrato);
           
             entidad.setComentarios(comentarios);
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
             ContratoCliente entidad = Obtener(id); 
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
       
    public static ContratoCliente Obtener(int id)
    { 
        ContratoCliente entidad = new ContratoCliente();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (ContratoCliente) session.createCriteria(ContratoCliente.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    public static List<Anticipo> ListarAbonos(int id)
    {  
        List<Anticipo> lista = new ArrayList();
        try
        {
            Session session = HibernateUtils.getSession();
            String hql = "SELECT CC.anticipos FROM ContratoCliente AS CC WHERE CC.id = :id";
            Query query = session.createQuery(hql).setParameter("id", id);
            lista = (List<Anticipo>)query.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista; 
    }    
     
    public static List<ContratoCliente> Listado()
    {
        List<ContratoCliente> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(ContratoCliente.class);
            lista = (List<ContratoCliente>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<ContratoCliente> Buscar(int idContrato, String nombre, int folio, boolean liquidado)
    {
        List<ContratoCliente> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Contrato.class); 
            crit.add(Expression.eq("id", idContrato));
            crit.createAlias("cliente", "c");
            if (!nombre.isEmpty())
                crit.add(Expression.like("c.nombre", nombre, MatchMode.ANYWHERE));
            if (folio > 0)
                crit.add(Expression.eq("c.folio", folio));
            crit.add(Expression.eq("c.liquidado", liquidado)); 
            crit.setResultTransformer(Transformers.aliasToBean(ContratoCliente.class));
            lista = (List<ContratoCliente>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
     
}
