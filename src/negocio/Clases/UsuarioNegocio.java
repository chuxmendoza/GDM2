package negocio.Clases;
 
import gdm.entidades.clases.Perfil;
import gdm.entidades.clases.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;  


/**
 *
 * @author luis
 */
public class UsuarioNegocio {
       
    public static Usuario Login(String login, String pass)
    {
        Usuario usuario = new Usuario();
      try 
      {        
          Session session = HibernateUtils.getSession();
          Criteria crit=session.createCriteria(Usuario.class);
          crit.add(Expression.eq("login", login));
          //crit.Add(Expression.Eq("Contrasena", contrasena));
          usuario = (Usuario)crit.uniqueResult();
          if (usuario != null)
            if (!usuario.getPass().equals(pass))
              usuario = null;
      }
      catch(Exception ex) 
      {
        throw ex;
      }
      return usuario;
    }
    
    public static Usuario Obtener(int id)
    { 
        Usuario entidad = new Usuario();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Usuario) session.createCriteria(Usuario.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    public static Boolean Guardar(String login, String pass, String nombre, Perfil perfil)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Usuario entidad = new Usuario();
             entidad.setLogin(login);
             entidad.setPass(pass);
             entidad.setNombre(nombre);
             entidad.setPerfil(perfil);
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
    
    public static Boolean Editar(int id, String login, String pass, String nombre, Perfil perfil)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Usuario entidad = Obtener(id);
             entidad.setLogin(login);
             entidad.setPass(pass);
             entidad.setNombre(nombre);
             entidad.setPerfil(perfil);
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
             Usuario entidad = Obtener(id); 
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
    
    public static Perfil ObtenerPerfil(int id)
    {
        Perfil perfil = Perfil.ADMIN;
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.eq("id", id));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("perfil")));
            perfil = (Perfil) crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return perfil;
    }
    
    public static String ObtenerNombre(int id)
    {
        String nombre = "";
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.eq("id", id));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("nombre")));
            nombre = (String) crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return nombre;
    }
    
    public static Boolean ValidarLogin(String login)
    {
        boolean realizado = false;
        Integer id = 0;
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.eq("login", login));
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
    
    public static List<Usuario> Listado()
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Usuario.class);
            lista = (List<Usuario>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Usuario> Buscar(String nombre)
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Usuario>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }

   
    
    }

  

