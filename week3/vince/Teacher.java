package week3.vince;

public class Teacher {
    private String name;
    private String subject;
    private int yearsOfExperience;

    // Constructor
    public Teacher(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for yearsOfExperience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // Setter for yearsOfExperience
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

}
