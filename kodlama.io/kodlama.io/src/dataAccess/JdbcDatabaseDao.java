package dataAccess;

import entities.BaseObject;

public class JdbcDatabaseDao implements BaseDao{

    @Override
    public void add(BaseObject baseObject) {
        System.out.println(baseObject.getName() + " isimli " + baseObject.getSection() + " Veritabanına Jdbc ile Eklendi");
        
    }
    
}
