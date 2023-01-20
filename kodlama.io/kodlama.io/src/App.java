
import DataBase.DataBaseSimulation;
import business.CategoryMAnager;
import business.CourseManager;
import business.TeacherManager;
import dataAccess.HibernateDataBaseDao;
import dataAccess.JdbcDatabaseDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher();
        teacher.setName("Gökhan Güney");
        TeacherManager teacherManager = new TeacherManager(new HibernateDataBaseDao());
        teacherManager.add(teacher);

        System.out.println("-----------------------------------");

        Course course = new Course();
        course.setName("Java");
        course.setCoursePrice(950);
        CourseManager courseManager = new CourseManager(new JdbcDatabaseDao(),new DataBaseSimulation());
        courseManager.add(course);

        System.out.println("-----------------------------------");

        Category category = new Category();
        category.setName("Programlama");
        CategoryMAnager categoryMAnager = new CategoryMAnager(new HibernateDataBaseDao());
        categoryMAnager.add(category);

        System.out.println("-----------------------------------");

    }
}




// kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs bölümlerini katmanlı mimaride kodlamak istiyoruz.

// Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.

// Çoklu loglama yapısını simule ediniz.

// Aşağıdaki isterleri gerçekleştiriniz.

// Kurs ismi tekrar edemez
// Kategori ismi tekrar edemez
// Bir kursun fiyatı 0 dan küçük olamaz