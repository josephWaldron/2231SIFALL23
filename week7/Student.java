package week7;

public class Student {
    private String name;
    public String email;
    private int age;

    public Student(){
        this.name = "";
        this.email = "";
        this.age = 0;
    }
    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Name: " + this.name + "\nEmail: " + this.email + "\nAge: " + this.age;
    }
}
