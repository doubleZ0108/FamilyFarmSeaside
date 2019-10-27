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
      try {
        String classPath="";
        String id="";
        Class clazz = null;
        Constructor constructor;
        Object object = null;
        XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new FileInputStream(path));
        while (reader.hasNext()){
          int eventType = reader.next();
          if(eventType == XMLEvent.START_ELEMENT){
            if(reader.getName().toString().equals("bean")){
              for (int i = 0; i < reader.getAttributeCount(); i++) {
                if(reader.getAttributeName(i).toString().equals("id")){
                  id = reader.getAttributeValue(i);
                }else if(reader.getAttributeName(i).toString().equals("class")){
                  classPath = reader.getAttributeValue(i);
                }
              }
              clazz = Class.forName(classPath);
              constructor = clazz.getConstructor();
              object = constructor.newInstance();
            } else if(reader.getName().toString().equals("property")){
              if(object != null){
                String methodName = "";
                Field field = null;
                Method method = null;
                Object value = null;
                for (int i = 0; i < reader.getAttributeCount(); i++) {
                  if(reader.getAttributeName(i).toString().equals("name")){
                    String propertyName = reader.getAttributeValue(i);
                    methodName = "set"+propertyName.substring(0,1).toUpperCase() + propertyName.substring(1);
                    field = clazz.getDeclaredField(propertyName);
                    method = clazz.getDeclaredMethod(methodName,field.getType());
                  }else if(reader.getAttributeName(i).toString().equals("value")){
                    String temptValue = reader.getAttributeValue(i);
                    assert field != null;
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

    private Object getBean(String id) {
        return ioc.get(id);
    }

    public static void main(String[] args){
      System.out.println("Loading config XML from src/main/java/com/familyFarmSeaside/person/worker/shortTerm/ioc/warehouseConfig.xml");
      System.out.println("Every object defined in the file will be instantiated. They are listed as bellow");
      System.out.println();
      ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("src/main/java/com/familyFarmSeaside/person/worker/shortTerm/ioc/warehouseConfig.xml");
      Warehouse warehouse = (Warehouse)classPathXmlApplicationContext.getBean("warehouse_1");
      warehouse.displayIOCInfo();
      System.out.println();
      warehouse = (Warehouse)classPathXmlApplicationContext.getBean("warehouse_2");
      warehouse.displayIOCInfo();
    }
}
