package Week1_DesignPrinciplesandPattern.Extra.Ex_10_MVCPattern.Code;


public class Main {
    public static void main(String[] args) {
       
        Student student = new Student("Prachi", "101", "A");

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

       
        controller.updateView();

       
        controller.setStudentName("Suman");
        controller.setStudentGrade("A+");

        
        controller.updateView();
    }
}

