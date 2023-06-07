package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:

    public String getGradeLevel() {
        String gradeLevel = "";
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits >=0  && this.numberOfCredits <= 29 ){
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits >=30 && this.numberOfCredits <= 59) {
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits >=90) {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }
//LC Text Solution:
//     public static String getGradeLevel(int credits) {
//         if (credits <= 29){
//             return "freshman";
//         } else if (credits <= 59){
//             return "sophomore";
//         } else if (credits <= 89) {
//             return "junior";
//         } else {
//             return "senior";
//         }
//     }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.numberOfCredits * this.gpa;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore /this.numberOfCredits;

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student " + "\""+name+"\"" + " is assigned student ID "+ studentId + " and has " + numberOfCredits + " credits, " +
                "with a GPA of " + gpa;

    }
//LC Text Solution:
//    public String toString() {
//        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
//        return studentReport;
//    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
//LC Text Solution:
//    public boolean equals(Object toBeCompared) {
//        if (toBeCompared == this) {
//            return true;
//        }
//
//        if (toBeCompared == null) {
//            return false;
//        }
//
//        if (toBeCompared.getClass() != getClass()) {
//            return false;
//        }
//
//        Student theStudent = (Student) toBeCompared;
//        return theStudent.getStudentId() == getStudentId();
//    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(50, 3.8);
        System.out.println(sally);
//        sally.setNumberOfCredits(12);
        System.out.println(sally.getGradeLevel());
        System.out.println(sally.toString());


    }
}
