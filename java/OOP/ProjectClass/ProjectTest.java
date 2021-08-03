package OOP.ProjectClass;

public class ProjectTest {
    public static void main(String[] args) {
        // Creating an instance of the Project class
        Project project1 = new Project();
        // Returns the default parameters for when the name and description are blank
        System.out.println(project1.elevatorPitch());
        // Setting the name, and then returning it
        project1.setName("Big Project");
        System.out.println(project1.getName());
        // Setting the description, and then returning it
        project1.setDescription("This is a big project");
        System.out.println(project1.getDescription());
        // Returns the name and description of the project separated by a colon
        System.out.println(project1.elevatorPitch());
    }
}
