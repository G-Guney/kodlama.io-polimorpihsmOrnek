package dataAccess;
import entities.BaseObject;


public class HibernateDataBaseDao implements BaseDao{

    @Override
    public void add(BaseObject baseObject) {
        System.out.println(baseObject.getName() + " isimli " + baseObject.getSection() + " Veritabanınıa Hibernate ile Eklendi");
    }
    
}
