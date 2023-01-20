package business;

import dataAccess.BaseDao;
import entities.Category;

public class CategoryMAnager {
    

    private BaseDao daoSelecet;

    public CategoryMAnager(BaseDao daoSelect){
        this.daoSelecet = daoSelect;
    }

    public void add(Category category){
        daoSelecet.add(category);
    }




}
