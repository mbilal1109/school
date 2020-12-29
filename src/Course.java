public class Course {
    private String name;
    private String ID;

    public Course(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
