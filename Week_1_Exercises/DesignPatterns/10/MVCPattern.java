public class MVCPattern {
    public static void main(String[] args) {
        // Create a Student object
        Student model = new Student();
        model.setName("John Doe");
        model.setId("1234");
        model.setGrade("A");

        // Create a View object
        StudentView view = new StudentView();

        // Create a Controller object
        StudentController controller = new StudentController(model, view);

        // Update and display student details
        controller.updateView();

        // Update student details through the controller
        controller.setStudentName("Jane Smith");
        controller.setStudentId("5678");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
