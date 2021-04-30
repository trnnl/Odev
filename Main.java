public class Main {
    public static void main(String[] args) {

        User user = new User("Turan","Can","1");
        User user1 = new User("Muzaffer","Can","2");
        Student student = new Student("Turan","Can","1","12345");
        Student student1 = new Student("Muzaffer","Can","2","6789");
        User user3 = new User("Engin","Can","1");
        User user4 = new User("Ahmet","Can","2");
        Instructor instructor = new Instructor("Engin","Can","1","Java, C#");
        Instructor instructor1 = new Instructor("Ahmet","Can","2","C, C++");

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        System.out.println();
        System.out.println("********Öğrenciler********\n");
        studentManager.isimEkle(user);
        studentManager.isimEkle(user1);
        System.out.println();
        studentManager.isimEkle(student);
        studentManager.isimEkle(student1);

        System.out.println("----------------------------------------");
        System.out.println("********Eğitmenler********\n");
        instructorManager.isimEkle(user3);
        instructorManager.isimEkle(user4);
        System.out.println();
        instructorManager.isimEkle(instructor);
        instructorManager.isimEkle(instructor1);


    }
}
