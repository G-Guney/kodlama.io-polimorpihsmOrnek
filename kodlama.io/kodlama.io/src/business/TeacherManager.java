package business;

import dataAccess.BaseDao;
import entities.Teacher;

public class TeacherManager {
    
    private BaseDao daoSelect;

    public TeacherManager(BaseDao daoSelect){
        this.daoSelect = daoSelect;
 
    }
    
    public void add(Teacher teacher){
       daoSelect.add(teacher);
    }

}
