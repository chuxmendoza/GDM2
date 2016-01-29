/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.Clases;

import gdm.entidades.clases.Escuela;
import gdm.entidades.clases.EscuelaCombo;
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;

/**
 *
 * @author Chuy
 */
public class EscuelaNegocio {
    
     public static Escuela Obtener(int id)
    { 
        Escuela entidad = new Escuela();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Escuela) session.createCriteria(Escuela.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
      public static Boolean Guardar(String nombre, String ciudad)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Escuela entidad = new Escuela();            
             entidad.setNombre(nombre);
             entidad.setCiudad(ciudad);
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
       public static Boolean Editar(int id,String nombre,String ciudad)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Escuela entidad = Obtener(id);             
             entidad.setNombre(nombre);   
             entidad.setCiudad(ciudad);
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
             Escuela entidad = Obtener(id); 
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
     public static String ObtenerNombre(int id)
    {
        String nombre = "";
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Escuela.class);
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
     public static List<Escuela> Listado()
    {
        List<Escuela> lista = new ArrayList<Escuela>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Escuela.class);
            lista = (List<Escuela>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
     public static List<EscuelaCombo> ListadoCombo()
    {
        List<Escuela> lista = new ArrayList<Escuela>();
           List<EscuelaCombo> listaCombo = new ArrayList<EscuelaCombo>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Escuela.class);
            lista = (List<Escuela>) crit.list();
            
            for(Escuela e: lista){
                EscuelaCombo ec = new EscuelaCombo();
                ec.setId(e.getId());
                ec.setNombre(e.getNombre()+" "+e.getCiudad());
                listaCombo.add(ec);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return listaCombo;
    }
     
    public static List<Escuela> Buscar(String nombre)
    {
        List<Escuela> lista = new ArrayList<Escuela>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Escuela.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Escuela>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
}
