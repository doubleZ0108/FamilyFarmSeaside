package main.java.com.familyFarmSeaside.person.worker.shortTerm.ioc;

import main.java.com.familyFarmSeaside.scene.warehouse.Warehouse;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.Iterator;

/**
 * @program: FamilyFarmSeaside
 * @description: The IOC container
 * @author: Zijian Zhang
 * @create: 2019/10/27
 **/
public class ClassPathXmlApplicationContext {
    private Map<String,Object> ioc = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext(String path) {
       /**
         * @description: The method that read the XML file and create the object in the IOC container.
         *
         * @param path : the path of the XML file
         *
         * @return : null
         **/
      try {
        String classPath="";
        String id="";
        Class clazz = null;
        Constructor constructor;
        Object object = null;
        // This method is to some degree convoluted
        // If you really want to read the code
        // PLEASE REMEBER
        // 1. find the class to be instantiate
        // 2. create an plain object of that class
        // 3. set the attributed of the object
        XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new FileInputStream(path));
        while (reader.hasNext()){
          int eventType = reader.next();
          if(eventType == XMLEvent.START_ELEMENT){
            // new object
            if(reader.getName().toString().equals("bean")){
              for (int i = 0; i < reader.getAttributeCount(); i++) {
                if(reader.getAttributeName(i).toString().equals("id")){
                  id = reader.getAttributeValue(i);
                }else if(reader.getAttributeName(i).toString().equals("class")){
                  classPath = reader.getAttributeValue(i);
                }
              }
              // find the class and its constructors
              clazz = Class.forName(classPath);
              constructor = clazz.getConstructor();
              object = constructor.newInstance();
              // set the properties of the object
            } else if(reader.getName().toString().equals("property")){
              if(object != null){
                String methodName = "";
                Field field = null;
                Method method = null;
                Object value = null;
                // every propertiy is set
                for (int i = 0; i < reader.getAttributeCount(); i++) {
                  if(reader.getAttributeName(i).toString().equals("name")){
                    String propertyName = reader.getAttributeValue(i);
                    // the method name has to follow the
                    // JavaBean template in order to get the method
                    methodName = "set"+propertyName.substring(0,1).toUpperCase() + propertyName.substring(1);
                    field = clazz.getDeclaredField(propertyName);
                    method = clazz.getDeclaredMethod(methodName,field.getType());
                  }else if(reader.getAttributeName(i).toString().equals("value")){
                    String temptValue = reader.getAttributeValue(i);
                    assert field != null;
                    // just some normal type
                    // adding more type is unnessary
                    if(field.getType().getName().equals("int")){
                      value = Integer.parseInt(temptValue);
                    }else if(field.getType().getName().equals("double")){
                      value = Double.parseDouble(temptValue);
                    }else if(field.getType().getName().equals("java.lang.String")){
                      value = temptValue;
                    }
                    method.invoke(object,value);
                  }
                }
              }
            }
          }else if(eventType==XMLEvent.END_ELEMENT){
            if(reader.getName().toString().equals("bean")){
              ioc.put(id,object);
            }
          }
        }
      }
      catch (FileNotFoundException | XMLStreamException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchFieldException ex) {
        ex.printStackTrace();
      }
    }

    public Object getBean(String id) {
        return ioc.get(id);
    }

  @Override
  public String toString() {
    return "class ClassPathXmlApplicationContext";
  }
}
