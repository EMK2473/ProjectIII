import java.util.ArrayList;

public class ProjectIII {

    public static void main(String[] args) {
        // create array of student objects
        // add students into array
        // print student info

    }


}


public class Student {
    // create private fields for student info
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

    // create public method toString
    public String toString(){
        
    }
     
}