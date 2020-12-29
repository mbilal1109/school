public class Driver {
    public static void main(String[] args) {


        Student st  = new Student("CS1243", "john oliver", "12/03/1999");

        Course cs  = new Course("science ", "CS012");
        st.setCourse(cs);

        System.out.println(st.toString());
        System.out.println("student course is : "+cs.toString());


    }
}
