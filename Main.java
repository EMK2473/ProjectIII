/*
Student Array
Project 2
Eric Keeton


Purpose: This application manages a collection of student objects. It creates an array list of students and demonstrates the use of encapsulation and method overloading. The program prints the information of each student in the specified format:

Last Name, First Name, Gender, Grade Level, Favorite Subject
 */

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // create array of student objects
        ArrayList<Student> studentsArray = new ArrayList<>();
        // add students into array
        studentsArray.add(new Student("Tony", "Stark", "Senior", "Male", "Engineering"));
        studentsArray.add(new Student("Natasha", "Romanoff", "Junior", "Female", "Martial Arts"));
        studentsArray.add(new Student("Steve", "Rogers", "Senior", "Male", "History"));
        studentsArray.add(new Student("Wanda", "Maximoff", "Junior", "Female", "Psychology"));
        studentsArray.add(new Student("Thanos", "Titan", "Graduate", "Male", "Philosophy"));

        // for each student in studentsArray, print student info
        for(Student student : studentsArray){
            System.out.println(student);
        }

    }


}


