package entities;

public class Course extends BaseObject{
    double coursePrice ;

    public double getCoursePrice() {
        return this.coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }


    @Override
    public String getSection() {
        return "Kurs Bölümü";
    }


    //names; java, angular, react...
    
}
