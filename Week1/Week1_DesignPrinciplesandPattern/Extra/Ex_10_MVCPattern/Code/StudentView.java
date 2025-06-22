package Week1_DesignPrinciplesandPattern.Extra.Ex_10_MVCPattern.Code;


public class StudentView {
    public void displayStudentDetails(String name, String id, String grade) {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Grade : " + grade);
    }
}

