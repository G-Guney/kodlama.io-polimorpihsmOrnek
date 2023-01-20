package DataBase;
import java.util.ArrayList;


import entities.Course;

public class DataBaseSimulation {
    
    
    ArrayList<String> courseDB = new ArrayList<String>();

    public void courseAdd(Course course) throws Exception{
        
         if(courseDB.contains(course.getName())){
            throw new Exception("Aynı isimle kurs mevcu lütfen farklı bir isim giriniz..");
        }
        courseDB.add(course.getName());
    }

}
