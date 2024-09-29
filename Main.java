import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // create array of student objects
        ArrayList<Student> studentsArray = new ArrayList<>();
        // add students into array
        studentsArray.add(new Student("eric", "keeton", "senior", "male", "english"));
        // print student info
        System.out.println(studentsArray.get(0));

    }


}


