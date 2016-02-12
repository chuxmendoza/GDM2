package gdm.entidades.clases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files; 
import java.util.ArrayList;  
import java.util.List;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.VerticalAlignment; 
import jxl.write.Number;
import jxl.write.Label; 
import jxl.write.NumberFormats;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import negocio.Clases.ContratoNegocio;

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
            throw ex;
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
            throw ex;
        }
        return existe;
    }
    
    public static Boolean exportarExcelContratoConPrecios(String ruta, int idContrato) throws IOException, WriteException
    { 
        boolean realizado = false;
        try
        {
            Contrato contrato = ContratoNegocio.Obtener(idContrato);
            if (contrato == null)
                return false;
            
            //NumberFormat currency = NumberFormat.getCurrencyInstance();
            String nombreArchivo = contrato.toString();  
            nombreArchivo = nombreArchivo + " - completo.xls"; 
            //Se crea el libro Excel
            WritableWorkbook workbook = Workbook.createWorkbook(new File(nombreArchivo));  
            //Se crea una nueva hoja dentro del libro
            WritableSheet sheet = workbook.createSheet(nombreArchivo, 0); 
            
            int numAnticipos = 0;
            List totalAnticipos = new ArrayList();
            //<editor-fold defaultstate="collapsed" desc=" Obtener la longitud del contrato cliente con más anticipos ">  
            for(ContratoCliente cc : contrato.getContratoCliente())
            {
                int numA = cc.getAnticipos() != null ? cc.getAnticipos().size() : 0;
                if (numA > numAnticipos)
                {
                    numAnticipos = numA;
                }
            }
            //</editor-fold> 
            //<editor-fold defaultstate="collapsed" desc=" Ancho de columnas ">
            sheet.setColumnView(0, 3);
            sheet.setColumnView(1, 37);
            sheet.setColumnView(2, 9);
            sheet.setColumnView(3, 10);
            sheet.setColumnView(4, 7);
            sheet.setColumnView(5, 11);
            sheet.setColumnView(6, 6);
            sheet.setColumnView(7, 10);
            sheet.setColumnView(8, 11);
            sheet.setColumnView(9, 10);
            sheet.setColumnView(10, 7);
            sheet.setColumnView(11, 4);
            sheet.setColumnView(12, 10);
            
            
            sheet.setRowView(4, 27*20);
            //</editor-fold> 
            //<editor-fold defaultstate="collapsed" desc=" Titulos de la tabla ">  
            //Se asigna la información del contrato
            sheet.mergeCells(1, 0, 5, 0);
            sheet.mergeCells(2, 2, 6, 2);
            sheet.mergeCells(7, 2, 11, 2);
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 1, 0, contrato.getComentarios(), true, 9, true); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 1, 1, contrato.getEspecialidad().getNombre(), true, 10, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 1, 2, contrato.getGeneracion(), true, 9, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 2, 1, contrato.getEscuela().getCiudad(), true, 9, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 2, 2, "Escuela: " + contrato.getEscuela().getNombre(), true, 9, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 7, 2, "Fecha: " + contrato.getFechaEvento().toString(), true, 9, false);
            
            //Se inicia con los titulos 
            sheet.mergeCells(4, 4, 5, 4);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 0, 4, "#", true, 9, true);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 1, 4, "Nombre Completo", true, 9, false);           
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 2, 4, "Triptico", true, 9, true);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 3, 4, "MODELO", true, 9, true); 
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 4, 4, "Placas", true, 9, true);
            sheet.mergeCells(6, 4, 7, 4);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 6, 4, "Dirigido a: /                               # Agradecimiento", true, 9, true);
            sheet.mergeCells(8, 4, 11, 4);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 8, 4, "Fotografías", true, 9, true);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 12, 4, "Precio Paquete", true, 9, true);
            
            //Agregar N cantidad de columnas de anticipos 
            int col = 13;
            for (int i = 0; i < numAnticipos; i++)
            {
                sheet.setColumnView(col, 10);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, col, 4, "Ant.", true, 9, true);
                col++;
            }
            
            sheet.setColumnView((col), 10);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, (col), 4, "RESTO", true, 9, true);
            
            sheet.setColumnView((col+1), 40);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, (col+1), 4, "e-mail", true, 9, true);
            
            sheet.setColumnView((col+2), 12);
            sheet.setColumnView((col+3), 12);
            sheet.setColumnView((col+4), 12);
            sheet.setColumnView((col+5), 12);
            sheet.mergeCells((col+2), 4, (col+5), 4); 
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, (col+2), 4, "Notas", true, 9, true);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Registros de contratos clientes "> 
            //fila inicial
            int row = 5;
            //número del registro
            int indice = 1;  
            for(ContratoCliente cc : contrato.getContratoCliente())
            {  
                sheet.mergeCells(0, row, 0, row+1);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 0, row, indice+"", false, 9, true);
                
                sheet.mergeCells(1, row, 1, row+1);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 1, row, cc.getCliente().getNombre(), false, 9, false);
                
                sheet.mergeCells(2, row, 2, row+1);
                String triptico = cc.isTriptico() ? "Si" : "No";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 2, row, triptico, false, 9, true);
                
                sheet.mergeCells(3, row, 3, row+1);
                String modelo = cc.getModelo() != null ? cc.getModelo().getNombre() : "";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 3, row, modelo, false, 9, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 4, row, "RECCON", true, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 4, row+1, "AGRAD", true, 8, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 5, row, "Rec/"+modelo, false, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 5, row+1, "Agra/"+modelo, false, 8, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 6, row, "Para:", true, 9, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 6, row+1, "Mod.#", true, 9, true);
                
                String dirigidoA = cc.getDirigido();
                String codigo = cc.getAgradecimiento().getClave();
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 7, row, dirigidoA, false, 9, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 7, row+1, codigo, false, 9, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 8, row, "Panoramica", true, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 8, row+1, "Individual", true, 8, true);
                
                //TODO foto panoramica
                String fotoPan = cc.isFotoPersonalizada() ? "Si" : "No";
                String fotoInd = cc.getFotoPanoramica() ? "Si" : "No";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 9, row, fotoPan, false, 9, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 9, row+1, fotoInd, false, 9, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 10, row, "Misa", true, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 10, row+1, "Estudio", true, 8, true);
                
                String misa = cc.isMisa() ? "Si" : "No";
                String estudio = cc.isFotoEstudio() ? "Si" : "No";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 11, row, misa, false, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 11, row+1, estudio, false, 8, true);
                
                sheet.mergeCells(12, row, 12, row+1); 
                addPriceCell(sheet, Border.ALL, BorderLineStyle.THIN, 12, row, cc.getPrecio(), false, 9, true);
                
                //Agregar N cantidad de columnas de anticipos 
                int colCC = 13;
                int i = 0;
                double pagado = 0;
                for (Anticipo a : cc.getAnticipos())
                {
                    sheet.mergeCells(colCC, row, colCC, row+1); 
                    addPriceCell(sheet, Border.ALL, BorderLineStyle.THIN, colCC, row, a.getCantidad(), false, 9, true);
                    i++; colCC++;
                    pagado = pagado + a.getCantidad();
                }
                
                for(int idx = i; idx < numAnticipos; idx++)
                {
                    sheet.mergeCells(colCC, row, colCC, row+1); 
                    addCell(sheet, Border.ALL, BorderLineStyle.THIN, colCC, row, "", false, 9, true);
                    colCC++;
                }
                
                sheet.mergeCells(colCC, row, colCC, row+1); 
                double cantResto = (cc.getPrecio() - pagado);
                addPriceCell(sheet, Border.ALL, BorderLineStyle.THIN, colCC, row, cantResto, false, 9, true);
                
                sheet.mergeCells(colCC+1, row, colCC+1, row+1); 
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, colCC+1, row, cc.getCliente().getCorreo(), false, 9, false);
                
                sheet.mergeCells(colCC+2, row, colCC+5, row+1); 
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, colCC+2, row, cc.getComentarios(), false, 9, true);
                 
                row+=2;
                indice++;
            }
            
                //columna final para el cuerpo de la tabla 
                //int colFinal = 13 + numAnticipos;
                //TOTALES
                //Formula sumLabel = new Formula(12, row, "SUMA(m6:m"+row+")");
                //sheet.addCell(sumLabel);
            //</editor-fold>
            //Crea el archivo
            String path = ruta +"\\"+ nombreArchivo;
            // Use relative path for Unix systems
            File f = new File(path);
            f.getParentFile().mkdirs(); 
            f.createNewFile();
            //Escribimos los resultados al fichero Excel
            workbook.setOutputFile(f);
            workbook.write();
            workbook.close(); 
            
            //leerExcel();
 
            realizado = true;
        }
        catch (IOException ex)
        {
            throw ex;
        }
        catch (WriteException ex)
        {
            throw ex;
        }
        return realizado;
    } 
    
    public static Boolean exportarExcelContratoSinPrecios(String ruta, int idContrato) throws IOException, WriteException
    { 
        boolean realizado = false;
        try
        {
            Contrato contrato = ContratoNegocio.Obtener(idContrato);
            if (contrato == null)
                return false;
            
            //NumberFormat currency = NumberFormat.getCurrencyInstance();
            String nombreArchivo = contrato.toString();  
            nombreArchivo = nombreArchivo + ".xls"; 
            //Se crea el libro Excel
            WritableWorkbook workbook = Workbook.createWorkbook(new File(nombreArchivo));  
            //Se crea una nueva hoja dentro del libro
            WritableSheet sheet = workbook.createSheet(nombreArchivo, 0); 
            
            int numAnticipos = 0;
            List totalAnticipos = new ArrayList();
            //<editor-fold defaultstate="collapsed" desc=" Obtener la longitud del contrato cliente con más anticipos ">  
            for(ContratoCliente cc : contrato.getContratoCliente())
            {
                int numA = cc.getAnticipos() != null ? cc.getAnticipos().size() : 0;
                if (numA > numAnticipos)
                {
                    numAnticipos = numA;
                }
            }
            //</editor-fold> 
            //<editor-fold defaultstate="collapsed" desc=" Ancho de columnas ">
            sheet.setColumnView(0, 3);
            sheet.setColumnView(1, 37);
            sheet.setColumnView(2, 9);
            sheet.setColumnView(3, 10);
            sheet.setColumnView(4, 7);
            sheet.setColumnView(5, 11);
            sheet.setColumnView(6, 6);
            sheet.setColumnView(7, 10);
            sheet.setColumnView(8, 11);
            sheet.setColumnView(9, 10);
            sheet.setColumnView(10, 7);
            sheet.setColumnView(11, 4);
            sheet.setColumnView(12, 10);
            
            
            sheet.setRowView(4, 27*20);
            //</editor-fold> 
            //<editor-fold defaultstate="collapsed" desc=" Titulos de la tabla ">  
            //Se asigna la información del contrato
            sheet.mergeCells(1, 0, 5, 0);
            sheet.mergeCells(2, 2, 6, 2);
            sheet.mergeCells(7, 2, 11, 2);
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 1, 0, contrato.getComentarios(), true, 9, true); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 1, 1, contrato.getEspecialidad().getNombre(), true, 10, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 1, 2, contrato.getGeneracion(), true, 9, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 2, 1, contrato.getEscuela().getCiudad(), true, 9, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 2, 2, "Escuela: " + contrato.getEscuela().getNombre(), true, 9, false); 
            addCell(sheet, Border.NONE, BorderLineStyle.NONE, 7, 2, "Fecha: " + contrato.getFechaEvento().toString(), true, 9, false);
            
            //Se inicia con los titulos 
            sheet.mergeCells(4, 4, 5, 4);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 0, 4, "#", true, 9, true);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 1, 4, "Nombre Completo", true, 9, false);           
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 2, 4, "Triptico", true, 9, true);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 3, 4, "MODELO", true, 9, true); 
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 4, 4, "Placas", true, 9, true);
            sheet.mergeCells(6, 4, 7, 4);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 6, 4, "Dirigido a: /                               # Agradecimiento", true, 9, true);
            sheet.mergeCells(8, 4, 11, 4);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, 8, 4, "Fotografías", true, 9, true);
                        
            sheet.setColumnView((12), 40);
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, (12), 4, "e-mail", true, 9, true);
            
            sheet.setColumnView((13), 12);
            sheet.setColumnView((14), 12);
            sheet.setColumnView((15), 12);
            sheet.setColumnView((16), 12);
            sheet.mergeCells((13), 4, (16), 4); 
            addCell(sheet, Border.ALL, BorderLineStyle.THIN, (13), 4, "Notas", true, 9, true);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Registros de contratos clientes "> 
            //fila inicial
            int row = 5;
            //número del registro
            int indice = 1;  
            for(ContratoCliente cc : contrato.getContratoCliente())
            {  
                sheet.mergeCells(0, row, 0, row+1);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 0, row, indice+"", false, 9, true);
                
                sheet.mergeCells(1, row, 1, row+1);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 1, row, cc.getCliente().getNombre(), false, 9, false);
                
                sheet.mergeCells(2, row, 2, row+1);
                String triptico = cc.isTriptico() ? "Si" : "No";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 2, row, triptico, false, 9, true);
                
                sheet.mergeCells(3, row, 3, row+1);
                String modelo = cc.getModelo() != null ? cc.getModelo().getNombre() : "";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 3, row, modelo, false, 9, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 4, row, "RECCON", true, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 4, row+1, "AGRAD", true, 8, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 5, row, "Rec/"+modelo, false, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 5, row+1, "Agra/"+modelo, false, 8, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 6, row, "Para:", true, 9, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 6, row+1, "Mod.#", true, 9, true);
                
                String dirigidoA = cc.getDirigido();
                String codigo = cc.getAgradecimiento().getClave();
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 7, row, dirigidoA, false, 9, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 7, row+1, codigo, false, 9, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 8, row, "Panoramica", true, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 8, row+1, "Individual", true, 8, true);
                
                //TODO foto panoramica
                String fotoPan = cc.isFotoPersonalizada() ? "Si" : "No";
                String fotoInd = cc.getFotoPanoramica() ? "Si" : "No";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 9, row, fotoPan, false, 9, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 9, row+1, fotoInd, false, 9, true);
                
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 10, row, "Misa", true, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 10, row+1, "Estudio", true, 8, true);
                
                String misa = cc.isMisa() ? "Si" : "No";
                String estudio = cc.isFotoEstudio() ? "Si" : "No";
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 11, row, misa, false, 8, true);
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 11, row+1, estudio, false, 8, true);
                 
                sheet.mergeCells(12, row, 12, row+1); 
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 12, row, cc.getCliente().getCorreo(), false, 9, false);
                
                sheet.mergeCells(13, row, 16, row+1); 
                addCell(sheet, Border.ALL, BorderLineStyle.THIN, 13, row, cc.getComentarios(), false, 9, true);
                 
                row+=2;
                indice++;
            }
            
                //columna final para el cuerpo de la tabla 
                //int colFinal = 13 + numAnticipos;
                //TOTALES
                //Formula sumLabel = new Formula(12, row, "SUMA(m6:m"+row+")");
                //sheet.addCell(sumLabel);
            //</editor-fold>
            //Crea el archivo
            String path = ruta +"\\"+ nombreArchivo;
            // Use relative path for Unix systems
            File f = new File(path);
            f.getParentFile().mkdirs(); 
            f.createNewFile();
            //Escribimos los resultados al fichero Excel
            workbook.setOutputFile(f);
            workbook.write();
            workbook.close(); 
            
            //leerExcel();
 
            realizado = true;
        }
        catch (IOException ex)
        {
            throw ex;
        }
        catch (WriteException ex)
        {
            throw ex;
        }
        return realizado;
    } 
    
    private static void addPriceCell(WritableSheet sheet, Border border, BorderLineStyle borderLineStyle, 
        int col, int row, double desc, boolean bold, int tamanoLetra, boolean center) throws WriteException {
        //Estilo de letra
        WritableFont cellFont = new WritableFont(WritableFont.ARIAL, tamanoLetra);
        
        if (bold)
            cellFont.setBoldStyle(WritableFont.BOLD); 
        //Estilo de celda
        WritableCellFormat cellFormat = new WritableCellFormat(NumberFormats.ACCOUNTING_FLOAT);
        cellFormat.setFont(cellFont);
        cellFormat.setWrap(true);
        if (center)
            cellFormat.setAlignment(Alignment.CENTRE);
        cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
        cellFormat.setBorder(border, borderLineStyle);
        
        Number label = new Number(col, row, desc, cellFormat);
        sheet.addCell(label);
    }
    
    private static void addCell(WritableSheet sheet, Border border, BorderLineStyle borderLineStyle, 
        int col, int row, String desc, boolean bold, int tamanoLetra, boolean center) throws WriteException {
        //Estilo de letra
        WritableFont cellFont = new WritableFont(WritableFont.ARIAL, tamanoLetra);
        
        if (bold)
            cellFont.setBoldStyle(WritableFont.BOLD); 
        //Estilo de celda
        WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
        cellFormat.setWrap(true);
        if (center)
            cellFormat.setAlignment(Alignment.CENTRE);
        cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
        cellFormat.setBorder(border, borderLineStyle);
        Label label = new Label(col, row, desc, cellFormat);
        sheet.addCell(label);
    }
}
