/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.Clases;

import gdm.entidades.clases.Cliente;
import gdm.entidades.clases.Direccion;
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
public class ClienteNegocio {
           
     public static int Guardar(String nombre, Direccion direccion,String celular, String telefono,String correo)
    {
        int realizado = 0;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Cliente entidad = new Cliente();             
             entidad.setNombre(nombre);         
             entidad.setDireccion(direccion);
             entidad.setCelular(celular);
             entidad.setCorreo(correo);
             entidad.setTelefono(telefono);
               
             session.save(entidad);  
             tx.commit();
             realizado = entidad.getId();
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
    
    public static Boolean Editar(int id, String nombre, Direccion direccion,String celular, String telefono,String correo)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Cliente entidad = Obtener(id);
        Session session = null;
        try
        {    
             session =  HibernateUtils.getSession();    
             tx = session.beginTransaction();                
             entidad.setNombre(nombre);
             entidad.setDireccion(direccion);
             entidad.setCelular(celular);
             entidad.setTelefono(telefono);
             entidad.setCorreo(correo);
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
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Cliente entidad = new Cliente(id); 
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
       
    public static Cliente Obtener(int id)
    { 
        
        Cliente entidad = new Cliente();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Cliente) session.createCriteria(Cliente.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        
        return entidad; 
    }
    
    
    public static List<Cliente> Listado()
    
    {
        
        List<Cliente> lista = new ArrayList<Cliente>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Cliente.class);
            lista = (List<Cliente>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Cliente> Buscar(String nombre)
    {
        List<Cliente> lista = new ArrayList<Cliente>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Cliente.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Cliente>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
        public static Boolean ValidarCliente(String nombre)
    {
        boolean realizado = false;
        Integer id = 0;
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Cliente.class);
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


