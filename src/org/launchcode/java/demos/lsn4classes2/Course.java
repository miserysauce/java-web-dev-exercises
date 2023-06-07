package org.launchcode.java.demos.lsn4classes2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;
//public Course (String topic, Teacher instructor, ArrayList<Student> enrolledStudents){
//    this.topic = topic;
//    this.instructor = instructor;
//    this.enrolledStudents = enrolledStudents;
//}
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return topic + " is taught by " + instructor +"." + "\n"+ "Enrolled Students: "+ enrolledStudents;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }
//    public static void main(String[] args){
//        Course Zelda = new Course("Zelda", "Link", "Sally");
//    }
}
