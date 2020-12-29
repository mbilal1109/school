public class Student {

    private  String ID;
    private  String name;
    private  String dob;

    private Course course;

    public Student(String ID, String name, String dob) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                '}'+ "\n\t" +course.toString();
    }
}
