package OOP.ProjectClass;

public class Project {
    private String name;
    private String description;

    // OVERLOADED METHOD IF NO PARAMETERS ARE ENTERED
    public Project() {
        this.name = "BLANK NAME";
        this.description = "BLANK DESCRIPTION";
    }

    // OVERLOADED METHOD IF ONLY NAME IS ENTERED
    public Project(String name) {
        this.name = name;
        this.description = "BLANK DESCRIPTION";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // RETURNS NAME & DESCRIPTION, SEPARATED BY A COLON
    public String elevatorPitch() {
        return this.name + " : " + this.description;
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
