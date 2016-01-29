/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm.presentacion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


/**
 *
 * @author luis
 */
public class CustomComboBox extends JComboBox{
    
    private String display;
    private String value; 
    private  List<ComboItem> items;
    
    public void setDisplayMember(String display)
    {
        this.display = display;
    }
    
    public void setValueMember(String value)
    {
        this.value = value;
    }
    
    public void setDataSource(List<?> list) throws IllegalArgumentException, IllegalAccessException
    { 
        items = new ArrayList();
        List<String> nombres = new ArrayList<String>();
        for(Object o : list)
        {
            Class<?> clazz = o.getClass(); 
            ComboItem ci = new ComboItem();
            for(Field field : clazz.getDeclaredFields()) {  
                field.setAccessible(true);
                Object item = field.get(o);  
                if (field.getName().equals(display))
                { 
                    ci.setLabel(""+item);
                    nombres.add(""+item);
                }
//                else
//                {
//                    ci.setLabel(field.toGenericString());
//                    nombres.add(field.toGenericString());
//                } 
                if (field.getName().equals(value))
                { 
                    ci.setValue(""+item);
                } 
//                else
//                {
//                    ci.setValue(item);
//                } 
            }
            items.add(ci);
        }
        this.setModel(new DefaultComboBoxModel(nombres.toArray()));
    }
     
    public Object getSelectedValue()
    {
        Object result;
        int index = this.getSelectedIndex();
        if (index == -1) {
            result= -1;
            
        }else{
            result =items.get(index).getValue();
        }
        return result;
    }
    
    public void setSelectedValue(Object value)
    {
        int index = this.getSelectedIndex();
        for(ComboItem ci : items)
        {
            if (ci.getValue().equals(value.toString()))
            {
                this.setSelectedItem(ci.getLabel());
            }
        }
    }
    
}
class ComboItem {
    private String value;
    private String label; 
     
    public ComboItem() {}
      
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return this.label;
    } 
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return label;
    }
}