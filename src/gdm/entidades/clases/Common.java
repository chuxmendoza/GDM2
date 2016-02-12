package gdm.entidades.clases;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class Common {
       
    public static void copiarArchivo(String rutaOrigen, String rutaDestino) throws IOException 
    {
        try
        { 
            File origen = new File(rutaOrigen);
            File destino = new File(rutaDestino);
            Files.copy(origen.toPath(), destino.toPath());
        }
        catch(Exception ex)
        {
        
        }
    }    
    
    public static boolean RutaExistente(String ruta)
    {
        boolean existe = false;
        try
        {
            File fichero = new File(ruta);
            if (fichero.exists())
                existe = true;
        }
        catch(Exception ex)
        {
            
        }
        return existe;
    }
}
