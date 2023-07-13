public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(695022500, "Darin", 2022, 4);

    
        student1.showDetails();

        student1.setID(65022501);
        student1.setName("Bella");
        student1.setAdmissionYear(2022);
        student1.setGPA(3.8);

        student1.showDetails();
    }
}