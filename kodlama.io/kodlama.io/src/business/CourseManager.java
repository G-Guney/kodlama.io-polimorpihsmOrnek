package business;

import DataBase.DataBaseSimulation;
import dataAccess.BaseDao;
import entities.Course;


public class CourseManager {
    private BaseDao dao;
    private DataBaseSimulation dataBaseSimulation;


    public CourseManager(BaseDao dao,DataBaseSimulation dataBaseSimulation){
        this.dao = dao;
        this.dataBaseSimulation = dataBaseSimulation;
    }

    public void add(Course course) throws Exception{
        if(course.getCoursePrice() < 0 ){
            throw new Exception("Kurs Fiyatı 0'dan küçük olamaz");
        }
        dao.add(course);
        dataBaseSimulation.courseAdd(course);

    }
    
}
