public class Student {
    // declared private fields for student info
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String gender;
    private String favSubject;


    // student constructor; student fields as params
    public Student(String firstName, String lastName, String gradeLevel, String gender, String favSubject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.favSubject = favSubject;

    }

    // "overloaded" toString method to print student info in req format
    public String toString(){
        return lastName + ", " + firstName + ", " + gender + ", " + gradeLevel + ", " + favSubject; 
    }
}
