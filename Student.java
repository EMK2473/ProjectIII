public class Student {
    // declared private fields for student info
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String gender;
    private String favSubject;


    // create public constructor; student fields as param
    public Student(String firstName, String lastName, String gradeLevel, String gender, String favSubject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.favSubject = favSubject;

    }

    // create public method toString to print student info
    public String toString(){
        return firstName + " " + lastName + " " + gradeLevel + " " + gender + " " + favSubject; 
    }
}
